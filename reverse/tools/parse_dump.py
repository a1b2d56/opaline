"""Parse `aapt2 dump resources` output into a JSON resource table.

Usage: python -I parse_dump.py <dump.txt> <out.json>

Output shape:
  { "dimen/coui_round_corner_m": {"": "12.000000dp", "night": "..."},
    "style/Widget.COUI.Switch": {"": {"parent": "style/...", "items": {"attr": "value"}}},
    ... }
"""

import json
import re
import sys

RES_RE = re.compile(r"^\s+resource 0x[0-9a-f]+ (\S+)")
VAL_RE = re.compile(r"^\s+\(([^)]*)\)\s?(.*)$")
STYLE_RE = re.compile(r"\(style\) size=\d+(?: parent=(\S+))?")
ITEM_RE = re.compile(r"^\s+(?:([A-Za-z0-9_.:]+)\(0x[0-9a-f]+\)|(0x0101[0-9a-f]{4}))=(.*)$")
ANDROID_ATTRS = {
    "0x01010095": "android:textSize", "0x01010097": "android:textStyle",
    "0x01010098": "android:textColor", "0x01010218": "android:lineSpacingMultiplier",
    "0x010103ac": "android:fontFamily", "0x0101055f": "android:textFontWeight",
    "0x010100f4": "android:layout_width", "0x010100f5": "android:layout_height",
    "0x0101013f": "android:minWidth", "0x01010140": "android:minHeight",
    "0x010100d5": "android:padding", "0x010100d6": "android:paddingLeft",
    "0x010100d7": "android:paddingTop", "0x010100d8": "android:paddingRight",
    "0x010100d9": "android:paddingBottom", "0x010103b3": "android:paddingStart",
    "0x010103b4": "android:paddingEnd", "0x01010155": "android:height",
    "0x01010159": "android:width", "0x0101011f": "android:maxWidth",
    "0x01010120": "android:maxHeight", "0x010100d4": "android:background",
    "0x01010030": "android:colorBackground", "0x01010099": "android:textColorHighlight",
    "0x0101009a": "android:textColorHint", "0x01010217": "android:lineSpacingExtra",
    "0x01010433": "android:elevation", "0x010101e5": "android:button",
    "0x01010036": "android:textColorPrimary", "0x01010038": "android:textColorSecondary",
    "0x010100f6": "android:layout_margin", "0x010100f9": "android:layout_marginRight",
    "0x010100f7": "android:layout_marginLeft", "0x010100f8": "android:layout_marginTop",
    "0x010100fa": "android:layout_marginBottom", "0x010103b5": "android:layout_marginStart",
    "0x010103b6": "android:layout_marginEnd", "0x01010000": "android:theme",
    "0x01010003": "android:name", "0x010100af": "android:gravity",
}


def parse(path):
    table = {}
    cur = None
    cur_cfg = None
    with open(path, "r", encoding="utf-8", errors="replace") as f:
        for line in f:
            line = line.rstrip("\n")
            m = RES_RE.match(line)
            if m:
                cur = m.group(1)
                table.setdefault(cur, {})
                cur_cfg = None
                continue
            if cur is None:
                continue
            m = ITEM_RE.match(line)
            if m and cur_cfg is not None and isinstance(table[cur].get(cur_cfg), dict):
                key = m.group(1) or ANDROID_ATTRS.get(m.group(2), m.group(2))
                table[cur][cur_cfg]["items"][key] = m.group(3).strip()
                continue
            m = VAL_RE.match(line)
            if m and line.startswith("      ") and not line.startswith("        "):
                cfg, val = m.group(1), m.group(2).strip()
                sm = STYLE_RE.match(val)
                if sm:
                    table[cur][cfg] = {"parent": sm.group(1), "items": {}}
                else:
                    table[cur][cfg] = val
                cur_cfg = cfg
    return table


if __name__ == "__main__":
    t = parse(sys.argv[1])
    with open(sys.argv[2], "w", encoding="utf-8") as f:
        json.dump(t, f, ensure_ascii=False, indent=0)
    print(len(t), "resources")
