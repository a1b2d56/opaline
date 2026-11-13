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

/** `color_menu_ic_redo_normal` */
val OpalineIcons.System.Redo: ImageVector
    get() {
        if (_redo != null) return _redo!!
        _redo = ImageVector.Builder(
            name = "Redo",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.3f, 7.5f),
                    PathNode.CurveTo(20.3f, 7.113f, 20.614f, 6.8f, 21.0f, 6.8f),
                    PathNode.CurveTo(21.387f, 6.8f, 21.7f, 7.113f, 21.7f, 7.5f),
                    PathNode.LineTo(21.7f, 13.5f),
                    PathNode.CurveTo(21.7f, 13.886f, 21.387f, 14.2f, 21.0f, 14.2f),
                    PathNode.LineTo(15.0f, 14.2f),
                    PathNode.CurveTo(14.614f, 14.2f, 14.3f, 13.886f, 14.3f, 13.5f),
                    PathNode.CurveTo(14.3f, 13.113f, 14.614f, 12.8f, 15.0f, 12.8f),
                    PathNode.LineTo(19.136f, 12.8f),
                    PathNode.CurveTo(18.361f, 11.45f, 17.21f, 10.345f, 15.816f, 9.625f),
                    PathNode.CurveTo(14.156f, 8.767f, 12.25f, 8.507f, 10.421f, 8.889f),
                    PathNode.CurveTo(8.591f, 9.271f, 6.949f, 10.272f, 5.771f, 11.723f),
                    PathNode.CurveTo(4.592f, 13.174f, 3.95f, 14.986f, 3.951f, 16.855f),
                    PathNode.CurveTo(3.952f, 17.242f, 3.638f, 17.556f, 3.252f, 17.556f),
                    PathNode.CurveTo(2.865f, 17.556f, 2.552f, 17.243f, 2.551f, 16.857f),
                    PathNode.CurveTo(2.55f, 14.666f, 3.303f, 12.541f, 4.684f, 10.84f),
                    PathNode.CurveTo(6.065f, 9.14f, 7.99f, 7.967f, 10.135f, 7.519f),
                    PathNode.CurveTo(12.279f, 7.071f, 14.513f, 7.375f, 16.459f, 8.381f),
                    PathNode.CurveTo(18.064f, 9.21f, 19.392f, 10.474f, 20.3f, 12.017f),
                    PathNode.LineTo(20.3f, 7.5f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _redo!!
    }

private var _redo: ImageVector? = null
