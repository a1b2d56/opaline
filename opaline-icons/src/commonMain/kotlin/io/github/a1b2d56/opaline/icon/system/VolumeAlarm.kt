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

/** `systemui_icon_volume_alarm_multi_app` */
val OpalineIcons.System.VolumeAlarm: ImageVector
    get() {
        if (_volumeAlarm != null) return _volumeAlarm!!
        _volumeAlarm = ImageVector.Builder(
            name = "VolumeAlarm",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.946f, 2.876f),
                    PathNode.CurveTo(17.249f, 2.877f, 21.549f, 7.176f, 21.549f, 12.479f),
                    PathNode.CurveTo(21.549f, 14.561f, 20.883f, 16.488f, 19.756f, 18.061f),
                    PathNode.CurveTo(19.527f, 18.381f, 19.411f, 18.541f, 19.404f, 18.701f),
                    PathNode.CurveTo(19.398f, 18.863f, 19.492f, 19.019f, 19.679f, 19.33f),
                    PathNode.LineTo(20.538f, 20.763f),
                    PathNode.CurveTo(20.701f, 21.035f, 20.659f, 21.383f, 20.435f, 21.607f),
                    PathNode.CurveTo(20.211f, 21.831f, 19.863f, 21.874f, 19.591f, 21.711f),
                    PathNode.LineTo(17.982f, 20.746f),
                    PathNode.CurveTo(17.699f, 20.576f, 17.559f, 20.491f, 17.41f, 20.491f),
                    PathNode.CurveTo(17.262f, 20.49f, 17.108f, 20.58f, 16.801f, 20.761f),
                    PathNode.CurveTo(15.377f, 21.599f, 13.718f, 22.081f, 11.946f, 22.081f),
                    PathNode.CurveTo(10.16f, 22.081f, 8.487f, 21.591f, 7.055f, 20.741f),
                    PathNode.CurveTo(6.747f, 20.558f, 6.592f, 20.466f, 6.444f, 20.466f),
                    PathNode.CurveTo(6.295f, 20.466f, 6.153f, 20.552f, 5.869f, 20.722f),
                    PathNode.LineTo(4.223f, 21.711f),
                    PathNode.CurveTo(3.951f, 21.874f, 3.603f, 21.83f, 3.379f, 21.607f),
                    PathNode.CurveTo(3.155f, 21.383f, 3.113f, 21.035f, 3.276f, 20.763f),
                    PathNode.LineTo(4.169f, 19.273f),
                    PathNode.CurveTo(4.355f, 18.964f, 4.447f, 18.809f, 4.441f, 18.649f),
                    PathNode.CurveTo(4.435f, 18.489f, 4.322f, 18.329f, 4.097f, 18.009f),
                    PathNode.CurveTo(2.993f, 16.446f, 2.344f, 14.538f, 2.344f, 12.479f),
                    PathNode.CurveTo(2.344f, 7.176f, 6.643f, 2.876f, 11.946f, 2.876f),
                    PathNode.Close,
                    PathNode.MoveTo(11.919f, 5.945f),
                    PathNode.CurveTo(11.777f, 5.945f, 11.64f, 6.001f, 11.533f, 6.101f),
                    PathNode.CurveTo(11.425f, 6.201f, 11.354f, 6.337f, 11.344f, 6.479f),
                    PathNode.CurveTo(11.337f, 6.568f, 11.331f, 6.659f, 11.325f, 6.748f),
                    PathNode.CurveTo(11.209f, 8.324f, 11.092f, 9.9f, 10.977f, 11.475f),
                    PathNode.CurveTo(10.188f, 12.364f, 9.4f, 13.255f, 8.612f, 14.144f),
                    PathNode.CurveTo(8.565f, 14.196f, 8.519f, 14.249f, 8.473f, 14.301f),
                    PathNode.CurveTo(8.381f, 14.405f, 8.333f, 14.549f, 8.334f, 14.695f),
                    PathNode.CurveTo(8.336f, 14.84f, 8.388f, 14.976f, 8.483f, 15.078f),
                    PathNode.CurveTo(8.577f, 15.179f, 8.71f, 15.24f, 8.855f, 15.252f),
                    PathNode.CurveTo(8.999f, 15.264f, 9.146f, 15.226f, 9.256f, 15.141f),
                    PathNode.CurveTo(9.311f, 15.098f, 9.368f, 15.056f, 9.423f, 15.013f),
                    PathNode.CurveTo(10.405f, 14.257f, 11.387f, 13.5f, 12.368f, 12.743f),
                    PathNode.CurveTo(12.47f, 12.697f, 12.564f, 12.635f, 12.641f, 12.558f),
                    PathNode.CurveTo(12.71f, 12.489f, 12.764f, 12.411f, 12.805f, 12.326f),
                    PathNode.CurveTo(12.873f, 12.21f, 12.914f, 12.079f, 12.919f, 11.939f),
                    PathNode.CurveTo(12.923f, 11.833f, 12.905f, 11.724f, 12.871f, 11.62f),
                    PathNode.CurveTo(12.871f, 11.614f, 12.871f, 11.608f, 12.87f, 11.602f),
                    PathNode.CurveTo(12.752f, 9.984f, 12.633f, 8.366f, 12.514f, 6.748f),
                    PathNode.CurveTo(12.507f, 6.659f, 12.501f, 6.568f, 12.494f, 6.479f),
                    PathNode.CurveTo(12.484f, 6.337f, 12.413f, 6.201f, 12.306f, 6.101f),
                    PathNode.CurveTo(12.198f, 6.001f, 12.061f, 5.945f, 11.919f, 5.945f),
                    PathNode.Close,
                    PathNode.MoveTo(18.141f, 2.049f),
                    PathNode.CurveTo(19.317f, 1.791f, 20.597f, 2.119f, 21.512f, 3.034f),
                    PathNode.CurveTo(22.427f, 3.948f, 22.754f, 5.228f, 22.496f, 6.405f),
                    PathNode.CurveTo(22.366f, 6.999f, 22.301f, 7.297f, 21.892f, 7.416f),
                    PathNode.CurveTo(21.483f, 7.536f, 21.208f, 7.262f, 20.66f, 6.714f),
                    PathNode.LineTo(17.831f, 3.885f),
                    PathNode.CurveTo(17.283f, 3.337f, 17.009f, 3.063f, 17.129f, 2.654f),
                    PathNode.CurveTo(17.249f, 2.245f, 17.546f, 2.18f, 18.141f, 2.049f),
                    PathNode.Close,
                    PathNode.MoveTo(2.489f, 2.991f),
                    PathNode.CurveTo(3.404f, 2.076f, 4.684f, 1.747f, 5.861f, 2.005f),
                    PathNode.CurveTo(6.455f, 2.136f, 6.753f, 2.202f, 6.872f, 2.611f),
                    PathNode.CurveTo(6.992f, 3.02f, 6.718f, 3.293f, 6.17f, 3.841f),
                    PathNode.LineTo(3.341f, 6.67f),
                    PathNode.CurveTo(2.793f, 7.218f, 2.519f, 7.493f, 2.11f, 7.373f),
                    PathNode.CurveTo(1.701f, 7.254f, 1.636f, 6.956f, 1.505f, 6.361f),
                    PathNode.CurveTo(1.247f, 5.184f, 1.575f, 3.905f, 2.489f, 2.991f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeAlarm!!
    }

private var _volumeAlarm: ImageVector? = null
