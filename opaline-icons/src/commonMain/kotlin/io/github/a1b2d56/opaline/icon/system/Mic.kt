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

/** `menu_ic_voice_normal` */
val OpalineIcons.System.Mic: ImageVector
    get() {
        if (_mic != null) return _mic!!
        _mic = ImageVector.Builder(
            name = "Mic",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 11.0f),
                    PathNode.CurveTo(41.523f, 11.0f, 46.0f, 15.477f, 46.0f, 21.0f),
                    PathNode.LineTo(46.0f, 37.0f),
                    PathNode.CurveTo(46.0f, 42.523f, 41.523f, 47.0f, 36.0f, 47.0f),
                    PathNode.CurveTo(30.477f, 47.0f, 26.0f, 42.523f, 26.0f, 37.0f),
                    PathNode.LineTo(26.0f, 21.0f),
                    PathNode.CurveTo(26.0f, 15.477f, 30.477f, 11.0f, 36.0f, 11.0f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 4.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(54.0f, 34.0f),
                    PathNode.LineTo(54.0f, 37.0f),
                    PathNode.CurveTo(54.0f, 46.941f, 45.941f, 55.0f, 36.0f, 55.0f),
                    PathNode.CurveTo(26.059f, 55.0f, 18.0f, 46.941f, 18.0f, 37.0f),
                    PathNode.LineTo(18.0f, 34.0f),
                    PathNode.MoveTo(36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 4.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.5f, 63.0f),
                    PathNode.LineTo(36.5f, 64.0f),
                    PathNode.LineTo(35.5f, 64.0f),
                    PathNode.LineTo(35.5f, 63.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _mic!!
    }

private var _mic: ImageVector? = null
