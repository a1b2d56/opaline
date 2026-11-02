# ColorOS 17 Material

ColorOS 17 draws bars, toolbar controls and panels with a glass material: the content behind them is
blurred, tinted by two color layers with their own blend modes, and outlined by a soft light rim.
Opaline reproduces it with values taken from the ColorOS 17 component library
(`COUIMaterialBlurEffect`, `COUIMaterialStrokeEffect`).

## How it fits together

The material is opt-in and split across two modules, so `opaline-ui` never depends on a blur
implementation:

- **`opaline-core`** defines the contract: `MaterialType`, `MaterialRenderer` and
  `LocalMaterialRenderer`. Without a renderer in scope, components keep their solid fills.
- **`opaline-blur`** provides the implementation: `ProvideMaterialBackdrop` draws every type by
  blurring a recorded backdrop, and `MaterialBackdropSource` records the page.

| Component | Material | ColorOS 17 source |
| :-- | :-- | :-- |
| `TopAppBar` navigation control | `TopBarCircle` (glass circle) | `TYPE_FRAMEWORK_TOP_BAR` + `TYPE_FRAMEWORK_CIRCLE_1` |
| `TopAppBar` action group | `TopBarCapsule` (glass capsule) | `TYPE_FRAMEWORK_TOP_BAR` + `TYPE_FRAMEWORK_CAPSULE_1` |
| `SearchBar` | `SearchBar` | `TYPE_SEARCH_BAR_NO_MATERIAL` |
| `NavigationBar` | `BottomBar` | `TYPE_FRAMEWORK_BOTTOM_BAR` |
| `FloatingNavigationBar`, `FloatingToolbar` | `FloatingBar` (with rim) | `TYPE_FRAMEWORK_BOTTOM_BAR` |
| Overlay dialogs | `DialogPanel` | `coui_dialog_list_mix_blur` / `_blend_blur` |
| Overlay bottom sheets | `BottomSheetPanel` | `coui_bottomdialog_list_mix_blur` / `_blend_blur` |

## Usage

```kotlin
val backdrop = rememberLayerBackdrop()

ProvideMaterialBackdrop(backdrop) {
    Scaffold(
        topBar = { TopAppBar(title = "Settings", actions = { /* icon buttons */ }) },
        bottomBar = { NavigationBar { /* items */ } },
    ) { padding ->
        MaterialBackdropSource(backdrop, Modifier.fillMaxSize()) {
            // Page content: recorded into the backdrop, drawn with solid fills.
        }
    }
}
```

Place `ProvideMaterialBackdrop` around the **root** `Scaffold` so its popup host, which renders
overlay dialogs and bottom sheets, is inside the provider and outside the recorded content.

## Rules

- **Nothing inside `MaterialBackdropSource` draws a bar material.** A component cannot blur the
  layer it is being recorded into, so the source turns the bar materials off for its content. Use
  content glass (below) for controls inside the page.
- **Window variants stay solid.** `WindowDialog`, `WindowBottomSheet` and the other `Window*`
  components open a separate platform window that cannot sample the main window, so they turn
  materials off.
- **Runtime shaders are required.** Where they are unavailable (Android below 13), the renderer
  reports every type as unsupported and components keep their solid fills.

## Content glass

ColorOS 17 also has glass for controls inside the page: secondary, primary and borderless buttons,
chips and segmented controls. Apps opt in per control (`drawableMaterialEffect`), usually when the
controls sit on an image or a colored panel. In Opaline, `ContentMaterialBox` records a background
and gives the controls laid over it the glass:

```kotlin
ContentMaterialBox(
    background = {
        Image(painter, contentDescription = null, Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    },
    modifier = Modifier.fillMaxWidth().height(240.dp),
) {
    Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        TabRowWithContour(tabs = tabs, selectedTabIndex = tab, onTabSelected = { tab = it })
        Chip(selected = true, onClick = {}, label = "Favorites")
        TextButton(text = "Primary", onClick = {}, colors = ButtonDefaults.textButtonColorsPrimary())
    }
}
```

| Control | Material |
| :-- | :-- |
| `Button` / `TextButton` with the primary color | `TYPE_CONTENT_PRIMARY_BUTTON`, tinted with the button color |
| `Button` / `TextButton` with a transparent fill | `TYPE_CONTENT_TRANSPARENT_BUTTON` |
| Other `Button` / `TextButton` | `TYPE_CONTENT_SECONDARY_BUTTON` |
| Unselected `Chip` | `TYPE_CONTENT_CHIP_TAB` |
| Selected `Chip` | The primary button material, tinted with the chip color |
| `TabRowWithContour` container | `TYPE_CONTENT_SEGMENT_BUTTON` |

To record the background yourself, use `ProvideContentMaterial(backdrop)` around the controls. The
backdrop must not contain the controls. Dialogs and bottom sheets turn content glass off for their
contents, so their buttons keep the solid ColorOS 17 pill.

<p>
  <img src="/screenshots/content-glass-light.webp" width="45%" alt="Content glass over a photo, light" />
  <img src="/screenshots/content-glass-dark.webp" width="45%" alt="Content glass over a photo, dark" />
</p>

## Using a preset directly

`opaline-blur` also exposes the raw presets for your own surfaces:

```kotlin
Box(
    Modifier.opalineMaterial(
        backdrop = backdrop,
        shape = RoundedCornerShape(24.dp),
        material = OpalineMaterial.FrameworkBottomBar,
        dark = isSystemInDarkTheme(),
    ),
)
```

`OpalineMaterial` lists every ColorOS 17 preset (top bar, search bar, bottom bar, secondary,
transparent and segment buttons, chip tabs, dialog and bottom-sheet panels), each with its light and
dark parameters; `opalinePrimaryButtonMaterial(themeColor, enabled, dark)` builds the theme-tinted
primary button material.

## Accuracy

Blur radii, color layers and blend modes are transcribed exactly. Two parts are approximations:

- The rim is drawn with the blur module's edge highlight (width and opacity from
  `COUIMaterialStrokeEffect`); ColorOS renders it with a native edge shader that also takes an angle
  and shadow-fade parameters.
- Dialog and bottom-sheet panels use ColorOS's window-blur parameters: the mix and blend colors go to
  `OplusBlurParam.setMaterialParams` and the radius (`coui_dialog_blur_radius` 200px,
  `coui_bottomdialog_blur_radius` 400px) to `ViewRootManager.setBlurRadius`. The blending happens in
  the system compositor, which is not part of the app libraries; Opaline draws the mix color
  source-over and the blend color as an overlay.

## Screenshots

The overlay bottom sheet of the example app with the material, in light and dark themes:

<p>
  <img src="/screenshots/bottom-sheet-light.webp" width="45%" alt="Glass bottom sheet, light" />
  <img src="/screenshots/bottom-sheet-dark.webp" width="45%" alt="Glass bottom sheet, dark" />
</p>
