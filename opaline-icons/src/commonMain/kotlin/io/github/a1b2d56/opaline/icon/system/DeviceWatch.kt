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

/** `icon_watch_in_use` */
val OpalineIcons.System.DeviceWatch: ImageVector
    get() {
        if (_deviceWatch != null) return _deviceWatch!!
        _deviceWatch = ImageVector.Builder(
            name = "DeviceWatch",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 7.0f),
                    PathNode.LineTo(15.5f, 7.0f),
                    PathNode.CurveTo(15.776f, 7.0f, 16.0f, 7.224f, 16.0f, 7.5f),
                    PathNode.LineTo(16.0f, 16.5f),
                    PathNode.CurveTo(16.0f, 16.776f, 15.776f, 17.0f, 15.5f, 17.0f),
                    PathNode.LineTo(8.5f, 17.0f),
                    PathNode.CurveTo(8.224f, 17.0f, 8.0f, 16.776f, 8.0f, 16.5f),
                    PathNode.LineTo(8.0f, 7.5f),
                    PathNode.CurveTo(8.0f, 7.224f, 8.224f, 7.0f, 8.5f, 7.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.836f, 0.522f),
                    PathNode.CurveTo(10.943f, 0.226f, 13.053f, 0.226f, 15.163f, 0.522f),
                    PathNode.CurveTo(15.494f, 0.569f, 15.746f, 0.843f, 15.765f, 1.177f),
                    PathNode.CurveTo(15.775f, 1.362f, 15.775f, 1.606f, 15.775f, 1.852f),
                    PathNode.CurveTo(15.776f, 1.969f, 15.775f, 2.086f, 15.776f, 2.198f),
                    PathNode.CurveTo(15.78f, 2.576f, 15.795f, 2.961f, 15.847f, 3.31f),
                    PathNode.CurveTo(15.899f, 3.669f, 15.983f, 3.934f, 16.088f, 4.104f),
                    PathNode.CurveTo(16.138f, 4.186f, 16.189f, 4.24f, 16.245f, 4.275f),
                    PathNode.CurveTo(16.317f, 4.297f, 16.39f, 4.319f, 16.464f, 4.342f),
                    PathNode.CurveTo(17.734f, 4.561f, 18.701f, 5.667f, 18.701f, 7.0f),
                    PathNode.LineTo(18.701f, 17.0f),
                    PathNode.CurveTo(18.701f, 18.334f, 17.733f, 19.438f, 16.462f, 19.657f),
                    PathNode.CurveTo(16.389f, 19.68f, 16.316f, 19.703f, 16.244f, 19.725f),
                    PathNode.CurveTo(16.188f, 19.76f, 16.137f, 19.814f, 16.087f, 19.895f),
                    PathNode.CurveTo(15.982f, 20.066f, 15.898f, 20.331f, 15.846f, 20.689f),
                    PathNode.CurveTo(15.794f, 21.039f, 15.779f, 21.424f, 15.775f, 21.802f),
                    PathNode.CurveTo(15.774f, 21.914f, 15.774f, 22.031f, 15.774f, 22.147f),
                    PathNode.CurveTo(15.774f, 22.394f, 15.774f, 22.637f, 15.764f, 22.823f),
                    PathNode.CurveTo(15.745f, 23.157f, 15.493f, 23.431f, 15.162f, 23.477f),
                    PathNode.CurveTo(13.055f, 23.774f, 10.945f, 23.774f, 8.835f, 23.477f),
                    PathNode.CurveTo(8.504f, 23.431f, 8.252f, 23.157f, 8.233f, 22.823f),
                    PathNode.CurveTo(8.223f, 22.637f, 8.223f, 22.394f, 8.223f, 22.147f),
                    PathNode.CurveTo(8.223f, 22.031f, 8.223f, 21.914f, 8.222f, 21.802f),
                    PathNode.CurveTo(8.218f, 21.424f, 8.203f, 21.039f, 8.151f, 20.689f),
                    PathNode.CurveTo(8.099f, 20.331f, 8.015f, 20.066f, 7.91f, 19.895f),
                    PathNode.CurveTo(7.86f, 19.814f, 7.809f, 19.76f, 7.753f, 19.725f),
                    PathNode.CurveTo(7.679f, 19.702f, 7.604f, 19.679f, 7.529f, 19.656f),
                    PathNode.CurveTo(6.263f, 19.433f, 5.301f, 18.33f, 5.301f, 17.0f),
                    PathNode.LineTo(5.301f, 7.0f),
                    PathNode.CurveTo(5.301f, 5.669f, 6.264f, 4.565f, 7.531f, 4.343f),
                    PathNode.CurveTo(7.606f, 4.32f, 7.68f, 4.297f, 7.754f, 4.275f),
                    PathNode.CurveTo(7.81f, 4.24f, 7.861f, 4.186f, 7.911f, 4.104f),
                    PathNode.CurveTo(8.016f, 3.934f, 8.1f, 3.669f, 8.152f, 3.31f),
                    PathNode.CurveTo(8.204f, 2.961f, 8.219f, 2.576f, 8.223f, 2.198f),
                    PathNode.CurveTo(8.224f, 2.086f, 8.224f, 1.969f, 8.224f, 1.852f),
                    PathNode.CurveTo(8.224f, 1.606f, 8.224f, 1.362f, 8.234f, 1.177f),
                    PathNode.CurveTo(8.253f, 0.843f, 8.505f, 0.569f, 8.836f, 0.522f),
                    PathNode.Close,
                    PathNode.MoveTo(8.001f, 5.7f),
                    PathNode.CurveTo(7.283f, 5.7f, 6.701f, 6.282f, 6.701f, 7.0f),
                    PathNode.LineTo(6.701f, 17.0f),
                    PathNode.CurveTo(6.701f, 17.718f, 7.283f, 18.3f, 8.001f, 18.3f),
                    PathNode.LineTo(16.001f, 18.3f),
                    PathNode.CurveTo(16.719f, 18.3f, 17.301f, 17.718f, 17.301f, 17.0f),
                    PathNode.LineTo(17.301f, 7.0f),
                    PathNode.CurveTo(17.301f, 6.282f, 16.719f, 5.7f, 16.001f, 5.7f),
                    PathNode.LineTo(8.001f, 5.7f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceWatch!!
    }

private var _deviceWatch: ImageVector? = null
