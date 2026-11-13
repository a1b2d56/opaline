"""Convert Android vector drawables into `OpalineIcons.System` ImageVector files.

Reads a manifest of `<drawable name> <IconName>` lines and writes one Kotlin file
per icon. Colors are dropped (icons are tinted where they are used); per-path
alpha is kept relative to the most opaque path so two-tone icons survive.

Usage: python -I vd2kt.py <manifest> <out dir> <res/drawable dir>... [--preview file.html] [--skip-errors]

A drawable is taken from the first directory that has it.
"""

import math
import os
import re
import sys
import xml.etree.ElementTree as ET

A = "{http://schemas.android.com/apk/res/android}"
PACKAGE = "io.github.a1b2d56.opaline.icon.system"
ARGS = {"M": 2, "L": 2, "H": 1, "V": 1, "C": 6, "S": 4, "Q": 4, "T": 2, "A": 7, "Z": 0}
TOKEN = re.compile(r"[MmLlHhVvCcSsQqTtAaZz]|[-+]?(?:\d+\.?\d*|\.\d+)(?:[eE][-+]?\d+)?")
NODE = {"M": "MoveTo", "L": "LineTo", "C": "CurveTo", "Q": "QuadTo"}


def arc_to_cubics(x0, y0, rx, ry, phi, large, sweep, x, y):
    """Endpoint-parameterised SVG arc as a list of cubic segments."""
    if rx == 0 or ry == 0 or (x0 == x and y0 == y):
        return [(x0, y0, x, y, x, y)]
    rx, ry, phi = abs(rx), abs(ry), math.radians(phi)
    cp, sp = math.cos(phi), math.sin(phi)
    dx, dy = (x0 - x) / 2, (y0 - y) / 2
    x1, y1 = cp * dx + sp * dy, -sp * dx + cp * dy
    lam = x1 * x1 / (rx * rx) + y1 * y1 / (ry * ry)
    if lam > 1:
        rx, ry = rx * math.sqrt(lam), ry * math.sqrt(lam)
    num_ = rx * rx * ry * ry - rx * rx * y1 * y1 - ry * ry * x1 * x1
    den = rx * rx * y1 * y1 + ry * ry * x1 * x1
    k = math.sqrt(max(0.0, num_ / den)) * (-1 if large == sweep else 1)
    cx1, cy1 = k * rx * y1 / ry, -k * ry * x1 / rx
    cx, cy = cp * cx1 - sp * cy1 + (x0 + x) / 2, sp * cx1 + cp * cy1 + (y0 + y) / 2
    t1 = math.atan2((y1 - cy1) / ry, (x1 - cx1) / rx)
    t2 = math.atan2((-y1 - cy1) / ry, (-x1 - cx1) / rx)
    dt = t2 - t1
    if sweep and dt < 0:
        dt += 2 * math.pi
    elif not sweep and dt > 0:
        dt -= 2 * math.pi
    n = max(1, int(math.ceil(abs(dt) / (math.pi / 2) - 1e-9)))
    step = dt / n
    h = 4 / 3 * math.tan(step / 4)

    def point(t):
        ct, st = math.cos(t), math.sin(t)
        return (
            cx + rx * ct * cp - ry * st * sp,
            cy + rx * ct * sp + ry * st * cp,
            -rx * st * cp - ry * ct * sp,
            -rx * st * sp + ry * ct * cp,
        )

    out = []
    for i in range(n):
        ax, ay, adx, ady = point(t1 + i * step)
        bx, by, bdx, bdy = point(t1 + (i + 1) * step)
        out.append((ax + h * adx, ay + h * ady, bx - h * bdx, by - h * bdy, bx, by))
    return out


def parse_path(d):
    """Path data as absolute (command, numbers) pairs using M, L, C, Q and Z only."""
    tokens = TOKEN.findall(d)
    nodes, i, cmd = [], 0, None
    x = y = sx = sy = 0.0
    last_c = last_q = None
    while i < len(tokens):
        if tokens[i].isalpha():
            cmd = tokens[i]
            i += 1
        elif cmd in ("M", "m"):
            cmd = "L" if cmd == "M" else "l"
        up, rel = cmd.upper(), cmd.islower()
        n = ARGS[up]
        a = [float(t) for t in tokens[i:i + n]]
        i += n
        ox, oy = (x, y) if rel else (0.0, 0.0)
        c = q = None
        if up == "M":
            x, y = a[0] + ox, a[1] + oy
            sx, sy = x, y
            nodes.append(("M", [x, y]))
        elif up == "L":
            x, y = a[0] + ox, a[1] + oy
            nodes.append(("L", [x, y]))
        elif up == "H":
            x = a[0] + ox
            nodes.append(("L", [x, y]))
        elif up == "V":
            y = a[0] + oy
            nodes.append(("L", [x, y]))
        elif up in ("C", "S"):
            if up == "S":
                c1 = (2 * x - last_c[0], 2 * y - last_c[1]) if last_c else (x, y)
                a = [c1[0] - ox, c1[1] - oy] + a
            p = [a[0] + ox, a[1] + oy, a[2] + ox, a[3] + oy, a[4] + ox, a[5] + oy]
            c = (p[2], p[3])
            x, y = p[4], p[5]
            nodes.append(("C", p))
        elif up in ("Q", "T"):
            if up == "T":
                q1 = (2 * x - last_q[0], 2 * y - last_q[1]) if last_q else (x, y)
                a = [q1[0] - ox, q1[1] - oy] + a
            p = [a[0] + ox, a[1] + oy, a[2] + ox, a[3] + oy]
            q = (p[0], p[1])
            x, y = p[2], p[3]
            nodes.append(("Q", p))
        elif up == "A":
            ex, ey = a[5] + ox, a[6] + oy
            for seg in arc_to_cubics(x, y, a[0], a[1], a[2], a[3] != 0, a[4] != 0, ex, ey):
                nodes.append(("C", list(seg)))
            x, y = ex, ey
        elif up == "Z":
            x, y = sx, sy
            nodes.append(("Z", []))
        last_c, last_q = c, q
    return nodes


def color_alpha(value):
    """Alpha of a color attribute, or None when it paints nothing."""
    if not value:
        return None
    if value.startswith("#"):
        h = value[1:]
        if len(h) == 8:
            return int(h[:2], 16) / 255 or None
        if len(h) == 4:
            return int(h[0], 16) / 15 or None
    return 1.0


def dp(value):
    return float(value.replace("dip", "").replace("dp", ""))


def read_icon(path):
    root = ET.parse(path).getroot()
    if root.tag != "vector":
        raise ValueError("not a vector drawable")
    paths = []
    for e in root.iter():
        if e.tag == "group" and any(k != A + "name" for k in e.attrib):
            raise ValueError("transformed group")
        if "gradient" in e.tag:
            raise ValueError("gradient")
        if e.tag != "path":
            continue
        fill = color_alpha(e.get(A + "fillColor"))
        stroke = color_alpha(e.get(A + "strokeColor"))
        if fill is None and stroke is None:
            continue
        paths.append({
            "nodes": parse_path(e.get(A + "pathData")),
            "fill": None if fill is None else fill * float(e.get(A + "fillAlpha", 1)),
            "stroke": None if stroke is None else stroke * float(e.get(A + "strokeAlpha", 1)),
            "width": float(e.get(A + "strokeWidth", 0)),
            "cap": e.get(A + "strokeLineCap", "butt"),
            "join": e.get(A + "strokeLineJoin", "miter"),
            "evenodd": e.get(A + "fillType") == "evenOdd",
        })
    top = max(v for p in paths for v in (p["fill"], p["stroke"]) if v is not None)
    for p in paths:
        for k in ("fill", "stroke"):
            if p[k] is not None:
                p[k] = round(p[k] / top, 2)
    return {
        "w": dp(root.get(A + "width")),
        "h": dp(root.get(A + "height")),
        "vw": float(root.get(A + "viewportWidth")),
        "vh": float(root.get(A + "viewportHeight")),
        "paths": paths,
    }


def num(v):
    s = ("%.3f" % v).rstrip("0").rstrip(".")
    return "0" if s in ("-0", "") else s


def f(v):
    s = num(v)
    return (s if "." in s else s + ".0") + "f"


def kotlin(name, source, icon):
    var = "_" + name[0].lower() + name[1:]
    imports = [
        "androidx.compose.ui.graphics.Color",
        "androidx.compose.ui.graphics.PathFillType",
        "androidx.compose.ui.graphics.SolidColor",
        "androidx.compose.ui.graphics.vector.ImageVector",
        "androidx.compose.ui.graphics.vector.PathNode",
        "androidx.compose.ui.unit.dp",
        "io.github.a1b2d56.opaline.icon.OpalineIcons",
    ]
    if any(p["stroke"] is not None for p in icon["paths"]):
        imports += ["androidx.compose.ui.graphics.StrokeCap", "androidx.compose.ui.graphics.StrokeJoin"]
    o = [
        "// Copyright 2026, Opaline contributors",
        "// SPDX-License-Identifier: Apache-2.0",
        "",
        "package " + PACKAGE,
        "",
    ]
    o += ["import " + i for i in sorted(imports)]
    o += [
        "",
        "/** `%s` */" % source,
        "val OpalineIcons.System.%s: ImageVector" % name,
        "    get() {",
        "        if (%s != null) return %s!!" % (var, var),
        "        %s = ImageVector.Builder(" % var,
        '            name = "%s",' % name,
        "            defaultWidth = %s.dp," % f(icon["w"]),
        "            defaultHeight = %s.dp," % f(icon["h"]),
        "            viewportWidth = %s," % f(icon["vw"]),
        "            viewportHeight = %s," % f(icon["vh"]),
        "        ).apply {",
    ]
    for p in icon["paths"]:
        o += ["            addPath(", "                pathData = listOf("]
        for c, a in p["nodes"]:
            if c == "Z":
                o.append("                    PathNode.Close,")
            else:
                o.append("                    PathNode.%s(%s)," % (NODE[c], ", ".join(f(v) for v in a)))
        o.append("                ),")
        if p["fill"] is not None:
            o.append("                fill = SolidColor(Color.Black),")
            o.append("                fillAlpha = %s," % f(p["fill"]))
        if p["stroke"] is not None:
            o.append("                stroke = SolidColor(Color.Black),")
            o.append("                strokeAlpha = %s," % f(p["stroke"]))
            o.append("                strokeLineWidth = %s," % f(p["width"]))
            o.append("                strokeLineCap = StrokeCap.%s," % p["cap"].capitalize())
            o.append("                strokeLineJoin = StrokeJoin.%s," % p["join"].capitalize())
        o.append("                pathFillType = PathFillType.%s," % ("EvenOdd" if p["evenodd"] else "NonZero"))
        o.append("            )")
    o += [
        "        }.build()",
        "        return %s!!" % var,
        "    }",
        "",
        "private var %s: ImageVector? = null" % var,
        "",
    ]
    return "\n".join(o)


def svg(icon):
    o = ['<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 %s %s">'
         % (num(icon["vw"]), num(icon["vh"]))]
    for p in icon["paths"]:
        d = " ".join(c + " ".join(num(v) for v in a) for c, a in p["nodes"])
        attrs = 'fill="none"'
        if p["fill"] is not None:
            attrs = 'fill="#000" fill-opacity="%s" fill-rule="%s"' % (
                p["fill"], "evenodd" if p["evenodd"] else "nonzero")
        if p["stroke"] is not None:
            attrs += ' stroke="#000" stroke-opacity="%s" stroke-width="%s" stroke-linecap="%s" stroke-linejoin="%s"' % (
                p["stroke"], num(p["width"]), p["cap"], p["join"])
        o.append('<path d="%s" %s/>' % (d, attrs))
    o.append("</svg>")
    return "".join(o)


def main(argv):
    preview = None
    if "--preview" in argv:
        i = argv.index("--preview")
        preview = argv[i + 1]
        argv = argv[:i] + argv[i + 2:]
    lenient = "--skip-errors" in argv
    argv = [a for a in argv if a != "--skip-errors"]
    manifest, out, dirs = argv[1], argv[2], argv[3:]
    os.makedirs(out, exist_ok=True)
    cells, seen = [], set()
    for line in open(manifest, encoding="utf-8"):
        line = line.split("#")[0].split()
        if not line:
            continue
        source, name = line
        if name in seen:
            sys.exit("duplicate icon name: " + name)
        seen.add(name)
        found = [d for d in dirs if os.path.exists(os.path.join(d, source + ".xml"))]
        try:
            if not found:
                raise ValueError("not found")
            icon = read_icon(os.path.join(found[0], source + ".xml"))
        except ValueError as e:
            if not lenient:
                sys.exit("%s: %s" % (source, e))
            print("skipped %s: %s" % (source, e))
            continue
        with open(os.path.join(out, name + ".kt"), "w", encoding="utf-8", newline="\n") as fh:
            fh.write(kotlin(name, source, icon))
        cells.append("<figure>%s<figcaption>%s</figcaption></figure>" % (svg(icon), name))
    if preview:
        with open(preview, "w", encoding="utf-8") as fh:
            fh.write("<style>body{font:11px sans-serif;display:flex;flex-wrap:wrap;background:#fff}"
                     "figure{width:110px;margin:6px;text-align:center}</style>" + "".join(cells))
    print("wrote %d icons to %s" % (len(cells), out))


if __name__ == "__main__":
    main(sys.argv)
