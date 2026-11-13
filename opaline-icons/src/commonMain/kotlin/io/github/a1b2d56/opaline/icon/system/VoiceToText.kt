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

/** `color_menu_ic_voice_word_normal` */
val OpalineIcons.System.VoiceToText: ImageVector
    get() {
        if (_voiceToText != null) return _voiceToText!!
        _voiceToText = ImageVector.Builder(
            name = "VoiceToText",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.2f, 11.088f),
                    PathNode.CurveTo(3.587f, 11.088f, 3.9f, 11.402f, 3.9f, 11.788f),
                    PathNode.CurveTo(3.9f, 14.881f, 6.407f, 17.388f, 9.5f, 17.388f),
                    PathNode.LineTo(10.5f, 17.388f),
                    PathNode.CurveTo(12.356f, 17.388f, 13.999f, 16.485f, 15.019f, 15.095f),
                    PathNode.CurveTo(15.156f, 15.62f, 15.344f, 16.125f, 15.577f, 16.604f),
                    PathNode.CurveTo(14.344f, 17.902f, 12.62f, 18.729f, 10.7f, 18.783f),
                    PathNode.LineTo(10.7f, 20.5f),
                    PathNode.LineTo(13.0f, 20.5f),
                    PathNode.LineTo(13.141f, 20.515f),
                    PathNode.CurveTo(13.46f, 20.58f, 13.7f, 20.862f, 13.7f, 21.2f),
                    PathNode.CurveTo(13.7f, 21.539f, 13.46f, 21.821f, 13.141f, 21.886f),
                    PathNode.LineTo(13.0f, 21.9f),
                    PathNode.LineTo(7.0f, 21.9f),
                    PathNode.CurveTo(6.613f, 21.9f, 6.3f, 21.587f, 6.3f, 21.2f),
                    PathNode.CurveTo(6.3f, 20.814f, 6.613f, 20.5f, 7.0f, 20.5f),
                    PathNode.LineTo(9.3f, 20.5f),
                    PathNode.LineTo(9.3f, 18.783f),
                    PathNode.CurveTo(5.526f, 18.677f, 2.5f, 15.587f, 2.5f, 11.788f),
                    PathNode.CurveTo(2.5f, 11.401f, 2.814f, 11.088f, 3.2f, 11.088f),
                    PathNode.Close,
                    PathNode.MoveTo(19.597f, 11.333f),
                    PathNode.CurveTo(19.809f, 11.311f, 20.008f, 11.445f, 20.055f, 11.653f),
                    PathNode.CurveTo(20.086f, 11.791f, 20.112f, 11.929f, 20.138f, 12.067f),
                    PathNode.CurveTo(20.176f, 12.28f, 20.2f, 12.423f, 20.206f, 12.494f),
                    PathNode.LineTo(23.15f, 12.494f),
                    PathNode.CurveTo(23.393f, 12.494f, 23.591f, 12.692f, 23.591f, 12.935f),
                    PathNode.LineTo(23.591f, 13.253f),
                    PathNode.CurveTo(23.591f, 13.496f, 23.393f, 13.693f, 23.15f, 13.693f),
                    PathNode.LineTo(22.221f, 13.693f),
                    PathNode.CurveTo(22.003f, 14.481f, 21.741f, 15.177f, 21.434f, 15.781f),
                    PathNode.CurveTo(21.167f, 16.311f, 20.84f, 16.796f, 20.459f, 17.24f),
                    PathNode.CurveTo(20.818f, 17.506f, 21.216f, 17.753f, 21.656f, 17.978f),
                    PathNode.CurveTo(22.171f, 18.232f, 22.758f, 18.469f, 23.415f, 18.69f),
                    PathNode.CurveTo(23.67f, 18.776f, 23.796f, 19.065f, 23.68f, 19.308f),
                    PathNode.LineTo(23.438f, 19.815f),
                    PathNode.CurveTo(23.338f, 20.021f, 23.097f, 20.118f, 22.884f, 20.032f),
                    PathNode.CurveTo(22.12f, 19.724f, 21.446f, 19.406f, 20.863f, 19.079f),
                    PathNode.CurveTo(20.358f, 18.795f, 19.906f, 18.492f, 19.509f, 18.168f),
                    PathNode.CurveTo(19.125f, 18.486f, 18.694f, 18.788f, 18.214f, 19.069f),
                    PathNode.CurveTo(17.632f, 19.411f, 16.952f, 19.745f, 16.175f, 20.072f),
                    PathNode.CurveTo(15.97f, 20.158f, 15.735f, 20.075f, 15.627f, 19.881f),
                    PathNode.LineTo(15.354f, 19.391f),
                    PathNode.CurveTo(15.222f, 19.152f, 15.336f, 18.853f, 15.592f, 18.757f),
                    PathNode.CurveTo(16.286f, 18.497f, 16.893f, 18.231f, 17.412f, 17.958f),
                    PathNode.CurveTo(17.834f, 17.732f, 18.211f, 17.49f, 18.548f, 17.238f),
                    PathNode.CurveTo(18.171f, 16.805f, 17.847f, 16.33f, 17.576f, 15.811f),
                    PathNode.CurveTo(17.262f, 15.203f, 16.986f, 14.497f, 16.748f, 13.693f),
                    PathNode.LineTo(15.859f, 13.693f),
                    PathNode.CurveTo(15.616f, 13.693f, 15.419f, 13.496f, 15.419f, 13.253f),
                    PathNode.LineTo(15.419f, 12.935f),
                    PathNode.CurveTo(15.419f, 12.692f, 15.616f, 12.494f, 15.859f, 12.494f),
                    PathNode.LineTo(18.88f, 12.494f),
                    PathNode.CurveTo(18.866f, 12.408f, 18.852f, 12.314f, 18.833f, 12.213f),
                    PathNode.CurveTo(18.819f, 12.112f, 18.803f, 12.016f, 18.788f, 11.926f),
                    PathNode.CurveTo(18.744f, 11.662f, 18.926f, 11.404f, 19.191f, 11.376f),
                    PathNode.LineTo(19.597f, 11.333f),
                    PathNode.Close,
                    PathNode.MoveTo(18.063f, 13.693f),
                    PathNode.CurveTo(18.229f, 14.259f, 18.434f, 14.768f, 18.679f, 15.221f),
                    PathNode.CurveTo(18.906f, 15.636f, 19.179f, 16.02f, 19.497f, 16.373f),
                    PathNode.CurveTo(19.805f, 16.022f, 20.068f, 15.638f, 20.283f, 15.221f),
                    PathNode.CurveTo(20.513f, 14.776f, 20.707f, 14.267f, 20.868f, 13.693f),
                    PathNode.LineTo(18.063f, 13.693f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 1.99f),
                    PathNode.CurveTo(12.54f, 1.99f, 14.6f, 4.05f, 14.6f, 6.591f),
                    PathNode.LineTo(14.6f, 11.29f),
                    PathNode.CurveTo(14.599f, 13.83f, 12.54f, 15.89f, 10.0f, 15.891f),
                    PathNode.CurveTo(7.46f, 15.89f, 5.4f, 13.83f, 5.399f, 11.29f),
                    PathNode.LineTo(5.399f, 6.591f),
                    PathNode.CurveTo(5.399f, 4.05f, 7.46f, 1.99f, 10.0f, 1.99f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 3.391f),
                    PathNode.CurveTo(8.233f, 3.391f, 6.8f, 4.824f, 6.8f, 6.591f),
                    PathNode.LineTo(6.8f, 11.29f),
                    PathNode.CurveTo(6.8f, 13.057f, 8.233f, 14.49f, 10.0f, 14.49f),
                    PathNode.CurveTo(11.767f, 14.49f, 13.199f, 13.057f, 13.199f, 11.29f),
                    PathNode.LineTo(13.199f, 6.591f),
                    PathNode.CurveTo(13.199f, 4.824f, 11.767f, 3.391f, 10.0f, 3.391f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _voiceToText!!
    }

private var _voiceToText: ImageVector? = null
