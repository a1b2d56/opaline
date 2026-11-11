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

/** `systemui_icon_volume_alarm_mute_multi_app` */
val OpalineIcons.System.VolumeAlarmMute: ImageVector
    get() {
        if (_volumeAlarmMute != null) return _volumeAlarmMute!!
        _volumeAlarmMute = ImageVector.Builder(
            name = "VolumeAlarmMute",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.95f),
                    PathNode.CurveTo(17.36f, 2.95f, 21.7f, 7.29f, 21.7f, 12.65f),
                    PathNode.CurveTo(21.7f, 15.03f, 20.85f, 17.21f, 19.43f, 18.89f),
                    PathNode.LineTo(20.7f, 21.12f),
                    PathNode.CurveTo(20.88f, 21.43f, 20.82f, 21.82f, 20.57f, 22.08f),
                    PathNode.CurveTo(20.26f, 22.4f, 19.75f, 22.4f, 19.43f, 22.08f),
                    PathNode.LineTo(17.79f, 20.44f),
                    PathNode.CurveTo(16.17f, 21.64f, 14.17f, 22.35f, 12.0f, 22.35f),
                    PathNode.CurveTo(9.83f, 22.35f, 7.83f, 21.64f, 6.22f, 20.44f),
                    PathNode.LineTo(4.57f, 22.08f),
                    PathNode.CurveTo(4.26f, 22.4f, 3.75f, 22.4f, 3.43f, 22.08f),
                    PathNode.CurveTo(3.18f, 21.83f, 3.13f, 21.43f, 3.31f, 21.12f),
                    PathNode.LineTo(4.58f, 18.89f),
                    PathNode.CurveTo(3.16f, 17.21f, 2.3f, 15.03f, 2.3f, 12.65f),
                    PathNode.CurveTo(2.3f, 7.29f, 6.64f, 2.95f, 12.0f, 2.95f),
                    PathNode.Close,
                    PathNode.MoveTo(12.15f, 7.65f),
                    PathNode.CurveTo(11.83f, 7.65f, 11.57f, 7.9f, 11.55f, 8.22f),
                    PathNode.LineTo(11.33f, 12.22f),
                    PathNode.LineTo(9.38f, 14.42f),
                    PathNode.CurveTo(9.17f, 14.67f, 9.18f, 15.03f, 9.41f, 15.26f),
                    PathNode.CurveTo(9.63f, 15.48f, 9.99f, 15.49f, 10.23f, 15.28f),
                    PathNode.LineTo(12.81f, 13.05f),
                    PathNode.CurveTo(12.93f, 12.95f, 13.0f, 12.8f, 12.99f, 12.65f),
                    PathNode.LineTo(12.75f, 8.22f),
                    PathNode.CurveTo(12.73f, 7.9f, 12.47f, 7.65f, 12.15f, 7.65f),
                    PathNode.Close,
                    PathNode.MoveTo(3.55f, 2.55f),
                    PathNode.CurveTo(5.0f, 1.4f, 6.4f, 1.48f, 7.38f, 2.08f),
                    PathNode.CurveTo(7.66f, 2.25f, 7.65f, 2.66f, 7.38f, 2.88f),
                    PathNode.LineTo(2.89f, 6.4f),
                    PathNode.CurveTo(2.63f, 6.62f, 2.23f, 6.52f, 2.14f, 6.2f),
                    PathNode.CurveTo(1.8f, 5.1f, 2.07f, 3.7f, 3.54f, 2.56f),
                    PathNode.Close,
                    PathNode.MoveTo(16.6f, 2.08f),
                    PathNode.CurveTo(17.58f, 1.48f, 18.98f, 1.4f, 20.45f, 2.55f),
                    PathNode.CurveTo(21.92f, 3.7f, 22.19f, 5.09f, 21.86f, 6.21f),
                    PathNode.CurveTo(21.77f, 6.52f, 21.37f, 6.61f, 21.09f, 6.4f),
                    PathNode.LineTo(16.6f, 2.88f),
                    PathNode.CurveTo(16.33f, 2.66f, 16.32f, 2.25f, 16.6f, 2.08f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeAlarmMute!!
    }

private var _volumeAlarmMute: ImageVector? = null
