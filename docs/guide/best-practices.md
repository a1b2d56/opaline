# Best Practices

## Start from the example app

The [example app](https://github.com/a1b2d56/opaline/tree/main/example) uses every component in
Opaline, including the ColorOS 17 material on its bars and sheets. Try it in the browser as the
[live demo](https://a1b2d56.github.io/opaline/example/){target="_blank"}, or run it locally:

```shell
./gradlew :example:desktop:hotRunDesktop --auto   # Desktop
./gradlew :example:android:installDebug          # Android
./gradlew :example:web:wasmJsBrowserRun          # Web (Wasm)
```

## Recommendations

- **Wrap your app in `OpalineTheme` once** and read colors and text styles from
  `OpalineTheme.colorScheme` and `OpalineTheme.textStyles` instead of hardcoding them. Dark mode and
  Monet colors then work without extra code.
- **Use `Scaffold` for overlays.** `OverlayDialog`, `OverlayBottomSheet` and the overlay menus are
  hosted by `Scaffold`; use the `Window*` variants only when you need a separate platform window.
- **Provide the material at the page level.** Record the page content with
  `MaterialBackdropSource` and wrap the bars in `ProvideMaterialBackdrop`, as described in
  [ColorOS 17 Material](./material.md). On devices without runtime shaders the components keep
  their solid fills automatically.
- **Keep lists lazy.** Use `LazyColumn` with `Card` groups for long settings pages; the overscroll
  effect and scroll haptics are applied automatically.
- **Prefer the preference components** (`SwitchPreference`, `ArrowPreference`, …) for settings rows:
  they already follow the ColorOS 17 list metrics.

## Projects built on the same foundations

Opaline shares its API with [Miuix](https://github.com/compose-miuix-ui/miuix), whose README lists
many apps built with it. Their structure carries over to Opaline almost unchanged; see
[Migrating from Miuix or COUI](./migration.md).
