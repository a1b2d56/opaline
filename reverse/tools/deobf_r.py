"""Annotate jadx output: replace obfuscated R field references (e.g. lb.d.f15734n)
with the real resource name, using the aapt2 dump of the same APK.

Usage: python -I deobf_r.py <jadx_sources_dir> <aapt2_dump.txt>
Rewrites .java files in place: `lb.d.A` -> `lb.d.A/*dimen/coui_x*/`.
"""

import os
import re
import sys

FIELD_RE = re.compile(r"public static (?:final )?int (\w+) = (-?\d+);")
RES_RE = re.compile(r"^\s+resource 0x([0-9a-f]+) (\S+)")


def main():
    src, dump = sys.argv[1], sys.argv[2]
    ids = {}
    with open(dump, encoding="utf-8", errors="replace") as f:
        for line in f:
            m = RES_RE.match(line)
            if m:
                ids[int(m.group(1), 16)] = m.group(2)
    # Collect R-like classes: every field is a static int resolving to a resource id.
    rmap = {}
    for dp, _, files in os.walk(src):
        for fn in files:
            if not fn.endswith(".java"):
                continue
            path = os.path.join(dp, fn)
            if os.path.getsize(path) > 3_000_000:
                continue
            with open(path, encoding="utf-8", errors="replace") as f:
                text = f.read()
            fields = FIELD_RE.findall(text)
            if len(fields) < 3:
                continue
            hits = [(n, int(v)) for n, v in fields if int(v) & 0xFFFFFFFF in ids or int(v) in ids]
            if len(hits) < 0.9 * len(fields):
                continue
            rel = os.path.relpath(path, src)[:-5].replace(os.sep, ".")
            for n, v in hits:
                rmap[f"{rel}.{n}"] = ids.get(v, ids.get(v & 0xFFFFFFFF))
    print("R fields:", len(rmap))
    if not rmap:
        return
    # Longest-first alternation over fully qualified refs.
    keys = sorted(rmap, key=len, reverse=True)
    rx = re.compile(r"\b(" + "|".join(re.escape(k) for k in keys) + r")\b(?!/\*)")
    changed = 0
    for dp, _, files in os.walk(src):
        for fn in files:
            if not fn.endswith(".java"):
                continue
            path = os.path.join(dp, fn)
            with open(path, encoding="utf-8", errors="replace") as f:
                text = f.read()
            new = rx.sub(lambda m: f"{m.group(1)}/*{rmap[m.group(1)]}*/", text)
            if new != text:
                with open(path, "w", encoding="utf-8") as f:
                    f.write(new)
                changed += 1
    print("files annotated:", changed)


if __name__ == "__main__":
    main()
