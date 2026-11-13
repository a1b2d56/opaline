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

/** `pb_dr_menu_sms_normal` */
val OpalineIcons.System.Messages: ImageVector
    get() {
        if (_messages != null) return _messages!!
        _messages = ImageVector.Builder(
            name = "Messages",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.378f, 3.0f),
                    PathNode.LineTo(4.351f, 3.0f),
                    PathNode.LineTo(4.351f, 3.0f),
                    PathNode.CurveTo(4.01f, 3.0f, 3.712f, 3.0f, 3.467f, 3.02f),
                    PathNode.CurveTo(3.207f, 3.041f, 2.944f, 3.088f, 2.69f, 3.218f),
                    PathNode.CurveTo(2.313f, 3.41f, 2.007f, 3.716f, 1.816f, 4.092f),
                    PathNode.CurveTo(1.686f, 4.346f, 1.639f, 4.609f, 1.618f, 4.869f),
                    PathNode.CurveTo(1.598f, 5.115f, 1.598f, 5.412f, 1.598f, 5.753f),
                    PathNode.LineTo(1.598f, 5.753f),
                    PathNode.LineTo(1.598f, 5.78f),
                    PathNode.LineTo(1.598f, 21.863f),
                    PathNode.CurveTo(1.598f, 22.117f, 1.735f, 22.351f, 1.957f, 22.475f),
                    PathNode.CurveTo(2.179f, 22.598f, 2.451f, 22.592f, 2.666f, 22.458f),
                    PathNode.LineTo(7.985f, 19.162f),
                    PathNode.CurveTo(8.191f, 19.034f, 8.229f, 19.013f, 8.263f, 18.999f),
                    PathNode.CurveTo(8.304f, 18.983f, 8.347f, 18.97f, 8.39f, 18.963f),
                    PathNode.CurveTo(8.426f, 18.957f, 8.469f, 18.955f, 8.712f, 18.955f),
                    PathNode.LineTo(19.624f, 18.955f),
                    PathNode.LineTo(19.65f, 18.955f),
                    PathNode.LineTo(19.65f, 18.955f),
                    PathNode.CurveTo(19.992f, 18.955f, 20.289f, 18.955f, 20.535f, 18.935f),
                    PathNode.CurveTo(20.795f, 18.913f, 21.058f, 18.866f, 21.312f, 18.737f),
                    PathNode.CurveTo(21.688f, 18.545f, 21.994f, 18.239f, 22.186f, 17.863f),
                    PathNode.CurveTo(22.315f, 17.608f, 22.363f, 17.346f, 22.384f, 17.086f),
                    PathNode.CurveTo(22.404f, 16.84f, 22.404f, 16.543f, 22.404f, 16.201f),
                    PathNode.LineTo(22.404f, 16.175f),
                    PathNode.LineTo(22.404f, 5.78f),
                    PathNode.LineTo(22.404f, 5.753f),
                    PathNode.CurveTo(22.404f, 5.412f, 22.404f, 5.115f, 22.384f, 4.869f),
                    PathNode.CurveTo(22.363f, 4.609f, 22.315f, 4.346f, 22.186f, 4.092f),
                    PathNode.CurveTo(21.994f, 3.716f, 21.688f, 3.41f, 21.312f, 3.218f),
                    PathNode.CurveTo(21.058f, 3.088f, 20.795f, 3.041f, 20.535f, 3.02f),
                    PathNode.CurveTo(20.289f, 3.0f, 19.992f, 3.0f, 19.65f, 3.0f),
                    PathNode.LineTo(19.65f, 3.0f),
                    PathNode.LineTo(19.624f, 3.0f),
                    PathNode.LineTo(4.378f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(3.325f, 4.465f),
                    PathNode.CurveTo(3.349f, 4.453f, 3.407f, 4.43f, 3.581f, 4.415f),
                    PathNode.CurveTo(3.762f, 4.401f, 4.002f, 4.4f, 4.378f, 4.4f),
                    PathNode.LineTo(19.624f, 4.4f),
                    PathNode.CurveTo(20.0f, 4.4f, 20.239f, 4.401f, 20.421f, 4.415f),
                    PathNode.CurveTo(20.594f, 4.43f, 20.652f, 4.453f, 20.676f, 4.465f),
                    PathNode.CurveTo(20.789f, 4.523f, 20.881f, 4.615f, 20.938f, 4.728f),
                    PathNode.CurveTo(20.951f, 4.752f, 20.974f, 4.81f, 20.989f, 4.983f),
                    PathNode.CurveTo(21.003f, 5.165f, 21.004f, 5.404f, 21.004f, 5.78f),
                    PathNode.LineTo(21.004f, 16.175f),
                    PathNode.CurveTo(21.004f, 16.55f, 21.003f, 16.79f, 20.989f, 16.972f),
                    PathNode.CurveTo(20.974f, 17.145f, 20.951f, 17.203f, 20.938f, 17.227f),
                    PathNode.CurveTo(20.881f, 17.34f, 20.789f, 17.432f, 20.676f, 17.489f),
                    PathNode.CurveTo(20.652f, 17.501f, 20.594f, 17.525f, 20.421f, 17.539f),
                    PathNode.CurveTo(20.239f, 17.554f, 20.0f, 17.555f, 19.624f, 17.555f),
                    PathNode.LineTo(8.712f, 17.555f),
                    PathNode.LineTo(8.673f, 17.555f),
                    PathNode.CurveTo(8.491f, 17.555f, 8.325f, 17.554f, 8.158f, 17.582f),
                    PathNode.CurveTo(8.012f, 17.607f, 7.869f, 17.648f, 7.732f, 17.704f),
                    PathNode.CurveTo(7.576f, 17.767f, 7.435f, 17.855f, 7.28f, 17.951f),
                    PathNode.LineTo(7.247f, 17.972f),
                    PathNode.LineTo(2.998f, 20.606f),
                    PathNode.LineTo(2.998f, 5.78f),
                    PathNode.CurveTo(2.998f, 5.404f, 2.998f, 5.165f, 3.013f, 4.983f),
                    PathNode.CurveTo(3.027f, 4.81f, 3.051f, 4.752f, 3.063f, 4.728f),
                    PathNode.CurveTo(3.121f, 4.615f, 3.212f, 4.523f, 3.325f, 4.465f),
                    PathNode.Close,
                    PathNode.MoveTo(7.301f, 8.782f),
                    PathNode.CurveTo(7.301f, 8.395f, 7.614f, 8.082f, 8.001f, 8.082f),
                    PathNode.LineTo(16.001f, 8.082f),
                    PathNode.CurveTo(16.388f, 8.082f, 16.701f, 8.395f, 16.701f, 8.782f),
                    PathNode.CurveTo(16.701f, 9.168f, 16.388f, 9.482f, 16.001f, 9.482f),
                    PathNode.LineTo(8.001f, 9.482f),
                    PathNode.CurveTo(7.614f, 9.482f, 7.301f, 9.168f, 7.301f, 8.782f),
                    PathNode.Close,
                    PathNode.MoveTo(7.301f, 12.782f),
                    PathNode.CurveTo(7.301f, 12.395f, 7.614f, 12.082f, 8.001f, 12.082f),
                    PathNode.LineTo(13.001f, 12.082f),
                    PathNode.CurveTo(13.388f, 12.082f, 13.701f, 12.395f, 13.701f, 12.782f),
                    PathNode.CurveTo(13.701f, 13.168f, 13.388f, 13.482f, 13.001f, 13.482f),
                    PathNode.LineTo(8.001f, 13.482f),
                    PathNode.CurveTo(7.614f, 13.482f, 7.301f, 13.168f, 7.301f, 12.782f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _messages!!
    }

private var _messages: ImageVector? = null
