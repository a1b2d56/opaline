# Changelog

## 0.1.0

The first Opaline release. Opaline continues [COUI](https://github.com/suqi8/coui) (ColorOS 16) and
moves it to ColorOS 17, with every new value read from the ColorOS 17 system software. The full
record, including what is still unverified, is
[`docs/coui17-delta.md`](https://github.com/a1b2d56/opaline/blob/main/docs/coui17-delta.md).

### ColorOS 17

- **Glass material.** A `MaterialRenderer` contract in `opaline-core`, a backdrop-blur renderer in
  `opaline-blur` (`ProvideMaterialBackdrop`, `MaterialBackdropSource`) and the system presets in
  `OpalineMaterial`. TopAppBar controls, SearchBar, NavigationBar, FloatingNavigationBar,
  FloatingToolbar, overlay dialogs and bottom sheets draw it when a renderer is provided. See
  [ColorOS 17 Material](./material.md).
- **Content glass.** Buttons, chips and segmented controls over an image or panel can blur it with
  `ContentMaterialBox` (`drawableMaterialEffect` on ColorOS).
- **Dialogs.** Capsule button pills that stack when a label does not fit or when there are three
  buttons, as in `COUIButtonBarLayout`, and an optional recommended (primary) button.
- **TopAppBar.** 24sp collapsed title, 18sp while a subtitle stays visible.
- **Switch.** The thumb follows the finger and resists past either end; the unchecked track uses the
  new `controls` color.
- **TopTips.** Capsule on one line, 16dp corners once the text wraps, animated between the two.
- **NavigationBar.** Item colors follow the ColorOS 17 tab state model.
- **System icons.** `OpalineIcons.System` in `opaline-icons`: 107 single-weight icons from
  ColorOS 17: the volume panel, connected devices, controls and the Settings categories and actions.
- Recalibrated colors, radii and metrics across components.

### Library

- New name, packages (`io.github.a1b2d56.opaline`) and Maven group.
- Upstream Miuix fixes synced to `b7a5f08f`.
- Public API tracked with Kotlin ABI validation.
- Some icons redrawn from scratch.
