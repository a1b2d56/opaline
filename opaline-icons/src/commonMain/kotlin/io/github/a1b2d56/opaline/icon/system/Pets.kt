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

/** `ic_group_cover_pets` */
val OpalineIcons.System.Pets: ImageVector
    get() {
        if (_pets != null) return _pets!!
        _pets = ImageVector.Builder(
            name = "Pets",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.216f, 2.0f),
                    PathNode.CurveTo(13.986f, 2.0f, 12.908f, 3.404f, 12.493f, 5.127f),
                    PathNode.CurveTo(12.043f, 6.993f, 12.46f, 8.801f, 14.369f, 9.168f),
                    PathNode.CurveTo(14.599f, 9.212f, 14.814f, 9.234f, 15.015f, 9.234f),
                    PathNode.CurveTo(16.489f, 9.234f, 17.22f, 8.071f, 17.401f, 6.071f),
                    PathNode.CurveTo(17.607f, 3.797f, 16.88f, 2.29f, 15.525f, 2.03f),
                    PathNode.CurveTo(15.423f, 2.01f, 15.319f, 2.0f, 15.216f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.13f, 2.129f),
                    PathNode.CurveTo(8.043f, 2.129f, 7.955f, 2.135f, 7.866f, 2.149f),
                    PathNode.CurveTo(6.503f, 2.358f, 5.846f, 4.075f, 5.846f, 5.996f),
                    PathNode.CurveTo(5.846f, 7.751f, 6.674f, 9.125f, 8.282f, 9.125f),
                    PathNode.CurveTo(8.435f, 9.125f, 8.594f, 9.113f, 8.761f, 9.087f),
                    PathNode.CurveTo(10.683f, 8.793f, 11.256f, 7.115f, 10.781f, 5.24f),
                    PathNode.CurveTo(10.337f, 3.488f, 9.367f, 2.128f, 8.13f, 2.129f),
                    PathNode.Close,
                    PathNode.MoveTo(19.845f, 7.948f),
                    PathNode.CurveTo(19.007f, 7.948f, 18.152f, 8.507f, 17.601f, 9.306f),
                    PathNode.CurveTo(16.863f, 10.377f, 16.971f, 11.882f, 18.335f, 12.764f),
                    PathNode.CurveTo(18.729f, 13.019f, 19.105f, 13.13f, 19.452f, 13.13f),
                    PathNode.CurveTo(20.308f, 13.13f, 20.999f, 12.459f, 21.415f, 11.611f),
                    PathNode.CurveTo(22.0f, 10.417f, 21.739f, 8.711f, 20.68f, 8.153f),
                    PathNode.CurveTo(20.412f, 8.012f, 20.13f, 7.948f, 19.845f, 7.948f),
                    PathNode.Close,
                    PathNode.MoveTo(3.685f, 8.364f),
                    PathNode.CurveTo(3.12f, 8.364f, 2.595f, 8.586f, 2.225f, 8.981f),
                    PathNode.CurveTo(1.463f, 9.795f, 1.6f, 11.443f, 2.393f, 12.526f),
                    PathNode.CurveTo(2.825f, 13.115f, 3.449f, 13.446f, 4.092f, 13.446f),
                    PathNode.CurveTo(4.63f, 13.446f, 5.181f, 13.215f, 5.645f, 12.709f),
                    PathNode.CurveTo(6.665f, 11.598f, 6.553f, 10.241f, 5.476f, 9.165f),
                    PathNode.CurveTo(4.924f, 8.612f, 4.282f, 8.364f, 3.685f, 8.364f),
                    PathNode.Close,
                    PathNode.MoveTo(12.073f, 9.885f),
                    PathNode.CurveTo(12.063f, 9.885f, 12.053f, 9.885f, 12.043f, 9.885f),
                    PathNode.CurveTo(10.016f, 9.905f, 7.825f, 11.912f, 5.47f, 15.906f),
                    PathNode.CurveTo(4.549f, 17.469f, 4.791f, 19.526f, 6.044f, 20.784f),
                    PathNode.LineTo(6.431f, 21.174f),
                    PathNode.CurveTo(6.976f, 21.721f, 7.673f, 22.0f, 8.374f, 22.0f),
                    PathNode.CurveTo(8.946f, 22.0f, 9.52f, 21.814f, 10.016f, 21.435f),
                    PathNode.LineTo(10.221f, 21.279f),
                    PathNode.CurveTo(10.716f, 20.901f, 11.305f, 20.699f, 11.909f, 20.699f),
                    PathNode.CurveTo(12.497f, 20.699f, 13.086f, 20.891f, 13.591f, 21.275f),
                    PathNode.LineTo(13.723f, 21.375f),
                    PathNode.CurveTo(14.214f, 21.747f, 14.782f, 21.931f, 15.349f, 21.931f),
                    PathNode.CurveTo(16.017f, 21.931f, 16.682f, 21.676f, 17.214f, 21.173f),
                    PathNode.LineTo(17.767f, 20.652f),
                    PathNode.CurveTo(19.102f, 19.39f, 19.386f, 17.25f, 18.433f, 15.628f),
                    PathNode.CurveTo(16.184f, 11.799f, 14.064f, 9.885f, 12.073f, 9.885f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _pets!!
    }

private var _pets: ImageVector? = null
