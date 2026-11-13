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

/** `app_ic_sort` */
val OpalineIcons.System.Menu: ImageVector
    get() {
        if (_menu != null) return _menu!!
        _menu = ImageVector.Builder(
            name = "Menu",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 17.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _menu!!
    }

private var _menu: ImageVector? = null
