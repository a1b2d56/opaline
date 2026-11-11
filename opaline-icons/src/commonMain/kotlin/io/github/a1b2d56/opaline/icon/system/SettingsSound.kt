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

/** `settings_search_sound_settings_ic_oplus` */
val OpalineIcons.System.SettingsSound: ImageVector
    get() {
        if (_settingsSound != null) return _settingsSound!!
        _settingsSound = ImageVector.Builder(
            name = "SettingsSound",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.907f, 4.715f),
                    PathNode.CurveTo(5.182f, 4.378f, 5.133f, 3.882f, 4.796f, 3.607f),
                    PathNode.CurveTo(4.459f, 3.331f, 3.963f, 3.381f, 3.688f, 3.717f),
                    PathNode.CurveTo(2.324f, 5.384f, 1.585f, 7.53f, 1.585f, 9.965f),
                    PathNode.LineTo(1.585f, 10.248f),
                    PathNode.CurveTo(1.585f, 10.683f, 1.937f, 11.035f, 2.372f, 11.035f),
                    PathNode.CurveTo(2.807f, 11.035f, 3.16f, 10.683f, 3.16f, 10.248f),
                    PathNode.LineTo(3.16f, 9.965f),
                    PathNode.CurveTo(3.16f, 7.856f, 3.796f, 6.072f, 4.907f, 4.715f),
                    PathNode.Close,
                    PathNode.MoveTo(19.199f, 3.607f),
                    PathNode.CurveTo(19.536f, 3.331f, 20.032f, 3.381f, 20.307f, 3.717f),
                    PathNode.CurveTo(21.671f, 5.384f, 22.41f, 7.53f, 22.41f, 9.965f),
                    PathNode.LineTo(22.41f, 10.248f),
                    PathNode.CurveTo(22.41f, 10.683f, 22.058f, 11.035f, 21.623f, 11.035f),
                    PathNode.CurveTo(21.188f, 11.035f, 20.835f, 10.683f, 20.835f, 10.248f),
                    PathNode.LineTo(20.835f, 9.965f),
                    PathNode.CurveTo(20.835f, 7.856f, 20.199f, 6.072f, 19.088f, 4.715f),
                    PathNode.CurveTo(18.813f, 4.378f, 18.863f, 3.882f, 19.199f, 3.607f),
                    PathNode.Close,
                    PathNode.MoveTo(11.997f, 4.137f),
                    PathNode.CurveTo(11.521f, 4.137f, 11.134f, 4.523f, 11.134f, 5.0f),
                    PathNode.CurveTo(11.134f, 5.078f, 11.145f, 5.155f, 11.165f, 5.227f),
                    PathNode.CurveTo(9.837f, 5.362f, 8.778f, 5.835f, 8.024f, 6.639f),
                    PathNode.CurveTo(7.125f, 7.596f, 6.759f, 8.917f, 6.759f, 10.379f),
                    PathNode.LineTo(6.759f, 11.561f),
                    PathNode.CurveTo(6.759f, 13.534f, 6.24f, 14.443f, 5.772f, 15.028f),
                    PathNode.CurveTo(5.646f, 15.185f, 5.518f, 15.326f, 5.385f, 15.471f),
                    PathNode.LineTo(5.359f, 15.499f),
                    PathNode.LineTo(5.358f, 15.5f),
                    PathNode.CurveTo(5.238f, 15.631f, 5.105f, 15.775f, 4.988f, 15.922f),
                    PathNode.CurveTo(4.723f, 16.257f, 4.484f, 16.675f, 4.484f, 17.249f),
                    PathNode.CurveTo(4.484f, 17.629f, 4.792f, 17.936f, 5.172f, 17.936f),
                    PathNode.LineTo(9.168f, 17.936f),
                    PathNode.CurveTo(9.13f, 18.702f, 9.406f, 19.478f, 9.996f, 20.062f),
                    PathNode.CurveTo(11.103f, 21.177f, 12.891f, 21.177f, 13.998f, 20.062f),
                    PathNode.CurveTo(14.587f, 19.478f, 14.863f, 18.702f, 14.826f, 17.936f),
                    PathNode.LineTo(18.822f, 17.936f),
                    PathNode.CurveTo(19.201f, 17.936f, 19.509f, 17.629f, 19.509f, 17.249f),
                    PathNode.CurveTo(19.509f, 16.675f, 19.27f, 16.257f, 19.005f, 15.922f),
                    PathNode.CurveTo(18.888f, 15.775f, 18.755f, 15.631f, 18.635f, 15.5f),
                    PathNode.LineTo(18.634f, 15.499f),
                    PathNode.LineTo(18.608f, 15.471f),
                    PathNode.CurveTo(18.475f, 15.326f, 18.347f, 15.185f, 18.221f, 15.028f),
                    PathNode.CurveTo(17.753f, 14.443f, 17.234f, 13.534f, 17.234f, 11.561f),
                    PathNode.LineTo(17.234f, 10.379f),
                    PathNode.CurveTo(17.234f, 8.917f, 16.868f, 7.596f, 15.969f, 6.639f),
                    PathNode.CurveTo(15.215f, 5.835f, 14.157f, 5.363f, 12.829f, 5.227f),
                    PathNode.CurveTo(12.849f, 5.155f, 12.86f, 5.078f, 12.86f, 5.0f),
                    PathNode.CurveTo(12.86f, 4.523f, 12.473f, 4.137f, 11.997f, 4.137f),
                    PathNode.Close,
                    PathNode.MoveTo(9.026f, 7.58f),
                    PathNode.CurveTo(9.598f, 6.971f, 10.529f, 6.561f, 11.997f, 6.561f),
                    PathNode.CurveTo(13.464f, 6.561f, 14.395f, 6.971f, 14.967f, 7.58f),
                    PathNode.CurveTo(15.546f, 8.197f, 15.859f, 9.128f, 15.859f, 10.379f),
                    PathNode.LineTo(15.859f, 11.561f),
                    PathNode.CurveTo(15.859f, 13.835f, 16.477f, 15.05f, 17.147f, 15.887f),
                    PathNode.CurveTo(17.306f, 16.085f, 17.462f, 16.256f, 17.596f, 16.401f),
                    PathNode.LineTo(17.611f, 16.418f),
                    PathNode.CurveTo(17.659f, 16.47f, 17.702f, 16.517f, 17.742f, 16.561f),
                    PathNode.LineTo(6.251f, 16.561f),
                    PathNode.CurveTo(6.291f, 16.517f, 6.335f, 16.47f, 6.382f, 16.418f),
                    PathNode.LineTo(6.397f, 16.401f),
                    PathNode.CurveTo(6.531f, 16.256f, 6.687f, 16.085f, 6.846f, 15.887f),
                    PathNode.CurveTo(7.516f, 15.05f, 8.134f, 13.835f, 8.134f, 11.561f),
                    PathNode.LineTo(8.134f, 10.379f),
                    PathNode.CurveTo(8.134f, 9.128f, 8.447f, 8.197f, 9.026f, 7.58f),
                    PathNode.Close,
                    PathNode.MoveTo(11.211f, 18.837f),
                    PathNode.CurveTo(10.962f, 18.591f, 10.857f, 18.258f, 10.898f, 17.936f),
                    PathNode.LineTo(13.095f, 17.936f),
                    PathNode.CurveTo(13.137f, 18.258f, 13.031f, 18.592f, 12.782f, 18.838f),
                    PathNode.LineTo(12.775f, 18.845f),
                    PathNode.CurveTo(12.342f, 19.282f, 11.651f, 19.281f, 11.218f, 18.844f),
                    PathNode.LineTo(11.211f, 18.837f),
                    PathNode.Close,
                    PathNode.MoveTo(17.381f, 5.322f),
                    PathNode.CurveTo(17.731f, 5.064f, 18.224f, 5.138f, 18.482f, 5.488f),
                    PathNode.CurveTo(19.381f, 6.706f, 19.831f, 8.236f, 19.831f, 9.966f),
                    PathNode.LineTo(19.831f, 10.249f),
                    PathNode.CurveTo(19.831f, 10.684f, 19.478f, 11.036f, 19.043f, 11.036f),
                    PathNode.CurveTo(18.608f, 11.036f, 18.256f, 10.684f, 18.256f, 10.249f),
                    PathNode.LineTo(18.256f, 9.966f),
                    PathNode.CurveTo(18.256f, 8.51f, 17.88f, 7.324f, 17.215f, 6.423f),
                    PathNode.CurveTo(16.957f, 6.073f, 17.031f, 5.58f, 17.381f, 5.322f),
                    PathNode.Close,
                    PathNode.MoveTo(6.779f, 6.423f),
                    PathNode.CurveTo(7.037f, 6.073f, 6.963f, 5.58f, 6.613f, 5.322f),
                    PathNode.CurveTo(6.263f, 5.064f, 5.77f, 5.138f, 5.512f, 5.488f),
                    PathNode.CurveTo(4.613f, 6.706f, 4.164f, 8.236f, 4.164f, 9.966f),
                    PathNode.LineTo(4.164f, 10.249f),
                    PathNode.CurveTo(4.164f, 10.684f, 4.516f, 11.036f, 4.951f, 11.036f),
                    PathNode.CurveTo(5.386f, 11.036f, 5.739f, 10.684f, 5.739f, 10.249f),
                    PathNode.LineTo(5.739f, 9.966f),
                    PathNode.CurveTo(5.739f, 8.51f, 6.114f, 7.324f, 6.779f, 6.423f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsSound!!
    }

private var _settingsSound: ImageVector? = null
