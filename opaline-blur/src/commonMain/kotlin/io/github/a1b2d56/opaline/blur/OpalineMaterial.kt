// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.blur

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.blur.highlight.Highlight

/**
 * The backdrop half of a ColorOS 17 material: a blur followed by two color filters, each blended
 * over the blurred backdrop with its own mode.
 *
 * Mirrors `COUIMaterialBlurEffect.BlurEffectParams`, which COUI applies with
 * `OplusViewBackgroundRenderEffect` as `createBlurEffect(r) -> BlendModeColorFilter(layer1) ->
 * BlendModeColorFilter(layer2)`. A zero [blurRadiusPx] keeps the two color layers and skips the blur.
 *
 * @param blurRadiusPx The blur radius in pixels, as COUI passes it to `RenderEffect.createBlurEffect`.
 * @param layer1 The first color filter.
 * @param layer2 The second color filter, applied on top of [layer1].
 */
@Immutable
data class OpalineMaterialBlur(
    val blurRadiusPx: Float,
    val layer1: BlendColorEntry,
    val layer2: BlendColorEntry,
) {
    /** Whether this material draws nothing (COUI `TYPE_NO_EFFECT`). */
    val isEmpty: Boolean
        get() = blurRadiusPx == 0f && layer1.color.alpha == 0f && layer2.color.alpha == 0f
}

/**
 * The edge half of a ColorOS 17 material: the glass rim COUI draws with
 * `OplusMaterialUtil.setEdgeParams` (`COUIMaterialStrokeEffect.StrokeEffectParams`).
 *
 * @param edgeAlpha The opacity of the rim (`edgeAlpha`).
 * @param edgeWidth The width of the rim (`edgeWidthDp`).
 * @param isCircle Whether COUI renders the rim for a circular outline (`strokeType` 2) rather than
 *   a capsule (`strokeType` 1).
 */
@Immutable
data class OpalineMaterialStroke(
    val edgeAlpha: Float,
    val edgeWidth: Dp,
    val isCircle: Boolean = false,
) {
    /** The rim as a opaline-blur [Highlight]. */
    fun toHighlight(): Highlight = Highlight(width = edgeWidth, alpha = edgeAlpha.coerceIn(0f, 1f))
}

/**
 * The ColorOS 17 material presets, transcribed from `COUIMaterialBlurEffect` (blur + color layers)
 * and `COUIMaterialStrokeEffect` (glass rim) in the COUI support library shipped with
 * com.oplus.uxdesign 17.0.15. Each preset carries the light and the dark variant COUI picks by
 * night mode.
 */
enum class OpalineMaterial(
    internal val light: OpalineMaterialBlur,
    internal val dark: OpalineMaterialBlur,
    internal val strokeLight: OpalineMaterialStroke? = null,
    internal val strokeDark: OpalineMaterialStroke? = null,
) {
    /** `TYPE_FRAMEWORK_TOP_BAR`: the toolbar backdrop; its capsule controls use `TYPE_FRAMEWORK_CAPSULE_1`. */
    FrameworkTopBar(
        light = blur(0f, 0x66333333, BlurBlendMode.ColorDodge, 0x99F5F5F5, BlurBlendMode.Luminosity),
        dark = blur(0f, 0xCC262626, BlurBlendMode.SrcOver, 0xB37F7F7F, BlurBlendMode.Overlay),
        strokeLight = OpalineMaterialStroke(0.2f, 2.2.dp),
        strokeDark = OpalineMaterialStroke(0.6f, 2.2.dp),
    ),

    /** `TYPE_FRAMEWORK_TOP_BAR_BLUR`: the toolbar backdrop with a 20px blur. */
    FrameworkTopBarBlur(
        light = blur(20f, 0x66333333, BlurBlendMode.ColorDodge, 0x99F5F5F5, BlurBlendMode.Luminosity),
        dark = blur(20f, 0xCC262626, BlurBlendMode.SrcOver, 0xB37F7F7F, BlurBlendMode.Overlay),
        strokeLight = OpalineMaterialStroke(0.2f, 2.2.dp),
        strokeDark = OpalineMaterialStroke(0.6f, 2.2.dp),
    ),

    /** `TYPE_FRAMEWORK_TOP_BAR1`: the lighter toolbar variant (same params in both themes). */
    FrameworkTopBarLight(
        light = blur(25f, 0x1A6E6E6E, BlurBlendMode.ColorDodge, 0x24F1F1F1, BlurBlendMode.Luminosity),
        dark = blur(25f, 0x1A6E6E6E, BlurBlendMode.ColorDodge, 0x24F1F1F1, BlurBlendMode.Luminosity),
        strokeLight = OpalineMaterialStroke(0.2f, 2.5.dp),
        strokeDark = OpalineMaterialStroke(0.2f, 2.5.dp),
    ),

    /** `TYPE_SEARCH_BAR_NO_MATERIAL`: the search capsule backdrop. */
    SearchBar(
        light = blur(0f, 0xD6333333, BlurBlendMode.ColorDodge, 0x66F5F5F5, BlurBlendMode.Luminosity),
        dark = blur(0f, 0xCC262626, BlurBlendMode.SrcOver, 0xB37F7F7F, BlurBlendMode.Overlay),
    ),

    /** `TYPE_FRAMEWORK_BOTTOM_BAR`: the bottom navigation / tool bar backdrop. */
    FrameworkBottomBar(
        light = blur(25f, 0xB3666666, BlurBlendMode.ColorDodge, 0x99F5F5F5, BlurBlendMode.Luminosity),
        dark = blur(25f, 0x80666666, BlurBlendMode.Overlay, 0xB3262626, BlurBlendMode.Luminosity),
        strokeLight = OpalineMaterialStroke(0.2f, 2.0.dp),
        strokeDark = OpalineMaterialStroke(0.6f, 2.0.dp),
    ),

    /** `TYPE_CONTENT_SECONDARY_BUTTON` with `TYPE_CONTENT_CAPSULE_2`: secondary capsule buttons. */
    ContentSecondaryButton(
        light = blur(25f, 0xCCFFFFFF, BlurBlendMode.SrcOver, 0x00FFFFFF, BlurBlendMode.SrcOver),
        dark = blur(25f, 0x33FFFFFF, BlurBlendMode.SrcOver, 0x00FFFFFF, BlurBlendMode.SrcOver),
        strokeLight = OpalineMaterialStroke(0.5f, 2.8.dp),
        strokeDark = OpalineMaterialStroke(0.5f, 2.8.dp),
    ),

    /** `TYPE_CONTENT_TRANSPARENT_BUTTON` with `TYPE_CONTENT_CAPSULE_3`: borderless capsule buttons. */
    ContentTransparentButton(
        light = blur(25f, 0x3F333333, BlurBlendMode.Overlay, 0x3FFFFFFF, BlurBlendMode.Luminosity),
        dark = blur(25f, 0x3F333333, BlurBlendMode.Overlay, 0x3FFFFFFF, BlurBlendMode.Luminosity),
        strokeLight = OpalineMaterialStroke(0.5f, 2.8.dp),
        strokeDark = OpalineMaterialStroke(0.5f, 2.8.dp),
    ),

    /** `TYPE_CONTENT_SEGMENT_BUTTON`: the segment (TabRowWithContour) container. */
    ContentSegmentButton(
        light = blur(25f, 0x7F333333, BlurBlendMode.ColorDodge, 0x99EFEFEF, BlurBlendMode.Luminosity),
        dark = blur(25f, 0x7F7F7F7F, BlurBlendMode.Overlay, 0x99262626, BlurBlendMode.Luminosity),
    ),

    /** `TYPE_CONTENT_CHIP_TAB`: an unselected chip tab. */
    ContentChipTab(
        light = blur(40f, 0x144E4E4E, BlurBlendMode.ColorDodge, 0x14606060, BlurBlendMode.Luminosity),
        dark = blur(40f, 0x33B2B2B2, BlurBlendMode.Luminosity, 0x33303030, BlurBlendMode.Overlay),
    ),

    /** `TYPE_CONTENT_CHIP_TAB_SELECTED`: the selected chip tab. */
    ContentChipTabSelected(
        light = blur(40f, 0x66A3A1A1, BlurBlendMode.ColorDodge, 0x99F5F5F5, BlurBlendMode.Luminosity),
        dark = blur(40f, 0xA6505050, BlurBlendMode.Luminosity, 0x4CA7A7A7, BlurBlendMode.Overlay),
    ),

    /** `TYPE_CONTENT_CHIP_TAB_NO_BLUR`: an unselected chip tab without blur. */
    ContentChipTabNoBlur(
        light = blur(0f, 0x9A9B9B9B, BlurBlendMode.ColorDodge, 0x9ACECECE, BlurBlendMode.Luminosity),
        dark = blur(0f, 0xEE474747, BlurBlendMode.Luminosity, 0xCE8D8D8D, BlurBlendMode.Overlay),
    ),

    /** `TYPE_CONTENT_CHIP_TAB_SELECTED_NO_BLUR`: the selected chip tab without blur. */
    ContentChipTabSelectedNoBlur(
        light = blur(0f, 0x66A3A3A3, BlurBlendMode.ColorDodge, 0xCEF5F5F5, BlurBlendMode.Luminosity),
        dark = blur(0f, 0xDA888888, BlurBlendMode.Luminosity, 0x80A8A8A8, BlurBlendMode.Overlay),
    ),

    /**
     * The bottom sheet window backdrop (`COUIBottomSheetDialog.initBlurParams`, enabled only on
     * OplusBuild SDK >= 40, i.e. ColorOS 17): coui_bottomdialog_list_mix_blur / _blend_blur over
     * a `coui_bottomdialog_blur_radius` (400px) window blur. COUI hands these to the window blur
     * (`OplusBlurParam.setMaterialParams` with material type 3 in light and 2 in dark mode, and
     * `ViewRootManager.setBlurRadius`); the blending itself happens in the system compositor, so
     * here the mix color is drawn source-over and the blend color as an overlay.
     */
    BottomSheetPanel(
        light = blur(400f, 0xDCC8C8C8, BlurBlendMode.SrcOver, 0x376E6E6E, BlurBlendMode.Overlay),
        dark = blur(400f, 0xA4515151, BlurBlendMode.SrcOver, 0xB30F0F0F, BlurBlendMode.Overlay),
    ),

    /**
     * The dialog window backdrop: coui_dialog_list_mix_blur / _blend_blur over a
     * `coui_dialog_blur_radius` (200px) window blur, see [BottomSheetPanel].
     */
    DialogPanel(
        light = blur(200f, 0xDC909090, BlurBlendMode.SrcOver, 0x509F9F9F, BlurBlendMode.Overlay),
        dark = blur(200f, 0x8C777777, BlurBlendMode.SrcOver, 0xB2292929, BlurBlendMode.Overlay),
    ),
    ;

    /** The blur half of this material for the given theme. */
    fun blur(dark: Boolean): OpalineMaterialBlur = if (dark) this.dark else light

    /** The rim of this material for the given theme, or null when COUI draws none. */
    fun stroke(dark: Boolean): OpalineMaterialStroke? = if (dark) strokeDark else strokeLight
}

/**
 * The ColorOS 17 primary-button material (`COUIMaterialThemeBlurEffect.TYPE_CONTENT_PRIMARY_BUTTON`):
 * the theme color at 229/255 alpha over a 10px blur, topped by a transparent white layer, with the
 * `TYPE_CONTENT_CAPSULE_1` rim. Built per theme color, so it is a function rather than a preset.
 *
 * @param themeColor The theme (primary) color of the button.
 * @param enabled Whether the button is enabled; disabled buttons drop to 77/255 alpha.
 * @param dark Whether the dark variant is wanted.
 */
fun opalinePrimaryButtonMaterial(themeColor: Color, enabled: Boolean, dark: Boolean): Pair<OpalineMaterialBlur, OpalineMaterialStroke> {
    val alpha = (if (enabled) 229f else 77f) / 255f
    val material = OpalineMaterialBlur(
        blurRadiusPx = 10f,
        layer1 = BlendColorEntry(themeColor.copy(alpha = alpha), BlurBlendMode.SrcOver),
        // Only the light enabled variant leaves the overlay layer fully transparent.
        layer2 = BlendColorEntry(Color(if (enabled && !dark) 0x00FFFFFF else 0x19FFFFFF), BlurBlendMode.Overlay),
    )
    val stroke = when {
        enabled && dark -> OpalineMaterialStroke(0.26f, 2.8.dp)
        enabled -> OpalineMaterialStroke(0.3f, 2.8.dp)
        dark -> OpalineMaterialStroke(0.18f, 2.8.dp)
        else -> OpalineMaterialStroke(0.12f, 2.8.dp)
    }
    return material to stroke
}

/**
 * Paints a ColorOS 17 [OpalineMaterial] behind this composable: the backdrop is blurred and filtered
 * through the material's two color layers, then the glass rim is drawn on top.
 *
 * The backdrop must come from a [LayerBackdrop] recorded behind this composable
 * (see [rememberLayerBackdrop] and [layerBackdrop]).
 *
 * @param backdrop The [Backdrop] providing the content behind this composable.
 * @param shape The outline of the material.
 * @param material The ColorOS 17 preset to draw.
 * @param dark Whether the dark variant is used.
 * @param drawStroke Whether the glass rim is drawn when the preset has one.
 * @param enabled Whether the effect is active.
 */
@Composable
fun Modifier.opalineMaterial(
    backdrop: Backdrop,
    shape: Shape,
    material: OpalineMaterial,
    dark: Boolean,
    drawStroke: Boolean = true,
    enabled: Boolean = true,
): Modifier = opalineMaterial(
    backdrop = backdrop,
    shape = shape,
    blur = material.blur(dark),
    stroke = if (drawStroke) material.stroke(dark) else null,
    enabled = enabled,
)

/**
 * Paints an explicit [OpalineMaterialBlur] (and optional [OpalineMaterialStroke]) behind this composable.
 *
 * @param backdrop The [Backdrop] providing the content behind this composable.
 * @param shape The outline of the material.
 * @param blur The blur and color layers.
 * @param stroke The glass rim, or null for none.
 * @param enabled Whether the effect is active.
 */
@Composable
fun Modifier.opalineMaterial(
    backdrop: Backdrop,
    shape: Shape,
    blur: OpalineMaterialBlur,
    stroke: OpalineMaterialStroke? = null,
    enabled: Boolean = true,
): Modifier {
    val density = LocalDensity.current.density
    val colors = remember(blur) { BlurColors(blendColors = listOf(blur.layer1, blur.layer2)) }
    val highlight = remember(stroke) { stroke?.toHighlight() }
    return textureBlur(
        backdrop = backdrop,
        shape = shape,
        // COUI radii are raw pixels; textureBlur expects dp.
        blurRadius = blur.blurRadiusPx / density,
        colors = colors,
        highlight = highlight,
        enabled = enabled && !blur.isEmpty,
    )
}

private fun blur(
    radiusPx: Float,
    color1: Long,
    mode1: BlurBlendMode,
    color2: Long,
    mode2: BlurBlendMode,
): OpalineMaterialBlur = OpalineMaterialBlur(
    blurRadiusPx = radiusPx,
    layer1 = BlendColorEntry(Color(color1), mode1),
    layer2 = BlendColorEntry(Color(color2), mode2),
)
