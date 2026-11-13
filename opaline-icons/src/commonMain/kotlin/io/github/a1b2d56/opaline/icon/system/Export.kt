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

/** `pb_dr_menu_export_normal` */
val OpalineIcons.System.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = ImageVector.Builder(
            name = "Export",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.301f, 2.301f),
                    PathNode.CurveTo(3.196f, 2.301f, 2.301f, 3.196f, 2.301f, 4.301f),
                    PathNode.LineTo(2.301f, 19.701f),
                    PathNode.CurveTo(2.301f, 20.805f, 3.196f, 21.701f, 4.301f, 21.701f),
                    PathNode.LineTo(15.701f, 21.701f),
                    PathNode.CurveTo(16.805f, 21.701f, 17.701f, 20.805f, 17.701f, 19.701f),
                    PathNode.LineTo(17.701f, 15.001f),
                    PathNode.LineTo(16.301f, 15.001f),
                    PathNode.LineTo(16.301f, 19.701f),
                    PathNode.CurveTo(16.301f, 20.032f, 16.032f, 20.301f, 15.701f, 20.301f),
                    PathNode.LineTo(12.703f, 20.301f),
                    PathNode.LineTo(12.703f, 3.701f),
                    PathNode.LineTo(15.701f, 3.701f),
                    PathNode.CurveTo(16.032f, 3.701f, 16.301f, 3.969f, 16.301f, 4.301f),
                    PathNode.LineTo(16.301f, 9.001f),
                    PathNode.LineTo(17.701f, 9.001f),
                    PathNode.LineTo(17.701f, 4.301f),
                    PathNode.CurveTo(17.701f, 3.196f, 16.805f, 2.301f, 15.701f, 2.301f),
                    PathNode.LineTo(4.301f, 2.301f),
                    PathNode.Close,
                    PathNode.MoveTo(11.299f, 3.701f),
                    PathNode.LineTo(4.301f, 3.701f),
                    PathNode.CurveTo(3.969f, 3.701f, 3.701f, 3.969f, 3.701f, 4.301f),
                    PathNode.LineTo(3.701f, 19.701f),
                    PathNode.CurveTo(3.701f, 20.032f, 3.969f, 20.301f, 4.301f, 20.301f),
                    PathNode.LineTo(11.299f, 20.301f),
                    PathNode.LineTo(11.299f, 3.701f),
                    PathNode.Close,
                    PathNode.MoveTo(15.001f, 11.301f),
                    PathNode.CurveTo(14.614f, 11.301f, 14.301f, 11.614f, 14.301f, 12.001f),
                    PathNode.CurveTo(14.301f, 12.387f, 14.614f, 12.701f, 15.001f, 12.701f),
                    PathNode.LineTo(21.311f, 12.701f),
                    PathNode.LineTo(19.506f, 14.506f),
                    PathNode.CurveTo(19.232f, 14.779f, 19.232f, 15.222f, 19.506f, 15.496f),
                    PathNode.CurveTo(19.779f, 15.769f, 20.222f, 15.769f, 20.496f, 15.496f),
                    PathNode.LineTo(23.496f, 12.496f),
                    PathNode.CurveTo(23.769f, 12.222f, 23.769f, 11.779f, 23.496f, 11.506f),
                    PathNode.LineTo(20.496f, 8.506f),
                    PathNode.CurveTo(20.222f, 8.232f, 19.779f, 8.232f, 19.506f, 8.506f),
                    PathNode.CurveTo(19.232f, 8.779f, 19.232f, 9.222f, 19.506f, 9.496f),
                    PathNode.LineTo(21.311f, 11.301f),
                    PathNode.LineTo(15.001f, 11.301f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _export!!
    }

private var _export: ImageVector? = null
