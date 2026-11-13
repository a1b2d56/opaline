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

/** `color_menu_ic_todo_normal` */
val OpalineIcons.System.Todo: ImageVector
    get() {
        if (_todo != null) return _todo!!
        _todo = ImageVector.Builder(
            name = "Todo",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.7f, 4.0f),
                    PathNode.LineTo(4.3f, 4.0f),
                    PathNode.CurveTo(3.582f, 4.0f, 3.0f, 4.582f, 3.0f, 5.3f),
                    PathNode.LineTo(3.0f, 19.7f),
                    PathNode.CurveTo(3.0f, 20.418f, 3.582f, 21.0f, 4.3f, 21.0f),
                    PathNode.LineTo(19.7f, 21.0f),
                    PathNode.CurveTo(20.418f, 21.0f, 21.0f, 20.418f, 21.0f, 19.7f),
                    PathNode.LineTo(21.0f, 5.3f),
                    PathNode.CurveTo(21.0f, 4.582f, 20.418f, 4.0f, 19.7f, 4.0f),
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
                    PathNode.MoveTo(8.0f, 14.398f),
                    PathNode.LineTo(10.667f, 17.198f),
                    PathNode.LineTo(16.0f, 11.598f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.7f, 7.843f),
                    PathNode.LineTo(20.3f, 7.843f),
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
                    PathNode.MoveTo(6.7f, 2.8f),
                    PathNode.CurveTo(6.7f, 2.413f, 6.387f, 2.1f, 6.0f, 2.1f),
                    PathNode.CurveTo(5.613f, 2.1f, 5.3f, 2.413f, 5.3f, 2.8f),
                    PathNode.LineTo(6.7f, 2.8f),
                    PathNode.Close,
                    PathNode.MoveTo(5.3f, 2.8f),
                    PathNode.LineTo(5.3f, 3.3f),
                    PathNode.LineTo(6.7f, 3.3f),
                    PathNode.LineTo(6.7f, 2.8f),
                    PathNode.LineTo(5.3f, 2.8f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.7f, 2.8f),
                    PathNode.CurveTo(18.7f, 2.413f, 18.387f, 2.1f, 18.0f, 2.1f),
                    PathNode.CurveTo(17.613f, 2.1f, 17.3f, 2.413f, 17.3f, 2.8f),
                    PathNode.LineTo(18.7f, 2.8f),
                    PathNode.Close,
                    PathNode.MoveTo(17.3f, 2.8f),
                    PathNode.LineTo(17.3f, 3.3f),
                    PathNode.LineTo(18.7f, 3.3f),
                    PathNode.LineTo(18.7f, 2.8f),
                    PathNode.LineTo(17.3f, 2.8f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _todo!!
    }

private var _todo: ImageVector? = null
