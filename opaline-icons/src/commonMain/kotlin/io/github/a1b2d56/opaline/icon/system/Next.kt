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

/** `coui_btn_next_normal` */
val OpalineIcons.System.Next: ImageVector
    get() {
        if (_next != null) return _next!!
        _next = ImageVector.Builder(
            name = "Next",
            defaultWidth = 12.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 12.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 6.0f),
                    PathNode.LineTo(10.646f, 11.646f),
                    PathNode.CurveTo(10.842f, 11.842f, 10.842f, 12.158f, 10.646f, 12.354f),
                    PathNode.LineTo(5.0f, 18.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _next!!
    }

private var _next: ImageVector? = null
