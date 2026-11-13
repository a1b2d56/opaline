// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `ic_edit_trim_normal` */
val OpalineIcons.System.Trim: ImageVector
    get() {
        if (_trim != null) return _trim!!
        _trim = ImageVector.Builder(
            name = "Trim",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(1.3f, 5.3f),
                    PathNode.CurveTo(1.3f, 4.195f, 2.195f, 3.3f, 3.3f, 3.3f),
                    PathNode.LineTo(7.0f, 3.3f),
                    PathNode.CurveTo(7.387f, 3.3f, 7.7f, 3.613f, 7.7f, 4.0f),
                    PathNode.CurveTo(7.7f, 4.386f, 7.387f, 4.7f, 7.0f, 4.7f),
                    PathNode.LineTo(3.3f, 4.7f),
                    PathNode.CurveTo(2.969f, 4.7f, 2.7f, 4.968f, 2.7f, 5.3f),
                    PathNode.LineTo(2.7f, 8.0f),
                    PathNode.CurveTo(2.7f, 8.386f, 2.387f, 8.7f, 2.0f, 8.7f),
                    PathNode.CurveTo(1.613f, 8.7f, 1.3f, 8.386f, 1.3f, 8.0f),
                    PathNode.LineTo(1.3f, 5.3f),
                    PathNode.Close,
                    PathNode.MoveTo(16.3f, 4.0f),
                    PathNode.CurveTo(16.3f, 3.613f, 16.614f, 3.3f, 17.0f, 3.3f),
                    PathNode.LineTo(20.7f, 3.3f),
                    PathNode.CurveTo(21.805f, 3.3f, 22.7f, 4.195f, 22.7f, 5.3f),
                    PathNode.LineTo(22.7f, 8.0f),
                    PathNode.CurveTo(22.7f, 8.386f, 22.387f, 8.7f, 22.0f, 8.7f),
                    PathNode.CurveTo(21.614f, 8.7f, 21.3f, 8.386f, 21.3f, 8.0f),
                    PathNode.LineTo(21.3f, 5.3f),
                    PathNode.CurveTo(21.3f, 4.968f, 21.031f, 4.7f, 20.7f, 4.7f),
                    PathNode.LineTo(17.0f, 4.7f),
                    PathNode.CurveTo(16.614f, 4.7f, 16.3f, 4.386f, 16.3f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(2.0f, 15.3f),
                    PathNode.CurveTo(2.387f, 15.3f, 2.7f, 15.613f, 2.7f, 16.0f),
                    PathNode.LineTo(2.7f, 18.7f),
                    PathNode.CurveTo(2.7f, 19.031f, 2.969f, 19.3f, 3.3f, 19.3f),
                    PathNode.LineTo(7.0f, 19.3f),
                    PathNode.CurveTo(7.387f, 19.3f, 7.7f, 19.613f, 7.7f, 20.0f),
                    PathNode.CurveTo(7.7f, 20.386f, 7.387f, 20.7f, 7.0f, 20.7f),
                    PathNode.LineTo(3.3f, 20.7f),
                    PathNode.CurveTo(2.195f, 20.7f, 1.3f, 19.804f, 1.3f, 18.7f),
                    PathNode.LineTo(1.3f, 16.0f),
                    PathNode.CurveTo(1.3f, 15.613f, 1.613f, 15.3f, 2.0f, 15.3f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 15.3f),
                    PathNode.CurveTo(22.387f, 15.3f, 22.7f, 15.613f, 22.7f, 16.0f),
                    PathNode.LineTo(22.7f, 18.7f),
                    PathNode.CurveTo(22.7f, 19.804f, 21.805f, 20.7f, 20.7f, 20.7f),
                    PathNode.LineTo(17.0f, 20.7f),
                    PathNode.CurveTo(16.614f, 20.7f, 16.3f, 20.386f, 16.3f, 20.0f),
                    PathNode.CurveTo(16.3f, 19.613f, 16.614f, 19.3f, 17.0f, 19.3f),
                    PathNode.LineTo(20.7f, 19.3f),
                    PathNode.CurveTo(21.031f, 19.3f, 21.3f, 19.031f, 21.3f, 18.7f),
                    PathNode.LineTo(21.3f, 16.0f),
                    PathNode.CurveTo(21.3f, 15.613f, 21.614f, 15.3f, 22.0f, 15.3f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 6.3f),
                    PathNode.CurveTo(13.387f, 6.3f, 13.7f, 6.613f, 13.7f, 7.0f),
                    PathNode.LineTo(13.7f, 17.0f),
                    PathNode.CurveTo(13.7f, 17.386f, 13.387f, 17.7f, 13.0f, 17.7f),
                    PathNode.CurveTo(12.613f, 17.7f, 12.3f, 17.386f, 12.3f, 17.0f),
                    PathNode.LineTo(12.3f, 7.0f),
                    PathNode.CurveTo(12.3f, 6.613f, 12.613f, 6.3f, 13.0f, 6.3f),
                    PathNode.Close,
                    PathNode.MoveTo(10.7f, 9.0f),
                    PathNode.CurveTo(10.7f, 8.613f, 10.387f, 8.3f, 10.0f, 8.3f),
                    PathNode.CurveTo(9.613f, 8.3f, 9.3f, 8.613f, 9.3f, 9.0f),
                    PathNode.LineTo(9.3f, 15.0f),
                    PathNode.CurveTo(9.3f, 15.386f, 9.613f, 15.7f, 10.0f, 15.7f),
                    PathNode.CurveTo(10.387f, 15.7f, 10.7f, 15.386f, 10.7f, 15.0f),
                    PathNode.LineTo(10.7f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 9.3f),
                    PathNode.CurveTo(16.387f, 9.3f, 16.7f, 9.613f, 16.7f, 10.0f),
                    PathNode.LineTo(16.7f, 14.0f),
                    PathNode.CurveTo(16.7f, 14.386f, 16.387f, 14.7f, 16.0f, 14.7f),
                    PathNode.CurveTo(15.613f, 14.7f, 15.3f, 14.386f, 15.3f, 14.0f),
                    PathNode.LineTo(15.3f, 10.0f),
                    PathNode.CurveTo(15.3f, 9.613f, 15.613f, 9.3f, 16.0f, 9.3f),
                    PathNode.Close,
                    PathNode.MoveTo(7.7f, 11.0f),
                    PathNode.CurveTo(7.7f, 10.613f, 7.387f, 10.3f, 7.0f, 10.3f),
                    PathNode.CurveTo(6.613f, 10.3f, 6.3f, 10.613f, 6.3f, 11.0f),
                    PathNode.LineTo(6.3f, 13.0f),
                    PathNode.CurveTo(6.3f, 13.386f, 6.613f, 13.7f, 7.0f, 13.7f),
                    PathNode.CurveTo(7.387f, 13.7f, 7.7f, 13.386f, 7.7f, 13.0f),
                    PathNode.LineTo(7.7f, 11.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _trim!!
    }

private var _trim: ImageVector? = null
