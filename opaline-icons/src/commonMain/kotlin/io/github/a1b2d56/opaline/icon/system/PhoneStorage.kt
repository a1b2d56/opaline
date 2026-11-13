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

/** `ic_all_files` */
val OpalineIcons.System.PhoneStorage: ImageVector
    get() {
        if (_phoneStorage != null) return _phoneStorage!!
        _phoneStorage = ImageVector.Builder(
            name = "PhoneStorage",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.7f, 1.301f),
                    PathNode.CurveTo(17.805f, 1.301f, 18.7f, 2.196f, 18.7f, 3.301f),
                    PathNode.LineTo(18.7f, 20.701f),
                    PathNode.CurveTo(18.7f, 21.805f, 17.805f, 22.701f, 16.7f, 22.701f),
                    PathNode.LineTo(7.3f, 22.701f),
                    PathNode.CurveTo(6.195f, 22.701f, 5.3f, 21.805f, 5.3f, 20.701f),
                    PathNode.LineTo(5.3f, 3.301f),
                    PathNode.CurveTo(5.3f, 2.196f, 6.195f, 1.301f, 7.3f, 1.301f),
                    PathNode.LineTo(16.7f, 1.301f),
                    PathNode.Close,
                    PathNode.MoveTo(7.3f, 2.701f),
                    PathNode.CurveTo(6.969f, 2.701f, 6.7f, 2.97f, 6.7f, 3.301f),
                    PathNode.LineTo(6.7f, 20.701f),
                    PathNode.CurveTo(6.7f, 21.032f, 6.969f, 21.301f, 7.3f, 21.301f),
                    PathNode.LineTo(16.7f, 21.301f),
                    PathNode.CurveTo(17.031f, 21.301f, 17.3f, 21.032f, 17.3f, 20.701f),
                    PathNode.LineTo(17.3f, 3.301f),
                    PathNode.CurveTo(17.3f, 2.97f, 17.031f, 2.701f, 16.7f, 2.701f),
                    PathNode.LineTo(7.3f, 2.701f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 19.001f),
                    PathNode.CurveTo(14.276f, 19.001f, 14.5f, 19.225f, 14.5f, 19.501f),
                    PathNode.CurveTo(14.5f, 19.777f, 14.276f, 20.001f, 14.0f, 20.001f),
                    PathNode.LineTo(10.0f, 20.001f),
                    PathNode.CurveTo(9.724f, 20.001f, 9.5f, 19.777f, 9.5f, 19.501f),
                    PathNode.CurveTo(9.5f, 19.225f, 9.724f, 19.001f, 10.0f, 19.001f),
                    PathNode.LineTo(14.0f, 19.001f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 3.501f),
                    PathNode.CurveTo(12.414f, 3.501f, 12.75f, 3.837f, 12.75f, 4.251f),
                    PathNode.CurveTo(12.75f, 4.665f, 12.414f, 5.001f, 12.0f, 5.001f),
                    PathNode.CurveTo(11.586f, 5.001f, 11.25f, 4.665f, 11.25f, 4.251f),
                    PathNode.CurveTo(11.25f, 3.837f, 11.586f, 3.501f, 12.0f, 3.501f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _phoneStorage!!
    }

private var _phoneStorage: ImageVector? = null
