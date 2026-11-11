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

/** `systemui_icon_volume_ringer_vibrate_multi_app` */
val OpalineIcons.System.VolumeVibrate: ImageVector
    get() {
        if (_volumeVibrate != null) return _volumeVibrate!!
        _volumeVibrate = ImageVector.Builder(
            name = "VolumeVibrate",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.424f, 5.489f),
                    PathNode.CurveTo(17.624f, 5.462f, 17.826f, 5.524f, 17.978f, 5.657f),
                    PathNode.CurveTo(18.129f, 5.79f, 18.217f, 5.982f, 18.217f, 6.183f),
                    PathNode.LineTo(18.217f, 18.008f),
                    PathNode.CurveTo(18.217f, 18.032f, 18.212f, 18.056f, 18.209f, 18.08f),
                    PathNode.CurveTo(18.214f, 18.147f, 18.217f, 18.214f, 18.217f, 18.282f),
                    PathNode.CurveTo(18.217f, 19.939f, 16.874f, 21.282f, 15.217f, 21.282f),
                    PathNode.CurveTo(13.56f, 21.282f, 12.217f, 19.939f, 12.217f, 18.282f),
                    PathNode.CurveTo(12.217f, 16.625f, 13.56f, 15.282f, 15.217f, 15.282f),
                    PathNode.CurveTo(15.806f, 15.282f, 16.353f, 15.454f, 16.817f, 15.747f),
                    PathNode.LineTo(16.817f, 10.32f),
                    PathNode.LineTo(8.217f, 11.465f),
                    PathNode.LineTo(8.217f, 19.649f),
                    PathNode.CurveTo(8.217f, 19.653f, 8.215f, 19.656f, 8.215f, 19.66f),
                    PathNode.CurveTo(8.191f, 21.295f, 6.859f, 22.614f, 5.218f, 22.614f),
                    PathNode.CurveTo(3.562f, 22.614f, 2.219f, 21.271f, 2.219f, 19.615f),
                    PathNode.CurveTo(2.219f, 17.959f, 3.562f, 16.616f, 5.218f, 16.616f),
                    PathNode.CurveTo(5.806f, 16.616f, 6.354f, 16.787f, 6.817f, 17.08f),
                    PathNode.LineTo(6.817f, 7.514f),
                    PathNode.CurveTo(6.817f, 7.164f, 7.076f, 6.867f, 7.424f, 6.82f),
                    PathNode.LineTo(17.424f, 5.489f),
                    PathNode.Close,
                    PathNode.MoveTo(6.881f, 2.236f),
                    PathNode.CurveTo(7.268f, 2.236f, 7.581f, 2.55f, 7.581f, 2.936f),
                    PathNode.CurveTo(7.581f, 3.323f, 7.268f, 3.636f, 6.881f, 3.636f),
                    PathNode.CurveTo(4.955f, 3.636f, 3.394f, 5.198f, 3.394f, 7.124f),
                    PathNode.CurveTo(3.394f, 7.51f, 3.08f, 7.824f, 2.694f, 7.824f),
                    PathNode.CurveTo(2.307f, 7.824f, 1.994f, 7.51f, 1.993f, 7.124f),
                    PathNode.CurveTo(1.993f, 4.424f, 4.182f, 2.236f, 6.881f, 2.236f),
                    PathNode.Close,
                    PathNode.MoveTo(6.881f, 4.924f),
                    PathNode.CurveTo(7.268f, 4.924f, 7.581f, 5.237f, 7.581f, 5.624f),
                    PathNode.CurveTo(7.581f, 6.01f, 7.268f, 6.324f, 6.881f, 6.324f),
                    PathNode.CurveTo(6.439f, 6.324f, 6.081f, 6.682f, 6.081f, 7.124f),
                    PathNode.CurveTo(6.081f, 7.51f, 5.768f, 7.824f, 5.381f, 7.824f),
                    PathNode.CurveTo(4.995f, 7.824f, 4.681f, 7.51f, 4.681f, 7.124f),
                    PathNode.CurveTo(4.681f, 5.909f, 5.666f, 4.924f, 6.881f, 4.924f),
                    PathNode.Close,
                    PathNode.MoveTo(17.975f, 3.674f),
                    PathNode.CurveTo(19.19f, 3.674f, 20.175f, 4.659f, 20.175f, 5.874f),
                    PathNode.CurveTo(20.175f, 6.26f, 19.861f, 6.574f, 19.475f, 6.574f),
                    PathNode.CurveTo(19.088f, 6.574f, 18.775f, 6.26f, 18.775f, 5.874f),
                    PathNode.CurveTo(18.775f, 5.432f, 18.417f, 5.074f, 17.975f, 5.074f),
                    PathNode.CurveTo(17.588f, 5.074f, 17.275f, 4.76f, 17.275f, 4.374f),
                    PathNode.CurveTo(17.275f, 3.987f, 17.588f, 3.674f, 17.975f, 3.674f),
                    PathNode.Close,
                    PathNode.MoveTo(17.975f, 0.986f),
                    PathNode.CurveTo(20.674f, 0.986f, 22.862f, 3.175f, 22.862f, 5.874f),
                    PathNode.CurveTo(22.862f, 6.26f, 22.549f, 6.574f, 22.162f, 6.574f),
                    PathNode.CurveTo(21.776f, 6.574f, 21.462f, 6.26f, 21.462f, 5.874f),
                    PathNode.CurveTo(21.462f, 3.948f, 19.901f, 2.387f, 17.975f, 2.386f),
                    PathNode.CurveTo(17.588f, 2.386f, 17.275f, 2.073f, 17.275f, 1.686f),
                    PathNode.CurveTo(17.275f, 1.3f, 17.588f, 0.986f, 17.975f, 0.986f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeVibrate!!
    }

private var _volumeVibrate: ImageVector? = null
