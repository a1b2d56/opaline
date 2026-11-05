"""Resolve git conflict hunks in a file.

Usage:
    python -I resolve.py <file> <choice> [<choice> ...]

One choice per conflict hunk, in order:
    ours    keep the HEAD side
    theirs  keep the upstream side
    both    ours then theirs
    tboth   theirs then ours
    @path   replace the hunk with the contents of a file
Line endings of the file are preserved.
"""

import re
import sys

HUNK = re.compile(r"^<<<<<<< [^\n]*\n(.*?)^=======\n(.*?)^>>>>>>> [^\n]*\n", re.S | re.M)


def main():
    path, choices = sys.argv[1], sys.argv[2:]
    raw = open(path, encoding="utf-8", newline="").read()
    crlf = "\r\n" in raw
    text = raw.replace("\r\n", "\n")
    hunks = list(HUNK.finditer(text))
    if len(hunks) != len(choices):
        sys.exit(f"{path}: {len(hunks)} hunks, {len(choices)} choices")
    out, pos = [], 0
    for m, c in zip(hunks, choices):
        out.append(text[pos:m.start()])
        ours, theirs = m.group(1), m.group(2)
        if c == "ours":
            out.append(ours)
        elif c == "theirs":
            out.append(theirs)
        elif c == "both":
            out.append(ours + theirs)
        elif c == "tboth":
            out.append(theirs + ours)
        elif c.startswith("@"):
            rep = open(c[1:], encoding="utf-8").read().replace("\r\n", "\n")
            out.append(rep if rep.endswith("\n") or not rep else rep + "\n")
        else:
            sys.exit(f"bad choice {c}")
        pos = m.end()
    out.append(text[pos:])
    result = "".join(out)
    if crlf:
        result = result.replace("\n", "\r\n")
    open(path, "w", encoding="utf-8", newline="").write(result)
    print(f"{path}: resolved {len(hunks)}")


if __name__ == "__main__":
    main()
