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

/** `menu_ic_move_normal` */
val OpalineIcons.System.Cut: ImageVector
    get() {
        if (_cut != null) return _cut!!
        _cut = ImageVector.Builder(
            name = "Cut",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(23.9f, 42.5f),
                    PathNode.LineTo(52.0f, 12.0f),
                    PathNode.CurveTo(54.2f, 14.1f, 54.6f, 17.4f, 53.0f, 19.4f),
                    PathNode.LineTo(40.6f, 34.8f),
                    PathNode.CurveTo(42.5f, 37.1f, 44.8f, 39.7f, 47.4f, 42.8f),
                    PathNode.CurveTo(48.5f, 42.3f, 49.7f, 42.1f, 51.0f, 42.1f),
                    PathNode.CurveTo(56.0f, 42.1f, 60.0f, 46.1f, 60.0f, 51.1f),
                    PathNode.CurveTo(60.0f, 56.1f, 56.0f, 60.1f, 51.0f, 60.1f),
                    PathNode.CurveTo(46.0f, 60.1f, 42.0f, 56.1f, 42.0f, 51.1f),
                    PathNode.CurveTo(42.0f, 50.4f, 42.1f, 49.7f, 42.3f, 49.0f),
                    PathNode.CurveTo(42.3f, 49.0f, 42.2f, 48.9f, 42.2f, 48.9f),
                    PathNode.CurveTo(39.9f, 45.8f, 37.8f, 43.1f, 36.0f, 40.7f),
                    PathNode.LineTo(29.8f, 48.3f),
                    PathNode.CurveTo(29.8f, 48.3f, 29.7f, 48.4f, 29.7f, 48.4f),
                    PathNode.CurveTo(30.0f, 49.2f, 30.1f, 50.1f, 30.1f, 51.1f),
                    PathNode.CurveTo(30.1f, 56.1f, 26.1f, 60.1f, 21.1f, 60.1f),
                    PathNode.CurveTo(16.1f, 60.1f, 12.1f, 56.1f, 12.1f, 51.1f),
                    PathNode.CurveTo(12.1f, 46.1f, 16.1f, 42.1f, 21.1f, 42.1f),
                    PathNode.CurveTo(22.0f, 42.0f, 23.0f, 42.2f, 23.9f, 42.5f),
                    PathNode.Close,
                    PathNode.MoveTo(29.7f, 32.0f),
                    PathNode.CurveTo(27.6f, 29.2f, 24.3f, 24.9f, 20.0f, 19.3f),
                    PathNode.CurveTo(18.4f, 17.3f, 18.8f, 14.0f, 20.8f, 12.0f),
                    PathNode.CurveTo(26.7f, 18.7f, 31.1f, 23.7f, 34.0f, 27.1f),
                    PathNode.LineTo(29.7f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 32.0f),
                    PathNode.CurveTo(34.9f, 32.0f, 34.0f, 32.9f, 34.0f, 34.0f),
                    PathNode.CurveTo(34.0f, 35.1f, 34.9f, 36.0f, 36.0f, 36.0f),
                    PathNode.CurveTo(37.1f, 36.0f, 38.0f, 35.1f, 38.0f, 34.0f),
                    PathNode.CurveTo(38.0f, 32.9f, 37.1f, 32.0f, 36.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(51.0f, 54.0f),
                    PathNode.CurveTo(52.7f, 54.0f, 54.0f, 52.7f, 54.0f, 51.0f),
                    PathNode.CurveTo(54.0f, 49.3f, 52.7f, 48.0f, 51.0f, 48.0f),
                    PathNode.CurveTo(49.3f, 48.0f, 48.0f, 49.3f, 48.0f, 51.0f),
                    PathNode.CurveTo(48.0f, 52.7f, 49.3f, 54.0f, 51.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(21.0f, 54.0f),
                    PathNode.CurveTo(22.7f, 54.0f, 24.0f, 52.7f, 24.0f, 51.0f),
                    PathNode.CurveTo(24.0f, 49.3f, 22.7f, 48.0f, 21.0f, 48.0f),
                    PathNode.CurveTo(19.3f, 48.0f, 18.0f, 49.3f, 18.0f, 51.0f),
                    PathNode.CurveTo(18.0f, 52.7f, 19.3f, 54.0f, 21.0f, 54.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _cut!!
    }

private var _cut: ImageVector? = null
