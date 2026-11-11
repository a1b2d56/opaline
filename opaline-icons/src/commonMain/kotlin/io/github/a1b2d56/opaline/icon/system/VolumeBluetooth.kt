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

/** `systemui_icon_volume_media_bt_multi_app` */
val OpalineIcons.System.VolumeBluetooth: ImageVector
    get() {
        if (_volumeBluetooth != null) return _volumeBluetooth!!
        _volumeBluetooth = ImageVector.Builder(
            name = "VolumeBluetooth",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.645f, 2.523f),
                    PathNode.CurveTo(10.645f, 1.38f, 11.93f, 0.734f, 12.842f, 1.371f),
                    PathNode.LineTo(12.929f, 1.437f),
                    PathNode.LineTo(18.224f, 5.749f),
                    PathNode.CurveTo(19.007f, 6.387f, 19.01f, 7.582f, 18.231f, 8.225f),
                    PathNode.LineTo(13.718f, 11.941f),
                    PathNode.LineTo(18.252f, 15.776f),
                    PathNode.CurveTo(19.016f, 16.422f, 19.006f, 17.603f, 18.232f, 18.236f),
                    PathNode.LineTo(12.931f, 22.566f),
                    PathNode.CurveTo(12.017f, 23.313f, 10.645f, 22.663f, 10.645f, 21.483f),
                    PathNode.LineTo(10.645f, 14.903f),
                    PathNode.LineTo(7.236f, 18.313f),
                    PathNode.CurveTo(7.038f, 18.51f, 6.939f, 18.609f, 6.825f, 18.647f),
                    PathNode.CurveTo(6.724f, 18.679f, 6.616f, 18.679f, 6.516f, 18.647f),
                    PathNode.CurveTo(6.402f, 18.61f, 6.302f, 18.511f, 6.104f, 18.313f),
                    PathNode.LineTo(5.538f, 17.747f),
                    PathNode.CurveTo(5.341f, 17.549f, 5.242f, 17.45f, 5.204f, 17.336f),
                    PathNode.CurveTo(5.172f, 17.236f, 5.172f, 17.127f, 5.204f, 17.027f),
                    PathNode.CurveTo(5.242f, 16.912f, 5.34f, 16.813f, 5.538f, 16.615f),
                    PathNode.LineTo(9.586f, 12.568f),
                    PathNode.CurveTo(9.784f, 12.37f, 9.884f, 12.27f, 9.921f, 12.156f),
                    PathNode.CurveTo(9.954f, 12.056f, 9.954f, 11.947f, 9.921f, 11.847f),
                    PathNode.CurveTo(9.884f, 11.733f, 9.784f, 11.634f, 9.586f, 11.436f),
                    PathNode.LineTo(5.538f, 7.388f),
                    PathNode.CurveTo(5.341f, 7.19f, 5.242f, 7.091f, 5.204f, 6.977f),
                    PathNode.CurveTo(5.172f, 6.876f, 5.172f, 6.767f, 5.204f, 6.667f),
                    PathNode.CurveTo(5.242f, 6.553f, 5.34f, 6.454f, 5.538f, 6.256f),
                    PathNode.LineTo(6.104f, 5.691f),
                    PathNode.CurveTo(6.302f, 5.493f, 6.402f, 5.394f, 6.516f, 5.357f),
                    PathNode.CurveTo(6.616f, 5.324f, 6.724f, 5.324f, 6.825f, 5.357f),
                    PathNode.CurveTo(6.939f, 5.394f, 7.038f, 5.493f, 7.236f, 5.691f),
                    PathNode.LineTo(10.645f, 9.1f),
                    PathNode.LineTo(10.645f, 2.523f),
                    PathNode.Close,
                    PathNode.MoveTo(13.045f, 19.374f),
                    PathNode.LineTo(15.968f, 16.986f),
                    PathNode.LineTo(13.045f, 14.514f),
                    PathNode.LineTo(13.045f, 19.374f),
                    PathNode.Close,
                    PathNode.MoveTo(13.045f, 9.387f),
                    PathNode.LineTo(15.95f, 6.993f),
                    PathNode.LineTo(13.045f, 4.626f),
                    PathNode.LineTo(13.045f, 9.387f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeBluetooth!!
    }

private var _volumeBluetooth: ImageVector? = null
