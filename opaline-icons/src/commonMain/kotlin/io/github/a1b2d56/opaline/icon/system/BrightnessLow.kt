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

/** `settings_brightness_ic_min` */
val OpalineIcons.System.BrightnessLow: ImageVector
    get() {
        if (_brightnessLow != null) return _brightnessLow!!
        _brightnessLow = ImageVector.Builder(
            name = "BrightnessLow",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.2f, 5.875f),
                    PathNode.LineTo(11.2f, 4.125f),
                    PathNode.LineTo(12.8f, 4.125f),
                    PathNode.LineTo(12.8f, 5.875f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 8.425f),
                    PathNode.CurveTo(10.026f, 8.425f, 8.425f, 10.026f, 8.425f, 12.0f),
                    PathNode.CurveTo(8.425f, 13.974f, 10.026f, 15.575f, 12.0f, 15.575f),
                    PathNode.CurveTo(13.974f, 15.575f, 15.575f, 13.974f, 15.575f, 12.0f),
                    PathNode.CurveTo(15.575f, 10.026f, 13.974f, 8.425f, 12.0f, 8.425f),
                    PathNode.Close,
                    PathNode.MoveTo(6.825f, 12.0f),
                    PathNode.CurveTo(6.825f, 9.142f, 9.142f, 6.825f, 12.0f, 6.825f),
                    PathNode.CurveTo(14.858f, 6.825f, 17.175f, 9.142f, 17.175f, 12.0f),
                    PathNode.CurveTo(17.175f, 14.858f, 14.858f, 17.175f, 12.0f, 17.175f),
                    PathNode.CurveTo(9.142f, 17.175f, 6.825f, 14.858f, 6.825f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.003f, 5.866f),
                    PathNode.LineTo(15.766f, 7.103f),
                    PathNode.LineTo(16.897f, 8.234f),
                    PathNode.LineTo(18.134f, 6.997f),
                    PathNode.Close,
                    PathNode.MoveTo(18.125f, 11.2f),
                    PathNode.LineTo(19.875f, 11.2f),
                    PathNode.LineTo(19.875f, 12.8f),
                    PathNode.LineTo(18.125f, 12.8f),
                    PathNode.Close,
                    PathNode.MoveTo(18.134f, 17.003f),
                    PathNode.LineTo(16.897f, 15.766f),
                    PathNode.LineTo(15.766f, 16.897f),
                    PathNode.LineTo(17.003f, 18.134f),
                    PathNode.Close,
                    PathNode.MoveTo(12.8f, 18.125f),
                    PathNode.LineTo(12.8f, 19.875f),
                    PathNode.LineTo(11.2f, 19.875f),
                    PathNode.LineTo(11.2f, 18.125f),
                    PathNode.Close,
                    PathNode.MoveTo(6.997f, 18.134f),
                    PathNode.LineTo(8.234f, 16.897f),
                    PathNode.LineTo(7.103f, 15.766f),
                    PathNode.LineTo(5.866f, 17.003f),
                    PathNode.Close,
                    PathNode.MoveTo(5.875f, 12.8f),
                    PathNode.LineTo(4.125f, 12.8f),
                    PathNode.LineTo(4.125f, 11.2f),
                    PathNode.LineTo(5.875f, 11.2f),
                    PathNode.Close,
                    PathNode.MoveTo(5.866f, 6.997f),
                    PathNode.LineTo(7.103f, 8.234f),
                    PathNode.LineTo(8.234f, 7.103f),
                    PathNode.LineTo(6.997f, 5.866f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _brightnessLow!!
    }

private var _brightnessLow: ImageVector? = null
