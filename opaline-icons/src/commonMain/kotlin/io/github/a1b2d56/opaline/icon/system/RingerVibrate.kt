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

/** `op_ic_vibrate` */
val OpalineIcons.System.RingerVibrate: ImageVector
    get() {
        if (_ringerVibrate != null) return _ringerVibrate!!
        _ringerVibrate = ImageVector.Builder(
            name = "RingerVibrate",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.242f, 3.016f),
                    PathNode.CurveTo(13.855f, 3.016f, 14.354f, 3.015f, 14.758f, 3.048f),
                    PathNode.CurveTo(15.169f, 3.082f, 15.539f, 3.154f, 15.884f, 3.33f),
                    PathNode.CurveTo(16.425f, 3.605f, 16.866f, 4.045f, 17.142f, 4.586f),
                    PathNode.CurveTo(17.317f, 4.931f, 17.389f, 5.302f, 17.422f, 5.713f),
                    PathNode.CurveTo(17.455f, 6.117f, 17.455f, 6.616f, 17.455f, 7.229f),
                    PathNode.LineTo(17.455f, 16.804f),
                    PathNode.CurveTo(17.455f, 17.417f, 17.455f, 17.916f, 17.422f, 18.32f),
                    PathNode.CurveTo(17.389f, 18.731f, 17.318f, 19.102f, 17.142f, 19.447f),
                    PathNode.CurveTo(16.866f, 19.988f, 16.425f, 20.428f, 15.884f, 20.704f),
                    PathNode.CurveTo(15.539f, 20.879f, 15.169f, 20.951f, 14.758f, 20.985f),
                    PathNode.CurveTo(14.354f, 21.018f, 13.855f, 21.017f, 13.242f, 21.017f),
                    PathNode.LineTo(11.09f, 21.017f),
                    PathNode.CurveTo(10.477f, 21.017f, 9.978f, 21.018f, 9.574f, 20.985f),
                    PathNode.CurveTo(9.163f, 20.951f, 8.792f, 20.879f, 8.448f, 20.704f),
                    PathNode.CurveTo(7.906f, 20.428f, 7.466f, 19.988f, 7.191f, 19.447f),
                    PathNode.CurveTo(7.015f, 19.102f, 6.943f, 18.731f, 6.909f, 18.32f),
                    PathNode.CurveTo(6.876f, 17.916f, 6.877f, 17.417f, 6.877f, 16.804f),
                    PathNode.LineTo(6.877f, 7.229f),
                    PathNode.CurveTo(6.877f, 6.616f, 6.876f, 6.117f, 6.909f, 5.713f),
                    PathNode.CurveTo(6.943f, 5.302f, 7.015f, 4.931f, 7.191f, 4.586f),
                    PathNode.CurveTo(7.466f, 4.045f, 7.906f, 3.605f, 8.448f, 3.33f),
                    PathNode.CurveTo(8.792f, 3.154f, 9.163f, 3.082f, 9.574f, 3.048f),
                    PathNode.CurveTo(9.978f, 3.015f, 10.477f, 3.016f, 11.09f, 3.016f),
                    PathNode.LineTo(13.242f, 3.016f),
                    PathNode.Close,
                    PathNode.MoveTo(10.956f, 17.828f),
                    PathNode.CurveTo(10.539f, 17.828f, 10.201f, 18.166f, 10.2f, 18.583f),
                    PathNode.CurveTo(10.2f, 19.0f, 10.539f, 19.338f, 10.956f, 19.338f),
                    PathNode.LineTo(13.372f, 19.338f),
                    PathNode.CurveTo(13.789f, 19.338f, 14.128f, 19.0f, 14.128f, 18.583f),
                    PathNode.CurveTo(14.128f, 18.166f, 13.789f, 17.828f, 13.372f, 17.828f),
                    PathNode.LineTo(10.956f, 17.828f),
                    PathNode.Close,
                    PathNode.MoveTo(3.211f, 7.419f),
                    PathNode.CurveTo(3.46f, 7.212f, 3.831f, 7.246f, 4.038f, 7.495f),
                    PathNode.LineTo(4.902f, 8.529f),
                    PathNode.CurveTo(5.048f, 8.704f, 5.169f, 8.846f, 5.256f, 8.997f),
                    PathNode.CurveTo(5.594f, 9.581f, 5.594f, 10.302f, 5.256f, 10.886f),
                    PathNode.CurveTo(5.169f, 11.036f, 5.048f, 11.179f, 4.902f, 11.354f),
                    PathNode.CurveTo(4.727f, 11.564f, 4.687f, 11.616f, 4.662f, 11.658f),
                    PathNode.CurveTo(4.535f, 11.878f, 4.534f, 12.149f, 4.661f, 12.37f),
                    PathNode.CurveTo(4.686f, 12.412f, 4.726f, 12.463f, 4.902f, 12.674f),
                    PathNode.CurveTo(5.049f, 12.851f, 5.172f, 12.995f, 5.259f, 13.147f),
                    PathNode.CurveTo(5.594f, 13.729f, 5.594f, 14.446f, 5.259f, 15.029f),
                    PathNode.CurveTo(5.172f, 15.18f, 5.05f, 15.324f, 4.903f, 15.5f),
                    PathNode.LineTo(4.038f, 16.539f),
                    PathNode.CurveTo(3.831f, 16.788f, 3.46f, 16.821f, 3.211f, 16.614f),
                    PathNode.CurveTo(2.962f, 16.406f, 2.929f, 16.036f, 3.136f, 15.787f),
                    PathNode.LineTo(3.999f, 14.748f),
                    PathNode.CurveTo(4.176f, 14.537f, 4.216f, 14.485f, 4.24f, 14.443f),
                    PathNode.CurveTo(4.367f, 14.223f, 4.367f, 13.953f, 4.24f, 13.733f),
                    PathNode.CurveTo(4.216f, 13.691f, 4.176f, 13.638f, 3.999f, 13.425f),
                    PathNode.CurveTo(3.853f, 13.25f, 3.731f, 13.108f, 3.644f, 12.958f),
                    PathNode.CurveTo(3.307f, 12.373f, 3.307f, 11.653f, 3.645f, 11.069f),
                    PathNode.CurveTo(3.732f, 10.919f, 3.853f, 10.777f, 3.999f, 10.602f),
                    PathNode.CurveTo(4.174f, 10.392f, 4.214f, 10.34f, 4.239f, 10.298f),
                    PathNode.CurveTo(4.366f, 10.078f, 4.366f, 9.806f, 4.239f, 9.585f),
                    PathNode.CurveTo(4.214f, 9.544f, 4.174f, 9.492f, 3.999f, 9.282f),
                    PathNode.LineTo(3.136f, 8.247f),
                    PathNode.CurveTo(2.929f, 7.997f, 2.962f, 7.627f, 3.211f, 7.419f),
                    PathNode.Close,
                    PathNode.MoveTo(20.299f, 7.498f),
                    PathNode.CurveTo(20.507f, 7.249f, 20.877f, 7.215f, 21.126f, 7.422f),
                    PathNode.CurveTo(21.375f, 7.63f, 21.41f, 8.0f, 21.202f, 8.25f),
                    PathNode.LineTo(20.337f, 9.289f),
                    PathNode.CurveTo(20.163f, 9.498f, 20.122f, 9.549f, 20.098f, 9.591f),
                    PathNode.CurveTo(19.971f, 9.812f, 19.972f, 10.084f, 20.099f, 10.304f),
                    PathNode.CurveTo(20.123f, 10.346f, 20.163f, 10.398f, 20.338f, 10.608f),
                    PathNode.CurveTo(20.484f, 10.783f, 20.605f, 10.924f, 20.692f, 11.074f),
                    PathNode.CurveTo(21.03f, 11.658f, 21.03f, 12.381f, 20.692f, 12.965f),
                    PathNode.CurveTo(20.605f, 13.115f, 20.484f, 13.257f, 20.338f, 13.431f),
                    PathNode.CurveTo(20.164f, 13.64f, 20.124f, 13.692f, 20.1f, 13.734f),
                    PathNode.CurveTo(19.972f, 13.955f, 19.972f, 14.227f, 20.1f, 14.448f),
                    PathNode.CurveTo(20.124f, 14.489f, 20.164f, 14.541f, 20.338f, 14.75f),
                    PathNode.LineTo(21.202f, 15.785f),
                    PathNode.CurveTo(21.41f, 16.034f, 21.376f, 16.405f, 21.127f, 16.613f),
                    PathNode.CurveTo(20.878f, 16.82f, 20.508f, 16.786f, 20.3f, 16.538f),
                    PathNode.LineTo(19.436f, 15.502f),
                    PathNode.CurveTo(19.29f, 15.328f, 19.17f, 15.186f, 19.083f, 15.037f),
                    PathNode.CurveTo(18.744f, 14.452f, 18.744f, 13.73f, 19.083f, 13.145f),
                    PathNode.CurveTo(19.17f, 12.995f, 19.29f, 12.854f, 19.436f, 12.679f),
                    PathNode.CurveTo(19.611f, 12.47f, 19.651f, 12.418f, 19.675f, 12.377f),
                    PathNode.CurveTo(19.803f, 12.156f, 19.803f, 11.883f, 19.675f, 11.663f),
                    PathNode.CurveTo(19.651f, 11.621f, 19.61f, 11.569f, 19.436f, 11.36f),
                    PathNode.CurveTo(19.29f, 11.185f, 19.168f, 11.042f, 19.081f, 10.892f),
                    PathNode.CurveTo(18.744f, 10.308f, 18.743f, 9.588f, 19.08f, 9.004f),
                    PathNode.CurveTo(19.167f, 8.854f, 19.289f, 8.712f, 19.435f, 8.537f),
                    PathNode.LineTo(20.299f, 7.498f),
                    PathNode.Close,
                    PathNode.MoveTo(12.158f, 4.694f),
                    PathNode.CurveTo(11.742f, 4.694f, 11.405f, 5.031f, 11.405f, 5.447f),
                    PathNode.CurveTo(11.405f, 5.863f, 11.742f, 6.2f, 12.158f, 6.2f),
                    PathNode.CurveTo(12.573f, 6.2f, 12.91f, 5.863f, 12.91f, 5.447f),
                    PathNode.CurveTo(12.91f, 5.031f, 12.573f, 4.694f, 12.158f, 4.694f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _ringerVibrate!!
    }

private var _ringerVibrate: ImageVector? = null
