// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
package io.github.a1b2d56.opaline.blur.highlight

import androidx.annotation.FloatRange
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Configuration for an outline highlight.
 *
 * Drawn after the content as an additive overlay shaped by the rounded shape passed
 * to `Modifier.highlight`. Combine with `Modifier.drawBackdrop` to produce a lit edge
 * over a blurred background.
 *
 * @property width Stroke band width — the outermost ring painted with [HighlightStyle.color].
 * @property alpha Overall opacity multiplier folded into the shader.
 * @property style The shading model used to paint the highlight pixels.
 */
@Immutable
data class Highlight(
    val width: Dp = 0.8.dp,
    @param:FloatRange(from = 0.0, to = 1.0) val alpha: Float = 1f,
    val style: HighlightStyle = HighlightStyle.Default,
) {

    companion object {

        /** Default highlight: a [BloomStroke.Default] rim at the default width. */
        @Stable
        val Default: Highlight = Highlight()
    }
}
