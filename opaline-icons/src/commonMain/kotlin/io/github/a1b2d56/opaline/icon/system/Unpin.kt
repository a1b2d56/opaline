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

/** `conv_pin_to_untop` */
val OpalineIcons.System.Unpin: ImageVector
    get() {
        if (_unpin != null) return _unpin!!
        _unpin = ImageVector.Builder(
            name = "Unpin",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.48f, 9.718f),
                    PathNode.CurveTo(5.731f, 11.437f, 4.715f, 13.8f, 4.701f, 16.299f),
                    PathNode.LineTo(14.061f, 16.299f),
                    PathNode.LineTo(15.462f, 17.699f),
                    PathNode.LineTo(13.196f, 17.699f),
                    PathNode.LineTo(12.496f, 23.0f),
                    PathNode.CurveTo(12.419f, 23.579f, 11.582f, 23.579f, 11.505f, 23.0f),
                    PathNode.LineTo(10.805f, 17.699f),
                    PathNode.LineTo(4.0f, 17.699f),
                    PathNode.CurveTo(3.614f, 17.699f, 3.3f, 17.385f, 3.3f, 16.999f),
                    PathNode.LineTo(3.3f, 16.351f),
                    PathNode.CurveTo(3.3f, 13.458f, 4.47f, 10.72f, 6.491f, 8.728f),
                    PathNode.LineTo(7.48f, 9.718f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(1.92f, 1.333f),
                    PathNode.CurveTo(2.193f, 1.06f, 2.637f, 1.06f, 2.91f, 1.333f),
                    PathNode.LineTo(7.8f, 6.223f),
                    PathNode.LineTo(7.8f, 2.7f),
                    PathNode.LineTo(5.876f, 2.7f),
                    PathNode.CurveTo(5.489f, 2.7f, 5.176f, 2.386f, 5.176f, 2.0f),
                    PathNode.CurveTo(5.176f, 1.613f, 5.489f, 1.3f, 5.876f, 1.3f),
                    PathNode.LineTo(8.49f, 1.3f),
                    PathNode.CurveTo(8.493f, 1.3f, 8.497f, 1.299f, 8.5f, 1.299f),
                    PathNode.CurveTo(8.503f, 1.299f, 8.507f, 1.3f, 8.51f, 1.3f),
                    PathNode.LineTo(15.49f, 1.3f),
                    PathNode.CurveTo(15.493f, 1.3f, 15.497f, 1.299f, 15.5f, 1.299f),
                    PathNode.CurveTo(15.503f, 1.299f, 15.507f, 1.3f, 15.51f, 1.3f),
                    PathNode.LineTo(18.126f, 1.3f),
                    PathNode.CurveTo(18.512f, 1.3f, 18.826f, 1.613f, 18.826f, 2.0f),
                    PathNode.CurveTo(18.826f, 2.386f, 18.512f, 2.7f, 18.126f, 2.7f),
                    PathNode.LineTo(16.2f, 2.7f),
                    PathNode.LineTo(16.2f, 7.63f),
                    PathNode.CurveTo(19.018f, 9.633f, 20.7f, 12.881f, 20.7f, 16.351f),
                    PathNode.LineTo(20.7f, 16.999f),
                    PathNode.CurveTo(20.7f, 17.385f, 20.386f, 17.699f, 20.0f, 17.699f),
                    PathNode.LineTo(19.276f, 17.699f),
                    PathNode.LineTo(22.91f, 21.333f),
                    PathNode.CurveTo(23.183f, 21.606f, 23.183f, 22.05f, 22.91f, 22.323f),
                    PathNode.CurveTo(22.637f, 22.597f, 22.193f, 22.596f, 21.92f, 22.323f),
                    PathNode.LineTo(1.92f, 2.323f),
                    PathNode.CurveTo(1.646f, 2.05f, 1.646f, 1.606f, 1.92f, 1.333f),
                    PathNode.Close,
                    PathNode.MoveTo(9.2f, 7.623f),
                    PathNode.LineTo(17.876f, 16.299f),
                    PathNode.LineTo(19.299f, 16.299f),
                    PathNode.CurveTo(19.281f, 13.209f, 17.732f, 10.327f, 15.159f, 8.612f),
                    PathNode.LineTo(15.111f, 8.581f),
                    PathNode.CurveTo(14.917f, 8.451f, 14.8f, 8.233f, 14.8f, 7.999f),
                    PathNode.LineTo(14.8f, 2.7f),
                    PathNode.LineTo(9.2f, 2.7f),
                    PathNode.LineTo(9.2f, 7.623f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _unpin!!
    }

private var _unpin: ImageVector? = null
