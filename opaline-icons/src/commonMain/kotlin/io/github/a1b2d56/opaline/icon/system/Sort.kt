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

/** `coui_preference_category_fold` */
val OpalineIcons.System.Sort: ImageVector
    get() {
        if (_sort != null) return _sort!!
        _sort = ImageVector.Builder(
            name = "Sort",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.25f, 14.833f),
                    PathNode.LineTo(12.25f, 16.385f),
                    PathNode.LineTo(13.375f, 15.317f),
                    PathNode.LineTo(15.563f, 13.241f),
                    PathNode.LineTo(14.645f, 12.274f),
                    PathNode.LineTo(13.583f, 13.281f),
                    PathNode.LineTo(13.583f, 4.736f),
                    PathNode.LineTo(12.25f, 4.736f),
                    PathNode.LineTo(12.25f, 14.833f),
                    PathNode.Close,
                    PathNode.MoveTo(4.167f, 6.855f),
                    PathNode.LineTo(10.0f, 6.855f),
                    PathNode.LineTo(10.0f, 5.521f),
                    PathNode.LineTo(4.167f, 5.521f),
                    PathNode.LineTo(4.167f, 6.855f),
                    PathNode.Close,
                    PathNode.MoveTo(4.167f, 10.5f),
                    PathNode.LineTo(10.729f, 10.5f),
                    PathNode.LineTo(10.729f, 9.167f),
                    PathNode.LineTo(4.167f, 9.167f),
                    PathNode.LineTo(4.167f, 10.5f),
                    PathNode.Close,
                    PathNode.MoveTo(11.458f, 14.146f),
                    PathNode.LineTo(4.167f, 14.146f),
                    PathNode.LineTo(4.167f, 12.813f),
                    PathNode.LineTo(11.458f, 12.813f),
                    PathNode.LineTo(11.458f, 14.146f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _sort!!
    }

private var _sort: ImageVector? = null
