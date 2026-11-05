"""Three-way sync of upstream Miuix into Opaline.

    base   = upstream at the fork point, translated into Opaline's layout and names
    theirs = upstream at the target commit, translated the same way
    ours   = the Opaline working tree

A scratch git repository holds the three trees (all LF), `git merge` combines them, and the merged
files are copied back into the Opaline tree with each file's original line endings. Conflicts are
left in place with standard markers and listed at the end.

Usage:
    python -I upstream_sync.py <miuix_git> <opaline_repo> <scratch_dir> <base_commit> <target_commit>
"""

import os
import re
import shutil
import subprocess
import sys
import tarfile
import io

# Upstream paths taken into the sync. docs/, CI, IDE files and modules Opaline does not carry are
# deliberately left out (see docs/upstream-sync.md).
INCLUDE = re.compile(
    r"^(miuix-(core|ui|preference|shader|blur|squircle|icons|nav)/"
    r"|build-plugins/|build-logic/"
    r"|gradle/libs\.versions\.toml$|gradle/wrapper/gradle-wrapper\.properties$|gradle\.properties$"
    r"|baselineprofile/"
    r"|example/(shared|android|desktop|web|macos)/)")
EXCLUDE = re.compile(r"(^|/)build/|baseline-prof\.txt$|startup-prof\.txt$")
TEXT_EXT = (".kt", ".kts", ".toml", ".properties", ".xml", ".pro", ".txt", ".json", ".html",
            ".css", ".js", ".mjs", ".swift", ".plist", ".xcconfig", ".md")

HEADER_RE = re.compile(r"\A// Copyright (\d{4}), compose-miuix-ui contributors\n// SPDX-License-Identifier: Apache-2\.0\n")
MIUIX_HEADER = ("// Copyright {y}, compose-miuix-ui contributors\n"
                "// Modifications Copyright 2026, COUI contributors and Opaline contributors\n"
                "// SPDX-License-Identifier: Apache-2.0\n")
OPALINE_PORT_HEADER = ("// Copyright {y}, compose-miuix-ui contributors\n"
                       "// Modifications Copyright 2026, Opaline contributors\n"
                       "// SPDX-License-Identifier: Apache-2.0\n")


def map_path(p):
    p = re.sub(r"^build-logic/", "build-plugins/", p)
    p = re.sub(r"^miuix-", "opaline-", p)
    p = p.replace("top/yukonga/miuix/kmp", "io/github/a1b2d56/opaline")
    p = p.replace("top/yukonga/miuix", "io/github/a1b2d56/opaline")
    head, _, base = p.rpartition("/")
    base = base.replace("Miuix", "Opaline").replace("MIUIX", "OPALINE")
    return f"{head}/{base}" if head else base


PROTECT = ["compose-miuix-ui", "github.com/compose-miuix-ui/miuix"]


def map_text(text):
    m = HEADER_RE.match(text)
    if m:
        text = MIUIX_HEADER.format(y=m.group(1)) + text[m.end():]
    for i, token in enumerate(PROTECT):
        text = text.replace(token, f"\x00{i}\x00")
    text = text.replace("top.yukonga.miuix.kmp", "io.github.a1b2d56.opaline")
    text = text.replace("top.yukonga.miuix", "io.github.a1b2d56.opaline")
    text = text.replace("top/yukonga/miuix/kmp", "io/github/a1b2d56/opaline")
    text = text.replace("build-logic", "build-plugins")
    text = re.sub(r"\bmiuix-(core|ui|preference|shader|blur|squircle|icons|nav)\b", r"opaline-\1", text)
    text = text.replace("Miuix", "Opaline").replace("MIUIX", "OPALINE")
    text = re.sub(r"\bmiuix(?=[A-Z_])", "opaline", text)
    for i, token in enumerate(PROTECT):
        text = text.replace(f"\x00{i}\x00", token)
    return text


def run(*args, cwd=None, check=True):
    return subprocess.run(args, cwd=cwd, capture_output=True, text=True, encoding="utf-8",
                          errors="replace", check=check)


def export_upstream(git, commit, dest):
    data = subprocess.run(["git", "-C", git, "archive", "--format=tar", commit],
                          capture_output=True, check=True).stdout
    with tarfile.open(fileobj=io.BytesIO(data)) as tar:
        for member in tar.getmembers():
            if not member.isfile() or not INCLUDE.search(member.name) or EXCLUDE.search(member.name):
                continue
            raw = tar.extractfile(member).read()
            out = os.path.join(dest, map_path(member.name))
            os.makedirs(os.path.dirname(out), exist_ok=True)
            if member.name.endswith(TEXT_EXT) or member.name.endswith("gradlew"):
                text = raw.decode("utf-8").replace("\r\n", "\n")
                with open(out, "w", encoding="utf-8", newline="\n") as f:
                    f.write(map_text(text))
            else:
                with open(out, "wb") as f:
                    f.write(raw)


def ours_paths(repo):
    """Files of the Opaline tree that correspond to the synced upstream scope."""
    scope = re.compile(
        r"^(opaline-(core|ui|preference|shader|blur|squircle|icons|nav)/|build-plugins/"
        r"|gradle/libs\.versions\.toml$|gradle/wrapper/gradle-wrapper\.properties$|gradle\.properties$"
        r"|baselineprofile/|example/(shared|android|desktop|web|macos)/)")
    for dp, dirs, files in os.walk(repo):
        dirs[:] = [d for d in dirs if d not in {".git", ".gradle", "build", "reverse", "node_modules", ".kotlin"}]
        for fn in files:
            rel = os.path.relpath(os.path.join(dp, fn), repo).replace("\\", "/")
            if scope.search(rel) and not EXCLUDE.search(rel):
                yield rel


def snapshot(scratch, message):
    run("git", "add", "-A", cwd=scratch)
    run("git", "-c", "user.name=sync", "-c", "user.email=sync@localhost", "commit", "-q",
        "--allow-empty", "-m", message, cwd=scratch)


def clear(scratch):
    for name in os.listdir(scratch):
        if name != ".git":
            p = os.path.join(scratch, name)
            shutil.rmtree(p) if os.path.isdir(p) else os.remove(p)


def main():
    git, repo, scratch, base, target = sys.argv[1:6]
    if os.path.exists(scratch):
        shutil.rmtree(scratch)
    os.makedirs(scratch)
    run("git", "init", "-q", "-b", "base", cwd=scratch)
    run("git", "config", "core.autocrlf", "false", cwd=scratch)

    export_upstream(git, base, scratch)
    snapshot(scratch, f"base {base}")

    run("git", "checkout", "-q", "-b", "theirs", cwd=scratch)
    clear(scratch)
    export_upstream(git, target, scratch)
    snapshot(scratch, f"theirs {target}")

    run("git", "checkout", "-q", "-b", "ours", "base", cwd=scratch)
    clear(scratch)
    crlf = {}
    for rel in ours_paths(repo):
        src = os.path.join(repo, rel)
        dst = os.path.join(scratch, rel)
        os.makedirs(os.path.dirname(dst), exist_ok=True)
        raw = open(src, "rb").read()
        if rel.endswith(TEXT_EXT) or rel.endswith("gradlew"):
            crlf[rel] = b"\r\n" in raw
            raw = raw.replace(b"\r\n", b"\n")
        with open(dst, "wb") as f:
            f.write(raw)
    snapshot(scratch, "ours")

    merge = run("git", "-c", "user.name=sync", "-c", "user.email=sync@localhost", "merge",
                "--no-ff", "--no-commit", "-X", "find-renames=60%", "theirs", cwd=scratch, check=False)
    print(merge.stdout[-3000:], merge.stderr[-2000:])

    status = run("git", "status", "--porcelain", cwd=scratch).stdout.splitlines()
    added_upstream = set(run("git", "diff", "--name-only", "--diff-filter=A", "base", "theirs",
                             cwd=scratch).stdout.split())
    conflicts, written, deleted = [], 0, 0
    for line in status:
        code, path = line[:2], line[3:].strip().strip('"')
        if " -> " in path:
            path = path.split(" -> ")[1]
        src = os.path.join(scratch, path)
        dst = os.path.join(repo, path)
        if code.strip() == "D" or not os.path.exists(src):
            if os.path.exists(dst):
                os.remove(dst)
                deleted += 1
            continue
        if "U" in code or code == "AA":
            conflicts.append(path)
        raw = open(src, "rb").read()
        if path.endswith(TEXT_EXT) or path.endswith("gradlew"):
            text = raw.decode("utf-8")
            if path in added_upstream:
                text = text.replace(MIUIX_HEADER.split("\n")[1], OPALINE_PORT_HEADER.split("\n")[1], 1)
            raw = text.encode("utf-8")
            if crlf.get(path, True):
                raw = raw.replace(b"\n", b"\r\n")
        os.makedirs(os.path.dirname(dst), exist_ok=True)
        with open(dst, "wb") as f:
            f.write(raw)
        written += 1
    print(f"written={written} deleted={deleted} conflicts={len(conflicts)}")
    for c in conflicts:
        print("CONFLICT", c)


if __name__ == "__main__":
    main()
