# ColorOS 17 reverse-engineering workspace

Inputs (not committed): `C:\Users\Devil\Documents\repack\system_ext` (ColorOS 17 system_ext,
`ro.build.version.oplus.api=40`) and `repack\system\system\framework`.

Generated (git-ignored): `dump/` (aapt2 dumps, parsed JSON, build logs), `input/` (APK/dex copies),
`jadx/` (decompiled sources).

## Rebuild the dumps

```bash
AAPT2=$LOCALAPPDATA/Android/Sdk/build-tools/37.0.0/aapt2.exe
SE=/c/Users/Devil/Documents/repack/system_ext
$AAPT2 dump resources $SE/priv-app/Settings/Settings.apk > dump/Settings.res.txt
$AAPT2 dump resources $SE/app/UXDesign/UXDesign.apk > dump/UXDesign.res.txt
python -I tools/parse_dump.py dump/Settings.res.txt dump/Settings.json
python -I tools/parse_dump.py dump/UXDesign.res.txt dump/UXDesign.json
```

Decompile the COUI library: `jadx --no-res -d jadx/uxdesign input/uxdesign/UXDesign.apk`, then
`python -I tools/deobf_r.py jadx/uxdesign/sources dump/UXDesign.res.txt` to annotate the
obfuscated R references (`lb.d.A/*color/coui_color_error*/`).

## Tools

| Script | Use |
| :-- | :-- |
| `tools/res.py name ...` | look up and resolve a resource (`--apk`, `--style`, `--theme X --attr a b`, `--grep regex`) |
| `tools/citations.py <repo>` | every COUI token cited in the Kotlin sources, with its 17 value |
| `tools/flag.py <repo>` | citations whose 17 value does not appear near the citing line (likely changed) |
| `tools/deobf_r.py` | annotate jadx output with real resource names |
| `tools/vd2kt.py <res/drawable> tools/system_icons.txt <out dir>` | convert the listed SystemUI vector drawables into `OpalineIcons.System` (`--preview file.html` writes a contact sheet) |
| `tools/upstream_sync.py` | three-way merge of an upstream Miuix range, see `docs/upstream-sync.md` |
| `tools/resolve.py` | resolve conflict hunks left by a sync, one choice per hunk |

## Findings

See `docs/coui17-delta.md` for the full 16 → 17 delta, with sources and open items.
