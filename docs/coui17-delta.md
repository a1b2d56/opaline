<!-- Copyright 2026, opaline contributors -->
<!-- SPDX-License-Identifier: Apache-2.0 -->

# ColorOS 16 → ColorOS 17 (COUI 17) delta

This fork recalibrates the ColorOS 16 COUI library against **ColorOS 17**. Everything below was
pulled from the ColorOS 17 `system_ext` partition, with no device attached:

| Source | Version | Used for |
| :-- | :-- | :-- |
| `priv-app/Settings/Settings.apk` | `com.android.settings` 17.0.0 (compileSdk 37) | resource tokens (colors, dimens, styles, theme attrs) |
| `app/UXDesign/UXDesign.apk` | `com.oplus.uxdesign` 17.0.15 | resource tokens + decompiled COUI support library (`com.coui.appcompat.*`) |
| `framework/oplus-framework-res.apk`, `system/framework/oplus-framework.jar` | — | smooth-corner path API (`OplusPathSmooth`) |
| `system_ext/etc/build.prop` | `ro.build.version.oplus.api=40` | the OS-version gates in the COUI code |

**OS gate.** COUI branches on `OplusBuild.VERSION.SDK_VERSION`. ColorOS 17 reports **40**, so every
`> 37` branch (the "16.1" geometry) is live, and so is the one ColorOS 17-only gate, `>= 40`
(bottom-sheet background blur). Resources qualified `-v37` (Android 17) also apply.

Tooling lives in `reverse/tools/` (`parse_dump.py`, `res.py`, `citations.py`, `flag.py`,
`deobf_r.py`); see `reverse/notes.md`.

## 1. Applied to the library

### Color

| Slot | ColorOS 16 | ColorOS 17 | Token |
| :-- | :-- | :-- | :-- |
| `primary`, `primaryVariant`, `primaryContainer` (L) | `#0066FF` | **`#0080FF`** | `coui_color_blue` / `coui_color_primary_blue` (= `couiColorPrimary`) |
| `primary`, `primaryVariant` (D) | `#247CFF` | **`#1A8CFF`** | `coui_color_blue_dark` |
| `disabledPrimary`, `disabledPrimaryButton` | `#4D0066FF` / `#4D247CFF` | **`#4D0080FF` / `#4D1A8CFF`** | `coui_button_main_disable` |
| `tertiaryContainer(Variant)` | `#260066FF` / `#40247CFF` | **`#260080FF` / `#401A8CFF`** | `coui_color_secondary_blue` |
| `onTertiaryContainer` | `#0066FF` / `#5C9DFF` | **`#0080FF` / `#1A8CFF`** | `coui_color_label_theme_blue` |
| Segment indicator (TabRowWithContour) | `#FFFFFF` / `#1AFFFFFF` | **`#B2FFFFFF` / `#33FFFFFF`** (translucent) | `coui_color_segment_button_indicator` |
| Segment indicator shadow (D) | `#1A000000` | **`#14000000`** | `coui_segment_button_shadow_color` |
| TopTips container (D) | `#14FFFFFF` | **`#1AFFFFFF`** | `coui_color_container4` (night) |

The neutral ladder (labels, dividers, card, page background, press/hover, mask, error) did not change.

### Corners

ColorOS 17 draws cards, popups, dialogs and panels with the weighted G2 smooth path
(`Path.addSmoothRoundRect(..., weight)`, native). The `*_radius_{normal,large}_16_1` tokens
re-encode the same COUI corner ladder (XS 4 / S 8 / M 12 / L 16 / XL 20 / XXL 24 / XXXL 28 /
XXXXL 32) for heavier weights (2.5 normal, 3 large), as the side-by-side tables show:

| Step | design | legacy smooth radius @ weight | 16.1 normal @ 2.5 | 16.1 large @ 3 |
| :-- | :-- | :-- | :-- | :-- |
| M | 12 | 9 @ 0.99 | 15 | 17 |
| XL | 20 | 16 @ 1.1 | 24 | 28 |
| XXL | 24 | 19 @ 1.1 | 29 | 34 |
| XXXXL | 32 | 25 @ 1.1 | 38 | 45 |

The squircle (`SquircleDefaults.Extension` 1.2819) stands in for the legacy smooth path, as the 16
library already calibrated, so each 17 component takes the **legacy smooth radius of the ladder
step its 17 code selects**:

| Component | ColorOS 17 code path | Step | 16 lib | 17 lib |
| :-- | :-- | :-- | :-- | :-- |
| `CardDefaults.CornerRadius` | `COUICardListSelectedItemLayout.p()` → `coui_round_corner_xl_radius_normal_16_1` 24 @ 2.5 | XL | 12dp | **16dp** |
| `DialogDefaults.CornerRadius` | `COUIAlertDialogMaxLinearLayout` → `coui_round_corner_xxxxl_radius_large_16_1` 45 @ 3 | XXXXL | 19dp | **25dp** |
| Bottom sheet `cornerRadius` | `COUIPanelPercentFrameLayout` → `xxxxl_radius_large_16_1` 45 @ 3 | XXXXL | 20dp | **25dp** |
| Popup / cascading popup | `RoundFrameLayout` → `coui_popup_round_frame_layout_corner_radius` 28 @ 2.5 | XXL | 12 / 16dp | **19dp** |

⚠ This mapping is reasoned from the token tables, not measured. Check it on a ColorOS 17 device
(screenshot + corner arc height, as §9.5 of `coui-retheme-spec.md` did for 16).

### Geometry and spacing

| Item | 16 | 17 | Token / code |
| :-- | :-- | :-- | :-- |
| `SwitchDefaults.TrackWidth` (travel follows) | 38dp (travel 14) | **44dp** (travel 20) | `COUISwitchStyle switchMinWidth = bar_width` |
| Popup row min height | 48dp | **40dp** | `coui_popup_list_window_item_min_height` |
| Popup first/last row padding | 10dp (8 + 2) | **16dp** (8 + 8) | `coui_popup_list_padding_vertical` 8 (DefaultAdapter `c0`) |
| Popup row horizontal padding | 16dp | **20dp** | `coui_popup_list_window_item_icon_margin_left` |
| Popup divider | 0.33dp, inset 16 | **0.5dp, inset 20** | `coui_popup_list_divider_height`, `_default_divider_margin_horizontal` |
| Popup width bounds | 178–232dp | **168–256dp** | `coui_popup_list_window_min_width` / `_max_width` |
| TopAppBar expanded height | 107dp | **110dp** | `coui_appbar_title_expanded_height` |
| TopAppBar nav → title gap | 4dp | **10dp** | `coui_toolbar_gap_between_navigation_and_title` (values-v37) |
| TopAppBar title → actions gap | 8dp | **4dp** | `coui_toolbar_gap_before_menu` |
| New: `TopAppBarDefaults.ActionItemMinWidth` / `ActionItemSpacing` | — | **40dp / 10dp** | `coui_action_menu_item_min_width`, `coui_actionbar_menuitemview_item_spacing` (values-v37) |
| SearchBar input text | 16sp | **15sp** | `coui_search_view_input_text_size` |
| SearchBar action slide distance | 30dp | **60dp** | `coui_search_bar_functional_button_offset_distance` |
| TopTips message text | 14sp | **13sp** | `coui_toptips_view_default_text_size` |
| Loading dialog spinner | 26dp | **36dp** | `coui_spinner_loading_anim_width` |
| Loading dialog margins (top / below spinner / below text) | 26 / 16 / 26 | **28 / 12 / 28** | `coui_spinner_margin_*` |
| FullPageStatement fade edge | 46dp | **32dp** | `coui_full_page_statement_scroll_fade_length` |

### Dialog button bar (structural)

ColorOS 17 dialog buttons are capsule pills (`COUIAlertDialogBottomButtonSecondary` →
`Widget.COUI.Button.Large.ButtonNew.Secondary`, read from `coui_center_alert_dialog_button_panel.xml`):
44dp tall, full-capsule radius, `couiColorContainer8` fill, `couiColorLabelPrimary` 16sp text;
the neutral button (`…Secondary.Last`) is error-tinted. `COUIButtonBarLayout` pads each cell 16dp
on the outer edge, 4dp toward its neighbour, 4dp on top and 16dp under the last row, with no
dividers. `DialogButtonBar` was rewritten to this layout; `showDivider` now defaults to `false`
and a `neutralColors` parameter was added.

### Typography (Android 15+ `-v35` line spacing, which ColorOS 17 uses)

| Style | 16 | 17 | Token |
| :-- | :-- | :-- | :-- |
| `paragraph`, `body1` | 1.158 | **1.1321** | `coui_spacing_multiplier_body_l` |
| `button` | 1.263 | **1.1579** | `coui_spacing_multiplier_button_l` |
| `title4` | 1.2381 | **1.1429** | `coui_spacing_multiplier_headline_s` |

Sizes are unchanged. ColorOS 17 adds a `couiTextBodyL` tier at **15sp** (the old 16sp tier is now `couiTextBodyXL`).

## 2. New in ColorOS 17: the material (glass) layer

COUI 17 adds `COUIMaterialBlurEffect`, `COUIMaterialStrokeEffect`, `COUIMaterialThemeBlurEffect`
and `COUIMaterialStateManager`. Surfaces get a **backdrop** render effect
(`OplusViewBackgroundRenderEffect`): blur, then two `BlendModeColorFilter` layers, plus a native
glass rim (`OplusMaterialUtil.setEdgeParams`). All presets are transcribed into
`opaline-blur/.../blur/OpalineMaterial.kt`:

- `OpalineMaterial` presets: `FrameworkTopBar`, `FrameworkTopBarBlur`, `FrameworkTopBarLight`,
  `SearchBar`, `FrameworkBottomBar`, `ContentSecondaryButton`, `ContentTransparentButton`,
  `ContentSegmentButton`, `ContentChipTab(Selected)(NoBlur)`, `BottomSheetPanel`, `DialogPanel`,
  each with light and dark params, and the rim where COUI pairs one.
- `opalinePrimaryButtonMaterial(themeColor, enabled, dark)`: the theme-tinted primary button material.
- `Modifier.opalineMaterial(backdrop, shape, material, dark)`, built on `textureBlur`. COUI radii are
  pixels and are converted with the current density.

These presets back the component materials described under "Materials on components" below.

Approximations: the rim is drawn with the opaline-blur `Highlight` (width = `edgeWidthDp`,
alpha = `edgeAlpha`), not the native edge shader (`edgeAngle` and the shadow-fade params are
not reproduced). The window-level panel/dialog blur (`OplusBlurParam.setMaterialParams`, radius
400 / 200px through `ViewRootManager.setBlurRadius`) is drawn as a backdrop blur of the same pixel
radius with the mix color source-over and the blend color as an overlay.

### Materials on components

Components draw the material through a renderer contract, so `opaline-ui` keeps no blur dependency
(see `docs/guide/material.md`):

- `opaline-core`: `MaterialType`, `MaterialRenderer`, `LocalMaterialRenderer`, `Modifier.material`.
- `opaline-blur`: `BackdropMaterialRenderer`, `ProvideMaterialBackdrop`, `MaterialBackdropSource`.
- `opaline-ui`: TopAppBar navigation control (glass circle) and action group (glass capsule) from
  `ToolbarMaterialEffectDelegate` / `ToolbarMaterialEffectResolver`, SearchBar, NavigationBar,
  FloatingNavigationBar, FloatingToolbar, overlay dialogs and bottom sheets. `Window*` variants turn
  materials off (separate platform window). The example app uses all of it.

## 3. Interaction and color additions

| Item | ColorOS 17 source | Change |
| :-- | :-- | :-- |
| Switch drag | `COUISwitch.onTouchEvent` → `COUISpringDragHelper` (anchors 0 / travel, factor 0.55) | Thumb follows the finger; release on the other half toggles; past either end it resists with factor 0.55 |
| Switch unchecked track | `COUISwitch` `T0 = couiColorControls` | New `controls` color slot (`#29000000` / `#40FFFFFF`; Monet: on-surface 16% / 25%) used by `SwitchDefaults.switchColors()` |
| TopTips radius | `COUIDefaultTopTips.getSingleLineRadius` / `getMultiLineRadius` (SDK > 37) | Capsule (`couiRoundCornerFULL`) on one line, `coui_toptips_view_radius` 28dp @ weight 3 → 16dp once wrapped, animated; `cornerRadius` is now `Dp?` (null = automatic) |
| Icons | — | `ArrowRight`, `ArrowUpDown`, `Check` and the TextField password eye had been ported from ColorOS vector drawables by COUI; they are redrawn from scratch at the same metrics |
| Dialog recommended button | `COUIButtonBarLayout.setRecommendButtonId` → `e()`: `ButtonType.PRIMARY`, fill `couiColorLabelTheme`, text `coui_btn_default_text_color`, disabled `couiColorDisable` | `DialogButtonBar(recommended = …)` with `recommendedButtonColors()`; the stacking rule (`onMeasure`) does not look at it, so the old note that a recommend button forces stacking was wrong |
| Content glass | `COUIButton` / `COUIChip` / `COUISegmentButtonLayout` `drawableMaterialEffect`, `TYPE_CONTENT_*` presets | Opt-in `LocalContentMaterialRenderer`, separate from the bar renderer; `ContentMaterialBox` records a background and the controls over it blur it. Button picks primary / transparent / secondary from its color; unselected Chip uses the chip-tab glass, selected Chip the tinted primary glass; `TabRowWithContour` uses the segment glass for its container. Dialog and sheet contents turn it off |
| Panel blur radius | `integer/coui_bottomdialog_blur_radius` 400, `integer/coui_dialog_blur_radius` 200 → `m5.a.p()` → `ViewRootManager.setBlurRadius` | `BottomSheetPanel` 40 → 400px, `DialogPanel` 40 → 200px (the 40 had no source) |
| Collapsed title | `COUIAppbarTitleStyle.Collapsed` → `coui_appbar_title_collapsed_text_size` 24dp, sans-serif-semibold; `COUICollapsingToolbarLayout` switches to `coui_appbar_title_collapsed_with_subtitle_text_size` 18dp when `hasPersistentSubtitle()` | `TopAppBar` collapsed title 18sp medium → 24sp semibold, 18sp with a persistent subtitle. `SmallTopAppBar` stays at 18sp medium (`TextAppearance.COUI.Toolbar.SecondTitle`) |
| Switch thumb glow | `COUISwitch.R()` draws the glow bitmap only while `Z0` is true; the only write to `Z0` (`H0()`) sets it to false | Not drawn on ColorOS 17.0.15, so nothing to reproduce |

## 4. Not done yet (found, left for follow-up)

- **Panel material colors.** The dialog / bottom-sheet mix and blend colors go to
  `OplusBlurParam.setMaterialParams` (material type 3 in light, 2 in dark mode) and are blended by the
  system compositor, which is not in the system_ext dump. Opaline draws them source-over + overlay.
  Compare with a device.
- **Content glass in the wild.** ColorOS enables `drawableMaterialEffect` per control; which system
  screens use it, and over what, was not surveyed.
- **Device verification** of corner radii, material colors, the dialog pill layout, the 400px / 200px
  panel blur and the switch drag feel. All values here are read from the ROM; none were measured on a
  ColorOS 17 phone.
