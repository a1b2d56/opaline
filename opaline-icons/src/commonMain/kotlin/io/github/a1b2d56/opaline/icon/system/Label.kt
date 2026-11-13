// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `color_tool_menu_ic_label_new` */
val OpalineIcons.System.Label: ImageVector
    get() {
        if (_label != null) return _label!!
        _label = ImageVector.Builder(
            name = "Label",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.5f, 3.844f),
                    PathNode.CurveTo(4.5f, 3.171f, 5.046f, 2.625f, 5.719f, 2.625f),
                    PathNode.LineTo(18.281f, 2.625f),
                    PathNode.CurveTo(18.954f, 2.625f, 19.5f, 3.171f, 19.5f, 3.844f),
                    PathNode.LineTo(19.5f, 21.375f),
                    PathNode.LineTo(12.0f, 18.563f),
                    PathNode.LineTo(4.5f, 21.375f),
                    PathNode.LineTo(4.5f, 3.844f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _label!!
    }

private var _label: ImageVector? = null
