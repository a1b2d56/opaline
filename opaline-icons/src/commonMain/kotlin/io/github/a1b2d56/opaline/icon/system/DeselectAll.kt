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

/** `color_menu_ic_not_all_sel_disable` */
val OpalineIcons.System.DeselectAll: ImageVector
    get() {
        if (_deselectAll != null) return _deselectAll!!
        _deselectAll = ImageVector.Builder(
            name = "DeselectAll",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 19.7f),
                    PathNode.CurveTo(7.0f, 20.418f, 7.582f, 21.0f, 8.3f, 21.0f),
                    PathNode.LineTo(19.7f, 21.0f),
                    PathNode.CurveTo(20.418f, 21.0f, 21.0f, 20.418f, 21.0f, 19.7f),
                    PathNode.LineTo(21.0f, 8.3f),
                    PathNode.CurveTo(21.0f, 7.582f, 20.418f, 7.0f, 19.7f, 7.0f),
                    PathNode.LineTo(8.3f, 7.0f),
                    PathNode.CurveTo(7.582f, 7.0f, 7.0f, 7.582f, 7.0f, 8.3f),
                    PathNode.LineTo(7.0f, 19.7f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(4.3f, 17.0f),
                    PathNode.CurveTo(3.582f, 17.0f, 3.0f, 16.418f, 3.0f, 15.7f),
                    PathNode.LineTo(3.0f, 4.3f),
                    PathNode.CurveTo(3.0f, 3.582f, 3.582f, 3.0f, 4.3f, 3.0f),
                    PathNode.LineTo(15.7f, 3.0f),
                    PathNode.CurveTo(16.418f, 3.0f, 17.0f, 3.582f, 17.0f, 4.3f),
                    PathNode.LineTo(17.0f, 5.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.162f, 11.172f),
                    PathNode.CurveTo(11.889f, 10.899f, 11.445f, 10.899f, 11.172f, 11.172f),
                    PathNode.CurveTo(10.899f, 11.445f, 10.899f, 11.889f, 11.172f, 12.162f),
                    PathNode.LineTo(13.01f, 14.0f),
                    PathNode.LineTo(11.172f, 15.839f),
                    PathNode.CurveTo(10.899f, 16.112f, 10.899f, 16.556f, 11.172f, 16.829f),
                    PathNode.CurveTo(11.445f, 17.102f, 11.889f, 17.102f, 12.162f, 16.829f),
                    PathNode.LineTo(14.0f, 14.991f),
                    PathNode.LineTo(15.839f, 16.829f),
                    PathNode.CurveTo(16.112f, 17.102f, 16.556f, 17.102f, 16.829f, 16.829f),
                    PathNode.CurveTo(17.102f, 16.556f, 17.102f, 16.112f, 16.829f, 15.839f),
                    PathNode.LineTo(14.991f, 14.0f),
                    PathNode.LineTo(16.829f, 12.162f),
                    PathNode.CurveTo(17.102f, 11.889f, 17.102f, 11.445f, 16.829f, 11.172f),
                    PathNode.CurveTo(16.556f, 10.899f, 16.112f, 10.899f, 15.839f, 11.172f),
                    PathNode.LineTo(14.0f, 13.01f),
                    PathNode.LineTo(12.162f, 11.172f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _deselectAll!!
    }

private var _deselectAll: ImageVector? = null
