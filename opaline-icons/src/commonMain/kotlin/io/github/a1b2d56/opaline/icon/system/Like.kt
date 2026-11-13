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

/** `agent_fb_like` */
val OpalineIcons.System.Like: ImageVector
    get() {
        if (_like != null) return _like!!
        _like = ImageVector.Builder(
            name = "Like",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.572f, 0.967f),
                    PathNode.CurveTo(11.456f, 0.967f, 12.908f, 2.63f, 12.652f, 4.497f),
                    PathNode.LineTo(12.303f, 7.051f),
                    PathNode.LineTo(16.48f, 7.051f),
                    PathNode.CurveTo(18.288f, 7.051f, 19.585f, 8.793f, 19.067f, 10.524f),
                    PathNode.LineTo(17.348f, 16.274f),
                    PathNode.CurveTo(17.006f, 17.417f, 15.953f, 18.2f, 14.761f, 18.2f),
                    PathNode.LineTo(2.083f, 18.2f),
                    PathNode.CurveTo(1.467f, 18.2f, 0.966f, 17.7f, 0.966f, 17.084f),
                    PathNode.LineTo(0.966f, 9.584f),
                    PathNode.CurveTo(0.966f, 8.967f, 1.466f, 8.467f, 2.083f, 8.467f),
                    PathNode.LineTo(4.786f, 8.467f),
                    PathNode.LineTo(5.04f, 8.207f),
                    PathNode.CurveTo(6.774f, 6.43f, 7.975f, 4.203f, 8.509f, 1.778f),
                    PathNode.LineTo(8.532f, 1.691f),
                    PathNode.CurveTo(8.666f, 1.264f, 9.063f, 0.967f, 9.518f, 0.967f),
                    PathNode.LineTo(9.572f, 0.967f),
                    PathNode.Close,
                    PathNode.MoveTo(2.366f, 16.801f),
                    PathNode.LineTo(4.3f, 16.801f),
                    PathNode.LineTo(4.3f, 9.867f),
                    PathNode.LineTo(2.366f, 9.867f),
                    PathNode.LineTo(2.366f, 16.801f),
                    PathNode.Close,
                    PathNode.MoveTo(9.803f, 2.384f),
                    PathNode.CurveTo(9.182f, 4.945f, 7.885f, 7.295f, 6.042f, 9.185f),
                    PathNode.LineTo(5.7f, 9.534f),
                    PathNode.LineTo(5.7f, 16.801f),
                    PathNode.LineTo(14.761f, 16.801f),
                    PathNode.CurveTo(15.335f, 16.801f, 15.841f, 16.423f, 16.006f, 15.873f),
                    PathNode.LineTo(17.727f, 10.123f),
                    PathNode.CurveTo(17.976f, 9.289f, 17.351f, 8.451f, 16.48f, 8.45f),
                    PathNode.LineTo(11.977f, 8.45f),
                    PathNode.CurveTo(11.301f, 8.45f, 10.779f, 7.852f, 10.871f, 7.182f),
                    PathNode.LineTo(11.265f, 4.308f),
                    PathNode.CurveTo(11.395f, 3.359f, 10.723f, 2.507f, 9.803f, 2.384f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _like!!
    }

private var _like: ImageVector? = null
