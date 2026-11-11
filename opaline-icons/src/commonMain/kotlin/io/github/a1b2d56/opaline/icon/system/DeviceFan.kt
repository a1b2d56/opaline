// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `icon_smart_electric_fan_in_use` */
val OpalineIcons.System.DeviceFan: ImageVector
    get() {
        if (_deviceFan != null) return _deviceFan!!
        _deviceFan = ImageVector.Builder(
            name = "DeviceFan",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.MoveTo(1.5f, 12.0f),
                    PathNode.CurveTo(1.5f, 6.201f, 6.201f, 1.5f, 12.0f, 1.5f),
                    PathNode.CurveTo(17.799f, 1.5f, 22.5f, 6.201f, 22.5f, 12.0f),
                    PathNode.CurveTo(22.5f, 17.799f, 17.799f, 22.5f, 12.0f, 22.5f),
                    PathNode.CurveTo(6.201f, 22.5f, 1.5f, 17.799f, 1.5f, 12.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.55f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.498f, 12.03f),
                    PathNode.CurveTo(14.929f, 12.043f, 15.378f, 12.131f, 15.867f, 12.279f),
                    PathNode.CurveTo(16.447f, 12.453f, 16.924f, 12.695f, 17.355f, 13.0f),
                    PathNode.CurveTo(18.732f, 13.93f, 19.122f, 15.188f, 18.553f, 16.767f),
                    PathNode.CurveTo(18.353f, 17.351f, 17.949f, 17.879f, 17.347f, 18.377f),
                    PathNode.CurveTo(16.772f, 18.871f, 16.121f, 19.209f, 15.424f, 19.413f),
                    PathNode.CurveTo(14.622f, 19.659f, 13.901f, 19.477f, 13.321f, 18.886f),
                    PathNode.CurveTo(12.741f, 18.294f, 12.583f, 17.535f, 12.939f, 16.652f),
                    PathNode.CurveTo(13.247f, 15.889f, 13.239f, 15.105f, 12.937f, 14.316f),
                    PathNode.CurveTo(13.844f, 13.949f, 14.486f, 13.066f, 14.498f, 12.03f),
                    PathNode.Close,
                    PathNode.MoveTo(5.145f, 13.345f),
                    PathNode.CurveTo(5.756f, 12.707f, 6.519f, 12.578f, 7.402f, 12.933f),
                    PathNode.CurveTo(8.154f, 13.236f, 8.926f, 13.232f, 9.686f, 12.945f),
                    PathNode.CurveTo(10.056f, 13.85f, 10.94f, 14.488f, 11.976f, 14.498f),
                    PathNode.CurveTo(11.97f, 14.946f, 11.883f, 15.412f, 11.728f, 15.923f),
                    PathNode.CurveTo(11.555f, 16.503f, 11.339f, 16.978f, 11.035f, 17.408f),
                    PathNode.CurveTo(10.073f, 18.762f, 8.816f, 19.152f, 7.236f, 18.583f),
                    PathNode.CurveTo(6.652f, 18.382f, 6.125f, 17.978f, 5.626f, 17.376f),
                    PathNode.CurveTo(5.132f, 16.801f, 4.795f, 16.15f, 4.59f, 15.453f),
                    PathNode.CurveTo(4.372f, 14.646f, 4.554f, 13.926f, 5.145f, 13.345f),
                    PathNode.Close,
                    PathNode.MoveTo(8.601f, 4.585f),
                    PathNode.CurveTo(9.408f, 4.366f, 10.101f, 4.552f, 10.681f, 5.143f),
                    PathNode.CurveTo(11.261f, 5.735f, 11.419f, 6.494f, 11.063f, 7.377f),
                    PathNode.CurveTo(10.879f, 7.875f, 10.807f, 8.385f, 10.877f, 8.905f),
                    PathNode.CurveTo(10.914f, 9.186f, 10.974f, 9.44f, 11.059f, 9.683f),
                    PathNode.CurveTo(10.153f, 10.052f, 9.512f, 10.937f, 9.501f, 11.974f),
                    PathNode.CurveTo(9.072f, 11.968f, 8.625f, 11.898f, 8.135f, 11.75f),
                    PathNode.CurveTo(7.583f, 11.573f, 7.077f, 11.334f, 6.647f, 11.029f),
                    PathNode.CurveTo(5.266f, 10.071f, 4.875f, 8.813f, 5.445f, 7.233f),
                    PathNode.CurveTo(5.673f, 6.646f, 6.076f, 6.119f, 6.678f, 5.621f),
                    PathNode.CurveTo(7.253f, 5.127f, 7.904f, 4.789f, 8.601f, 4.585f),
                    PathNode.Close,
                    PathNode.MoveTo(12.967f, 6.621f),
                    PathNode.CurveTo(13.929f, 5.267f, 15.186f, 4.877f, 16.766f, 5.446f),
                    PathNode.CurveTo(17.35f, 5.647f, 17.878f, 6.05f, 18.375f, 6.652f),
                    PathNode.CurveTo(18.87f, 7.227f, 19.207f, 7.879f, 19.412f, 8.576f),
                    PathNode.CurveTo(19.63f, 9.382f, 19.448f, 10.103f, 18.857f, 10.683f),
                    PathNode.CurveTo(18.242f, 11.294f, 17.479f, 11.424f, 16.596f, 11.068f),
                    PathNode.CurveTo(16.098f, 10.884f, 15.587f, 10.812f, 15.067f, 10.882f),
                    PathNode.CurveTo(14.805f, 10.917f, 14.56f, 10.986f, 14.322f, 11.078f),
                    PathNode.CurveTo(13.958f, 10.162f, 13.07f, 9.512f, 12.027f, 9.501f),
                    PathNode.CurveTo(12.039f, 9.071f, 12.124f, 8.601f, 12.274f, 8.106f),
                    PathNode.CurveTo(12.451f, 7.553f, 12.663f, 7.051f, 12.967f, 6.621f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.001f),
                    PathNode.MoveTo(10.5f, 12.001f),
                    PathNode.CurveTo(10.5f, 11.173f, 11.172f, 10.501f, 12.0f, 10.501f),
                    PathNode.CurveTo(12.828f, 10.501f, 13.5f, 11.173f, 13.5f, 12.001f),
                    PathNode.CurveTo(13.5f, 12.829f, 12.828f, 13.501f, 12.0f, 13.501f),
                    PathNode.CurveTo(11.172f, 13.501f, 10.5f, 12.829f, 10.5f, 12.001f),
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceFan!!
    }

private var _deviceFan: ImageVector? = null
