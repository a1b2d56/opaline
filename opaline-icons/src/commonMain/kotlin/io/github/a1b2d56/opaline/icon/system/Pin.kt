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

/** `conv_pin_to_top` */
val OpalineIcons.System.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = ImageVector.Builder(
            name = "Pin",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.126f, 1.3f),
                    PathNode.CurveTo(18.513f, 1.3f, 18.826f, 1.613f, 18.826f, 2.0f),
                    PathNode.CurveTo(18.826f, 2.386f, 18.512f, 2.7f, 18.126f, 2.7f),
                    PathNode.LineTo(16.201f, 2.7f),
                    PathNode.LineTo(16.201f, 7.631f),
                    PathNode.CurveTo(19.019f, 9.634f, 20.701f, 12.882f, 20.701f, 16.352f),
                    PathNode.LineTo(20.701f, 17.0f),
                    PathNode.CurveTo(20.701f, 17.386f, 20.387f, 17.7f, 20.001f, 17.7f),
                    PathNode.LineTo(13.196f, 17.7f),
                    PathNode.LineTo(12.496f, 23.0f),
                    PathNode.CurveTo(12.419f, 23.579f, 11.582f, 23.579f, 11.505f, 23.0f),
                    PathNode.LineTo(10.805f, 17.7f),
                    PathNode.LineTo(4.001f, 17.7f),
                    PathNode.CurveTo(3.614f, 17.7f, 3.301f, 17.386f, 3.301f, 17.0f),
                    PathNode.LineTo(3.301f, 16.352f),
                    PathNode.CurveTo(3.301f, 12.881f, 4.983f, 9.634f, 7.801f, 7.631f),
                    PathNode.LineTo(7.801f, 2.7f),
                    PathNode.LineTo(5.876f, 2.7f),
                    PathNode.CurveTo(5.489f, 2.7f, 5.176f, 2.387f, 5.176f, 2.0f),
                    PathNode.CurveTo(5.176f, 1.613f, 5.489f, 1.3f, 5.876f, 1.3f),
                    PathNode.LineTo(18.126f, 1.3f),
                    PathNode.Close,
                    PathNode.MoveTo(9.201f, 8.0f),
                    PathNode.CurveTo(9.201f, 8.234f, 9.084f, 8.452f, 8.89f, 8.582f),
                    PathNode.LineTo(8.842f, 8.613f),
                    PathNode.CurveTo(6.269f, 10.328f, 4.719f, 13.21f, 4.702f, 16.3f),
                    PathNode.LineTo(19.3f, 16.3f),
                    PathNode.CurveTo(19.283f, 13.21f, 17.733f, 10.328f, 15.16f, 8.613f),
                    PathNode.LineTo(15.112f, 8.582f),
                    PathNode.CurveTo(14.918f, 8.452f, 14.801f, 8.234f, 14.801f, 8.0f),
                    PathNode.LineTo(14.801f, 2.7f),
                    PathNode.LineTo(9.201f, 2.7f),
                    PathNode.LineTo(9.201f, 8.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _pin!!
    }

private var _pin: ImageVector? = null
