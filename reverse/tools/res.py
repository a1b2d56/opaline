"""Look up and resolve ColorOS 17 resources from parsed aapt2 tables.

Usage:
  python -I res.py [--apk Settings] name [name ...]
  python -I res.py --apk Settings --style Widget.COUI.Switch
  python -I res.py --apk Settings --theme Theme.COUI.Main --attr couiColorPrimary
  python -I res.py --apk Settings --grep coui_round_corner

Names may be bare (coui_round_corner_m, searched across types) or typed (dimen/x).
"""

import argparse
import json
import os
import re
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
DUMP = os.path.join(HERE, "..", "dump")
_cache = {}


def table(apk):
    if apk not in _cache:
        with open(os.path.join(DUMP, apk + ".json"), encoding="utf-8") as f:
            _cache[apk] = json.load(f)
    return _cache[apk]


REF_RE = re.compile(r"^@(?:[\w.]+:)?(\w+/[\w.]+)")


def resolve(apk, value, cfg="", depth=0):
    """Follow @type/name references to a terminal value for the given config."""
    if depth > 12 or not isinstance(value, str):
        return value
    m = REF_RE.match(value)
    if not m:
        return value
    key = m.group(1)
    t = table(apk)
    if key not in t:
        return value + " (unresolved)"
    entry = t[key]
    v = entry.get(cfg, entry.get("", next(iter(entry.values()), None)))
    if isinstance(v, dict):
        return value
    return resolve(apk, v, cfg, depth + 1)


def show(apk, key):
    t = table(apk)
    entry = t[key]
    out = []
    for cfg, v in entry.items():
        if isinstance(v, dict):
            continue
        r = resolve(apk, v, cfg)
        out.append(f"({cfg}) {v}" + (f" -> {r}" if r != v else ""))
    return "; ".join(out)


def style_items(apk, name, cfg=""):
    """Return merged style items following the parent chain (child wins)."""
    t = table(apk)
    chain = []
    key = name if name.startswith("style/") else "style/" + name
    seen = set()
    while key and key in t and key not in seen:
        seen.add(key)
        entry = t[key]
        s = entry.get(cfg) or entry.get("")
        if not isinstance(s, dict):
            break
        chain.append((key, s["items"]))
        parent = s.get("parent")
        if not parent:
            # implicit parent by dotted name
            base = key[len("style/"):]
            parent = "style/" + base.rsplit(".", 1)[0] if "." in base else None
        key = parent
    merged = {}
    for k, items in reversed(chain):
        merged.update(items)
    return merged, [c[0] for c in chain]


def theme_attr(apk, theme, attr, cfg=""):
    items, _ = style_items(apk, theme, cfg)
    v = items.get(attr)
    if v is None:
        return None
    if v.startswith("?"):
        return theme_attr(apk, theme, v.split("/")[-1], cfg)
    return resolve(apk, v, cfg)


def main():
    sys.stdout.reconfigure(encoding="utf-8")
    ap = argparse.ArgumentParser()
    ap.add_argument("--apk", default="Settings")
    ap.add_argument("--style")
    ap.add_argument("--theme")
    ap.add_argument("--attr", nargs="*")
    ap.add_argument("--grep")
    ap.add_argument("--cfg", default="")
    ap.add_argument("names", nargs="*")
    a = ap.parse_args()
    t = table(a.apk)
    if a.grep:
        rx = re.compile(a.grep)
        for k in t:
            if rx.search(k) and not k.startswith("style/"):
                print(k, "=", show(a.apk, k))
        return
    if a.style:
        items, chain = style_items(a.apk, a.style, a.cfg)
        print("chain:", " <- ".join(chain))
        for k, v in sorted(items.items()):
            r = resolve(a.apk, v, a.cfg)
            print(f"  {k} = {v}" + (f" -> {r}" if r != v else ""))
        return
    if a.theme:
        for at in a.attr or []:
            print(at, "=", theme_attr(a.apk, a.theme, at, a.cfg),
                  "| night:", theme_attr(a.apk, a.theme, at, "night"))
        return
    for n in a.names:
        keys = [n] if "/" in n else [k for k in t if k.split("/", 1)[1] == n]
        if not keys:
            print(n, "= <missing>")
        for k in keys:
            print(k, "=", show(a.apk, k))


if __name__ == "__main__":
    main()
