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

/** `qs_icon_sim_2` */
val OpalineIcons.System.Sim2: ImageVector
    get() {
        if (_sim2 != null) return _sim2!!
        _sim2 = ImageVector.Builder(
            name = "Sim2",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.124f, 1.886f),
                    PathNode.CurveTo(8.499f, 1.511f, 9.008f, 1.3f, 9.538f, 1.3f),
                    PathNode.LineTo(18.7f, 1.3f),
                    PathNode.CurveTo(19.804f, 1.3f, 20.7f, 2.195f, 20.7f, 3.3f),
                    PathNode.LineTo(20.7f, 6.0f),
                    PathNode.LineTo(20.7f, 19.0f),
                    PathNode.LineTo(20.7f, 20.7f),
                    PathNode.CurveTo(20.7f, 21.804f, 19.804f, 22.7f, 18.7f, 22.7f),
                    PathNode.LineTo(5.3f, 22.7f),
                    PathNode.CurveTo(4.195f, 22.7f, 3.3f, 21.804f, 3.3f, 20.7f),
                    PathNode.LineTo(3.3f, 7.538f),
                    PathNode.CurveTo(3.3f, 7.008f, 3.511f, 6.499f, 3.886f, 6.124f),
                    PathNode.LineTo(8.124f, 1.886f),
                    PathNode.Close,
                    PathNode.MoveTo(9.341f, 15.283f),
                    PathNode.CurveTo(9.102f, 15.752f, 8.958f, 16.295f, 8.909f, 16.912f),
                    PathNode.LineTo(15.748f, 16.912f),
                    PathNode.LineTo(15.748f, 15.208f),
                    PathNode.LineTo(11.761f, 15.208f),
                    PathNode.CurveTo(11.851f, 15.011f, 12.024f, 14.793f, 12.279f, 14.554f),
                    PathNode.CurveTo(12.535f, 14.307f, 12.851f, 14.031f, 13.23f, 13.727f),
                    PathNode.LineTo(13.489f, 13.517f),
                    PathNode.CurveTo(13.925f, 13.171f, 14.238f, 12.912f, 14.427f, 12.739f),
                    PathNode.CurveTo(14.617f, 12.558f, 14.823f, 12.278f, 15.045f, 11.9f),
                    PathNode.CurveTo(15.267f, 11.521f, 15.378f, 11.093f, 15.378f, 10.616f),
                    PathNode.CurveTo(15.378f, 10.089f, 15.246f, 9.624f, 14.983f, 9.221f),
                    PathNode.CurveTo(14.728f, 8.809f, 14.362f, 8.488f, 13.884f, 8.258f),
                    PathNode.CurveTo(13.407f, 8.027f, 12.851f, 7.912f, 12.218f, 7.912f),
                    PathNode.CurveTo(11.395f, 7.912f, 10.703f, 8.056f, 10.144f, 8.344f),
                    PathNode.CurveTo(9.592f, 8.624f, 9.172f, 8.912f, 8.884f, 9.208f),
                    PathNode.LineTo(9.835f, 10.591f),
                    PathNode.CurveTo(10.131f, 10.295f, 10.448f, 10.06f, 10.785f, 9.887f),
                    PathNode.CurveTo(11.131f, 9.706f, 11.481f, 9.616f, 11.835f, 9.616f),
                    PathNode.CurveTo(12.238f, 9.616f, 12.576f, 9.71f, 12.847f, 9.9f),
                    PathNode.CurveTo(13.119f, 10.089f, 13.255f, 10.373f, 13.255f, 10.752f),
                    PathNode.CurveTo(13.255f, 11.056f, 13.135f, 11.344f, 12.897f, 11.616f),
                    PathNode.CurveTo(12.658f, 11.887f, 12.283f, 12.233f, 11.773f, 12.653f),
                    PathNode.LineTo(11.427f, 12.937f),
                    PathNode.CurveTo(11.436f, 12.929f, 11.366f, 12.986f, 11.218f, 13.11f),
                    PathNode.CurveTo(10.798f, 13.464f, 10.44f, 13.797f, 10.144f, 14.11f),
                    PathNode.CurveTo(9.855f, 14.414f, 9.588f, 14.805f, 9.341f, 15.283f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _sim2!!
    }

private var _sim2: ImageVector? = null
