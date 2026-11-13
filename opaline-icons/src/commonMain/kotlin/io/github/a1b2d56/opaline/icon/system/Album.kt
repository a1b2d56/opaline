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

/** `app_ic_tab_album` */
val OpalineIcons.System.Album: ImageVector
    get() {
        if (_album != null) return _album!!
        _album = ImageVector.Builder(
            name = "Album",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.443f, 6.132f),
                    PathNode.CurveTo(18.104f, 6.132f, 18.641f, 6.131f, 19.076f, 6.167f),
                    PathNode.CurveTo(19.52f, 6.203f, 19.919f, 6.28f, 20.291f, 6.47f),
                    PathNode.CurveTo(20.874f, 6.767f, 21.348f, 7.241f, 21.645f, 7.824f),
                    PathNode.CurveTo(21.835f, 8.196f, 21.912f, 8.596f, 21.948f, 9.039f),
                    PathNode.CurveTo(21.984f, 9.474f, 21.983f, 10.012f, 21.983f, 10.672f),
                    PathNode.LineTo(21.983f, 16.473f),
                    PathNode.CurveTo(21.983f, 17.132f, 21.984f, 17.67f, 21.948f, 18.105f),
                    PathNode.CurveTo(21.912f, 18.549f, 21.835f, 18.949f, 21.645f, 19.32f),
                    PathNode.CurveTo(21.348f, 19.903f, 20.874f, 20.378f, 20.291f, 20.675f),
                    PathNode.CurveTo(19.919f, 20.864f, 19.52f, 20.941f, 19.076f, 20.977f),
                    PathNode.CurveTo(18.641f, 21.013f, 18.104f, 21.013f, 17.443f, 21.013f),
                    PathNode.LineTo(6.556f, 21.013f),
                    PathNode.CurveTo(5.895f, 21.013f, 5.357f, 21.013f, 4.922f, 20.977f),
                    PathNode.CurveTo(4.479f, 20.941f, 4.08f, 20.864f, 3.708f, 20.675f),
                    PathNode.CurveTo(3.125f, 20.378f, 2.651f, 19.903f, 2.354f, 19.32f),
                    PathNode.CurveTo(2.164f, 18.949f, 2.087f, 18.549f, 2.051f, 18.105f),
                    PathNode.CurveTo(2.015f, 17.67f, 2.016f, 17.132f, 2.016f, 16.473f),
                    PathNode.LineTo(2.016f, 10.672f),
                    PathNode.CurveTo(2.016f, 10.012f, 2.015f, 9.474f, 2.051f, 9.039f),
                    PathNode.CurveTo(2.087f, 8.596f, 2.164f, 8.196f, 2.354f, 7.824f),
                    PathNode.CurveTo(2.651f, 7.241f, 3.125f, 6.767f, 3.708f, 6.47f),
                    PathNode.CurveTo(4.08f, 6.28f, 4.479f, 6.203f, 4.922f, 6.167f),
                    PathNode.CurveTo(5.357f, 6.131f, 5.895f, 6.132f, 6.556f, 6.132f),
                    PathNode.LineTo(17.443f, 6.132f),
                    PathNode.Close,
                    PathNode.MoveTo(6.556f, 7.532f),
                    PathNode.CurveTo(5.872f, 7.532f, 5.401f, 7.533f, 5.036f, 7.562f),
                    PathNode.CurveTo(4.679f, 7.592f, 4.485f, 7.646f, 4.344f, 7.718f),
                    PathNode.CurveTo(4.024f, 7.881f, 3.764f, 8.14f, 3.601f, 8.46f),
                    PathNode.CurveTo(3.529f, 8.601f, 3.474f, 8.796f, 3.445f, 9.152f),
                    PathNode.CurveTo(3.416f, 9.517f, 3.415f, 9.989f, 3.415f, 10.672f),
                    PathNode.LineTo(3.415f, 16.473f),
                    PathNode.CurveTo(3.415f, 17.156f, 3.416f, 17.627f, 3.445f, 17.992f),
                    PathNode.CurveTo(3.474f, 18.348f, 3.529f, 18.543f, 3.601f, 18.685f),
                    PathNode.CurveTo(3.764f, 19.004f, 4.024f, 19.264f, 4.344f, 19.427f),
                    PathNode.CurveTo(4.485f, 19.499f, 4.68f, 19.553f, 5.036f, 19.582f),
                    PathNode.CurveTo(5.401f, 19.612f, 5.872f, 19.612f, 6.556f, 19.612f),
                    PathNode.LineTo(17.443f, 19.612f),
                    PathNode.CurveTo(18.127f, 19.612f, 18.598f, 19.612f, 18.963f, 19.582f),
                    PathNode.CurveTo(19.319f, 19.553f, 19.514f, 19.499f, 19.655f, 19.427f),
                    PathNode.CurveTo(19.975f, 19.264f, 20.235f, 19.004f, 20.398f, 18.685f),
                    PathNode.CurveTo(20.469f, 18.543f, 20.524f, 18.348f, 20.553f, 17.992f),
                    PathNode.CurveTo(20.582f, 17.627f, 20.583f, 17.156f, 20.583f, 16.473f),
                    PathNode.LineTo(20.583f, 10.672f),
                    PathNode.CurveTo(20.583f, 9.989f, 20.582f, 9.517f, 20.553f, 9.152f),
                    PathNode.CurveTo(20.524f, 8.796f, 20.469f, 8.601f, 20.398f, 8.46f),
                    PathNode.CurveTo(20.235f, 8.141f, 19.975f, 7.881f, 19.655f, 7.718f),
                    PathNode.CurveTo(19.514f, 7.646f, 19.319f, 7.592f, 18.963f, 7.562f),
                    PathNode.CurveTo(18.598f, 7.533f, 18.127f, 7.532f, 17.443f, 7.532f),
                    PathNode.LineTo(6.556f, 7.532f),
                    PathNode.Close,
                    PathNode.MoveTo(15.586f, 16.751f),
                    PathNode.CurveTo(15.972f, 16.751f, 16.286f, 17.065f, 16.286f, 17.451f),
                    PathNode.CurveTo(16.286f, 17.838f, 15.973f, 18.151f, 15.586f, 18.151f),
                    PathNode.LineTo(8.424f, 18.151f),
                    PathNode.CurveTo(8.037f, 18.151f, 7.724f, 17.838f, 7.724f, 17.451f),
                    PathNode.CurveTo(7.724f, 17.065f, 8.037f, 16.751f, 8.424f, 16.751f),
                    PathNode.LineTo(15.586f, 16.751f),
                    PathNode.Close,
                    PathNode.MoveTo(15.384f, 2.988f),
                    PathNode.CurveTo(16.044f, 2.988f, 16.581f, 2.988f, 17.017f, 3.023f),
                    PathNode.CurveTo(17.46f, 3.06f, 17.86f, 3.137f, 18.231f, 3.326f),
                    PathNode.CurveTo(18.814f, 3.623f, 19.289f, 4.098f, 19.586f, 4.681f),
                    PathNode.LineTo(19.587f, 4.683f),
                    PathNode.LineTo(4.409f, 4.683f),
                    PathNode.LineTo(4.41f, 4.681f),
                    PathNode.CurveTo(4.707f, 4.098f, 5.182f, 3.623f, 5.765f, 3.326f),
                    PathNode.CurveTo(6.136f, 3.137f, 6.535f, 3.06f, 6.979f, 3.023f),
                    PathNode.CurveTo(7.414f, 2.988f, 7.952f, 2.988f, 8.612f, 2.988f),
                    PathNode.LineTo(15.384f, 2.988f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _album!!
    }

private var _album: ImageVector? = null
