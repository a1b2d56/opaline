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

/** `tab_stopwatch` */
val OpalineIcons.System.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) return _stopwatch!!
        _stopwatch = ImageVector.Builder(
            name = "Stopwatch",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.107f, 1.806f),
                    PathNode.CurveTo(13.451f, 1.806f, 13.623f, 1.806f, 13.763f, 1.848f),
                    PathNode.CurveTo(14.086f, 1.945f, 14.338f, 2.197f, 14.435f, 2.52f),
                    PathNode.CurveTo(14.476f, 2.66f, 14.477f, 2.832f, 14.477f, 3.175f),
                    PathNode.CurveTo(14.477f, 3.29f, 14.477f, 3.347f, 14.463f, 3.394f),
                    PathNode.CurveTo(14.431f, 3.502f, 14.346f, 3.586f, 14.238f, 3.618f),
                    PathNode.CurveTo(14.192f, 3.632f, 14.135f, 3.631f, 14.021f, 3.631f),
                    PathNode.LineTo(13.123f, 3.631f),
                    PathNode.CurveTo(13.042f, 3.631f, 12.977f, 3.697f, 12.977f, 3.778f),
                    PathNode.CurveTo(12.977f, 3.853f, 13.033f, 3.916f, 13.107f, 3.925f),
                    PathNode.CurveTo(14.496f, 4.097f, 15.786f, 4.585f, 16.905f, 5.318f),
                    PathNode.CurveTo(17.147f, 5.476f, 17.268f, 5.556f, 17.387f, 5.569f),
                    PathNode.CurveTo(17.414f, 5.572f, 17.437f, 5.573f, 17.465f, 5.572f),
                    PathNode.CurveTo(17.584f, 5.566f, 17.701f, 5.5f, 17.934f, 5.369f),
                    PathNode.CurveTo(18.208f, 5.214f, 18.345f, 5.136f, 18.488f, 5.142f),
                    PathNode.CurveTo(18.519f, 5.143f, 18.551f, 5.148f, 18.581f, 5.155f),
                    PathNode.CurveTo(18.721f, 5.188f, 18.831f, 5.3f, 19.052f, 5.524f),
                    PathNode.LineTo(19.479f, 5.958f),
                    PathNode.CurveTo(19.671f, 6.153f, 19.768f, 6.251f, 19.804f, 6.369f),
                    PathNode.CurveTo(19.823f, 6.433f, 19.83f, 6.5f, 19.823f, 6.566f),
                    PathNode.CurveTo(19.81f, 6.689f, 19.734f, 6.803f, 19.581f, 7.032f),
                    PathNode.CurveTo(19.45f, 7.228f, 19.384f, 7.327f, 19.365f, 7.429f),
                    PathNode.CurveTo(19.355f, 7.488f, 19.354f, 7.539f, 19.363f, 7.598f),
                    PathNode.CurveTo(19.38f, 7.701f, 19.45f, 7.809f, 19.589f, 8.025f),
                    PathNode.CurveTo(20.515f, 9.464f, 21.053f, 11.182f, 21.053f, 13.025f),
                    PathNode.CurveTo(21.053f, 18.078f, 17.011f, 22.194f, 12.0f, 22.194f),
                    PathNode.CurveTo(6.989f, 22.194f, 2.947f, 18.078f, 2.947f, 13.025f),
                    PathNode.CurveTo(2.947f, 8.368f, 6.381f, 4.508f, 10.843f, 3.932f),
                    PathNode.CurveTo(10.918f, 3.922f, 10.976f, 3.858f, 10.977f, 3.782f),
                    PathNode.CurveTo(10.977f, 3.699f, 10.909f, 3.631f, 10.826f, 3.631f),
                    PathNode.LineTo(9.933f, 3.631f),
                    PathNode.CurveTo(9.819f, 3.631f, 9.761f, 3.632f, 9.715f, 3.618f),
                    PathNode.CurveTo(9.607f, 3.586f, 9.522f, 3.502f, 9.49f, 3.394f),
                    PathNode.CurveTo(9.476f, 3.347f, 9.477f, 3.29f, 9.477f, 3.175f),
                    PathNode.CurveTo(9.477f, 2.832f, 9.477f, 2.66f, 9.519f, 2.52f),
                    PathNode.CurveTo(9.615f, 2.197f, 9.868f, 1.945f, 10.19f, 1.848f),
                    PathNode.CurveTo(10.33f, 1.806f, 10.502f, 1.806f, 10.846f, 1.806f),
                    PathNode.LineTo(13.107f, 1.806f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 5.555f),
                    PathNode.CurveTo(7.95f, 5.555f, 4.647f, 8.889f, 4.646f, 13.025f),
                    PathNode.CurveTo(4.647f, 17.161f, 7.95f, 20.494f, 12.0f, 20.494f),
                    PathNode.CurveTo(16.05f, 20.494f, 19.354f, 17.161f, 19.354f, 13.025f),
                    PathNode.CurveTo(19.353f, 8.889f, 16.05f, 5.555f, 12.0f, 5.555f),
                    PathNode.Close,
                    PathNode.MoveTo(11.933f, 6.837f),
                    PathNode.CurveTo(12.078f, 6.837f, 12.218f, 6.895f, 12.329f, 6.998f),
                    PathNode.CurveTo(12.44f, 7.1f, 12.513f, 7.239f, 12.524f, 7.384f),
                    PathNode.CurveTo(12.531f, 7.469f, 12.538f, 7.554f, 12.545f, 7.638f),
                    PathNode.CurveTo(12.667f, 9.159f, 12.79f, 10.681f, 12.912f, 12.202f),
                    PathNode.CurveTo(12.919f, 12.286f, 12.926f, 12.37f, 12.933f, 12.455f),
                    PathNode.CurveTo(12.954f, 12.72f, 12.868f, 12.975f, 12.68f, 13.163f),
                    PathNode.CurveTo(12.493f, 13.35f, 12.219f, 13.455f, 11.933f, 13.455f),
                    PathNode.CurveTo(11.646f, 13.455f, 11.373f, 13.35f, 11.186f, 13.163f),
                    PathNode.CurveTo(10.998f, 12.975f, 10.911f, 12.72f, 10.933f, 12.455f),
                    PathNode.CurveTo(10.939f, 12.37f, 10.946f, 12.286f, 10.953f, 12.202f),
                    PathNode.CurveTo(11.075f, 10.681f, 11.198f, 9.159f, 11.32f, 7.638f),
                    PathNode.CurveTo(11.327f, 7.554f, 11.334f, 7.469f, 11.341f, 7.384f),
                    PathNode.CurveTo(11.353f, 7.239f, 11.425f, 7.1f, 11.536f, 6.998f),
                    PathNode.CurveTo(11.647f, 6.895f, 11.788f, 6.837f, 11.933f, 6.837f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
