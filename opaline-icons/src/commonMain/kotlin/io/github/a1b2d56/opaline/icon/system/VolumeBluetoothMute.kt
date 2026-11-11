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

/** `systemui_icon_volume_media_bt_mute_multi_app` */
val OpalineIcons.System.VolumeBluetoothMute: ImageVector
    get() {
        if (_volumeBluetoothMute != null) return _volumeBluetoothMute!!
        _volumeBluetoothMute = ImageVector.Builder(
            name = "VolumeBluetoothMute",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.068f, 15.896f),
                    PathNode.LineTo(13.068f, 19.375f),
                    PathNode.LineTo(14.983f, 17.811f),
                    PathNode.LineTo(16.688f, 19.516f),
                    PathNode.LineTo(12.953f, 22.567f),
                    PathNode.CurveTo(12.039f, 23.313f, 10.668f, 22.663f, 10.667f, 21.483f),
                    PathNode.LineTo(10.667f, 14.904f),
                    PathNode.LineTo(7.258f, 18.313f),
                    PathNode.CurveTo(7.06f, 18.511f, 6.961f, 18.61f, 6.847f, 18.647f),
                    PathNode.CurveTo(6.747f, 18.68f, 6.638f, 18.68f, 6.538f, 18.647f),
                    PathNode.CurveTo(6.424f, 18.61f, 6.325f, 18.511f, 6.127f, 18.313f),
                    PathNode.LineTo(5.561f, 17.747f),
                    PathNode.CurveTo(5.363f, 17.549f, 5.264f, 17.45f, 5.227f, 17.336f),
                    PathNode.CurveTo(5.194f, 17.236f, 5.194f, 17.128f, 5.227f, 17.027f),
                    PathNode.CurveTo(5.264f, 16.913f, 5.363f, 16.814f, 5.561f, 16.616f),
                    PathNode.LineTo(9.609f, 12.567f),
                    PathNode.CurveTo(9.632f, 12.545f, 9.653f, 12.521f, 9.673f, 12.501f),
                    PathNode.LineTo(13.068f, 15.896f),
                    PathNode.Close,
                    PathNode.MoveTo(2.505f, 2.505f),
                    PathNode.CurveTo(2.778f, 2.232f, 3.222f, 2.232f, 3.495f, 2.505f),
                    PathNode.LineTo(21.495f, 20.505f),
                    PathNode.CurveTo(21.769f, 20.778f, 21.769f, 21.222f, 21.495f, 21.495f),
                    PathNode.CurveTo(21.222f, 21.768f, 20.778f, 21.768f, 20.505f, 21.495f),
                    PathNode.LineTo(2.505f, 3.495f),
                    PathNode.CurveTo(2.232f, 3.222f, 2.232f, 2.778f, 2.505f, 2.505f),
                    PathNode.Close,
                    PathNode.MoveTo(10.667f, 2.523f),
                    PathNode.CurveTo(10.668f, 1.381f, 11.953f, 0.735f, 12.864f, 1.372f),
                    PathNode.LineTo(12.951f, 1.438f),
                    PathNode.LineTo(18.246f, 5.75f),
                    PathNode.CurveTo(19.029f, 6.388f, 19.032f, 7.583f, 18.253f, 8.226f),
                    PathNode.LineTo(14.305f, 11.477f),
                    PathNode.LineTo(10.667f, 7.839f),
                    PathNode.LineTo(10.667f, 2.523f),
                    PathNode.Close,
                    PathNode.MoveTo(13.068f, 9.388f),
                    PathNode.LineTo(15.973f, 6.994f),
                    PathNode.LineTo(13.068f, 4.627f),
                    PathNode.LineTo(13.068f, 9.388f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeBluetoothMute!!
    }

private var _volumeBluetoothMute: ImageVector? = null
