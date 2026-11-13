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

/** `mms_dr_menu_forward` */
val OpalineIcons.System.Forward: ImageVector
    get() {
        if (_forward != null) return _forward!!
        _forward = ImageVector.Builder(
            name = "Forward",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 1.3f),
                    PathNode.CurveTo(15.613f, 1.3f, 15.3f, 1.613f, 15.3f, 2.0f),
                    PathNode.CurveTo(15.3f, 2.387f, 15.613f, 2.7f, 16.0f, 2.7f),
                    PathNode.LineTo(20.31f, 2.7f),
                    PathNode.LineTo(10.505f, 12.505f),
                    PathNode.CurveTo(10.232f, 12.778f, 10.232f, 13.222f, 10.505f, 13.495f),
                    PathNode.CurveTo(10.778f, 13.768f, 11.222f, 13.768f, 11.495f, 13.495f),
                    PathNode.LineTo(21.3f, 3.69f),
                    PathNode.LineTo(21.3f, 8.0f),
                    PathNode.CurveTo(21.3f, 8.387f, 21.613f, 8.7f, 22.0f, 8.7f),
                    PathNode.CurveTo(22.387f, 8.7f, 22.7f, 8.387f, 22.7f, 8.0f),
                    PathNode.LineTo(22.7f, 2.0f),
                    PathNode.CurveTo(22.7f, 1.613f, 22.387f, 1.3f, 22.0f, 1.3f),
                    PathNode.LineTo(16.0f, 1.3f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.949f, 11.0f),
                    PathNode.LineTo(18.949f, 19.672f),
                    PathNode.CurveTo(18.949f, 20.459f, 18.305f, 21.103f, 17.518f, 21.103f),
                    PathNode.LineTo(3.869f, 21.103f),
                    PathNode.CurveTo(3.082f, 21.103f, 2.438f, 20.459f, 2.438f, 19.672f),
                    PathNode.LineTo(2.438f, 6.023f),
                    PathNode.CurveTo(2.438f, 5.236f, 3.082f, 4.592f, 3.869f, 4.592f),
                    PathNode.LineTo(13.0f, 4.592f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _forward!!
    }

private var _forward: ImageVector? = null
