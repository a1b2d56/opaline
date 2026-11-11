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

/** `systemui_icon_volume_bt_sco_multi_app` */
val OpalineIcons.System.VolumeCall: ImageVector
    get() {
        if (_volumeCall != null) return _volumeCall!!
        _volumeCall = ImageVector.Builder(
            name = "VolumeCall",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.793f, 2.207f),
                    PathNode.CurveTo(6.17f, 2.252f, 6.524f, 2.414f, 6.804f, 2.671f),
                    PathNode.CurveTo(6.974f, 2.827f, 7.099f, 3.024f, 7.216f, 3.271f),
                    PathNode.CurveTo(7.332f, 3.516f, 7.45f, 3.832f, 7.602f, 4.232f),
                    PathNode.LineTo(8.872f, 7.592f),
                    PathNode.CurveTo(9.117f, 8.239f, 8.965f, 8.971f, 8.482f, 9.467f),
                    PathNode.CurveTo(7.82f, 10.146f, 7.703f, 11.185f, 8.243f, 11.934f),
                    PathNode.CurveTo(8.771f, 12.665f, 9.344f, 13.346f, 10.113f, 14.115f),
                    PathNode.CurveTo(10.881f, 14.884f, 11.562f, 15.458f, 12.293f, 15.985f),
                    PathNode.CurveTo(13.036f, 16.521f, 14.07f, 16.394f, 14.731f, 15.724f),
                    PathNode.CurveTo(15.217f, 15.231f, 15.949f, 15.071f, 16.597f, 15.316f),
                    PathNode.LineTo(19.955f, 16.586f),
                    PathNode.CurveTo(20.356f, 16.737f, 20.671f, 16.855f, 20.916f, 16.972f),
                    PathNode.CurveTo(21.164f, 17.089f, 21.36f, 17.213f, 21.517f, 17.384f),
                    PathNode.CurveTo(21.773f, 17.663f, 21.936f, 18.017f, 21.981f, 18.394f),
                    PathNode.CurveTo(22.008f, 18.624f, 21.973f, 18.854f, 21.901f, 19.118f),
                    PathNode.CurveTo(21.829f, 19.379f, 21.714f, 19.696f, 21.567f, 20.098f),
                    PathNode.LineTo(21.457f, 20.4f),
                    PathNode.CurveTo(21.246f, 20.982f, 21.12f, 21.341f, 20.847f, 21.626f),
                    PathNode.CurveTo(20.633f, 21.848f, 20.288f, 22.049f, 19.989f, 22.126f),
                    PathNode.CurveTo(19.61f, 22.223f, 19.288f, 22.166f, 18.77f, 22.08f),
                    PathNode.CurveTo(15.137f, 21.476f, 11.29f, 19.414f, 8.032f, 16.156f),
                    PathNode.CurveTo(4.774f, 12.898f, 2.712f, 9.051f, 2.108f, 5.418f),
                    PathNode.CurveTo(2.021f, 4.9f, 1.964f, 4.578f, 2.062f, 4.198f),
                    PathNode.CurveTo(2.138f, 3.899f, 2.339f, 3.554f, 2.562f, 3.341f),
                    PathNode.CurveTo(2.846f, 3.068f, 3.206f, 2.942f, 3.787f, 2.73f),
                    PathNode.LineTo(4.089f, 2.62f),
                    PathNode.CurveTo(4.492f, 2.473f, 4.808f, 2.359f, 5.069f, 2.287f),
                    PathNode.CurveTo(5.334f, 2.214f, 5.563f, 2.18f, 5.793f, 2.207f),
                    PathNode.Close,
                    PathNode.MoveTo(17.066f, 2.467f),
                    PathNode.CurveTo(17.066f, 1.96f, 17.617f, 1.666f, 18.031f, 1.912f),
                    PathNode.LineTo(18.112f, 1.969f),
                    PathNode.LineTo(20.539f, 3.945f),
                    PathNode.CurveTo(20.898f, 4.238f, 20.9f, 4.786f, 20.542f, 5.08f),
                    PathNode.LineTo(18.474f, 6.782f),
                    PathNode.LineTo(20.552f, 8.541f),
                    PathNode.CurveTo(20.902f, 8.837f, 20.897f, 9.379f, 20.542f, 9.669f),
                    PathNode.LineTo(18.113f, 11.653f),
                    PathNode.CurveTo(17.694f, 11.995f, 17.066f, 11.697f, 17.066f, 11.156f),
                    PathNode.LineTo(17.066f, 8.139f),
                    PathNode.LineTo(15.503f, 9.703f),
                    PathNode.CurveTo(15.413f, 9.793f, 15.367f, 9.839f, 15.315f, 9.856f),
                    PathNode.CurveTo(15.269f, 9.871f, 15.219f, 9.871f, 15.173f, 9.856f),
                    PathNode.CurveTo(15.121f, 9.839f, 15.075f, 9.793f, 14.984f, 9.703f),
                    PathNode.LineTo(14.725f, 9.443f),
                    PathNode.CurveTo(14.634f, 9.353f, 14.589f, 9.307f, 14.572f, 9.255f),
                    PathNode.CurveTo(14.558f, 9.209f, 14.557f, 9.159f, 14.572f, 9.113f),
                    PathNode.CurveTo(14.589f, 9.061f, 14.634f, 9.015f, 14.725f, 8.925f),
                    PathNode.LineTo(16.58f, 7.069f),
                    PathNode.CurveTo(16.671f, 6.979f, 16.716f, 6.933f, 16.734f, 6.881f),
                    PathNode.CurveTo(16.749f, 6.835f, 16.748f, 6.785f, 16.734f, 6.739f),
                    PathNode.CurveTo(16.717f, 6.687f, 16.671f, 6.641f, 16.58f, 6.551f),
                    PathNode.LineTo(14.726f, 4.695f),
                    PathNode.CurveTo(14.635f, 4.605f, 14.59f, 4.559f, 14.572f, 4.507f),
                    PathNode.CurveTo(14.557f, 4.461f, 14.558f, 4.411f, 14.572f, 4.365f),
                    PathNode.CurveTo(14.589f, 4.313f, 14.635f, 4.267f, 14.726f, 4.177f),
                    PathNode.LineTo(14.984f, 3.918f),
                    PathNode.CurveTo(15.075f, 3.827f, 15.121f, 3.782f, 15.173f, 3.764f),
                    PathNode.CurveTo(15.219f, 3.75f, 15.269f, 3.75f, 15.315f, 3.764f),
                    PathNode.CurveTo(15.367f, 3.782f, 15.413f, 3.827f, 15.503f, 3.918f),
                    PathNode.LineTo(17.066f, 5.48f),
                    PathNode.LineTo(17.066f, 2.467f),
                    PathNode.Close,
                    PathNode.MoveTo(18.165f, 10.19f),
                    PathNode.LineTo(19.504f, 9.096f),
                    PathNode.LineTo(18.165f, 7.962f),
                    PathNode.LineTo(18.165f, 10.19f),
                    PathNode.Close,
                    PathNode.MoveTo(18.165f, 5.612f),
                    PathNode.LineTo(19.497f, 4.514f),
                    PathNode.LineTo(18.165f, 3.43f),
                    PathNode.LineTo(18.165f, 5.612f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeCall!!
    }

private var _volumeCall: ImageVector? = null
