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

/** `settings_brightness_ic_max` */
val OpalineIcons.System.BrightnessHigh: ImageVector
    get() {
        if (_brightnessHigh != null) return _brightnessHigh!!
        _brightnessHigh = ImageVector.Builder(
            name = "BrightnessHigh",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.25f, 6.167f),
                    PathNode.LineTo(11.25f, 2.833f),
                    PathNode.LineTo(12.75f, 2.833f),
                    PathNode.LineTo(12.75f, 6.167f),
                    PathNode.LineTo(11.25f, 6.167f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.083f),
                    PathNode.CurveTo(9.285f, 7.083f, 7.083f, 9.285f, 7.083f, 12.0f),
                    PathNode.CurveTo(7.083f, 14.716f, 9.285f, 16.917f, 12.0f, 16.917f),
                    PathNode.CurveTo(14.715f, 16.917f, 16.917f, 14.716f, 16.917f, 12.0f),
                    PathNode.CurveTo(16.917f, 9.285f, 14.715f, 7.083f, 12.0f, 7.083f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.951f, 4.988f),
                    PathNode.LineTo(15.595f, 7.345f),
                    PathNode.LineTo(16.655f, 8.405f),
                    PathNode.LineTo(19.012f, 6.049f),
                    PathNode.LineTo(17.951f, 4.988f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.833f, 11.25f),
                    PathNode.LineTo(21.167f, 11.25f),
                    PathNode.LineTo(21.167f, 12.75f),
                    PathNode.LineTo(17.833f, 12.75f),
                    PathNode.LineTo(17.833f, 11.25f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.012f, 17.951f),
                    PathNode.LineTo(16.655f, 15.595f),
                    PathNode.LineTo(15.595f, 16.655f),
                    PathNode.LineTo(17.951f, 19.012f),
                    PathNode.LineTo(19.012f, 17.951f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.75f, 17.834f),
                    PathNode.LineTo(12.75f, 21.167f),
                    PathNode.LineTo(11.25f, 21.167f),
                    PathNode.LineTo(11.25f, 17.834f),
                    PathNode.LineTo(12.75f, 17.834f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.049f, 19.012f),
                    PathNode.LineTo(8.405f, 16.655f),
                    PathNode.LineTo(7.345f, 15.595f),
                    PathNode.LineTo(4.988f, 17.951f),
                    PathNode.LineTo(6.049f, 19.012f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.167f, 12.75f),
                    PathNode.LineTo(2.833f, 12.75f),
                    PathNode.LineTo(2.833f, 11.25f),
                    PathNode.LineTo(6.167f, 11.25f),
                    PathNode.LineTo(6.167f, 12.75f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.988f, 6.049f),
                    PathNode.LineTo(7.345f, 8.405f),
                    PathNode.LineTo(8.405f, 7.345f),
                    PathNode.LineTo(6.049f, 4.988f),
                    PathNode.LineTo(4.988f, 6.049f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _brightnessHigh!!
    }

private var _brightnessHigh: ImageVector? = null
