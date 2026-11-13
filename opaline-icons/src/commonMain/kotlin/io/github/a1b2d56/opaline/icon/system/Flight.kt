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

/** `ic_group_cover_travel` */
val OpalineIcons.System.Flight: ImageVector
    get() {
        if (_flight != null) return _flight!!
        _flight = ImageVector.Builder(
            name = "Flight",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.473f, 1.193f),
                    PathNode.CurveTo(9.928f, 1.193f, 10.356f, 1.412f, 10.622f, 1.781f),
                    PathNode.LineTo(16.145f, 9.427f),
                    PathNode.CurveTo(16.431f, 9.756f, 16.587f, 9.821f, 17.107f, 9.821f),
                    PathNode.LineTo(19.368f, 9.817f),
                    PathNode.LineTo(19.748f, 9.828f),
                    PathNode.CurveTo(21.617f, 9.936f, 22.99f, 10.834f, 23.0f, 12.0f),
                    PathNode.CurveTo(22.999f, 12.153f, 22.973f, 12.302f, 22.925f, 12.445f),
                    PathNode.CurveTo(22.9f, 12.517f, 22.87f, 12.588f, 22.835f, 12.657f),
                    PathNode.CurveTo(22.588f, 13.139f, 22.079f, 13.545f, 21.405f, 13.817f),
                    PathNode.CurveTo(21.309f, 13.856f, 21.209f, 13.892f, 21.107f, 13.926f),
                    PathNode.CurveTo(21.004f, 13.959f, 20.898f, 13.989f, 20.789f, 14.017f),
                    PathNode.CurveTo(20.681f, 14.044f, 20.569f, 14.068f, 20.455f, 14.089f),
                    PathNode.CurveTo(20.113f, 14.152f, 19.748f, 14.186f, 19.368f, 14.186f),
                    PathNode.LineTo(17.107f, 14.185f),
                    PathNode.CurveTo(16.587f, 14.185f, 16.431f, 14.248f, 16.13f, 14.587f),
                    PathNode.LineTo(10.627f, 22.219f),
                    PathNode.CurveTo(10.361f, 22.588f, 9.932f, 22.807f, 9.477f, 22.807f),
                    PathNode.LineTo(8.59f, 22.807f),
                    PathNode.CurveTo(8.202f, 22.806f, 7.92f, 22.439f, 8.02f, 22.065f),
                    PathNode.LineTo(10.113f, 14.163f),
                    PathNode.LineTo(5.255f, 13.9f),
                    PathNode.LineTo(3.412f, 15.933f),
                    PathNode.CurveTo(3.353f, 15.998f, 3.287f, 16.057f, 3.216f, 16.108f),
                    PathNode.CurveTo(3.136f, 16.166f, 3.048f, 16.213f, 2.957f, 16.25f),
                    PathNode.CurveTo(2.888f, 16.278f, 2.817f, 16.302f, 2.743f, 16.317f),
                    PathNode.CurveTo(2.701f, 16.326f, 2.658f, 16.333f, 2.614f, 16.338f),
                    PathNode.CurveTo(2.57f, 16.343f, 2.526f, 16.346f, 2.481f, 16.346f),
                    PathNode.LineTo(1.567f, 16.346f),
                    PathNode.CurveTo(1.41f, 16.346f, 1.273f, 16.283f, 1.173f, 16.185f),
                    PathNode.CurveTo(1.14f, 16.153f, 1.11f, 16.117f, 1.086f, 16.077f),
                    PathNode.CurveTo(1.061f, 16.038f, 1.042f, 15.995f, 1.027f, 15.95f),
                    PathNode.CurveTo(1.02f, 15.928f, 1.014f, 15.906f, 1.01f, 15.883f),
                    PathNode.CurveTo(0.992f, 15.791f, 0.998f, 15.693f, 1.031f, 15.597f),
                    PathNode.CurveTo(1.039f, 15.573f, 1.049f, 15.55f, 1.061f, 15.526f),
                    PathNode.LineTo(2.823f, 12.002f),
                    PathNode.LineTo(1.061f, 8.477f),
                    PathNode.CurveTo(1.014f, 8.383f, 0.995f, 8.285f, 1.001f, 8.19f),
                    PathNode.CurveTo(1.014f, 7.978f, 1.148f, 7.785f, 1.348f, 7.701f),
                    PathNode.CurveTo(1.414f, 7.673f, 1.488f, 7.657f, 1.567f, 7.657f),
                    PathNode.LineTo(2.481f, 7.657f),
                    PathNode.CurveTo(2.836f, 7.657f, 3.174f, 7.807f, 3.412f, 8.069f),
                    PathNode.LineTo(5.255f, 10.102f),
                    PathNode.LineTo(10.108f, 9.843f),
                    PathNode.LineTo(8.014f, 1.936f),
                    PathNode.CurveTo(7.915f, 1.561f, 8.197f, 1.193f, 8.585f, 1.193f),
                    PathNode.LineTo(9.473f, 1.193f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _flight!!
    }

private var _flight: ImageVector? = null
