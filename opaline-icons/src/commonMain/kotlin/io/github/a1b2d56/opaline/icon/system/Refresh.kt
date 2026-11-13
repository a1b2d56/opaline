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

/** `agent_fb_refresh` */
val OpalineIcons.System.Refresh: ImageVector
    get() {
        if (_refresh != null) return _refresh!!
        _refresh = ImageVector.Builder(
            name = "Refresh",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.25f, 1.697f),
                    PathNode.CurveTo(15.863f, 1.697f, 15.55f, 2.01f, 15.55f, 2.397f),
                    PathNode.LineTo(15.55f, 4.067f),
                    PathNode.CurveTo(14.599f, 3.192f, 13.448f, 2.547f, 12.186f, 2.198f),
                    PathNode.CurveTo(10.29f, 1.674f, 8.269f, 1.848f, 6.492f, 2.689f),
                    PathNode.CurveTo(4.715f, 3.53f, 3.299f, 4.982f, 2.503f, 6.78f),
                    PathNode.CurveTo(1.707f, 8.577f, 1.582f, 10.601f, 2.153f, 12.483f),
                    PathNode.CurveTo(2.724f, 14.364f, 3.952f, 15.978f, 5.613f, 17.029f),
                    PathNode.CurveTo(7.275f, 18.081f, 9.259f, 18.501f, 11.204f, 18.212f),
                    PathNode.CurveTo(13.149f, 17.923f, 14.925f, 16.945f, 16.209f, 15.456f),
                    PathNode.CurveTo(17.493f, 13.967f, 18.2f, 12.067f, 18.2f, 10.101f),
                    PathNode.CurveTo(18.2f, 9.714f, 17.886f, 9.401f, 17.5f, 9.401f),
                    PathNode.CurveTo(17.114f, 9.401f, 16.8f, 9.714f, 16.8f, 10.101f),
                    PathNode.CurveTo(16.8f, 11.731f, 16.214f, 13.308f, 15.149f, 14.542f),
                    PathNode.CurveTo(14.085f, 15.777f, 12.611f, 16.588f, 10.998f, 16.827f),
                    PathNode.CurveTo(9.385f, 17.067f, 7.74f, 16.718f, 6.362f, 15.846f),
                    PathNode.CurveTo(4.985f, 14.974f, 3.967f, 13.635f, 3.493f, 12.075f),
                    PathNode.CurveTo(3.02f, 10.515f, 3.123f, 8.837f, 3.783f, 7.346f),
                    PathNode.CurveTo(4.444f, 5.855f, 5.618f, 4.652f, 7.092f, 3.954f),
                    PathNode.CurveTo(8.565f, 3.257f, 10.241f, 3.113f, 11.813f, 3.547f),
                    PathNode.CurveTo(12.923f, 3.854f, 13.929f, 4.438f, 14.744f, 5.232f),
                    PathNode.LineTo(12.714f, 5.232f),
                    PathNode.LineTo(12.572f, 5.246f),
                    PathNode.CurveTo(12.254f, 5.312f, 12.014f, 5.594f, 12.014f, 5.932f),
                    PathNode.CurveTo(12.014f, 6.27f, 12.254f, 6.552f, 12.572f, 6.617f),
                    PathNode.LineTo(12.714f, 6.632f),
                    PathNode.LineTo(16.25f, 6.632f),
                    PathNode.CurveTo(16.636f, 6.632f, 16.95f, 6.318f, 16.95f, 5.932f),
                    PathNode.LineTo(16.95f, 2.397f),
                    PathNode.CurveTo(16.95f, 2.01f, 16.636f, 1.697f, 16.25f, 1.697f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
