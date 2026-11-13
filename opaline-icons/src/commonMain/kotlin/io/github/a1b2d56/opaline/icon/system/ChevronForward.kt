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

/** `coui_ic_chevron_end` */
val OpalineIcons.System.ChevronForward: ImageVector
    get() {
        if (_chevronForward != null) return _chevronForward!!
        _chevronForward = ImageVector.Builder(
            name = "ChevronForward",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.16f, 5.636f),
                    PathNode.LineTo(16.171f, 11.646f),
                    PathNode.CurveTo(16.366f, 11.842f, 16.366f, 12.158f, 16.171f, 12.354f),
                    PathNode.LineTo(10.16f, 18.364f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _chevronForward!!
    }

private var _chevronForward: ImageVector? = null
