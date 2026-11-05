# Upstream sync log

Opaline tracks [Miuix](https://github.com/compose-miuix-ui/miuix) for fixes and platform work.
Every sync is recorded here: the upstream range, what was taken, and what was left out and why.

## How a sync works

`reverse/tools/upstream_sync.py` performs a three-way merge in a scratch repository:

- **base**: upstream at the previous sync point, translated into Opaline's layout and names
- **theirs**: upstream at the target commit, translated the same way
- **ours**: the Opaline tree

The translation maps `miuix-*` modules to `opaline-*`, `top.yukonga.miuix.kmp` to
`io.github.a1b2d56.opaline`, `Miuix*`/`miuix*` symbols to `Opaline*`/`opaline*`, `build-logic` to
`build-plugins`, and Miuix headers to Opaline's attribution header. Upstream changes then land
automatically wherever COUI and Opaline did not touch the same lines; overlapping edits surface as
conflicts and are resolved by hand (`reverse/tools/resolve.py`).

In scope: the library modules Opaline carries, `build-plugins`, `gradle/` (version catalog and wrapper
properties), `gradle.properties`, `baselineprofile`, and `example/` (shared, android, desktop, web,
macos). Out of scope: `docs/` (Opaline writes its own), CI workflows, IDE files, baseline profile
outputs (regenerated), and upstream modules Opaline does not carry.

```bash
python -I reverse/tools/upstream_sync.py <miuix-clone> . <scratch-dir> <previous-sync-commit> <target-commit>
```

## Sync 1 — 2026-11-07

- **Fork point:** `a84c1811` (2026-07-25, "docs: move agent instructions to AGENTS.md"). COUI v1.1.0
  forked here: its version catalog matches upstream `b76d23ce` and it already carries the 2026-07-25
  nav fixes (`8c989bfd`, `a43f0790`), but not `652804e1` (2026-07-29).
- **Target:** `b7a5f08f` (2026-11-07, upstream `main`: Miuix 0.9.4, Gradle 9.9.0 and the glass PR), 116 commits.
- **Result:** 131 files merged (93 automatically, 38 with conflicts resolved by hand), desktop build and
  197 desktop tests green.

### Taken

| Area | Upstream changes |
| :-- | :-- |
| Toolchain | Kotlin 2.4.21, Compose Multiplatform 1.12.2, AGP 9.5.1, Gradle 9.9.0 (official distribution URL), Spotless 8.11.0, Compose ktlint rules 0.6.8, kotlinx.serialization 1.12.0, kotlinx-collections-immutable 0.5.2, navigationevent 1.2.0, material-color-utilities v6, about.libraries 15.3 |
| Build | `minSdk` 24 (`3fa5207e`), Gradle feature previews `NO_IMPLICIT_LOOKUP_IN_PARENT_PROJECTS` / `ENHANCED_GRAPH_ORDERING`, composite-build include outside `pluginManagement` (`0657575a`), Yarn lock location and IDE-sync workaround, no wasmJs executables for libraries (`a1a55060`), baseline-profile task fallback to the example profile |
| opaline-nav | Back events bridged across Android windows (`652804e1`), predictive-back completion arbitration (`e1086564`, `be0aa838`), swipe conflict fixes (`1f3f05d6`), `LocalNavTransitionScope` (`5de9d0f5`), SavedState `CreationExtras` in entries (`29d6deb3`), focus cleared when the top entry changes (`70528417`), swipe dismissal cancelled on consumed release (`ea2dbb3a`) |
| opaline-ui | Pull-to-refresh and overscroll gated on real gesture sessions (`47393d7a`), cascading popup state tracked by position (`a370b370`), Snackbar kept above the floating toolbar (`825c683e`), pager gesture-conflict utilities and fixes (`39c40f99`, `a575835c`, `00e2f193`, `2afdbb39`), display-cutout insets on landscape tablets and foldables (`8d8c1ba9`), `ThemeColorSpec` simplification with Spec2026 for CMF (`f9fade84`), ColorPalette geometry cache (`153920c7`), BasicComponent unbounded-width measure (`fa6f5b50`), `dimColor` and `surface` hooks on dialogs and bottom sheets (from `b7a5f08f`) |
| opaline-blur | Progressive blur shader update optimisation (`5c91d5e5`), backdrop sampling during scale (`0f960603`) |
| TabRow | Horizontal nested-scroll containment (`86cce57f`, `a575835c`), ported by hand into COUI's segment-button implementation |
| NavigationBar | `colors` parameter on `NavigationBarItem` / `FloatingNavigationBarItem` (`e2cca731`), adapted: `NavigationBarItemColors` carries COUI's tab semantics (selected / unselected / disabled, icon shows selected while pressed, no alpha fades) instead of Miuix's alpha scaling; the upstream test was rewritten accordingly |

### Left out

| Upstream change | Reason |
| :-- | :-- |
| `miuix-glass`, `miuix-glass-icons` (`b7a5f08f`) | A port of HyperOS 4's glass material. Opaline has its own ColorOS 17 material (`OpalineMaterial`). |
| `miuix-window` and its Linux window fixes (`fc455d9a` and follow-ups) | Desktop window chrome with HyperOS-style captions. **Deferred**: worth adopting once its captions are restyled to ColorOS. |
| `example:desktop-nucleus`, Nucleus native desktop build | Depends on `miuix-window`. |
| Expandable `NavigationRail` with badges and `badge` on navigation items (from `b7a5f08f`) | A rewrite that conflicts with COUI's rail (display modes, ColorOS colors). **Deferred** as a feature; needs a ColorOS design pass and a ColorOS red-dot badge. |
| TopAppBar title blur, clipping and the pinned-title fix (`ad956299`, `d5c03cca`, `b7a5f08f`) | COUI replaced the TopAppBar with a ColorOS collapsing toolbar; these changes target Miuix's title logic. |
| Medium-weight SearchBar label | ColorOS 17's search input is 15sp regular. |
| PullToRefresh `isRefreshingNow` plumbing | Depends on Miuix's PullToRefresh internals that COUI replaced; only the gesture-session gating was taken. |
| MiSans web font and on-demand web font loading (`89792510`) | MiSans is Xiaomi's proprietary font. The MiSans preload the web demo inherited through COUI (`webfont` package, Xiaomi CDN) was removed as well; the demo uses the default font. |
| Example pages and settings for glass, nested-nav / overscroll test pages, liquid-glass bar refinements | Demo-only; conflicting example files keep COUI's versions. The example gets reworked in a later phase. |
| `build-logic` directory rename | Contents synced into `build-plugins`; the rename itself is cosmetic. |
| docs, CI, `.idea`, README changes | Opaline maintains its own. |

### Next sync

Use `b7a5f08f` as the base commit.
