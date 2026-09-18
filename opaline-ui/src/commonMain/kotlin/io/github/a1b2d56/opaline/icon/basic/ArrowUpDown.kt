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
 * An up/down indicator for spinners and dropdown rows: two plain chevrons drawn at the metrics of
 * the ColorOS menu indicator (14x24dp box, 1.4dp round stroke, mirrored in RTL).
 * Render at its native 14x24dp size and tint with the tertiary label color.
 */
val OpalineIcons.Basic.ArrowUpDown: ImageVector
    get() {
        if (_arrowUpDown != null) return _arrowUpDown!!
        _arrowUpDown = ImageVector.Builder("ArrowUpDown", 14.dp, 24.dp, 14f, 24f, autoMirror = true).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(3f, 10f)
                lineTo(7f, 5.8f)
                lineTo(11f, 10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            ) {
                moveTo(3f, 14f)
                lineTo(7f, 18.2f)
                lineTo(11f, 14f)
            }
        }.build()
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
