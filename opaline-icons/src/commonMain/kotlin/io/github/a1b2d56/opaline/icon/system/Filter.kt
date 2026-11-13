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

/** `photo_editor_ic_filter` */
val OpalineIcons.System.Filter: ImageVector
    get() {
        if (_filter != null) return _filter!!
        _filter = ImageVector.Builder(
            name = "Filter",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.682f, 10.929f),
                    PathNode.CurveTo(6.788f, 13.311f, 9.201f, 14.963f, 12.0f, 14.963f),
                    PathNode.CurveTo(12.232f, 14.963f, 12.461f, 14.95f, 12.688f, 14.928f),
                    PathNode.CurveTo(12.758f, 15.275f, 12.796f, 15.633f, 12.796f, 16.001f),
                    PathNode.CurveTo(12.796f, 18.964f, 10.394f, 21.366f, 7.431f, 21.366f),
                    PathNode.CurveTo(4.468f, 21.366f, 2.065f, 18.964f, 2.065f, 16.001f),
                    PathNode.CurveTo(2.066f, 13.651f, 3.578f, 11.654f, 5.682f, 10.929f),
                    PathNode.Close,
                    PathNode.MoveTo(18.318f, 10.929f),
                    PathNode.CurveTo(20.425f, 11.653f, 21.94f, 13.649f, 21.94f, 16.002f),
                    PathNode.CurveTo(21.94f, 18.965f, 19.538f, 21.366f, 16.575f, 21.366f),
                    PathNode.CurveTo(15.241f, 21.366f, 14.021f, 20.879f, 13.083f, 20.073f),
                    PathNode.CurveTo(13.909f, 18.928f, 14.398f, 17.524f, 14.398f, 16.005f),
                    PathNode.CurveTo(14.398f, 15.519f, 14.347f, 15.045f, 14.252f, 14.588f),
                    PathNode.CurveTo(16.054f, 13.972f, 17.523f, 12.64f, 18.318f, 10.929f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.363f),
                    PathNode.CurveTo(14.963f, 13.363f, 17.365f, 10.961f, 17.365f, 7.998f),
                    PathNode.CurveTo(17.365f, 5.035f, 14.963f, 2.633f, 12.0f, 2.633f),
                    PathNode.CurveTo(9.037f, 2.633f, 6.635f, 5.035f, 6.635f, 7.998f),
                    PathNode.CurveTo(6.635f, 10.961f, 9.037f, 13.363f, 12.0f, 13.363f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _filter!!
    }

private var _filter: ImageVector? = null
