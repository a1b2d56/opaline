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

/** `systemui_icon_volume_voice_multi_app` */
val OpalineIcons.System.VolumeVoice: ImageVector
    get() {
        if (_volumeVoice != null) return _volumeVoice!!
        _volumeVoice = ImageVector.Builder(
            name = "VolumeVoice",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.793f, 2.02f),
                    PathNode.CurveTo(6.17f, 2.065f, 6.524f, 2.227f, 6.804f, 2.484f),
                    PathNode.CurveTo(6.974f, 2.64f, 7.098f, 2.837f, 7.216f, 3.084f),
                    PathNode.CurveTo(7.332f, 3.329f, 7.45f, 3.645f, 7.602f, 4.045f),
                    PathNode.LineTo(8.872f, 7.405f),
                    PathNode.CurveTo(9.117f, 8.052f, 8.965f, 8.784f, 8.481f, 9.28f),
                    PathNode.CurveTo(7.82f, 9.959f, 7.703f, 10.998f, 8.243f, 11.748f),
                    PathNode.CurveTo(8.77f, 12.478f, 9.343f, 13.159f, 10.112f, 13.928f),
                    PathNode.CurveTo(10.881f, 14.697f, 11.562f, 15.271f, 12.293f, 15.798f),
                    PathNode.CurveTo(13.036f, 16.334f, 14.07f, 16.207f, 14.73f, 15.538f),
                    PathNode.CurveTo(15.217f, 15.044f, 15.949f, 14.884f, 16.597f, 15.129f),
                    PathNode.LineTo(19.955f, 16.399f),
                    PathNode.CurveTo(20.356f, 16.55f, 20.671f, 16.669f, 20.916f, 16.785f),
                    PathNode.CurveTo(21.164f, 16.902f, 21.36f, 17.026f, 21.517f, 17.197f),
                    PathNode.CurveTo(21.773f, 17.477f, 21.935f, 17.83f, 21.98f, 18.207f),
                    PathNode.CurveTo(22.008f, 18.437f, 21.973f, 18.667f, 21.9f, 18.931f),
                    PathNode.CurveTo(21.829f, 19.192f, 21.714f, 19.509f, 21.567f, 19.912f),
                    PathNode.LineTo(21.457f, 20.213f),
                    PathNode.CurveTo(21.245f, 20.795f, 21.12f, 21.154f, 20.847f, 21.439f),
                    PathNode.CurveTo(20.633f, 21.661f, 20.288f, 21.862f, 19.989f, 21.939f),
                    PathNode.CurveTo(19.609f, 22.036f, 19.288f, 21.979f, 18.77f, 21.893f),
                    PathNode.CurveTo(15.136f, 21.289f, 11.29f, 19.227f, 8.032f, 15.969f),
                    PathNode.CurveTo(4.774f, 12.711f, 2.712f, 8.864f, 2.107f, 5.231f),
                    PathNode.CurveTo(2.021f, 4.713f, 1.964f, 4.391f, 2.061f, 4.011f),
                    PathNode.CurveTo(2.138f, 3.713f, 2.339f, 3.367f, 2.561f, 3.154f),
                    PathNode.CurveTo(2.846f, 2.881f, 3.206f, 2.755f, 3.787f, 2.543f),
                    PathNode.LineTo(4.089f, 2.433f),
                    PathNode.CurveTo(4.491f, 2.286f, 4.808f, 2.172f, 5.069f, 2.1f),
                    PathNode.CurveTo(5.334f, 2.027f, 5.563f, 1.993f, 5.793f, 2.02f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeVoice!!
    }

private var _volumeVoice: ImageVector? = null
