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

/** `menu_ic_delete_normal` */
val OpalineIcons.System.Delete: ImageVector
    get() {
        if (_delete != null) return _delete!!
        _delete = ImageVector.Builder(
            name = "Delete",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.5f, 23.9f),
                    PathNode.LineTo(16.4f, 23.9f),
                    PathNode.CurveTo(14.9f, 23.9f, 13.8f, 22.3f, 13.8f, 20.9f),
                    PathNode.CurveTo(13.8f, 19.5f, 15.0f, 18.0f, 16.4f, 18.0f),
                    PathNode.LineTo(29.7f, 18.0f),
                    PathNode.LineTo(29.7f, 15.9f),
                    PathNode.CurveTo(29.7f, 13.9f, 31.3f, 12.9f, 33.3f, 12.9f),
                    PathNode.LineTo(38.6f, 12.9f),
                    PathNode.CurveTo(40.6f, 12.9f, 42.2f, 13.9f, 42.2f, 15.9f),
                    PathNode.LineTo(42.2f, 18.0f),
                    PathNode.LineTo(55.5f, 18.0f),
                    PathNode.CurveTo(57.0f, 18.0f, 58.1f, 19.4f, 58.1f, 20.9f),
                    PathNode.CurveTo(58.1f, 22.4f, 56.9f, 23.9f, 55.4f, 23.9f),
                    PathNode.LineTo(54.3f, 23.9f),
                    PathNode.CurveTo(54.2f, 29.0f, 53.8f, 38.2f, 53.1f, 54.0f),
                    PathNode.CurveTo(53.0f, 57.3f, 50.2f, 60.0f, 46.9f, 60.0f),
                    PathNode.LineTo(25.1f, 60.0f),
                    PathNode.CurveTo(21.8f, 60.0f, 19.0f, 57.4f, 18.9f, 54.0f),
                    PathNode.LineTo(17.5f, 23.9f),
                    PathNode.Close,
                    PathNode.MoveTo(23.1f, 23.9f),
                    PathNode.LineTo(24.4f, 53.2f),
                    PathNode.CurveTo(24.4f, 53.7f, 24.8f, 54.0f, 25.3f, 54.0f),
                    PathNode.LineTo(46.9f, 54.0f),
                    PathNode.CurveTo(47.4f, 54.0f, 47.8f, 53.6f, 47.8f, 53.2f),
                    PathNode.LineTo(49.1f, 23.9f),
                    PathNode.LineTo(23.1f, 23.9f),
                    PathNode.Close,
                    PathNode.MoveTo(31.6f, 28.0f),
                    PathNode.CurveTo(33.1f, 28.0f, 34.3f, 29.2f, 34.3f, 30.7f),
                    PathNode.LineTo(34.3f, 46.7f),
                    PathNode.CurveTo(34.3f, 48.2f, 33.1f, 49.4f, 31.6f, 49.4f),
                    PathNode.CurveTo(30.1f, 49.4f, 28.9f, 48.2f, 28.9f, 46.7f),
                    PathNode.LineTo(28.9f, 30.7f),
                    PathNode.CurveTo(28.9f, 29.2f, 30.1f, 28.0f, 31.6f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.4f, 28.0f),
                    PathNode.CurveTo(41.9f, 28.0f, 43.1f, 29.2f, 43.1f, 30.7f),
                    PathNode.LineTo(43.1f, 46.7f),
                    PathNode.CurveTo(43.1f, 48.2f, 41.9f, 49.4f, 40.4f, 49.4f),
                    PathNode.CurveTo(38.9f, 49.4f, 37.7f, 48.2f, 37.7f, 46.7f),
                    PathNode.LineTo(37.7f, 30.7f),
                    PathNode.CurveTo(37.8f, 29.2f, 39.0f, 28.0f, 40.4f, 28.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _delete!!
    }

private var _delete: ImageVector? = null
