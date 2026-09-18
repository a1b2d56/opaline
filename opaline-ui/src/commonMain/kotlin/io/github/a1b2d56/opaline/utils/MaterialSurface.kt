// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.utils

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.unit.Dp
import io.github.a1b2d56.opaline.material.MaterialType
import io.github.a1b2d56.opaline.material.isMaterialActive
import io.github.a1b2d56.opaline.material.material
import io.github.a1b2d56.opaline.squircle.squircleBackground
import io.github.a1b2d56.opaline.squircle.squircleSurface
import io.github.a1b2d56.opaline.theme.OpalineTheme

/** Whether the current color scheme is dark, which selects the dark variant of a material. */
@Composable
internal fun isMaterialDark(): Boolean = OpalineTheme.colorScheme.background.luminance() < 0.5f

/**
 * Fills a squircle with the ColorOS 17 material [type] when a renderer draws it, and with [color]
 * otherwise.
 */
@Composable
internal fun Modifier.materialOrSquircle(type: MaterialType, shape: Shape, color: Color, cornerRadius: Dp): Modifier = if (isMaterialActive(type)) {
    material(type, shape, isMaterialDark())
} else {
    squircleBackground(color = color, cornerRadius = cornerRadius)
}

/**
 * The content material of a button filled with [color]: primary when it uses the theme color,
 * transparent when it has no fill, secondary otherwise (`COUIButton` button types).
 */
@Composable
internal fun contentButtonMaterial(color: Color): MaterialType = when {
    color == OpalineTheme.colorScheme.primary -> MaterialType.ContentPrimaryButton
    color.alpha == 0f -> MaterialType.ContentTransparentButton
    else -> MaterialType.ContentSecondaryButton
}

/**
 * Fills a content control with the glass [type] when a content renderer draws it, with [pressTint]
 * laid over the glass; otherwise fills the squircle with [pressTint] over [container].
 */
@Composable
internal fun Modifier.contentMaterialSurface(
    type: MaterialType,
    container: Color,
    pressTint: Color,
    cornerRadius: Dp,
    enabled: Boolean,
): Modifier = if (isMaterialActive(type)) {
    material(type, RoundedCornerShape(cornerRadius), isMaterialDark(), tint = container, enabled = enabled)
        .squircleSurface(color = pressTint, cornerRadius = cornerRadius)
} else {
    squircleSurface(
        color = if (pressTint.alpha > 0f) pressTint.compositeOver(container) else container,
        cornerRadius = cornerRadius,
    )
}
