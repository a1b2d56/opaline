// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `systemui_icon_volume_notification_mute_multi_app` */
val OpalineIcons.System.VolumeNotificationMute: ImageVector
    get() {
        if (_volumeNotificationMute != null) return _volumeNotificationMute!!
        _volumeNotificationMute = ImageVector.Builder(
            name = "VolumeNotificationMute",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.207f, 19.934f),
                    PathNode.CurveTo(14.33f, 19.934f, 14.425f, 20.045f, 14.395f, 20.164f),
                    PathNode.CurveTo(14.367f, 20.275f, 14.331f, 20.384f, 14.287f, 20.49f),
                    PathNode.CurveTo(14.162f, 20.793f, 13.977f, 21.069f, 13.745f, 21.301f),
                    PathNode.CurveTo(13.513f, 21.533f, 13.238f, 21.717f, 12.935f, 21.843f),
                    PathNode.CurveTo(12.632f, 21.968f, 12.306f, 22.033f, 11.978f, 22.033f),
                    PathNode.CurveTo(11.65f, 22.033f, 11.324f, 21.968f, 11.021f, 21.843f),
                    PathNode.CurveTo(10.718f, 21.717f, 10.442f, 21.533f, 10.21f, 21.301f),
                    PathNode.CurveTo(9.978f, 21.069f, 9.794f, 20.793f, 9.668f, 20.49f),
                    PathNode.CurveTo(9.624f, 20.384f, 9.589f, 20.275f, 9.561f, 20.164f),
                    PathNode.CurveTo(9.53f, 20.045f, 9.625f, 19.934f, 9.748f, 19.934f),
                    PathNode.LineTo(14.207f, 19.934f),
                    PathNode.Close,
                    PathNode.MoveTo(15.804f, 18.633f),
                    PathNode.LineTo(4.426f, 18.633f),
                    PathNode.CurveTo(3.223f, 18.632f, 2.581f, 17.216f, 3.373f, 16.31f),
                    PathNode.LineTo(4.49f, 15.034f),
                    PathNode.CurveTo(5.084f, 14.356f, 5.431f, 13.498f, 5.476f, 12.599f),
                    PathNode.LineTo(5.635f, 9.404f),
                    PathNode.CurveTo(5.636f, 9.107f, 5.658f, 8.815f, 5.699f, 8.528f),
                    PathNode.LineTo(15.804f, 18.633f),
                    PathNode.Close,
                    PathNode.MoveTo(17.643f, 18.633f),
                    PathNode.LineTo(17.642f, 18.633f),
                    PathNode.LineTo(6.088f, 7.079f),
                    PathNode.LineTo(6.088f, 7.078f),
                    PathNode.LineTo(17.643f, 18.633f),
                    PathNode.Close,
                    PathNode.MoveTo(11.977f, 1.967f),
                    PathNode.CurveTo(12.423f, 1.967f, 12.851f, 2.144f, 13.167f, 2.46f),
                    PathNode.CurveTo(13.402f, 2.695f, 13.56f, 2.993f, 13.625f, 3.313f),
                    PathNode.CurveTo(13.747f, 3.346f, 13.867f, 3.383f, 13.986f, 3.423f),
                    PathNode.CurveTo(13.784f, 3.92f, 13.673f, 4.464f, 13.673f, 5.033f),
                    PathNode.CurveTo(13.673f, 7.408f, 15.598f, 9.333f, 17.973f, 9.333f),
                    PathNode.CurveTo(18.088f, 9.333f, 18.202f, 9.326f, 18.316f, 9.317f),
                    PathNode.CurveTo(18.316f, 9.347f, 18.318f, 9.376f, 18.319f, 9.405f),
                    PathNode.LineTo(18.474f, 12.596f),
                    PathNode.CurveTo(18.518f, 13.497f, 18.866f, 14.357f, 19.461f, 15.036f),
                    PathNode.LineTo(20.576f, 16.31f),
                    PathNode.CurveTo(21.003f, 16.798f, 21.01f, 17.431f, 20.741f, 17.914f),
                    PathNode.LineTo(7.64f, 4.812f),
                    PathNode.CurveTo(8.388f, 4.11f, 9.306f, 3.589f, 10.326f, 3.314f),
                    PathNode.CurveTo(10.392f, 2.993f, 10.551f, 2.695f, 10.786f, 2.46f),
                    PathNode.CurveTo(11.102f, 2.144f, 11.53f, 1.967f, 11.977f, 1.967f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(3.0f, 3.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeNotificationMute!!
    }

private var _volumeNotificationMute: ImageVector? = null
