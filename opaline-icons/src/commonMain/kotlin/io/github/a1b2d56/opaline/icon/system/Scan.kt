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

/** `pb_dr_menu_scan_card_normal` */
val OpalineIcons.System.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = ImageVector.Builder(
            name = "Scan",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.801f, 4.901f),
                    PathNode.CurveTo(2.801f, 3.741f, 3.741f, 2.801f, 4.901f, 2.801f),
                    PathNode.LineTo(8.001f, 2.801f),
                    PathNode.CurveTo(8.387f, 2.801f, 8.701f, 3.114f, 8.701f, 3.501f),
                    PathNode.CurveTo(8.701f, 3.887f, 8.387f, 4.201f, 8.001f, 4.201f),
                    PathNode.LineTo(4.901f, 4.201f),
                    PathNode.CurveTo(4.514f, 4.201f, 4.201f, 4.514f, 4.201f, 4.901f),
                    PathNode.LineTo(4.201f, 8.001f),
                    PathNode.CurveTo(4.201f, 8.387f, 3.887f, 8.701f, 3.501f, 8.701f),
                    PathNode.CurveTo(3.114f, 8.701f, 2.801f, 8.387f, 2.801f, 8.001f),
                    PathNode.LineTo(2.801f, 4.901f),
                    PathNode.Close,
                    PathNode.MoveTo(1.301f, 12.001f),
                    PathNode.CurveTo(1.301f, 11.614f, 1.614f, 11.301f, 2.001f, 11.301f),
                    PathNode.LineTo(22.001f, 11.301f),
                    PathNode.CurveTo(22.387f, 11.301f, 22.701f, 11.614f, 22.701f, 12.001f),
                    PathNode.CurveTo(22.701f, 12.387f, 22.387f, 12.701f, 22.001f, 12.701f),
                    PathNode.LineTo(2.001f, 12.701f),
                    PathNode.CurveTo(1.614f, 12.701f, 1.301f, 12.387f, 1.301f, 12.001f),
                    PathNode.Close,
                    PathNode.MoveTo(19.101f, 21.201f),
                    PathNode.CurveTo(20.261f, 21.201f, 21.201f, 20.261f, 21.201f, 19.101f),
                    PathNode.LineTo(21.201f, 16.001f),
                    PathNode.CurveTo(21.201f, 15.614f, 20.887f, 15.301f, 20.501f, 15.301f),
                    PathNode.CurveTo(20.114f, 15.301f, 19.801f, 15.614f, 19.801f, 16.001f),
                    PathNode.LineTo(19.801f, 19.101f),
                    PathNode.CurveTo(19.801f, 19.487f, 19.487f, 19.801f, 19.101f, 19.801f),
                    PathNode.LineTo(16.001f, 19.801f),
                    PathNode.CurveTo(15.614f, 19.801f, 15.301f, 20.114f, 15.301f, 20.501f),
                    PathNode.CurveTo(15.301f, 20.887f, 15.614f, 21.201f, 16.001f, 21.201f),
                    PathNode.LineTo(19.101f, 21.201f),
                    PathNode.Close,
                    PathNode.MoveTo(4.901f, 21.201f),
                    PathNode.CurveTo(3.741f, 21.201f, 2.801f, 20.261f, 2.801f, 19.101f),
                    PathNode.LineTo(2.801f, 16.001f),
                    PathNode.CurveTo(2.801f, 15.614f, 3.114f, 15.301f, 3.501f, 15.301f),
                    PathNode.CurveTo(3.887f, 15.301f, 4.201f, 15.614f, 4.201f, 16.001f),
                    PathNode.LineTo(4.201f, 19.101f),
                    PathNode.CurveTo(4.201f, 19.487f, 4.514f, 19.801f, 4.901f, 19.801f),
                    PathNode.LineTo(8.001f, 19.801f),
                    PathNode.CurveTo(8.387f, 19.801f, 8.701f, 20.114f, 8.701f, 20.501f),
                    PathNode.CurveTo(8.701f, 20.887f, 8.387f, 21.201f, 8.001f, 21.201f),
                    PathNode.LineTo(4.901f, 21.201f),
                    PathNode.Close,
                    PathNode.MoveTo(21.201f, 4.901f),
                    PathNode.CurveTo(21.201f, 3.741f, 20.261f, 2.801f, 19.101f, 2.801f),
                    PathNode.LineTo(16.001f, 2.801f),
                    PathNode.CurveTo(15.614f, 2.801f, 15.301f, 3.114f, 15.301f, 3.501f),
                    PathNode.CurveTo(15.301f, 3.887f, 15.614f, 4.201f, 16.001f, 4.201f),
                    PathNode.LineTo(19.101f, 4.201f),
                    PathNode.CurveTo(19.487f, 4.201f, 19.801f, 4.514f, 19.801f, 4.901f),
                    PathNode.LineTo(19.801f, 8.001f),
                    PathNode.CurveTo(19.801f, 8.387f, 20.114f, 8.701f, 20.501f, 8.701f),
                    PathNode.CurveTo(20.887f, 8.701f, 21.201f, 8.387f, 21.201f, 8.001f),
                    PathNode.LineTo(21.201f, 4.901f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _scan!!
    }

private var _scan: ImageVector? = null
