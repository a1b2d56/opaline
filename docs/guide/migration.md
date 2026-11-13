# Migrating from Miuix or COUI

Opaline descends from [Miuix](https://github.com/compose-miuix-ui/miuix) through
[COUI](https://github.com/suqi8/coui) and keeps the same API surface, so migrating is mostly a
mechanical rename: swap the dependency coordinates, update the package prefix and rename the
`Miuix*` / `COUI*` symbols to `Opaline*`.

::: tip
Your app keeps the same component set, but the visuals change to ColorOS 17 (colors, corner radii,
motion, press feedback and the glass material). See
[Behavioral and visual differences](#_7-behavioral-and-visual-differences).
:::

## From COUI

COUI apps are closest to Opaline. In short:

1. Replace the COUI coordinates with `io.github.a1b2d56.opaline:opaline-*:0.1.0` (one artifact per
   COUI artifact, same module names with `coui-` → `opaline-`).
2. Replace the package prefix `io.github.suqi8.coui.kmp` with `io.github.a1b2d56.opaline`.
3. Rename `COUI*` symbols to `Opaline*` (`COUITheme` → `OpalineTheme`, `COUIIcons` → `OpalineIcons`,
   `COUIIndication` → `OpalineIndication`, …).
4. Review the API changes made for ColorOS 17:
   - `NavigationBarItemColors` now has `selectedContentColor`, `unselectedContentColor` and
     `disabledContentColor`; build it with `NavigationBarDefaults.navigationBarItemColors()`.
   - `TopTips(cornerRadius = …)` takes `Dp?`; `null` (the default) picks a capsule on one line and
     16dp once the text wraps.
   - `Colors` gained a `controls` slot (the unchecked switch track); positional constructor calls
     need the extra argument.
   - The unused `DialogDefaults.ButtonBar*` metrics were removed; the button bar reads
     `DialogButtonBarDefaults`.
   - Bars, the search bar, dialogs and bottom sheets can draw the ColorOS 17 glass material, see
     [ColorOS 17 Material](./material.md).

The rest of this page covers migrating from Miuix.

## 1. Update dependencies

Replace the Miuix Maven coordinates (`top.yukonga.miuix.kmp`) with the Opaline ones
(`io.github.a1b2d56.opaline`). Every module has a 1:1 counterpart:

| Miuix module | Opaline module |
| :-- | :-- |
| `top.yukonga.miuix.kmp:miuix-ui` | `io.github.a1b2d56.opaline:opaline-ui` |
| `top.yukonga.miuix.kmp:miuix-preference` | `io.github.a1b2d56.opaline:opaline-preference` |
| `top.yukonga.miuix.kmp:miuix-icons` | `io.github.a1b2d56.opaline:opaline-icons` |
| `top.yukonga.miuix.kmp:miuix-blur` | `io.github.a1b2d56.opaline:opaline-blur` |
| `top.yukonga.miuix.kmp:miuix-squircle` | `io.github.a1b2d56.opaline:opaline-squircle` |
| `top.yukonga.miuix.kmp:miuix-nav` | `io.github.a1b2d56.opaline:opaline-nav` |
| `top.yukonga.miuix.kmp:miuix-shader` | `io.github.a1b2d56.opaline:opaline-shader` |
| `top.yukonga.miuix.kmp:miuix-core` | `io.github.a1b2d56.opaline:opaline-core` |

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("io.github.a1b2d56.opaline:opaline-ui:0.1.0")
            // Optional modules, same pattern:
            implementation("io.github.a1b2d56.opaline:opaline-preference:0.1.0")
            implementation("io.github.a1b2d56.opaline:opaline-icons:0.1.0")
        }
    }
}
```

Opaline also ships `io.github.a1b2d56.opaline:opaline-navigation3-ui`, an integration for AndroidX
Navigation 3.

## 2. Update the package prefix

Every package moves from `top.yukonga.miuix.kmp.*` to `io.github.a1b2d56.opaline.*` with the sub-package structure unchanged (`basic`, `theme`, `utils`, `icon`, `extra`/`preference`, `blur`, `nav`, …). A single find-and-replace over your sources handles it:

```shell
# macOS / Linux (run from your project root)
grep -rl "top.yukonga.miuix.kmp" src | xargs sed -i 's/top\.yukonga\.miuix\.kmp/io.github.a1b2d56.opaline/g'
```

On Windows, use your IDE's "Replace in Files" (`Ctrl+Shift+R` in Android Studio / IntelliJ) with `top.yukonga.miuix.kmp` → `io.github.a1b2d56.opaline`.

## 3. Renamed APIs

All `Miuix*`-prefixed symbols are renamed to `Opaline*`. The mapping is exactly 1:1:

| Miuix | Opaline |
| :-- | :-- |
| `MiuixTheme` (composable + object) | `OpalineTheme` |
| `MiuixIndication` | `OpalineIndication` |
| `MiuixPopupUtils` | `OpalinePopupUtils` |
| `MiuixPopupHost` | `OpalinePopupHost` |
| `MiuixScrollBehavior` | `OpalineScrollBehavior` |
| `MiuixIcons` | `OpalineIcons` |
| `MiuixOverscrollEffect` | `OpalineOverscrollEffect` |
| `MiuixOverscrollFactory` | `OpalineOverscrollFactory` |
| `NavTransitions.MiuixDefault` | `NavTransitions.OpalineDefault` |
| `BadgedBox` | `BadgeBox` (signature also changed, see below) |

A second find-and-replace of `MiuixTheme` → `OpalineTheme`, `MiuixIcons` → `OpalineIcons`, etc. covers these. The `folmeSpring` easing helper is now `responseSpring` (in `OpalineEasing.kt`), with the same parameters.

## 4. Changed APIs

A few components were rebuilt for ColorOS and their signatures differ.

### Badge

Miuix's `Badge` takes free-form content; Opaline's `Badge` is count-based and picks its form automatically — a dot when `count <= 0`, a number capsule for a positive count, and an ellipsis form for large counts. `BadgedBox` is renamed to `BadgeBox` and gains an `overhang` parameter controlling how far the badge sticks out of the content.

```kotlin
// Miuix
BadgedBox(badge = { Badge { Text("8") } }) { Icon(...) }

// Opaline
BadgeBox(badge = { Badge(count = 8) }) { Icon(...) }
```

### TextField

Opaline's `TextField` adds a `backgroundMode: TextFieldMode` parameter with three ColorOS forms — `Rectangle` (stroked rounded rectangle), `Line` (bottom underline, the default) and `None` (bare text). Related default changes and additions:

- `useLabelAsPlaceholder` now defaults to `true` (ColorOS fields use a hint instead of a floating label; Miuix defaulted to `false`).
- New parameters: `justShowFocusLine`, `isError`, `maxCount` (character counter), `showClearButton`, `showPasswordToggle`.
- `insideMargin` and `textStyle` defaults now depend on the selected mode.

For the ColorOS "card input" with a separate title above the field, use the new [InputView](../components/inputview.md) instead.

### PressFeedbackType

`PressFeedbackType` (used by `Card` and other pressables) gains a new `Tint` value — the COUI press-mask feedback. Any exhaustive `when` over it stops compiling until you add the new branch (or an `else`):

```kotlin
when (pressFeedbackType) {
    PressFeedbackType.None -> ...
    PressFeedbackType.Sink -> ...
    PressFeedbackType.Tilt -> ...
    PressFeedbackType.Tint -> ... // new in Opaline
}
```

### Dialog content padding

`OverlayDialog` / `WindowDialog` deliberately apply **no padding** to the `content` slot, so button bars and dividers can span the full dialog width (matching ColorOS). If your Miuix dialogs relied on built-in content insets, wrap your content in its own padding — `24.dp` horizontal matches the COUI title/summary insets:

```kotlin
OverlayDialog(show = showDialog, title = "Title", onDismissRequest = { ... }) {
    Column(Modifier.padding(start = 24.dp, end = 24.dp, bottom = 24.dp)) {
        // dialog body
    }
}
```

If you show many dialogs, wrap this once in your own `AppDialog` composable instead of padding every call site.

### TopAppBar

The navigation icon already carries a built-in `navigationIconPadding` of `16.dp`. If you added your own start padding around the back button under Miuix, remove it — otherwise the icon sits too far from the edge.

### TabRow

`TabRow` is visually rebuilt as ColorOS segment buttons. The signature is compatible, with small differences: `itemSpacing` defaults to `0.dp` (was `9.dp`; `TabRowWithContour` was `5.dp`), the plain `TabRow` defaults to a transparent background and accepts an `indication` parameter, and `TabRowWithContour` gains a `contourPadding` parameter.

### Switch

`Switch` gains `isLoading: Boolean = false` — while loading, the thumb shows the COUI spinner and the switch cannot be toggled (mirroring ColorOS async settings).

## 5. Migrating from an older Miuix (the `extra` package)

Older Miuix releases shipped a `top.yukonga.miuix.kmp.extra` package with `Super*`-prefixed components. Both Miuix and Opaline have since split it up; if your project still uses `extra.*`, map as follows:

| Old Miuix (`extra.*`) | Opaline |
| :-- | :-- |
| `SuperDialog` | `overlay.OverlayDialog` (or `window.WindowDialog`) — `show` is now a plain `Boolean` instead of `MutableState<Boolean>` |
| `SuperCheckbox` | `opaline-preference`: `preference.CheckboxPreference` |
| `SuperSwitch` | `opaline-preference`: `preference.SwitchPreference` |
| `SuperArrow` | `opaline-preference`: `preference.ArrowPreference` |
| `SuperDropdown` | `opaline-preference`: `preference.OverlayDropdownPreference` / `WindowDropdownPreference` |
| `SuperSpinner` | `opaline-preference`: `preference.OverlaySpinnerPreference` / `WindowSpinnerPreference` |
| `CheckboxLocation` | `opaline-preference`: `preference.CheckboxLocation` |
| `WindowBottomSheet` | `window.WindowBottomSheet` (package changed only) |

The preference components live in the separate `opaline-preference` artifact — add it to your dependencies if you only had `miuix` before. Old direct styling parameters (such as `TextField`'s `backgroundColor`) have generally moved into the corresponding `Defaults.…Colors(...)` factories.

## 6. Custom color schemes

The `Colors` constructor keeps Miuix's parameter order, so a fully custom scheme built with positional arguments carries over unchanged and keeps compiling. That said, consider deleting your custom palette entirely — `lightColorScheme()` / `darkColorScheme()` now return the native ColorOS 17 palette, which is usually what an Opaline app wants; a real-world migration removed ~220 lines of custom colors this way.

## 7. Behavioral and visual differences

The API stays familiar, but every component is rethemed to ColorOS 17:

- **Icons**: the weighted icon set (`MiuixIcons.Light` … `Demibold`, package `icon.extended`) is not carried over. `opaline-icons` holds ColorOS 17 icons under `OpalineIcons.System` (package `icon.system`), in one weight; pick the closest one from the [icon list](./icons.md).
- **Colors**: the color scheme values follow ColorOS (accent, container and surface colors differ from upstream); keep using `OpalineTheme.colorScheme.*` and your code picks the new values up automatically.
- **Shape and metrics**: corner radii, paddings and component sizes follow the ColorOS specification.
- **Motion**: animation curves and press feedback (scale/tint) follow COUI's motion design.
- **Dynamic color**: Monet / dynamic color is still supported through `ThemeController` (`ColorSchemeMode.MonetSystem`, `MonetLight`, `MonetDark`), exactly as before — see [Theme System](../guide/theme.md).

## 8. New components

Migrating also unlocks components that do not exist in Miuix:

- [Chip](../components/chip.md) — capsule-shaped checkable filter tag.
- [TopTips](../components/toptips.md) — tip banner shown at the top of a page.
- [Stepper](../components/stepper.md) — minus/plus integer stepper.
- [InputView](../components/inputview.md) — ColorOS card input with title and error caption.
- [CodeTextField](../components/codetextfield.md) — verification-code input with per-digit cells.
- [DatePicker](../components/datepicker.md) — year/month/day wheel picker.
- [TimePicker](../components/timepicker.md) — hour/minute (and AM/PM) wheel picker.
- [FullPageStatement](../components/fullpagestatement.md) — first-launch user agreement page.
- [ColorSwatchPicker](../components/colorswatchpicker.md) — swatch-based color picker.
- [LoadingButton](../components/loadingbutton.md) — button with built-in loading dots.
- [LoadingDialog](../components/loadingdialog.md) — rotating-spinner progress dialog (Overlay/Window variants).
- [SecurityDialog](../components/securitydialog.md) — security statement dialog (Overlay/Window variants).
- New preferences: [ButtonPreference](../components/buttonpreference.md), [ListPreference / MultiSelectListPreference](../components/listpreference.md), [MarkPreference](../components/markpreference.md), [RecommendedPreference](../components/recommendedpreference.md), [SwitchLoadingPreference](../components/switchloadingpreference.md).
