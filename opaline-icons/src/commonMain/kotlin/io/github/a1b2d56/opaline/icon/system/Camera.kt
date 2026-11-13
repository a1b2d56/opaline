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

/** `app_ic_camera` */
val OpalineIcons.System.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = ImageVector.Builder(
            name = "Camera",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.336f, 3.392f),
                    PathNode.CurveTo(14.604f, 3.394f, 14.854f, 3.409f, 15.091f, 3.483f),
                    PathNode.CurveTo(15.349f, 3.564f, 15.588f, 3.696f, 15.794f, 3.872f),
                    PathNode.CurveTo(16.045f, 4.087f, 16.219f, 4.378f, 16.418f, 4.695f),
                    PathNode.LineTo(17.362f, 6.204f),
                    PathNode.LineTo(19.921f, 6.207f),
                    PathNode.CurveTo(20.273f, 6.207f, 20.579f, 6.207f, 20.831f, 6.228f),
                    PathNode.CurveTo(21.091f, 6.249f, 21.355f, 6.296f, 21.608f, 6.426f),
                    PathNode.CurveTo(21.984f, 6.618f, 22.29f, 6.924f, 22.482f, 7.3f),
                    PathNode.CurveTo(22.611f, 7.554f, 22.657f, 7.816f, 22.679f, 8.076f),
                    PathNode.CurveTo(22.699f, 8.328f, 22.699f, 8.634f, 22.699f, 8.986f),
                    PathNode.LineTo(22.699f, 17.828f),
                    PathNode.CurveTo(22.699f, 18.181f, 22.699f, 18.487f, 22.679f, 18.739f),
                    PathNode.CurveTo(22.657f, 18.999f, 22.611f, 19.262f, 22.482f, 19.516f),
                    PathNode.CurveTo(22.29f, 19.892f, 21.983f, 20.199f, 21.607f, 20.391f),
                    PathNode.CurveTo(21.353f, 20.52f, 21.09f, 20.567f, 20.83f, 20.588f),
                    PathNode.CurveTo(20.578f, 20.608f, 20.271f, 20.608f, 19.919f, 20.607f),
                    PathNode.LineTo(4.08f, 20.605f),
                    PathNode.CurveTo(3.728f, 20.605f, 3.421f, 20.606f, 3.169f, 20.585f),
                    PathNode.CurveTo(2.909f, 20.564f, 2.646f, 20.516f, 2.392f, 20.387f),
                    PathNode.CurveTo(2.016f, 20.195f, 1.709f, 19.889f, 1.518f, 19.513f),
                    PathNode.CurveTo(1.388f, 19.258f, 1.34f, 18.994f, 1.319f, 18.734f),
                    PathNode.CurveTo(1.299f, 18.483f, 1.3f, 18.176f, 1.3f, 17.823f),
                    PathNode.LineTo(1.306f, 8.983f),
                    PathNode.CurveTo(1.306f, 8.631f, 1.306f, 8.325f, 1.326f, 8.073f),
                    PathNode.CurveTo(1.348f, 7.813f, 1.395f, 7.55f, 1.524f, 7.296f),
                    PathNode.CurveTo(1.716f, 6.92f, 2.023f, 6.614f, 2.398f, 6.423f),
                    PathNode.CurveTo(2.652f, 6.294f, 2.915f, 6.246f, 3.175f, 6.225f),
                    PathNode.CurveTo(3.313f, 6.213f, 3.467f, 6.208f, 3.636f, 6.206f),
                    PathNode.CurveTo(3.637f, 5.909f, 3.644f, 5.746f, 3.707f, 5.617f),
                    PathNode.CurveTo(3.775f, 5.478f, 3.888f, 5.365f, 4.027f, 5.297f),
                    PathNode.CurveTo(4.173f, 5.225f, 4.363f, 5.226f, 4.742f, 5.226f),
                    PathNode.CurveTo(5.121f, 5.226f, 5.311f, 5.225f, 5.457f, 5.297f),
                    PathNode.CurveTo(5.596f, 5.365f, 5.709f, 5.478f, 5.777f, 5.617f),
                    PathNode.CurveTo(5.84f, 5.746f, 5.847f, 5.908f, 5.848f, 6.204f),
                    PathNode.LineTo(6.936f, 6.204f),
                    PathNode.LineTo(7.803f, 4.749f),
                    PathNode.CurveTo(8.0f, 4.419f, 8.17f, 4.117f, 8.424f, 3.893f),
                    PathNode.CurveTo(8.631f, 3.71f, 8.875f, 3.572f, 9.138f, 3.487f),
                    PathNode.CurveTo(9.38f, 3.41f, 9.635f, 3.394f, 9.91f, 3.392f),
                    PathNode.LineTo(14.336f, 3.392f),
                    PathNode.Close,
                    PathNode.MoveTo(10.191f, 4.792f),
                    PathNode.CurveTo(9.715f, 4.792f, 9.63f, 4.8f, 9.565f, 4.82f),
                    PathNode.CurveTo(9.487f, 4.846f, 9.413f, 4.888f, 9.351f, 4.942f),
                    PathNode.CurveTo(9.3f, 4.987f, 9.249f, 5.057f, 9.006f, 5.466f),
                    PathNode.LineTo(7.936f, 7.263f),
                    PathNode.CurveTo(7.809f, 7.474f, 7.581f, 7.604f, 7.334f, 7.604f),
                    PathNode.LineTo(4.086f, 7.604f),
                    PathNode.CurveTo(3.711f, 7.605f, 3.471f, 7.605f, 3.289f, 7.62f),
                    PathNode.CurveTo(3.117f, 7.634f, 3.058f, 7.658f, 3.034f, 7.67f),
                    PathNode.CurveTo(2.922f, 7.727f, 2.829f, 7.82f, 2.772f, 7.933f),
                    PathNode.CurveTo(2.759f, 7.957f, 2.736f, 8.015f, 2.722f, 8.188f),
                    PathNode.CurveTo(2.707f, 8.369f, 2.706f, 8.609f, 2.706f, 8.984f),
                    PathNode.LineTo(2.7f, 17.824f),
                    PathNode.CurveTo(2.7f, 18.2f, 2.7f, 18.44f, 2.715f, 18.622f),
                    PathNode.CurveTo(2.729f, 18.794f, 2.752f, 18.853f, 2.765f, 18.877f),
                    PathNode.CurveTo(2.822f, 18.99f, 2.915f, 19.082f, 3.027f, 19.14f),
                    PathNode.CurveTo(3.051f, 19.152f, 3.11f, 19.175f, 3.283f, 19.189f),
                    PathNode.CurveTo(3.465f, 19.204f, 3.705f, 19.205f, 4.08f, 19.205f),
                    PathNode.LineTo(19.919f, 19.208f),
                    PathNode.CurveTo(20.294f, 19.208f, 20.534f, 19.207f, 20.716f, 19.192f),
                    PathNode.CurveTo(20.889f, 19.178f, 20.948f, 19.155f, 20.972f, 19.143f),
                    PathNode.CurveTo(21.084f, 19.085f, 21.176f, 18.993f, 21.233f, 18.881f),
                    PathNode.CurveTo(21.246f, 18.857f, 21.27f, 18.798f, 21.284f, 18.625f),
                    PathNode.CurveTo(21.299f, 18.443f, 21.299f, 18.204f, 21.299f, 17.828f),
                    PathNode.LineTo(21.299f, 8.986f),
                    PathNode.CurveTo(21.299f, 8.611f, 21.299f, 8.372f, 21.284f, 8.19f),
                    PathNode.CurveTo(21.27f, 8.017f, 21.246f, 7.958f, 21.233f, 7.935f),
                    PathNode.CurveTo(21.176f, 7.822f, 21.084f, 7.73f, 20.972f, 7.673f),
                    PathNode.CurveTo(20.948f, 7.661f, 20.889f, 7.637f, 20.717f, 7.623f),
                    PathNode.CurveTo(20.535f, 7.608f, 20.295f, 7.607f, 19.92f, 7.606f),
                    PathNode.LineTo(16.975f, 7.604f),
                    PathNode.CurveTo(16.734f, 7.604f, 16.51f, 7.48f, 16.382f, 7.276f),
                    PathNode.LineTo(15.232f, 5.439f),
                    PathNode.CurveTo(14.985f, 5.045f, 14.934f, 4.979f, 14.884f, 4.936f),
                    PathNode.CurveTo(14.822f, 4.883f, 14.75f, 4.844f, 14.673f, 4.819f),
                    PathNode.CurveTo(14.61f, 4.8f, 14.526f, 4.792f, 14.062f, 4.792f),
                    PathNode.LineTo(10.191f, 4.792f),
                    PathNode.Close,
                    PathNode.MoveTo(12.001f, 8.081f),
                    PathNode.CurveTo(14.873f, 8.081f, 17.202f, 10.411f, 17.202f, 13.283f),
                    PathNode.CurveTo(17.202f, 16.155f, 14.873f, 18.484f, 12.001f, 18.484f),
                    PathNode.CurveTo(9.129f, 18.484f, 6.799f, 16.156f, 6.799f, 13.283f),
                    PathNode.CurveTo(6.799f, 10.411f, 9.128f, 8.081f, 12.001f, 8.081f),
                    PathNode.Close,
                    PathNode.MoveTo(12.001f, 9.481f),
                    PathNode.CurveTo(9.902f, 9.481f, 8.199f, 11.184f, 8.199f, 13.283f),
                    PathNode.CurveTo(8.2f, 15.382f, 9.902f, 17.084f, 12.001f, 17.084f),
                    PathNode.CurveTo(14.1f, 17.084f, 15.802f, 15.382f, 15.802f, 13.283f),
                    PathNode.CurveTo(15.802f, 11.184f, 14.1f, 9.482f, 12.001f, 9.481f),
                    PathNode.Close,
                    PathNode.MoveTo(19.768f, 8.354f),
                    PathNode.CurveTo(20.209f, 8.354f, 20.567f, 8.712f, 20.567f, 9.153f),
                    PathNode.CurveTo(20.567f, 9.595f, 20.209f, 9.953f, 19.768f, 9.953f),
                    PathNode.CurveTo(19.326f, 9.953f, 18.968f, 9.595f, 18.968f, 9.153f),
                    PathNode.CurveTo(18.968f, 8.712f, 19.326f, 8.354f, 19.768f, 8.354f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _camera!!
    }

private var _camera: ImageVector? = null
