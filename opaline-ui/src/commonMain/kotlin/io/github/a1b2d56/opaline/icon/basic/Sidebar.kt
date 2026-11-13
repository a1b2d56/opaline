// Copyright 2026, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `app_ic_side_pane_control_dark` */
val OpalineIcons.Basic.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = ImageVector.Builder(
            name = "Sidebar",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.301f, 20.701f),
                    PathNode.CurveTo(2.196f, 20.701f, 1.301f, 19.805f, 1.301f, 18.701f),
                    PathNode.LineTo(1.301f, 5.301f),
                    PathNode.CurveTo(1.301f, 4.196f, 2.196f, 3.301f, 3.301f, 3.301f),
                    PathNode.LineTo(20.701f, 3.301f),
                    PathNode.CurveTo(21.805f, 3.301f, 22.701f, 4.196f, 22.701f, 5.301f),
                    PathNode.LineTo(22.701f, 18.701f),
                    PathNode.CurveTo(22.701f, 19.805f, 21.805f, 20.701f, 20.701f, 20.701f),
                    PathNode.LineTo(10.002f, 20.701f),
                    PathNode.LineTo(10.001f, 20.701f),
                    PathNode.LineTo(10.0f, 20.701f),
                    PathNode.LineTo(3.301f, 20.701f),
                    PathNode.Close,
                    PathNode.MoveTo(20.701f, 19.301f),
                    PathNode.LineTo(10.701f, 19.301f),
                    PathNode.LineTo(10.701f, 4.701f),
                    PathNode.LineTo(20.701f, 4.701f),
                    PathNode.CurveTo(21.032f, 4.701f, 21.301f, 4.969f, 21.301f, 5.301f),
                    PathNode.LineTo(21.301f, 18.701f),
                    PathNode.CurveTo(21.301f, 19.032f, 21.032f, 19.301f, 20.701f, 19.301f),
                    PathNode.Close,
                    PathNode.MoveTo(3.301f, 4.701f),
                    PathNode.LineTo(9.301f, 4.701f),
                    PathNode.LineTo(9.301f, 19.301f),
                    PathNode.LineTo(3.301f, 19.301f),
                    PathNode.CurveTo(2.969f, 19.301f, 2.701f, 19.032f, 2.701f, 18.701f),
                    PathNode.LineTo(2.701f, 5.301f),
                    PathNode.CurveTo(2.701f, 4.969f, 2.969f, 4.701f, 3.301f, 4.701f),
                    PathNode.Close,
                    PathNode.MoveTo(5.001f, 6.851f),
                    PathNode.CurveTo(4.642f, 6.851f, 4.351f, 7.142f, 4.351f, 7.501f),
                    PathNode.CurveTo(4.351f, 7.86f, 4.642f, 8.151f, 5.001f, 8.151f),
                    PathNode.LineTo(7.001f, 8.151f),
                    PathNode.CurveTo(7.36f, 8.151f, 7.651f, 7.86f, 7.651f, 7.501f),
                    PathNode.CurveTo(7.651f, 7.142f, 7.36f, 6.851f, 7.001f, 6.851f),
                    PathNode.LineTo(5.001f, 6.851f),
                    PathNode.Close,
                    PathNode.MoveTo(4.351f, 10.001f),
                    PathNode.CurveTo(4.351f, 9.642f, 4.642f, 9.351f, 5.001f, 9.351f),
                    PathNode.LineTo(7.001f, 9.351f),
                    PathNode.CurveTo(7.36f, 9.351f, 7.651f, 9.642f, 7.651f, 10.001f),
                    PathNode.CurveTo(7.651f, 10.36f, 7.36f, 10.651f, 7.001f, 10.651f),
                    PathNode.LineTo(5.001f, 10.651f),
                    PathNode.CurveTo(4.642f, 10.651f, 4.351f, 10.36f, 4.351f, 10.001f),
                    PathNode.Close,
                    PathNode.MoveTo(5.001f, 11.851f),
                    PathNode.CurveTo(4.642f, 11.851f, 4.351f, 12.142f, 4.351f, 12.501f),
                    PathNode.CurveTo(4.351f, 12.86f, 4.642f, 13.151f, 5.001f, 13.151f),
                    PathNode.LineTo(7.001f, 13.151f),
                    PathNode.CurveTo(7.36f, 13.151f, 7.651f, 12.86f, 7.651f, 12.501f),
                    PathNode.CurveTo(7.651f, 12.142f, 7.36f, 11.851f, 7.001f, 11.851f),
                    PathNode.LineTo(5.001f, 11.851f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
