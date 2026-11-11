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

/** `compact_window_info` */
val OpalineIcons.System.WindowInfo: ImageVector
    get() {
        if (_windowInfo != null) return _windowInfo!!
        _windowInfo = ImageVector.Builder(
            name = "WindowInfo",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.05f),
                    PathNode.CurveTo(7.609f, 4.05f, 4.05f, 7.609f, 4.05f, 12.0f),
                    PathNode.CurveTo(4.05f, 16.39f, 7.609f, 19.95f, 12.0f, 19.95f),
                    PathNode.CurveTo(16.391f, 19.95f, 19.95f, 16.39f, 19.95f, 12.0f),
                    PathNode.CurveTo(19.95f, 7.609f, 16.391f, 4.05f, 12.0f, 4.05f),
                    PathNode.Close,
                    PathNode.MoveTo(2.45f, 12.0f),
                    PathNode.CurveTo(2.45f, 6.725f, 6.726f, 2.45f, 12.0f, 2.45f),
                    PathNode.CurveTo(17.274f, 2.45f, 21.55f, 6.725f, 21.55f, 12.0f),
                    PathNode.CurveTo(21.55f, 17.274f, 17.274f, 21.55f, 12.0f, 21.55f),
                    PathNode.CurveTo(6.726f, 21.55f, 2.45f, 17.274f, 2.45f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(11.2f, 16.375f),
                    PathNode.LineTo(11.2f, 11.125f),
                    PathNode.LineTo(12.8f, 11.125f),
                    PathNode.LineTo(12.8f, 16.375f),
                    PathNode.LineTo(11.2f, 16.375f),
                    PathNode.Close,
                    PathNode.MoveTo(13.094f, 8.937f),
                    PathNode.CurveTo(13.094f, 9.541f, 12.604f, 10.031f, 12.0f, 10.031f),
                    PathNode.CurveTo(11.396f, 10.031f, 10.906f, 9.541f, 10.906f, 8.937f),
                    PathNode.CurveTo(10.906f, 8.333f, 11.396f, 7.843f, 12.0f, 7.843f),
                    PathNode.CurveTo(12.604f, 7.843f, 13.094f, 8.333f, 13.094f, 8.937f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _windowInfo!!
    }

private var _windowInfo: ImageVector? = null
