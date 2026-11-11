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

/** `oplus_flexible_two_layout_horizontal_icon` */
val OpalineIcons.System.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = ImageVector.Builder(
            name = "SplitHorizontal",
            defaultWidth = 25.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.801f, 19.7f),
                    PathNode.CurveTo(2.801f, 20.804f, 3.696f, 21.7f, 4.801f, 21.7f),
                    PathNode.LineTo(12.5f, 21.7f),
                    PathNode.CurveTo(12.5f, 21.7f, 12.5f, 21.7f, 12.501f, 21.7f),
                    PathNode.CurveTo(12.501f, 21.7f, 12.502f, 21.7f, 12.502f, 21.7f),
                    PathNode.LineTo(20.201f, 21.7f),
                    PathNode.CurveTo(21.305f, 21.7f, 22.201f, 20.804f, 22.201f, 19.7f),
                    PathNode.LineTo(22.201f, 4.3f),
                    PathNode.CurveTo(22.201f, 3.195f, 21.305f, 2.3f, 20.201f, 2.3f),
                    PathNode.LineTo(4.801f, 2.3f),
                    PathNode.CurveTo(3.696f, 2.3f, 2.801f, 3.195f, 2.801f, 4.3f),
                    PathNode.LineTo(2.801f, 19.7f),
                    PathNode.Close,
                    PathNode.MoveTo(13.201f, 20.3f),
                    PathNode.LineTo(20.201f, 20.3f),
                    PathNode.CurveTo(20.532f, 20.3f, 20.801f, 20.031f, 20.801f, 19.7f),
                    PathNode.LineTo(20.801f, 4.3f),
                    PathNode.CurveTo(20.801f, 3.968f, 20.532f, 3.7f, 20.201f, 3.7f),
                    PathNode.LineTo(13.201f, 3.7f),
                    PathNode.LineTo(13.201f, 20.3f),
                    PathNode.Close,
                    PathNode.MoveTo(11.801f, 3.7f),
                    PathNode.LineTo(4.801f, 3.7f),
                    PathNode.CurveTo(4.469f, 3.7f, 4.201f, 3.968f, 4.201f, 4.3f),
                    PathNode.LineTo(4.201f, 19.7f),
                    PathNode.CurveTo(4.201f, 20.031f, 4.469f, 20.3f, 4.801f, 20.3f),
                    PathNode.LineTo(11.801f, 20.3f),
                    PathNode.LineTo(11.801f, 3.7f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
