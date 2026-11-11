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

/** `coui_back_arrow_normal` */
val OpalineIcons.System.Back: ImageVector
    get() {
        if (_back != null) return _back!!
        _back = ImageVector.Builder(
            name = "Back",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.1f, 4.4f),
                    PathNode.LineTo(2.5f, 12.0f),
                    PathNode.MoveTo(2.5f, 12.0f),
                    PathNode.LineTo(10.1f, 19.6f),
                    PathNode.MoveTo(2.5f, 12.0f),
                    PathNode.LineTo(21.5f, 12.001f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _back!!
    }

private var _back: ImageVector? = null
