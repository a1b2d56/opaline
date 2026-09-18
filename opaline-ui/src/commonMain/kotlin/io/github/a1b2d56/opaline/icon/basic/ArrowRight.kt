// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/**
 * A forward chevron for list rows that open a new page, drawn as a plain polyline at the metrics
 * of the ColorOS "next" arrow (12x24dp box, 1.4dp round stroke, mirrored in RTL).
 * Render at its native 12x24dp size and tint with the tertiary label color.
 */
val OpalineIcons.Basic.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = ImageVector.Builder("ArrowRight", 12.dp, 24.dp, 12f, 24f, autoMirror = true).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(4.5f, 6f)
                lineTo(10.5f, 12f)
                lineTo(4.5f, 18f)
            }
        }.build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
