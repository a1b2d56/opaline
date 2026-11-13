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

/** `color_menu_ic_link_disable` */
val OpalineIcons.System.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = ImageVector.Builder(
            name = "Link",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.769f, 20.429f),
                    PathNode.CurveTo(1.591f, 18.25f, 1.591f, 14.717f, 3.769f, 12.538f),
                    PathNode.LineTo(6.836f, 9.471f),
                    PathNode.CurveTo(9.015f, 7.292f, 12.548f, 7.292f, 14.727f, 9.471f),
                    PathNode.CurveTo(15.472f, 10.216f, 15.962f, 11.119f, 16.197f, 12.072f),
                    PathNode.LineTo(15.651f, 12.619f),
                    PathNode.CurveTo(15.439f, 12.831f, 15.203f, 13.002f, 14.951f, 13.134f),
                    PathNode.CurveTo(14.886f, 12.16f, 14.481f, 11.205f, 13.737f, 10.461f),
                    PathNode.CurveTo(12.105f, 8.829f, 9.458f, 8.829f, 7.826f, 10.461f),
                    PathNode.LineTo(4.759f, 13.528f),
                    PathNode.CurveTo(3.127f, 15.16f, 3.127f, 17.806f, 4.759f, 19.439f),
                    PathNode.CurveTo(6.392f, 21.071f, 9.038f, 21.071f, 10.67f, 19.439f),
                    PathNode.LineTo(12.706f, 17.403f),
                    PathNode.CurveTo(13.373f, 17.491f, 14.05f, 17.482f, 14.714f, 17.375f),
                    PathNode.LineTo(11.66f, 20.429f),
                    PathNode.CurveTo(9.481f, 22.608f, 5.948f, 22.608f, 3.769f, 20.429f),
                    PathNode.Close,
                    PathNode.MoveTo(8.745f, 11.38f),
                    PathNode.LineTo(8.199f, 11.927f),
                    PathNode.CurveTo(8.434f, 12.88f, 8.925f, 13.783f, 9.67f, 14.528f),
                    PathNode.CurveTo(11.849f, 16.707f, 15.381f, 16.707f, 17.56f, 14.528f),
                    PathNode.LineTo(20.627f, 11.462f),
                    PathNode.CurveTo(22.806f, 9.283f, 22.806f, 5.75f, 20.627f, 3.571f),
                    PathNode.CurveTo(18.448f, 1.392f, 14.915f, 1.392f, 12.737f, 3.571f),
                    PathNode.LineTo(9.683f, 6.625f),
                    PathNode.CurveTo(10.347f, 6.518f, 11.024f, 6.509f, 11.691f, 6.597f),
                    PathNode.LineTo(13.726f, 4.561f),
                    PathNode.CurveTo(15.359f, 2.929f, 18.005f, 2.929f, 19.637f, 4.561f),
                    PathNode.CurveTo(21.269f, 6.193f, 21.269f, 8.839f, 19.637f, 10.472f),
                    PathNode.LineTo(16.57f, 13.538f),
                    PathNode.CurveTo(14.938f, 15.171f, 12.292f, 15.171f, 10.66f, 13.538f),
                    PathNode.CurveTo(9.915f, 12.794f, 9.51f, 11.839f, 9.445f, 10.865f),
                    PathNode.CurveTo(9.193f, 10.997f, 8.957f, 11.169f, 8.745f, 11.38f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _link!!
    }

private var _link: ImageVector? = null
