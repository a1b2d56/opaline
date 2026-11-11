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

/** `coui_list_expandable_indicator` */
val OpalineIcons.System.Expand: ImageVector
    get() {
        if (_expand != null) return _expand!!
        _expand = ImageVector.Builder(
            name = "Expand",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.2f, 10.0f),
                    PathNode.LineTo(18.329f, 5.413f),
                    PathNode.CurveTo(18.527f, 5.192f, 18.873f, 5.192f, 19.072f, 5.413f),
                    PathNode.LineTo(23.2f, 10.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(23.2f, 14.0f),
                    PathNode.LineTo(19.072f, 18.587f),
                    PathNode.CurveTo(18.873f, 18.808f, 18.527f, 18.808f, 18.329f, 18.587f),
                    PathNode.LineTo(14.2f, 14.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _expand!!
    }

private var _expand: ImageVector? = null
