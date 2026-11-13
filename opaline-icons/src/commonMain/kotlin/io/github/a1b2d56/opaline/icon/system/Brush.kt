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

/** `color_menu_ic_style_normal` */
val OpalineIcons.System.Brush: ImageVector
    get() {
        if (_brush != null) return _brush!!
        _brush = ImageVector.Builder(
            name = "Brush",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.923f, 1.105f),
                    PathNode.CurveTo(19.36f, 1.102f, 19.794f, 1.189f, 20.197f, 1.361f),
                    PathNode.CurveTo(20.601f, 1.532f, 20.966f, 1.784f, 21.272f, 2.1f),
                    PathNode.CurveTo(21.578f, 2.416f, 21.819f, 2.791f, 21.982f, 3.201f),
                    PathNode.CurveTo(22.145f, 3.612f, 22.228f, 4.052f, 22.225f, 4.494f),
                    PathNode.CurveTo(22.223f, 4.937f, 22.135f, 5.376f, 21.968f, 5.784f),
                    PathNode.CurveTo(21.801f, 6.191f, 21.557f, 6.56f, 21.25f, 6.871f),
                    PathNode.LineTo(21.251f, 6.872f),
                    PathNode.CurveTo(20.896f, 7.239f, 20.392f, 7.591f, 19.923f, 7.911f),
                    PathNode.CurveTo(19.856f, 7.957f, 19.79f, 8.002f, 19.724f, 8.047f),
                    PathNode.CurveTo(19.299f, 8.336f, 18.887f, 8.616f, 18.525f, 8.912f),
                    PathNode.CurveTo(18.101f, 9.259f, 17.82f, 9.57f, 17.687f, 9.849f),
                    PathNode.CurveTo(17.576f, 10.083f, 17.56f, 10.302f, 17.712f, 10.587f),
                    PathNode.LineTo(17.899f, 10.954f),
                    PathNode.CurveTo(18.317f, 11.806f, 18.591f, 12.626f, 18.614f, 13.415f),
                    PathNode.CurveTo(18.641f, 14.359f, 18.309f, 15.196f, 17.596f, 15.932f),
                    PathNode.LineTo(16.132f, 17.445f),
                    PathNode.CurveTo(16.001f, 17.581f, 15.819f, 17.658f, 15.63f, 17.657f),
                    PathNode.CurveTo(15.44f, 17.657f, 15.259f, 17.58f, 15.127f, 17.444f),
                    PathNode.LineTo(14.868f, 17.176f),
                    PathNode.CurveTo(14.778f, 17.27f, 14.671f, 17.381f, 14.552f, 17.506f),
                    PathNode.CurveTo(14.145f, 17.934f, 13.59f, 18.531f, 12.997f, 19.202f),
                    PathNode.CurveTo(11.792f, 20.566f, 10.496f, 22.171f, 9.924f, 23.31f),
                    PathNode.CurveTo(9.777f, 23.601f, 9.448f, 23.753f, 9.131f, 23.675f),
                    PathNode.CurveTo(8.814f, 23.597f, 8.593f, 23.31f, 8.598f, 22.984f),
                    PathNode.CurveTo(8.609f, 22.365f, 8.483f, 21.751f, 8.23f, 21.192f),
                    PathNode.CurveTo(7.978f, 20.632f, 7.605f, 20.142f, 7.144f, 19.756f),
                    PathNode.CurveTo(7.126f, 19.74f, 7.108f, 19.724f, 7.091f, 19.706f),
                    PathNode.LineTo(1.974f, 14.419f),
                    PathNode.CurveTo(1.712f, 14.148f, 1.712f, 13.717f, 1.974f, 13.446f),
                    PathNode.LineTo(6.617f, 8.651f),
                    PathNode.LineTo(6.357f, 8.383f),
                    PathNode.CurveTo(6.094f, 8.112f, 6.094f, 7.681f, 6.357f, 7.409f),
                    PathNode.LineTo(7.82f, 5.898f),
                    PathNode.LineTo(7.955f, 5.764f),
                    PathNode.CurveTo(8.635f, 5.118f, 9.412f, 4.809f, 10.29f, 4.836f),
                    PathNode.CurveTo(11.179f, 4.864f, 12.099f, 5.234f, 13.052f, 5.775f),
                    PathNode.LineTo(13.052f, 5.775f),
                    PathNode.CurveTo(13.313f, 5.922f, 13.503f, 5.907f, 13.715f, 5.799f),
                    PathNode.CurveTo(13.979f, 5.665f, 14.278f, 5.377f, 14.615f, 4.937f),
                    PathNode.CurveTo(14.901f, 4.563f, 15.172f, 4.139f, 15.45f, 3.702f),
                    PathNode.LineTo(15.45f, 3.702f),
                    PathNode.CurveTo(15.495f, 3.632f, 15.54f, 3.562f, 15.585f, 3.492f),
                    PathNode.CurveTo(15.895f, 3.007f, 16.236f, 2.489f, 16.59f, 2.122f),
                    PathNode.CurveTo(16.892f, 1.805f, 17.252f, 1.551f, 17.651f, 1.376f),
                    PathNode.CurveTo(18.053f, 1.2f, 18.485f, 1.107f, 18.923f, 1.105f),
                    PathNode.Close,
                    PathNode.MoveTo(10.743f, 12.908f),
                    PathNode.LineTo(13.895f, 16.169f),
                    PathNode.CurveTo(13.795f, 16.273f, 13.674f, 16.398f, 13.538f, 16.541f),
                    PathNode.CurveTo(13.122f, 16.978f, 12.554f, 17.588f, 11.947f, 18.276f),
                    PathNode.CurveTo(11.653f, 18.609f, 11.345f, 18.965f, 11.039f, 19.331f),
                    PathNode.CurveTo(10.294f, 18.015f, 8.964f, 17.163f, 7.682f, 16.341f),
                    PathNode.CurveTo(6.204f, 15.394f, 4.789f, 14.487f, 4.398f, 12.956f),
                    PathNode.LineTo(7.592f, 9.657f),
                    PathNode.LineTo(10.743f, 12.908f),
                    PathNode.LineTo(10.743f, 12.908f),
                    PathNode.Close,
                    PathNode.MoveTo(11.749f, 11.934f),
                    PathNode.LineTo(8.144f, 8.216f),
                    PathNode.CurveTo(8.125f, 8.192f, 8.104f, 8.168f, 8.081f, 8.146f),
                    PathNode.CurveTo(8.069f, 8.134f, 8.056f, 8.123f, 8.043f, 8.112f),
                    PathNode.LineTo(7.834f, 7.896f),
                    PathNode.LineTo(8.826f, 6.871f),
                    PathNode.LineTo(9.001f, 6.704f),
                    PathNode.CurveTo(9.407f, 6.348f, 9.808f, 6.222f, 10.247f, 6.236f),
                    PathNode.CurveTo(10.795f, 6.252f, 11.476f, 6.491f, 12.362f, 6.993f),
                    PathNode.LineTo(12.493f, 7.062f),
                    PathNode.CurveTo(13.143f, 7.381f, 13.782f, 7.335f, 14.348f, 7.047f),
                    PathNode.CurveTo(14.9f, 6.767f, 15.355f, 6.273f, 15.726f, 5.788f),
                    PathNode.CurveTo(16.054f, 5.361f, 16.363f, 4.876f, 16.64f, 4.441f),
                    PathNode.CurveTo(16.682f, 4.375f, 16.724f, 4.31f, 16.764f, 4.246f),
                    PathNode.CurveTo(17.089f, 3.739f, 17.355f, 3.344f, 17.595f, 3.096f),
                    PathNode.LineTo(17.602f, 3.09f),
                    PathNode.CurveTo(17.778f, 2.905f, 17.985f, 2.758f, 18.213f, 2.658f),
                    PathNode.CurveTo(18.44f, 2.559f, 18.684f, 2.507f, 18.93f, 2.505f),
                    PathNode.CurveTo(19.176f, 2.504f, 19.421f, 2.553f, 19.65f, 2.65f),
                    PathNode.CurveTo(19.879f, 2.747f, 20.088f, 2.89f, 20.265f, 3.074f),
                    PathNode.CurveTo(20.443f, 3.257f, 20.585f, 3.476f, 20.681f, 3.719f),
                    PathNode.CurveTo(20.778f, 3.962f, 20.827f, 4.223f, 20.826f, 4.487f),
                    PathNode.CurveTo(20.824f, 4.75f, 20.772f, 5.011f, 20.673f, 5.252f),
                    PathNode.CurveTo(20.598f, 5.433f, 20.499f, 5.601f, 20.378f, 5.75f),
                    PathNode.LineTo(20.25f, 5.893f),
                    PathNode.LineTo(20.245f, 5.898f),
                    PathNode.CurveTo(20.005f, 6.145f, 19.623f, 6.421f, 19.132f, 6.756f),
                    PathNode.CurveTo(19.07f, 6.799f, 19.006f, 6.842f, 18.941f, 6.886f),
                    PathNode.CurveTo(18.521f, 7.173f, 18.052f, 7.491f, 17.638f, 7.829f),
                    PathNode.CurveTo(17.167f, 8.215f, 16.692f, 8.684f, 16.424f, 9.247f),
                    PathNode.CurveTo(16.134f, 9.856f, 16.103f, 10.542f, 16.475f, 11.243f),
                    PathNode.LineTo(16.646f, 11.577f),
                    PathNode.CurveTo(17.018f, 12.335f, 17.2f, 12.946f, 17.215f, 13.455f),
                    PathNode.CurveTo(17.228f, 13.929f, 17.098f, 14.355f, 16.752f, 14.778f),
                    PathNode.LineTo(16.59f, 14.958f),
                    PathNode.LineTo(15.63f, 15.95f),
                    PathNode.LineTo(11.75f, 11.935f),
                    PathNode.LineTo(11.749f, 11.934f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _brush!!
    }

private var _brush: ImageVector? = null
