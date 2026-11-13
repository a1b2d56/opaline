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

/** `color_tool_menu_ic_edit` */
val OpalineIcons.System.Checklist: ImageVector
    get() {
        if (_checklist != null) return _checklist!!
        _checklist = ImageVector.Builder(
            name = "Checklist",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.257f, 4.083f),
                    PathNode.CurveTo(7.523f, 3.803f, 7.513f, 3.36f, 7.233f, 3.093f),
                    PathNode.CurveTo(6.953f, 2.827f, 6.51f, 2.838f, 6.243f, 3.118f),
                    PathNode.LineTo(4.083f, 5.385f),
                    PathNode.LineTo(3.257f, 4.518f),
                    PathNode.CurveTo(2.99f, 4.238f, 2.547f, 4.227f, 2.267f, 4.494f),
                    PathNode.CurveTo(1.987f, 4.76f, 1.976f, 5.203f, 2.243f, 5.483f),
                    PathNode.LineTo(3.576f, 6.883f),
                    PathNode.CurveTo(3.708f, 7.022f, 3.892f, 7.1f, 4.083f, 7.1f),
                    PathNode.CurveTo(4.275f, 7.1f, 4.458f, 7.022f, 4.59f, 6.883f),
                    PathNode.LineTo(7.257f, 4.083f),
                    PathNode.Close,
                    PathNode.MoveTo(7.257f, 18.083f),
                    PathNode.CurveTo(7.523f, 17.803f, 7.513f, 17.36f, 7.233f, 17.094f),
                    PathNode.CurveTo(6.953f, 16.827f, 6.51f, 16.838f, 6.243f, 17.118f),
                    PathNode.LineTo(4.083f, 19.385f),
                    PathNode.LineTo(3.257f, 18.518f),
                    PathNode.CurveTo(2.99f, 18.238f, 2.547f, 18.227f, 2.267f, 18.493f),
                    PathNode.CurveTo(1.987f, 18.76f, 1.976f, 19.203f, 2.243f, 19.483f),
                    PathNode.LineTo(3.576f, 20.883f),
                    PathNode.CurveTo(3.708f, 21.022f, 3.892f, 21.1f, 4.083f, 21.1f),
                    PathNode.CurveTo(4.275f, 21.1f, 4.458f, 21.022f, 4.59f, 20.883f),
                    PathNode.LineTo(7.257f, 18.083f),
                    PathNode.Close,
                    PathNode.MoveTo(7.233f, 10.094f),
                    PathNode.CurveTo(7.513f, 10.36f, 7.523f, 10.803f, 7.257f, 11.083f),
                    PathNode.LineTo(4.59f, 13.883f),
                    PathNode.CurveTo(4.458f, 14.022f, 4.275f, 14.1f, 4.083f, 14.1f),
                    PathNode.CurveTo(3.892f, 14.1f, 3.708f, 14.022f, 3.576f, 13.883f),
                    PathNode.LineTo(2.243f, 12.483f),
                    PathNode.CurveTo(1.976f, 12.203f, 1.987f, 11.76f, 2.267f, 11.493f),
                    PathNode.CurveTo(2.547f, 11.227f, 2.99f, 11.238f, 3.257f, 11.518f),
                    PathNode.LineTo(4.083f, 12.385f),
                    PathNode.LineTo(6.243f, 10.118f),
                    PathNode.CurveTo(6.51f, 9.838f, 6.953f, 9.827f, 7.233f, 10.094f),
                    PathNode.Close,
                    PathNode.MoveTo(9.25f, 4.3f),
                    PathNode.CurveTo(8.863f, 4.3f, 8.55f, 4.614f, 8.55f, 5.0f),
                    PathNode.CurveTo(8.55f, 5.387f, 8.863f, 5.7f, 9.25f, 5.7f),
                    PathNode.LineTo(21.25f, 5.7f),
                    PathNode.CurveTo(21.636f, 5.7f, 21.95f, 5.387f, 21.95f, 5.0f),
                    PathNode.CurveTo(21.95f, 4.614f, 21.636f, 4.3f, 21.25f, 4.3f),
                    PathNode.LineTo(9.25f, 4.3f),
                    PathNode.Close,
                    PathNode.MoveTo(8.55f, 12.0f),
                    PathNode.CurveTo(8.55f, 11.614f, 8.863f, 11.3f, 9.25f, 11.3f),
                    PathNode.LineTo(21.25f, 11.3f),
                    PathNode.CurveTo(21.636f, 11.3f, 21.95f, 11.614f, 21.95f, 12.0f),
                    PathNode.CurveTo(21.95f, 12.387f, 21.636f, 12.7f, 21.25f, 12.7f),
                    PathNode.LineTo(9.25f, 12.7f),
                    PathNode.CurveTo(8.863f, 12.7f, 8.55f, 12.387f, 8.55f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.25f, 18.3f),
                    PathNode.CurveTo(8.863f, 18.3f, 8.55f, 18.614f, 8.55f, 19.0f),
                    PathNode.CurveTo(8.55f, 19.387f, 8.863f, 19.7f, 9.25f, 19.7f),
                    PathNode.LineTo(21.25f, 19.7f),
                    PathNode.CurveTo(21.636f, 19.7f, 21.95f, 19.387f, 21.95f, 19.0f),
                    PathNode.CurveTo(21.95f, 18.614f, 21.636f, 18.3f, 21.25f, 18.3f),
                    PathNode.LineTo(9.25f, 18.3f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _checklist!!
    }

private var _checklist: ImageVector? = null
