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

/** `ic_main_recent` */
val OpalineIcons.System.Recent: ImageVector
    get() {
        if (_recent != null) return _recent!!
        _recent = ImageVector.Builder(
            name = "Recent",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.7f, 12.0f),
                    PathNode.CurveTo(2.7f, 6.864f, 6.864f, 2.7f, 12.0f, 2.7f),
                    PathNode.CurveTo(17.136f, 2.7f, 21.3f, 6.864f, 21.3f, 12.0f),
                    PathNode.CurveTo(21.3f, 17.136f, 17.136f, 21.3f, 12.0f, 21.3f),
                    PathNode.CurveTo(6.864f, 21.3f, 2.7f, 17.136f, 2.7f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 1.3f),
                    PathNode.CurveTo(6.09f, 1.3f, 1.3f, 6.09f, 1.3f, 12.0f),
                    PathNode.CurveTo(1.3f, 17.909f, 6.09f, 22.7f, 12.0f, 22.7f),
                    PathNode.CurveTo(17.909f, 22.7f, 22.7f, 17.909f, 22.7f, 12.0f),
                    PathNode.CurveTo(22.7f, 6.09f, 17.909f, 1.3f, 12.0f, 1.3f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 5.611f),
                    PathNode.CurveTo(12.335f, 5.611f, 12.611f, 5.875f, 12.627f, 6.211f),
                    PathNode.LineTo(12.867f, 11.542f),
                    PathNode.LineTo(15.973f, 14.977f),
                    PathNode.CurveTo(16.199f, 15.227f, 16.189f, 15.609f, 15.952f, 15.847f),
                    PathNode.CurveTo(15.714f, 16.084f, 15.332f, 16.094f, 15.082f, 15.869f),
                    PathNode.LineTo(11.274f, 12.426f),
                    PathNode.CurveTo(11.164f, 12.325f, 11.104f, 12.181f, 11.11f, 12.032f),
                    PathNode.LineTo(11.373f, 6.211f),
                    PathNode.CurveTo(11.388f, 5.875f, 11.664f, 5.611f, 12.0f, 5.611f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _recent!!
    }

private var _recent: ImageVector? = null
