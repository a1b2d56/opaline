// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.color.space

import androidx.compose.ui.graphics.Color
import io.github.a1b2d56.opaline.color.core.Transforms

/**
 * OkHSV representation with normalized, user-friendly ranges.
 * - `h`: hue in degrees [0, 360]
 * - `s`: saturation in percent [0, 100]
 * - `v`: value/brightness in percent [0, 100]
 */
data class OkHsv(val h: Float, val s: Float, val v: Float) {
    fun toColor(alpha: Float = 1f): Color = Transforms.okhsvToColor(h, s, v, alpha)
}
