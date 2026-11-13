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

/** `ic_mark_small` */
val OpalineIcons.System.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = ImageVector.Builder(
            name = "Flag",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.018f, 2.42f),
                    PathNode.CurveTo(12.603f, 2.681f, 14.25f, 2.952f, 16.123f, 2.818f),
                    PathNode.CurveTo(16.295f, 2.806f, 16.461f, 2.882f, 16.564f, 3.019f),
                    PathNode.CurveTo(16.668f, 3.156f, 16.695f, 3.336f, 16.636f, 3.498f),
                    PathNode.LineTo(15.25f, 7.31f),
                    PathNode.LineTo(16.636f, 11.122f),
                    PathNode.CurveTo(16.691f, 11.272f, 16.672f, 11.438f, 16.585f, 11.571f),
                    PathNode.CurveTo(16.499f, 11.705f, 16.354f, 11.79f, 16.196f, 11.801f),
                    PathNode.CurveTo(14.191f, 11.944f, 12.384f, 11.646f, 10.779f, 11.381f),
                    PathNode.CurveTo(10.297f, 11.301f, 9.833f, 11.225f, 9.388f, 11.164f),
                    PathNode.CurveTo(7.552f, 10.914f, 5.981f, 10.915f, 4.424f, 11.88f),
                    PathNode.LineTo(4.424f, 17.455f),
                    PathNode.CurveTo(4.424f, 17.777f, 4.163f, 18.038f, 3.841f, 18.038f),
                    PathNode.CurveTo(3.518f, 18.038f, 3.257f, 17.777f, 3.257f, 17.455f),
                    PathNode.LineTo(3.257f, 3.687f),
                    PathNode.CurveTo(3.257f, 3.379f, 3.496f, 3.127f, 3.798f, 3.105f),
                    PathNode.CurveTo(5.685f, 1.894f, 7.576f, 1.922f, 9.525f, 2.188f),
                    PathNode.CurveTo(10.02f, 2.255f, 10.516f, 2.337f, 11.018f, 2.42f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _flag!!
    }

private var _flag: ImageVector? = null
