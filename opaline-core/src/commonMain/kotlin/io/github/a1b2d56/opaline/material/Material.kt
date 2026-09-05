// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.material

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape

/**
 * The surfaces ColorOS 17 renders with its glass material (`COUIMaterialBlurEffect`,
 * `COUIMaterialStrokeEffect`, `COUIMaterialThemeBlurEffect`). Components ask for a type; how it is
 * drawn is decided by the [MaterialRenderer] in scope.
 */
enum class MaterialType {
    /** A circular toolbar control, such as the back button (`TYPE_FRAMEWORK_TOP_BAR` + `TYPE_FRAMEWORK_CIRCLE_1`). */
    TopBarCircle,

    /** A capsule grouping toolbar actions (`TYPE_FRAMEWORK_TOP_BAR` + `TYPE_FRAMEWORK_CAPSULE_1`). */
    TopBarCapsule,

    /** The search capsule (`TYPE_SEARCH_BAR_NO_MATERIAL`). */
    SearchBar,

    /** The bottom navigation or tool bar (`TYPE_FRAMEWORK_BOTTOM_BAR`). */
    BottomBar,

    /** A floating bottom bar or toolbar capsule (`TYPE_FRAMEWORK_BOTTOM_BAR` with its capsule rim). */
    FloatingBar,

    /** A dialog panel (`coui_dialog_list_mix_blur` / `_blend_blur` window blur). */
    DialogPanel,

    /** A bottom sheet panel (`coui_bottomdialog_list_mix_blur` / `_blend_blur`, ColorOS 17 only). */
    BottomSheetPanel,

    /** A primary (theme-colored) content button (`TYPE_CONTENT_PRIMARY_BUTTON` + `TYPE_CONTENT_CAPSULE_1`). */
    ContentPrimaryButton,

    /** A secondary content button (`TYPE_CONTENT_SECONDARY_BUTTON` + `TYPE_CONTENT_CAPSULE_2`). */
    ContentSecondaryButton,

    /** A borderless content button (`TYPE_CONTENT_TRANSPARENT_BUTTON` + `TYPE_CONTENT_CAPSULE_3`). */
    ContentTransparentButton,

    /** The container of a segmented control (`TYPE_CONTENT_SEGMENT_BUTTON`). */
    ContentSegment,

    /** An unselected chip (`TYPE_CONTENT_CHIP_TAB`). */
    ContentChipTab,

    /** A selected chip (`TYPE_CONTENT_CHIP_TAB_SELECTED`). */
    ContentChipTabSelected,
    ;

    /**
     * Whether this material belongs to a control inside page content. Content materials are drawn by
     * [LocalContentMaterialRenderer]; the others by [LocalMaterialRenderer].
     */
    val isContent: Boolean
        get() = ordinal >= ContentPrimaryButton.ordinal
}

/**
 * Draws a ColorOS 17 material behind a component.
 *
 * Opaline's components never depend on a blur implementation: they call [Modifier.material], which
 * does nothing unless a renderer is provided through [LocalMaterialRenderer]. `opaline-blur` provides
 * a backdrop-blur renderer (`ProvideMaterialBackdrop`); apps can supply their own.
 */
@Stable
interface MaterialRenderer {
    /**
     * Returns a modifier drawing [type] behind the content, clipped to [shape].
     *
     * @param type The material requested by the component.
     * @param shape The outline of the component.
     * @param dark Whether the dark variant should be used.
     * @param tint The component's own fill color, which tinted materials such as
     *   [MaterialType.ContentPrimaryButton] are built from, or [Color.Unspecified].
     * @param enabled Whether the component is enabled; tinted materials fade when it is not.
     */
    @Composable
    fun modifier(type: MaterialType, shape: Shape, dark: Boolean, tint: Color, enabled: Boolean): Modifier

    /**
     * Whether [type] is drawn by this renderer. Components keep their solid fill for types that are
     * not, and drop it for types that are, so the material shows through.
     */
    fun supports(type: MaterialType): Boolean = true
}

/**
 * The [MaterialRenderer] in scope, or `null` when components should keep their solid fills (the
 * default, and inside the content a backdrop is recorded from).
 */
val LocalMaterialRenderer = staticCompositionLocalOf<MaterialRenderer?> { null }

/**
 * The [MaterialRenderer] for controls inside page content (buttons, chips, segmented controls), or
 * `null` (the default) when they keep their solid fills.
 *
 * ColorOS 17 gives content controls glass only when an app opts in (`drawableMaterialEffect`),
 * typically over an image or a colored background. The renderer must sample a backdrop recorded
 * from that background, never from a layer the controls themselves are drawn into. Dialogs and
 * bottom sheets turn it off for their contents.
 */
val LocalContentMaterialRenderer = staticCompositionLocalOf<MaterialRenderer?> { null }

@Composable
private fun rendererFor(type: MaterialType): MaterialRenderer? = if (type.isContent) LocalContentMaterialRenderer.current else LocalMaterialRenderer.current

/** Whether a renderer in scope draws [type]. */
@Composable
fun isMaterialActive(type: MaterialType): Boolean = rendererFor(type)?.supports(type) == true

/**
 * Draws the ColorOS 17 material [type] behind this component when a [MaterialRenderer] is in scope;
 * otherwise returns the modifier unchanged.
 *
 * @param type The material to draw.
 * @param shape The outline of the component.
 * @param dark Whether the dark variant should be used.
 * @param tint The component's own fill color, used by tinted materials.
 * @param enabled Whether the component is enabled.
 */
@Composable
fun Modifier.material(
    type: MaterialType,
    shape: Shape,
    dark: Boolean,
    tint: Color = Color.Unspecified,
    enabled: Boolean = true,
): Modifier {
    val renderer = rendererFor(type) ?: return this
    if (!renderer.supports(type)) return this
    return this.then(renderer.modifier(type, shape, dark, tint, enabled))
}

/**
 * The solid color ColorOS 17 uses for [type] when the material cannot be drawn
 * (`ToolbarMaterialEffectDelegate` non-blur fallback, `PANEL_FALLBACK_OVERLAY_COLOR_*`), or `null`
 * when the component's own fill already matches.
 */
fun materialFallbackColor(type: MaterialType, dark: Boolean): Color? = when (type) {
    MaterialType.TopBarCircle, MaterialType.TopBarCapsule ->
        if (dark) Color(0xFF333333) else Color(0xFFF0F0F0)

    else -> null
}
