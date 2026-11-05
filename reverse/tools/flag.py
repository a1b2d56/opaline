"""Flag cited dimen/color tokens whose ColorOS 17 value does not appear near
the citation in the library source (likely changed since ColorOS 16).

Usage: python -I flag.py <repo_root>
"""

import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import res  # noqa: E402

NAME_RE = re.compile(r"\b((?:coui|support|switch|seekbar)_[a-z0-9_]+)\b")
APKS = ["Settings", "UXDesign", "SystemUI"]


def fmt_num(x):
    x = float(x)
    return str(int(x)) if x == int(x) else ("%g" % x)


def value_tokens(v):
    """Strings that would show up in source if the code used this value."""
    if v.endswith("dp") or v.endswith("sp"):
        n = fmt_num(v[:-2])
        return [n + ".dp", n + ".sp", n + "dp", n + "sp", "= " + n, n + "f", n + ")"]
    if v.startswith("#"):
        h = v[1:].upper()
        if len(h) == 6:
            h = "FF" + h
        return ["0x" + h, "#" + h[2:] if h.startswith("FF") else "#" + h, "#" + h]
    return [v]


def main():
    sys.stdout.reconfigure(encoding="utf-8")
    root = sys.argv[1]
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
                for name in set(NAME_RE.findall(line)):
                    ctx = "".join(lines[max(0, i - 8): i + 9]).upper()
                    for apk in APKS:
                        t = res.table(apk)
                        keys = [k for k in t if k.split("/", 1)[1] == name
                                and k.split("/")[0] in ("dimen", "color")]
                        if not keys:
                            continue
                        k = keys[0]
                        entry = t[k]
                        v = res.resolve(apk, entry.get("", next(iter(entry.values()))))
                        if not isinstance(v, str):
                            break
                        toks = value_tokens(v)
                        if not any(tok.upper() in ctx for tok in toks):
                            rel = os.path.relpath(path, root)
                            print(f"{rel}:{i + 1}  {k} = {res.show(apk, k)}\n    {line.strip()[:170]}")
                        break


if __name__ == "__main__":
    main()
