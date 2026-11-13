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

/** `rcs_ic_chatbot_website` */
val OpalineIcons.System.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = ImageVector.Builder(
            name = "Globe",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.7f),
                    PathNode.CurveTo(17.91f, 22.7f, 22.7f, 17.91f, 22.7f, 12.0f),
                    PathNode.CurveTo(22.7f, 6.091f, 17.91f, 1.3f, 12.0f, 1.3f),
                    PathNode.CurveTo(6.091f, 1.3f, 1.3f, 6.091f, 1.3f, 12.0f),
                    PathNode.CurveTo(1.3f, 17.91f, 6.091f, 22.7f, 12.0f, 22.7f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 2.7f),
                    PathNode.CurveTo(11.204f, 2.7f, 10.251f, 3.45f, 9.456f, 5.216f),
                    PathNode.CurveTo(9.067f, 6.081f, 8.749f, 7.127f, 8.53f, 8.3f),
                    PathNode.LineTo(15.47f, 8.3f),
                    PathNode.CurveTo(15.252f, 7.127f, 14.933f, 6.081f, 14.544f, 5.216f),
                    PathNode.CurveTo(13.749f, 3.45f, 12.796f, 2.7f, 12.0f, 2.7f),
                    PathNode.Close,
                    PathNode.MoveTo(8.18f, 4.642f),
                    PathNode.CurveTo(7.711f, 5.684f, 7.344f, 6.927f, 7.107f, 8.3f),
                    PathNode.LineTo(3.465f, 8.3f),
                    PathNode.CurveTo(4.501f, 5.915f, 6.506f, 4.049f, 8.984f, 3.2f),
                    PathNode.CurveTo(8.681f, 3.636f, 8.412f, 4.125f, 8.18f, 4.642f),
                    PathNode.Close,
                    PathNode.MoveTo(6.916f, 9.7f),
                    PathNode.LineTo(2.987f, 9.7f),
                    PathNode.CurveTo(2.8f, 10.436f, 2.7f, 11.206f, 2.7f, 12.0f),
                    PathNode.CurveTo(2.7f, 12.794f, 2.8f, 13.564f, 2.987f, 14.3f),
                    PathNode.LineTo(6.916f, 14.3f),
                    PathNode.CurveTo(6.84f, 13.558f, 6.8f, 12.788f, 6.8f, 12.0f),
                    PathNode.CurveTo(6.8f, 11.212f, 6.84f, 10.442f, 6.916f, 9.7f),
                    PathNode.Close,
                    PathNode.MoveTo(7.107f, 15.7f),
                    PathNode.LineTo(3.465f, 15.7f),
                    PathNode.CurveTo(4.501f, 18.085f, 6.506f, 19.951f, 8.984f, 20.8f),
                    PathNode.CurveTo(8.681f, 20.364f, 8.412f, 19.876f, 8.18f, 19.358f),
                    PathNode.CurveTo(7.711f, 18.316f, 7.344f, 17.073f, 7.107f, 15.7f),
                    PathNode.Close,
                    PathNode.MoveTo(8.53f, 15.7f),
                    PathNode.LineTo(15.47f, 15.7f),
                    PathNode.CurveTo(15.252f, 16.873f, 14.933f, 17.919f, 14.544f, 18.784f),
                    PathNode.CurveTo(13.749f, 20.55f, 12.796f, 21.3f, 12.0f, 21.3f),
                    PathNode.CurveTo(11.204f, 21.3f, 10.251f, 20.55f, 9.456f, 18.784f),
                    PathNode.CurveTo(9.067f, 17.919f, 8.749f, 16.873f, 8.53f, 15.7f),
                    PathNode.Close,
                    PathNode.MoveTo(15.676f, 14.3f),
                    PathNode.LineTo(8.324f, 14.3f),
                    PathNode.CurveTo(8.243f, 13.566f, 8.2f, 12.795f, 8.2f, 12.0f),
                    PathNode.CurveTo(8.2f, 11.205f, 8.243f, 10.434f, 8.324f, 9.7f),
                    PathNode.LineTo(15.676f, 9.7f),
                    PathNode.CurveTo(15.757f, 10.434f, 15.8f, 11.205f, 15.8f, 12.0f),
                    PathNode.CurveTo(15.8f, 12.795f, 15.757f, 13.566f, 15.676f, 14.3f),
                    PathNode.Close,
                    PathNode.MoveTo(16.893f, 15.7f),
                    PathNode.CurveTo(16.656f, 17.073f, 16.289f, 18.316f, 15.82f, 19.358f),
                    PathNode.CurveTo(15.588f, 19.876f, 15.319f, 20.364f, 15.016f, 20.8f),
                    PathNode.CurveTo(17.494f, 19.951f, 19.5f, 18.085f, 20.535f, 15.7f),
                    PathNode.LineTo(16.893f, 15.7f),
                    PathNode.Close,
                    PathNode.MoveTo(21.014f, 14.3f),
                    PathNode.LineTo(17.084f, 14.3f),
                    PathNode.CurveTo(17.16f, 13.558f, 17.2f, 12.788f, 17.2f, 12.0f),
                    PathNode.CurveTo(17.2f, 11.212f, 17.16f, 10.442f, 17.084f, 9.7f),
                    PathNode.LineTo(21.014f, 9.7f),
                    PathNode.CurveTo(21.201f, 10.436f, 21.3f, 11.206f, 21.3f, 12.0f),
                    PathNode.CurveTo(21.3f, 12.794f, 21.201f, 13.564f, 21.014f, 14.3f),
                    PathNode.Close,
                    PathNode.MoveTo(15.016f, 3.2f),
                    PathNode.CurveTo(17.494f, 4.049f, 19.5f, 5.915f, 20.535f, 8.3f),
                    PathNode.LineTo(16.893f, 8.3f),
                    PathNode.CurveTo(16.656f, 6.927f, 16.289f, 5.684f, 15.82f, 4.642f),
                    PathNode.CurveTo(15.588f, 4.125f, 15.319f, 3.636f, 15.016f, 3.2f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _globe!!
    }

private var _globe: ImageVector? = null
