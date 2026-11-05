"""List every COUI resource cited in the library sources, with the cited line
(which carries the ColorOS 16 value used by the code) next to the ColorOS 17
value from the parsed resource tables.

Usage: python -I citations.py <repo_root> [apk ...]
"""

import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import res  # noqa: E402

NAME_RE = re.compile(r"\b((?:coui|support|switch|seekbar)_[a-z0-9_]+)\b")
NUM_RE = re.compile(r"(-?\d+(?:\.\d+)?)\s*(?:\.dp|\.sp|dp|sp|f\b)")


def main():
    sys.stdout.reconfigure(encoding="utf-8")
    root = sys.argv[1]
    apks = sys.argv[2:] or ["Settings", "UXDesign"]
    seen = {}
    for dp, _, files in os.walk(root):
        if any(p in dp for p in (os.sep + "build", os.sep + "reverse", os.sep + ".git")):
            continue
        for fn in files:
            if not fn.endswith(".kt"):
                continue
            path = os.path.join(dp, fn)
            with open(path, encoding="utf-8", errors="replace") as f:
                lines = f.readlines()
            for i, line in enumerate(lines):
                for name in NAME_RE.findall(line):
                    seen.setdefault(name, []).append(
                        (os.path.relpath(path, root), i + 1, line.strip()[:160]))
    for name in sorted(seen):
        vals = []
        for apk in apks:
            t = res.table(apk)
            keys = [k for k in t if k.split("/", 1)[1] == name and not k.startswith("style/")]
            if keys:
                vals.append(f"{apk}: " + " | ".join(f"{k.split('/')[0]} {res.show(apk, k)}" for k in keys))
                break
        print(f"## {name}  =>  {vals[0] if vals else 'MISSING in 17'}")
        for path, ln, txt in seen[name][:3]:
            print(f"   {path}:{ln}: {txt}")


if __name__ == "__main__":
    main()
