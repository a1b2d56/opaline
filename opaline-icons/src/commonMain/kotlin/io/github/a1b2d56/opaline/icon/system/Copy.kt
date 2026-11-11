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

/** `menu_ic_copy_normal` */
val OpalineIcons.System.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = ImageVector.Builder(
            name = "Copy",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(29.0f, 38.0f),
                    PathNode.LineTo(29.0f, 33.5f),
                    PathNode.CurveTo(29.0f, 32.1f, 30.1f, 31.0f, 31.5f, 31.0f),
                    PathNode.CurveTo(32.9f, 31.0f, 34.0f, 32.1f, 34.0f, 33.5f),
                    PathNode.LineTo(34.0f, 38.0f),
                    PathNode.LineTo(38.5f, 38.0f),
                    PathNode.CurveTo(39.9f, 38.0f, 41.0f, 39.1f, 41.0f, 40.5f),
                    PathNode.CurveTo(41.0f, 41.9f, 39.9f, 43.0f, 38.5f, 43.0f),
                    PathNode.LineTo(34.0f, 43.0f),
                    PathNode.LineTo(34.0f, 47.5f),
                    PathNode.CurveTo(34.0f, 48.9f, 32.9f, 50.0f, 31.5f, 50.0f),
                    PathNode.CurveTo(30.1f, 50.0f, 29.0f, 48.9f, 29.0f, 47.5f),
                    PathNode.LineTo(29.0f, 43.0f),
                    PathNode.LineTo(24.5f, 43.0f),
                    PathNode.CurveTo(23.1f, 43.0f, 22.0f, 41.9f, 22.0f, 40.5f),
                    PathNode.CurveTo(22.0f, 39.1f, 23.1f, 38.0f, 24.5f, 38.0f),
                    PathNode.LineTo(29.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 54.0f),
                    PathNode.CurveTo(52.0f, 57.3f, 49.3f, 60.0f, 46.0f, 60.0f),
                    PathNode.LineTo(18.0f, 60.0f),
                    PathNode.CurveTo(14.7f, 60.0f, 12.0f, 57.3f, 12.0f, 54.0f),
                    PathNode.LineTo(12.0f, 26.0f),
                    PathNode.CurveTo(12.0f, 22.7f, 14.7f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.0f, 14.7f, 21.7f, 12.0f, 25.0f, 12.0f),
                    PathNode.LineTo(55.0f, 12.0f),
                    PathNode.CurveTo(58.3f, 12.0f, 61.0f, 14.7f, 61.0f, 18.0f),
                    PathNode.LineTo(61.0f, 48.0f),
                    PathNode.CurveTo(61.0f, 51.3f, 58.3f, 54.0f, 55.0f, 54.0f),
                    PathNode.LineTo(52.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(25.0f, 20.0f),
                    PathNode.LineTo(46.0f, 20.0f),
                    PathNode.CurveTo(49.3f, 20.0f, 52.0f, 22.7f, 52.0f, 26.0f),
                    PathNode.LineTo(52.0f, 49.0f),
                    PathNode.LineTo(53.0f, 49.0f),
                    PathNode.CurveTo(54.1f, 49.0f, 55.0f, 48.1f, 55.0f, 47.0f),
                    PathNode.LineTo(55.0f, 20.0f),
                    PathNode.CurveTo(55.0f, 18.9f, 54.1f, 18.0f, 53.0f, 18.0f),
                    PathNode.LineTo(27.0f, 18.0f),
                    PathNode.CurveTo(25.9f, 18.0f, 25.0f, 18.9f, 25.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 26.0f),
                    PathNode.CurveTo(18.9f, 26.0f, 18.0f, 26.9f, 18.0f, 28.0f),
                    PathNode.LineTo(18.0f, 52.0f),
                    PathNode.CurveTo(18.0f, 53.1f, 18.9f, 54.0f, 20.0f, 54.0f),
                    PathNode.LineTo(44.0f, 54.0f),
                    PathNode.CurveTo(45.1f, 54.0f, 46.0f, 53.1f, 46.0f, 52.0f),
                    PathNode.LineTo(46.0f, 28.0f),
                    PathNode.CurveTo(46.0f, 26.9f, 45.1f, 26.0f, 44.0f, 26.0f),
                    PathNode.LineTo(20.0f, 26.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _copy!!
    }

private var _copy: ImageVector? = null
