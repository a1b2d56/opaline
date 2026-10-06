// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.blur

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.material.LocalContentMaterialRenderer
import io.github.a1b2d56.opaline.material.LocalMaterialRenderer
import io.github.a1b2d56.opaline.material.MaterialRenderer
import io.github.a1b2d56.opaline.material.MaterialType

/**
 * A [MaterialRenderer] that draws ColorOS 17 materials by blurring [backdrop], using the presets
 * in [OpalineMaterial].
 *
 * Reports every type as unsupported where runtime shaders are unavailable, so components keep
 * their solid fills instead of turning transparent.
 *
 * @property backdrop The content behind the components, recorded with [MaterialBackdropSource] or
 *   [layerBackdrop].
 */
@Stable
class BackdropMaterialRenderer(private val backdrop: Backdrop) : MaterialRenderer {

    @Composable
    override fun modifier(type: MaterialType, shape: Shape, dark: Boolean, tint: Color, enabled: Boolean): Modifier = when (type) {
        MaterialType.TopBarCircle -> Modifier.opalineMaterial(
            backdrop = backdrop,
            shape = shape,
            blur = OpalineMaterial.FrameworkTopBar.blur(dark),
            // TYPE_FRAMEWORK_CIRCLE_1: the circular rim of a single toolbar control.
            stroke = if (dark) FrameworkCircleDark else FrameworkCircleLight,
        )

        MaterialType.TopBarCapsule ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.FrameworkTopBar, dark)

        MaterialType.SearchBar ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.SearchBar, dark)

        MaterialType.BottomBar ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.FrameworkBottomBar, dark, drawStroke = false)

        MaterialType.FloatingBar ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.FrameworkBottomBar, dark)

        MaterialType.DialogPanel ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.DialogPanel, dark)

        MaterialType.BottomSheetPanel ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.BottomSheetPanel, dark)

        MaterialType.ContentPrimaryButton -> {
            val (blur, stroke) = opalinePrimaryButtonMaterial(tint.copy(alpha = 1f), enabled, dark)
            Modifier.opalineMaterial(backdrop = backdrop, shape = shape, blur = blur, stroke = stroke)
        }

        MaterialType.ContentSecondaryButton ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.ContentSecondaryButton, dark)

        MaterialType.ContentTransparentButton ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.ContentTransparentButton, dark)

        MaterialType.ContentSegment ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.ContentSegmentButton, dark)

        MaterialType.ContentChipTab ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.ContentChipTab, dark)

        MaterialType.ContentChipTabSelected ->
            Modifier.opalineMaterial(backdrop, shape, OpalineMaterial.ContentChipTabSelected, dark)
    }

    override fun supports(type: MaterialType): Boolean = isRuntimeShaderSupported()

    private companion object {
        val FrameworkCircleLight = OpalineMaterialStroke(edgeAlpha = 0.2f, edgeWidth = 1.9.dp, isCircle = true)
        val FrameworkCircleDark = OpalineMaterialStroke(edgeAlpha = 0.6f, edgeWidth = 1.9.dp, isCircle = true)
    }
}

/**
 * Makes Opaline components draw ColorOS 17 materials over [backdrop]: top bar controls, the search
 * bar, bottom and floating bars, dialogs and bottom sheets.
 *
 * Record the page that sits behind them with [MaterialBackdropSource], so components inside the
 * recorded content keep their solid fills and never sample themselves.
 *
 * ```kotlin
 * val backdrop = rememberLayerBackdrop()
 * ProvideMaterialBackdrop(backdrop) {
 *     Scaffold(
 *         topBar = { TopAppBar(...) },        // glass controls
 *         bottomBar = { NavigationBar(...) }, // glass bar
 *     ) { padding ->
 *         MaterialBackdropSource(backdrop) { /* page content */ }
 *     }
 * }
 * ```
 *
 * @param backdrop The backdrop the materials blur.
 * @param content The content whose components draw the materials.
 */
@Composable
fun ProvideMaterialBackdrop(backdrop: Backdrop, content: @Composable () -> Unit) {
    val renderer = remember(backdrop) { BackdropMaterialRenderer(backdrop) }
    CompositionLocalProvider(LocalMaterialRenderer provides renderer, content = content)
}

/**
 * Records [content] into [backdrop] for the materials provided by [ProvideMaterialBackdrop], and
 * turns materials off inside it: a component cannot blur the layer it is being recorded into.
 *
 * @param backdrop The backdrop to record into.
 * @param modifier The modifier applied to the recorded container.
 * @param content The page content.
 */
@Composable
fun MaterialBackdropSource(
    backdrop: LayerBackdrop,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier = modifier.layerBackdrop(backdrop)) {
        CompositionLocalProvider(LocalMaterialRenderer provides null) {
            content()
        }
    }
}

/**
 * Gives buttons, chips and segmented controls in [content] the ColorOS 17 content glass, blurring
 * [backdrop]. Record [backdrop] from what sits behind the controls (an image, a colored panel),
 * never from a layer that contains the controls themselves; [ContentMaterialBox] sets both up.
 *
 * @param backdrop The backdrop the controls blur.
 * @param content The content whose controls draw the glass.
 */
@Composable
fun ProvideContentMaterial(backdrop: Backdrop, content: @Composable () -> Unit) {
    val renderer = remember(backdrop) { BackdropMaterialRenderer(backdrop) }
    CompositionLocalProvider(LocalContentMaterialRenderer provides renderer, content = content)
}

/**
 * Draws [background] and lays [content] over it, giving the buttons, chips and segmented controls
 * in [content] the ColorOS 17 content glass over that background (`drawableMaterialEffect`).
 *
 * ```kotlin
 * ContentMaterialBox(
 *     background = { Image(painter, null, Modifier.fillMaxSize(), contentScale = ContentScale.Crop) },
 * ) {
 *     Button(onClick = {}) { Text("Glass") }
 * }
 * ```
 *
 * @param background What the controls blur. It is recorded, so it may not contain the controls.
 * @param modifier The modifier applied to the container; the background fills it.
 * @param backdrop The backdrop [background] is recorded into.
 * @param content The controls drawn over the background.
 */
@Composable
fun ContentMaterialBox(
    background: @Composable BoxScope.() -> Unit,
    modifier: Modifier = Modifier,
    backdrop: LayerBackdrop = rememberLayerBackdrop(),
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier = modifier) {
        Box(modifier = Modifier.matchParentSize().layerBackdrop(backdrop)) {
            CompositionLocalProvider(LocalContentMaterialRenderer provides null) {
                background()
            }
        }
        ProvideContentMaterial(backdrop) {
            this@Box.content()
        }
    }
}
