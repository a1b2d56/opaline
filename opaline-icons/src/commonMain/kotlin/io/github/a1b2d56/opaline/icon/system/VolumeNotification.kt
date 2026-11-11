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

/** `systemui_icon_volume_notification_multi_app` */
val OpalineIcons.System.VolumeNotification: ImageVector
    get() {
        if (_volumeNotification != null) return _volumeNotification!!
        _volumeNotification = ImageVector.Builder(
            name = "VolumeNotification",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.207f, 19.934f),
                    PathNode.CurveTo(14.33f, 19.934f, 14.425f, 20.045f, 14.394f, 20.164f),
                    PathNode.CurveTo(14.366f, 20.275f, 14.331f, 20.384f, 14.287f, 20.49f),
                    PathNode.CurveTo(14.161f, 20.793f, 13.977f, 21.069f, 13.745f, 21.301f),
                    PathNode.CurveTo(13.513f, 21.533f, 13.238f, 21.717f, 12.934f, 21.843f),
                    PathNode.CurveTo(12.631f, 21.968f, 12.306f, 22.033f, 11.977f, 22.033f),
                    PathNode.CurveTo(11.649f, 22.033f, 11.324f, 21.968f, 11.02f, 21.843f),
                    PathNode.CurveTo(10.717f, 21.717f, 10.442f, 21.533f, 10.21f, 21.301f),
                    PathNode.CurveTo(9.978f, 21.069f, 9.793f, 20.793f, 9.668f, 20.49f),
                    PathNode.CurveTo(9.624f, 20.384f, 9.589f, 20.275f, 9.56f, 20.164f),
                    PathNode.CurveTo(9.53f, 20.045f, 9.625f, 19.934f, 9.748f, 19.934f),
                    PathNode.LineTo(14.207f, 19.934f),
                    PathNode.Close,
                    PathNode.MoveTo(11.976f, 1.967f),
                    PathNode.CurveTo(12.423f, 1.967f, 12.851f, 2.144f, 13.167f, 2.46f),
                    PathNode.CurveTo(13.402f, 2.695f, 13.559f, 2.993f, 13.625f, 3.313f),
                    PathNode.CurveTo(13.747f, 3.346f, 13.866f, 3.383f, 13.985f, 3.423f),
                    PathNode.CurveTo(13.784f, 3.92f, 13.673f, 4.464f, 13.673f, 5.033f),
                    PathNode.CurveTo(13.673f, 7.408f, 15.598f, 9.333f, 17.972f, 9.333f),
                    PathNode.CurveTo(18.088f, 9.333f, 18.202f, 9.326f, 18.315f, 9.317f),
                    PathNode.CurveTo(18.316f, 9.347f, 18.318f, 9.376f, 18.318f, 9.405f),
                    PathNode.LineTo(18.473f, 12.596f),
                    PathNode.CurveTo(18.518f, 13.497f, 18.866f, 14.357f, 19.461f, 15.036f),
                    PathNode.LineTo(20.576f, 16.31f),
                    PathNode.CurveTo(21.368f, 17.215f, 20.726f, 18.632f, 19.523f, 18.633f),
                    PathNode.LineTo(4.426f, 18.633f),
                    PathNode.CurveTo(3.223f, 18.632f, 2.58f, 17.216f, 3.373f, 16.31f),
                    PathNode.LineTo(4.49f, 15.034f),
                    PathNode.CurveTo(5.083f, 14.356f, 5.431f, 13.498f, 5.475f, 12.599f),
                    PathNode.LineTo(5.635f, 9.404f),
                    PathNode.CurveTo(5.65f, 6.488f, 7.634f, 4.038f, 10.326f, 3.314f),
                    PathNode.CurveTo(10.392f, 2.993f, 10.551f, 2.695f, 10.786f, 2.46f),
                    PathNode.CurveTo(11.102f, 2.144f, 11.53f, 1.967f, 11.976f, 1.967f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.977f, 5.033f),
                    PathNode.MoveTo(14.977f, 5.033f),
                    PathNode.CurveTo(14.977f, 3.376f, 16.32f, 2.033f, 17.977f, 2.033f),
                    PathNode.CurveTo(19.634f, 2.033f, 20.977f, 3.376f, 20.977f, 5.033f),
                    PathNode.CurveTo(20.977f, 6.69f, 19.634f, 8.033f, 17.977f, 8.033f),
                    PathNode.CurveTo(16.32f, 8.033f, 14.977f, 6.69f, 14.977f, 5.033f),
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeNotification!!
    }

private var _volumeNotification: ImageVector? = null
