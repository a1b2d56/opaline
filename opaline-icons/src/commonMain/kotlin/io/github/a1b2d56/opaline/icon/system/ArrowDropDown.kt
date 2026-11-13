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

/** `coui_date_picker_expand_icon_down` */
val OpalineIcons.System.ArrowDropDown: ImageVector
    get() {
        if (_arrowDropDown != null) return _arrowDropDown!!
        _arrowDropDown = ImageVector.Builder(
            name = "ArrowDropDown",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.148f, 8.25f),
                    PathNode.LineTo(17.852f, 8.25f),
                    PathNode.CurveTo(18.348f, 8.25f, 18.75f, 8.654f, 18.75f, 9.151f),
                    PathNode.CurveTo(18.75f, 9.356f, 18.681f, 9.555f, 18.553f, 9.715f),
                    PathNode.LineTo(12.876f, 16.828f),
                    PathNode.CurveTo(12.488f, 17.313f, 11.782f, 17.392f, 11.298f, 17.003f),
                    PathNode.CurveTo(11.234f, 16.951f, 11.175f, 16.892f, 11.124f, 16.828f),
                    PathNode.LineTo(5.447f, 9.715f),
                    PathNode.CurveTo(5.137f, 9.326f, 5.2f, 8.759f, 5.587f, 8.448f),
                    PathNode.CurveTo(5.746f, 8.32f, 5.944f, 8.25f, 6.148f, 8.25f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _arrowDropDown!!
    }

private var _arrowDropDown: ImageVector? = null
