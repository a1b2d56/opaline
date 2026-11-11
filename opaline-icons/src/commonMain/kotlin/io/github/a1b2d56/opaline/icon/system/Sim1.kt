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

/** `qs_icon_sim_1` */
val OpalineIcons.System.Sim1: ImageVector
    get() {
        if (_sim1 != null) return _sim1!!
        _sim1 = ImageVector.Builder(
            name = "Sim1",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.124f, 1.886f),
                    PathNode.CurveTo(8.499f, 1.511f, 9.008f, 1.3f, 9.538f, 1.3f),
                    PathNode.LineTo(18.7f, 1.3f),
                    PathNode.CurveTo(19.804f, 1.3f, 20.7f, 2.195f, 20.7f, 3.3f),
                    PathNode.LineTo(20.7f, 6.0f),
                    PathNode.LineTo(20.7f, 19.0f),
                    PathNode.LineTo(20.7f, 20.7f),
                    PathNode.CurveTo(20.7f, 21.804f, 19.804f, 22.7f, 18.7f, 22.7f),
                    PathNode.LineTo(5.3f, 22.7f),
                    PathNode.CurveTo(4.195f, 22.7f, 3.3f, 21.804f, 3.3f, 20.7f),
                    PathNode.LineTo(3.3f, 7.538f),
                    PathNode.CurveTo(3.3f, 7.008f, 3.511f, 6.499f, 3.886f, 6.124f),
                    PathNode.LineTo(8.124f, 1.886f),
                    PathNode.Close,
                    PathNode.MoveTo(10.986f, 10.403f),
                    PathNode.CurveTo(11.111f, 10.328f, 11.195f, 10.274f, 11.236f, 10.24f),
                    PathNode.LineTo(11.236f, 16.912f),
                    PathNode.LineTo(13.452f, 16.912f),
                    PathNode.LineTo(13.452f, 7.912f),
                    PathNode.LineTo(11.65f, 7.912f),
                    PathNode.CurveTo(11.591f, 8.046f, 11.466f, 8.192f, 11.274f, 8.35f),
                    PathNode.CurveTo(11.09f, 8.509f, 10.878f, 8.663f, 10.636f, 8.813f),
                    PathNode.CurveTo(10.435f, 8.93f, 10.198f, 9.043f, 9.922f, 9.151f),
                    PathNode.CurveTo(9.647f, 9.26f, 9.426f, 9.335f, 9.259f, 9.377f),
                    PathNode.LineTo(9.772f, 10.904f),
                    PathNode.CurveTo(9.889f, 10.862f, 10.031f, 10.812f, 10.198f, 10.754f),
                    PathNode.CurveTo(10.365f, 10.695f, 10.51f, 10.637f, 10.636f, 10.578f),
                    PathNode.CurveTo(10.744f, 10.528f, 10.861f, 10.47f, 10.986f, 10.403f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _sim1!!
    }

private var _sim1: ImageVector? = null
