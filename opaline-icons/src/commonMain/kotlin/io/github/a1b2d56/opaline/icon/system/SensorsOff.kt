// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `oplus_tile_icon_sensors_off` */
val OpalineIcons.System.SensorsOff: ImageVector
    get() {
        if (_sensorsOff != null) return _sensorsOff!!
        _sensorsOff = ImageVector.Builder(
            name = "SensorsOff",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.966f, 2.0f),
                    PathNode.LineTo(2.0f, 22.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.652f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(0.752f, 12.0f),
                    PathNode.LineTo(4.496f, 12.0f),
                    PathNode.LineTo(6.992f, 5.75f),
                    PathNode.LineTo(9.488f, 18.25f),
                    PathNode.LineTo(11.984f, 3.25f),
                    PathNode.LineTo(14.48f, 15.75f),
                    PathNode.LineTo(16.976f, 8.25f),
                    PathNode.LineTo(18.224f, 12.0f),
                    PathNode.LineTo(23.216f, 12.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.251f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _sensorsOff!!
    }

private var _sensorsOff: ImageVector? = null
