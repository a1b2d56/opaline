# Contributing to Opaline

Thanks for helping out. This page covers how the project is laid out, the conventions the code
follows and what to run before opening a pull request.

## Commands

| Action              | Command                                                     |
| :------------------ | :---------------------------------------------------------- |
| Build (full)        | `./gradlew assemble`                                        |
| Build (quick check) | `./gradlew compileKotlinDesktop`                            |
| Test                | `./gradlew check`                                           |
| Check formatting    | `./gradlew spotlessCheck` (also runs `checkLicenseHeaders`) |
| Fix formatting      | `./gradlew spotlessApply`                                   |
| Update API dumps    | `./gradlew updateKotlinAbi` (`check` runs `checkKotlinAbi`) |
| Run Android demo    | `./gradlew :example:android:installDebug`                   |
| Run Desktop demo    | `./gradlew :example:desktop:hotRunDesktop --auto`           |
| Run WasmJs demo     | `./gradlew :example:web:wasmJsBrowserRun`                   |
| Run Js demo         | `./gradlew :example:web:jsBrowserDevelopmentRun`            |
| Run macOS demo      | `./gradlew :example:macos:runDebugExecutableMacosArm64`     |
| Run iOS demo        | Open `example/ios/iosApp.xcodeproj` in Xcode and run        |

CI rejects formatting violations, so run `./gradlew spotlessCheck` before pushing. If you change
the public API, run `./gradlew updateKotlinAbi` and commit the updated files under `api/`.

## Repository layout

| Directory                 | Purpose                                                              |
| :------------------------ | :------------------------------------------------------------------- |
| `opaline-core/`           | Utilities, the material contract and the `OpalineIcons` base         |
| `opaline-ui/`             | Main UI library                                                      |
| `opaline-preference/`     | Preference, menu and popup components                                |
| `opaline-blur/`           | Blur effects and the ColorOS 17 material presets (Android minSdk 33) |
| `opaline-shader/`         | Runtime shader abstraction                                           |
| `opaline-squircle/`       | Smooth (squircle) corners                                            |
| `opaline-icons/`          | ColorOS 17 icon set (`OpalineIcons.System`)                          |
| `opaline-nav/`            | Self-contained navigation runtime                                    |
| `opaline-navigation3-ui/` | Navigation 3 UI                                                      |
| `example/`                | Demo app                                                             |
| `baselineprofile/`        | Android baseline profile generation                                  |
| `docs/`                   | VitePress documentation site                                         |
| `build-plugins/`          | Gradle convention plugins                                            |
| `reverse/`                | ColorOS 17 calibration tooling (see `reverse/notes.md`)              |

Components live in `opaline-ui/src/commonMain/kotlin/io/github/a1b2d56/opaline/`:

| Subdir     | Contents                                                        |
| :--------- | :-------------------------------------------------------------- |
| `basic/`   | Fundamental components (Button, Switch, TextField, Surface, …)  |
| `overlay/` | Scaffold-hosted overlays (OverlayDialog, OverlayBottomSheet, …) |
| `window/`  | Platform window components (WindowDialog, WindowBottomSheet, …) |
| `layout/`  | Shared layout primitives                                        |
| `theme/`   | OpalineTheme, Colors, TextStyles, ThemeController               |
| `color/`   | Color utilities                                                 |
| `anim/`    | Easing curves and animation helpers                             |
| `utils/`   | General utilities                                               |
| `icon/`    | Built-in basic icons                                            |

Almost all UI code lives in `commonMain`. Platform source sets (`androidMain`, and `skikoMain` with
`darwinMain`, `desktopMain` and `webMain` below it) are only for genuinely platform-specific code.

## Code style

- Spotless with ktlint and the Compose rules. Versions are in
  `build-plugins/src/main/kotlin/module.spotless.gradle.kts`. Icon files and parts of
  `opaline-navigation3-ui` are excluded.
- Code, comments, KDoc and docs are in English.
- Every `.kt` and `.kts` file starts with its copyright lines followed by
  `// SPDX-License-Identifier: Apache-2.0`. Keep the existing upstream lines.
  - New file: `// Copyright 2026, Opaline contributors`
  - File from Miuix: `// Copyright <year>, compose-miuix-ui contributors`, then
    `// Modifications Copyright 2026, COUI contributors and Opaline contributors`
  - File from COUI: `// Copyright <year>, COUI contributors`, then
    `// Modifications Copyright 2026, Opaline contributors`
  - Files adapted from AndroidX keep their original header.

## API conventions

```kotlin
@Composable
fun ComponentName(
    onClick: () -> Unit,                                  // required parameters, callbacks first
    modifier: Modifier = Modifier,
    enabled: Boolean = true,                              // flags
    cornerRadius: Dp = ComponentDefaults.CornerRadius,    // visuals, defaulted from ComponentDefaults
    colors: ComponentColors = ComponentDefaults.componentColors(),
    content: @Composable () -> Unit,                      // content last
)
```

- Each component has a `ComponentDefaults` object: dimensions as `val`, color factories as
  `@Composable` functions that `remember` their result.
- Color holders are `@Immutable data class`es. Use `@Stable` for classes holding lambdas or
  state-backed properties.
- Read colors and text styles from `OpalineTheme.colorScheme` and `OpalineTheme.textStyles`; never
  hardcode them in component bodies.
- Filled backgrounds use `Modifier.squircleSurface(...)`.
- Use `rememberUpdatedState` when a long-lived effect or cached lambda must read a fresh value, not
  when passing a callback straight to a child.
- `LaunchedEffect` keys are the values its body actually reads.
- Standard `List`/`Set`/`Map` are unstable to Compose; prefer `kotlinx.collections.immutable`.
- Add `@NonRestartableComposable` only to thin wrappers that delegate to another composable and read
  no state.

`BasicComponent` (`basic/Component.kt`) measures with a custom `Layout` and a weighted 2:5:3 split.
Don't replace it with `Row` and `weight(1f)`: text collapses to one character per line when the
start or end content overflows.

## Matching ColorOS 17

Visual values come from ColorOS 17, not from guesses.

- Cite the system resource or class a token comes from in its KDoc, for example
  `` `coui_popup_list_window_item_min_height` ``. System names keep their original spelling.
- Record calibration changes, and open questions, in `docs/coui17-delta.md`.
- ColorOS code branches on `OplusBuild.VERSION.SDK_VERSION`, which is 40 on ColorOS 17, so `> 37`
  branches and `-v37` resources apply.
- The tools in `reverse/` read a local ColorOS 17 `system_ext` dump. Dumps and decompiled code are
  git-ignored. Never commit ColorOS code, APKs or raw extracted files, and don't use ColorOS, COUI,
  OPPO or OnePlus in names, packages or symbols.
- `OpalineIcons.System` is generated: add a line to `reverse/tools/system_icons.txt` and run
  `reverse/tools/vd2kt.py`. Only single-colour vector icons belong there, not illustrations or
  bitmaps.

## Adding a component

1. Write the composable in `opaline-ui/.../basic/` (or `opaline-preference/.../preference/`),
   following the conventions above.
2. Add a demo section in `example/shared/src/commonMain/kotlin/component/` and register it in
   `MainPage.kt`.
3. Add an interactive docs demo in `docs/demo/src/commonMain/kotlin/` and register it in `Demo.kt`.
4. Write `docs/components/<name>.md`, add a row to `docs/components/index.md` and a sidebar entry in
   `docs/.vitepress/locales/en_US.ts`.
5. Check it on at least Android and Desktop.

When you change an existing component's API, defaults or behavior, update its docs page, the docs
demo and the example app too.

## Upstream Miuix

Fixes from Miuix are taken as reviewed patches and logged in `docs/upstream-sync.md`. Paths map
`miuix-*` → `opaline-*` and `top/yukonga/miuix/kmp` → `io/github/a1b2d56/opaline`; `Miuix*`
symbols become `Opaline*`.

## Commits

`<scope>: <summary>`, with scopes `library`, `docs`, `example`, `build`, `fix`, `fix(deps)` and
`chore(deps)`. Keep the subject under 72 characters, in sentence case and without a trailing
period. Reference issues and pull requests as `(#123)`.
