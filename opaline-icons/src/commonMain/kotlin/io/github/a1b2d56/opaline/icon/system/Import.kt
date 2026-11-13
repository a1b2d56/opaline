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

/** `pb_dr_menu_import_normal` */
val OpalineIcons.System.Import: ImageVector
    get() {
        if (_import != null) return _import!!
        _import = ImageVector.Builder(
            name = "Import",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.701f, 2.301f),
                    PathNode.CurveTo(20.805f, 2.301f, 21.701f, 3.196f, 21.701f, 4.301f),
                    PathNode.LineTo(21.701f, 19.701f),
                    PathNode.CurveTo(21.701f, 20.805f, 20.805f, 21.701f, 19.701f, 21.701f),
                    PathNode.LineTo(8.301f, 21.701f),
                    PathNode.CurveTo(7.196f, 21.701f, 6.301f, 20.805f, 6.301f, 19.701f),
                    PathNode.LineTo(6.301f, 18.001f),
                    PathNode.LineTo(7.701f, 18.001f),
                    PathNode.LineTo(7.701f, 19.701f),
                    PathNode.CurveTo(7.701f, 20.032f, 7.969f, 20.301f, 8.301f, 20.301f),
                    PathNode.LineTo(11.299f, 20.301f),
                    PathNode.LineTo(11.299f, 3.701f),
                    PathNode.LineTo(8.301f, 3.701f),
                    PathNode.CurveTo(7.969f, 3.701f, 7.701f, 3.969f, 7.701f, 4.301f),
                    PathNode.LineTo(7.701f, 6.001f),
                    PathNode.LineTo(6.301f, 6.001f),
                    PathNode.LineTo(6.301f, 4.301f),
                    PathNode.CurveTo(6.301f, 3.196f, 7.196f, 2.301f, 8.301f, 2.301f),
                    PathNode.LineTo(19.701f, 2.301f),
                    PathNode.Close,
                    PathNode.MoveTo(12.703f, 3.701f),
                    PathNode.LineTo(12.703f, 20.301f),
                    PathNode.LineTo(19.701f, 20.301f),
                    PathNode.CurveTo(20.032f, 20.301f, 20.301f, 20.032f, 20.301f, 19.701f),
                    PathNode.LineTo(20.301f, 4.301f),
                    PathNode.CurveTo(20.301f, 3.969f, 20.032f, 3.701f, 19.701f, 3.701f),
                    PathNode.LineTo(12.703f, 3.701f),
                    PathNode.Close,
                    PathNode.MoveTo(1.001f, 11.301f),
                    PathNode.CurveTo(0.614f, 11.301f, 0.301f, 11.614f, 0.301f, 12.001f),
                    PathNode.CurveTo(0.301f, 12.387f, 0.614f, 12.701f, 1.001f, 12.701f),
                    PathNode.LineTo(7.311f, 12.701f),
                    PathNode.LineTo(5.506f, 14.506f),
                    PathNode.CurveTo(5.232f, 14.779f, 5.232f, 15.222f, 5.506f, 15.496f),
                    PathNode.CurveTo(5.779f, 15.769f, 6.222f, 15.769f, 6.496f, 15.496f),
                    PathNode.LineTo(9.496f, 12.496f),
                    PathNode.CurveTo(9.769f, 12.222f, 9.769f, 11.779f, 9.496f, 11.506f),
                    PathNode.LineTo(6.496f, 8.506f),
                    PathNode.CurveTo(6.222f, 8.232f, 5.779f, 8.232f, 5.506f, 8.506f),
                    PathNode.CurveTo(5.232f, 8.779f, 5.232f, 9.222f, 5.506f, 9.496f),
                    PathNode.LineTo(7.311f, 11.301f),
                    PathNode.LineTo(1.001f, 11.301f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _import!!
    }

private var _import: ImageVector? = null
