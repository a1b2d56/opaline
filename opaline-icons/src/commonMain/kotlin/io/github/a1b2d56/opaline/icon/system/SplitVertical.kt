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

/** `oplus_flexible_two_layout_vertical_icon` */
val OpalineIcons.System.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = ImageVector.Builder(
            name = "SplitVertical",
            defaultWidth = 25.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.199f, 21.7f),
                    PathNode.CurveTo(21.303f, 21.7f, 22.199f, 20.805f, 22.199f, 19.7f),
                    PathNode.LineTo(22.199f, 12.001f),
                    PathNode.CurveTo(22.199f, 12.001f, 22.199f, 12.001f, 22.199f, 12.0f),
                    PathNode.CurveTo(22.199f, 12.0f, 22.199f, 11.999f, 22.199f, 11.999f),
                    PathNode.LineTo(22.199f, 4.3f),
                    PathNode.CurveTo(22.199f, 3.196f, 21.303f, 2.3f, 20.199f, 2.3f),
                    PathNode.LineTo(4.799f, 2.3f),
                    PathNode.CurveTo(3.694f, 2.3f, 2.799f, 3.196f, 2.799f, 4.3f),
                    PathNode.LineTo(2.799f, 19.7f),
                    PathNode.CurveTo(2.799f, 20.805f, 3.694f, 21.7f, 4.799f, 21.7f),
                    PathNode.LineTo(20.199f, 21.7f),
                    PathNode.Close,
                    PathNode.MoveTo(20.799f, 11.3f),
                    PathNode.LineTo(20.799f, 4.3f),
                    PathNode.CurveTo(20.799f, 3.969f, 20.53f, 3.7f, 20.199f, 3.7f),
                    PathNode.LineTo(4.799f, 3.7f),
                    PathNode.CurveTo(4.467f, 3.7f, 4.199f, 3.969f, 4.199f, 4.3f),
                    PathNode.LineTo(4.199f, 11.3f),
                    PathNode.LineTo(20.799f, 11.3f),
                    PathNode.Close,
                    PathNode.MoveTo(4.199f, 12.7f),
                    PathNode.LineTo(4.199f, 19.7f),
                    PathNode.CurveTo(4.199f, 20.032f, 4.467f, 20.3f, 4.799f, 20.3f),
                    PathNode.LineTo(20.199f, 20.3f),
                    PathNode.CurveTo(20.53f, 20.3f, 20.799f, 20.032f, 20.799f, 19.7f),
                    PathNode.LineTo(20.799f, 12.7f),
                    PathNode.LineTo(4.199f, 12.7f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
