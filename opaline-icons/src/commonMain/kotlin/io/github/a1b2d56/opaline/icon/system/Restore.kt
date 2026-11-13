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

/** `color_tool_menu_recycle_bin_restore_disable` */
val OpalineIcons.System.Restore: ImageVector
    get() {
        if (_restore != null) return _restore!!
        _restore = ImageVector.Builder(
            name = "Restore",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.742f, 7.82f),
                    PathNode.CurveTo(9.129f, 7.82f, 9.442f, 7.506f, 9.442f, 7.12f),
                    PathNode.CurveTo(9.442f, 6.733f, 9.129f, 6.42f, 8.742f, 6.42f),
                    PathNode.LineTo(5.969f, 6.42f),
                    PathNode.CurveTo(7.003f, 5.327f, 8.321f, 4.528f, 9.788f, 4.123f),
                    PathNode.CurveTo(11.706f, 3.593f, 13.751f, 3.769f, 15.55f, 4.62f),
                    PathNode.CurveTo(17.349f, 5.472f, 18.782f, 6.941f, 19.588f, 8.761f),
                    PathNode.CurveTo(20.395f, 10.58f, 20.52f, 12.629f, 19.942f, 14.533f),
                    PathNode.CurveTo(19.364f, 16.438f, 18.121f, 18.071f, 16.44f, 19.136f),
                    PathNode.CurveTo(14.758f, 20.2f, 12.75f, 20.625f, 10.781f, 20.333f),
                    PathNode.CurveTo(8.813f, 20.041f, 7.015f, 19.051f, 5.715f, 17.544f),
                    PathNode.CurveTo(4.415f, 16.037f, 3.7f, 14.113f, 3.7f, 12.123f),
                    PathNode.CurveTo(3.7f, 11.736f, 3.386f, 11.423f, 3.0f, 11.423f),
                    PathNode.CurveTo(2.613f, 11.423f, 2.3f, 11.736f, 2.3f, 12.123f),
                    PathNode.CurveTo(2.3f, 14.449f, 3.136f, 16.697f, 4.655f, 18.458f),
                    PathNode.CurveTo(6.174f, 20.219f, 8.275f, 21.376f, 10.576f, 21.718f),
                    PathNode.CurveTo(12.877f, 22.059f, 15.223f, 21.563f, 17.188f, 20.318f),
                    PathNode.CurveTo(19.154f, 19.074f, 20.606f, 17.166f, 21.282f, 14.94f),
                    PathNode.CurveTo(21.957f, 12.714f, 21.81f, 10.32f, 20.868f, 8.194f),
                    PathNode.CurveTo(19.926f, 6.067f, 18.251f, 4.35f, 16.149f, 3.355f),
                    PathNode.CurveTo(14.047f, 2.36f, 11.657f, 2.154f, 9.415f, 2.774f),
                    PathNode.CurveTo(7.816f, 3.216f, 6.368f, 4.057f, 5.2f, 5.205f),
                    PathNode.LineTo(5.2f, 2.877f),
                    PathNode.CurveTo(5.2f, 2.491f, 4.886f, 2.177f, 4.5f, 2.177f),
                    PathNode.CurveTo(4.113f, 2.177f, 3.8f, 2.491f, 3.8f, 2.877f),
                    PathNode.LineTo(3.8f, 7.12f),
                    PathNode.CurveTo(3.8f, 7.499f, 4.101f, 7.808f, 4.478f, 7.82f),
                    PathNode.CurveTo(4.502f, 7.821f, 4.526f, 7.821f, 4.55f, 7.82f),
                    PathNode.LineTo(8.742f, 7.82f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _restore!!
    }

private var _restore: ImageVector? = null
