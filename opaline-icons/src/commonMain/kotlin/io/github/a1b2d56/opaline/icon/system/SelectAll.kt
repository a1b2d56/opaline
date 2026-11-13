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

/** `color_menu_ic_all_sel_normal` */
val OpalineIcons.System.SelectAll: ImageVector
    get() {
        if (_selectAll != null) return _selectAll!!
        _selectAll = ImageVector.Builder(
            name = "SelectAll",
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
                    PathNode.MoveTo(11.0f, 13.854f),
                    PathNode.LineTo(13.095f, 16.0f),
                    PathNode.LineTo(17.0f, 12.0f),
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
        }.build()
        return _selectAll!!
    }

private var _selectAll: ImageVector? = null
