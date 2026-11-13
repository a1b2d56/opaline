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

/** `color_tool_menu_ic_mode_list` */
val OpalineIcons.System.ListView: ImageVector
    get() {
        if (_listView != null) return _listView!!
        _listView = ImageVector.Builder(
            name = "ListView",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.369f, 17.75f),
                    PathNode.CurveTo(4.06f, 17.75f, 4.619f, 18.31f, 4.619f, 19.0f),
                    PathNode.CurveTo(4.619f, 19.69f, 4.06f, 20.25f, 3.369f, 20.25f),
                    PathNode.CurveTo(2.679f, 20.25f, 2.119f, 19.69f, 2.119f, 19.0f),
                    PathNode.CurveTo(2.119f, 18.31f, 2.679f, 17.75f, 3.369f, 17.75f),
                    PathNode.Close,
                    PathNode.MoveTo(21.182f, 18.3f),
                    PathNode.CurveTo(21.568f, 18.3f, 21.882f, 18.613f, 21.882f, 19.0f),
                    PathNode.CurveTo(21.882f, 19.387f, 21.568f, 19.7f, 21.182f, 19.7f),
                    PathNode.LineTo(7.182f, 19.7f),
                    PathNode.CurveTo(6.795f, 19.7f, 6.481f, 19.387f, 6.481f, 19.0f),
                    PathNode.CurveTo(6.481f, 18.613f, 6.795f, 18.3f, 7.182f, 18.3f),
                    PathNode.LineTo(21.182f, 18.3f),
                    PathNode.Close,
                    PathNode.MoveTo(3.369f, 10.75f),
                    PathNode.CurveTo(4.06f, 10.75f, 4.619f, 11.31f, 4.619f, 12.0f),
                    PathNode.CurveTo(4.619f, 12.69f, 4.06f, 13.25f, 3.369f, 13.25f),
                    PathNode.CurveTo(2.679f, 13.25f, 2.119f, 12.69f, 2.119f, 12.0f),
                    PathNode.CurveTo(2.119f, 11.31f, 2.679f, 10.75f, 3.369f, 10.75f),
                    PathNode.Close,
                    PathNode.MoveTo(21.182f, 11.3f),
                    PathNode.CurveTo(21.568f, 11.3f, 21.882f, 11.613f, 21.882f, 12.0f),
                    PathNode.CurveTo(21.882f, 12.387f, 21.568f, 12.7f, 21.182f, 12.7f),
                    PathNode.LineTo(7.182f, 12.7f),
                    PathNode.CurveTo(6.795f, 12.7f, 6.481f, 12.387f, 6.481f, 12.0f),
                    PathNode.CurveTo(6.481f, 11.613f, 6.795f, 11.3f, 7.182f, 11.3f),
                    PathNode.LineTo(21.182f, 11.3f),
                    PathNode.Close,
                    PathNode.MoveTo(3.369f, 3.75f),
                    PathNode.CurveTo(4.06f, 3.75f, 4.619f, 4.31f, 4.619f, 5.0f),
                    PathNode.CurveTo(4.619f, 5.69f, 4.06f, 6.25f, 3.369f, 6.25f),
                    PathNode.CurveTo(2.679f, 6.25f, 2.119f, 5.69f, 2.119f, 5.0f),
                    PathNode.CurveTo(2.119f, 4.31f, 2.679f, 3.75f, 3.369f, 3.75f),
                    PathNode.Close,
                    PathNode.MoveTo(21.182f, 4.3f),
                    PathNode.CurveTo(21.568f, 4.3f, 21.882f, 4.613f, 21.882f, 5.0f),
                    PathNode.CurveTo(21.882f, 5.387f, 21.568f, 5.7f, 21.182f, 5.7f),
                    PathNode.LineTo(7.182f, 5.7f),
                    PathNode.CurveTo(6.795f, 5.7f, 6.481f, 5.387f, 6.481f, 5.0f),
                    PathNode.CurveTo(6.481f, 4.613f, 6.795f, 4.3f, 7.182f, 4.3f),
                    PathNode.LineTo(21.182f, 4.3f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _listView!!
    }

private var _listView: ImageVector? = null
