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

/** `menu_ic_settings_normal` */
val OpalineIcons.System.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = ImageVector.Builder(
            name = "Settings",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 72.0f,
            viewportHeight = 72.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(59.7f, 27.6f),
                    PathNode.LineTo(59.7f, 44.4f),
                    PathNode.CurveTo(59.7f, 47.2f, 58.2f, 49.9f, 55.7f, 51.3f),
                    PathNode.LineTo(39.7f, 60.6f),
                    PathNode.CurveTo(37.2f, 62.1f, 34.1f, 62.1f, 31.6f, 60.6f),
                    PathNode.LineTo(15.6f, 51.3f),
                    PathNode.CurveTo(13.1f, 49.9f, 11.6f, 47.2f, 11.6f, 44.4f),
                    PathNode.LineTo(11.6f, 27.6f),
                    PathNode.CurveTo(11.6f, 24.8f, 13.1f, 22.1f, 15.6f, 20.7f),
                    PathNode.LineTo(31.6f, 11.4f),
                    PathNode.CurveTo(34.1f, 9.9f, 37.2f, 9.9f, 39.7f, 11.4f),
                    PathNode.LineTo(55.7f, 20.7f),
                    PathNode.CurveTo(58.2f, 22.1f, 59.7f, 24.7f, 59.7f, 27.6f),
                    PathNode.Close,
                    PathNode.MoveTo(55.7f, 27.6f),
                    PathNode.CurveTo(55.7f, 26.2f, 54.9f, 24.9f, 53.7f, 24.1f),
                    PathNode.LineTo(37.7f, 14.8f),
                    PathNode.CurveTo(36.5f, 14.1f, 34.9f, 14.1f, 33.7f, 14.8f),
                    PathNode.LineTo(17.7f, 24.1f),
                    PathNode.CurveTo(16.5f, 24.8f, 15.7f, 26.1f, 15.7f, 27.6f),
                    PathNode.LineTo(15.7f, 44.4f),
                    PathNode.CurveTo(15.7f, 45.8f, 16.5f, 47.1f, 17.7f, 47.9f),
                    PathNode.LineTo(33.7f, 57.2f),
                    PathNode.CurveTo(34.9f, 57.9f, 36.5f, 57.9f, 37.7f, 57.2f),
                    PathNode.LineTo(53.7f, 47.9f),
                    PathNode.CurveTo(54.9f, 47.2f, 55.7f, 45.9f, 55.7f, 44.4f),
                    PathNode.LineTo(55.7f, 27.6f),
                    PathNode.Close,
                    PathNode.MoveTo(25.7f, 36.0f),
                    PathNode.CurveTo(25.7f, 30.5f, 30.2f, 26.0f, 35.7f, 26.0f),
                    PathNode.CurveTo(41.2f, 26.0f, 45.7f, 30.5f, 45.7f, 36.0f),
                    PathNode.CurveTo(45.7f, 41.5f, 41.2f, 46.0f, 35.7f, 46.0f),
                    PathNode.CurveTo(30.2f, 46.0f, 25.7f, 41.5f, 25.7f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(29.7f, 36.0f),
                    PathNode.CurveTo(29.7f, 39.3f, 32.4f, 42.0f, 35.7f, 42.0f),
                    PathNode.CurveTo(39.0f, 42.0f, 41.7f, 39.3f, 41.7f, 36.0f),
                    PathNode.CurveTo(41.7f, 32.7f, 39.0f, 30.0f, 35.7f, 30.0f),
                    PathNode.CurveTo(32.4f, 30.0f, 29.7f, 32.7f, 29.7f, 36.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _settings!!
    }

private var _settings: ImageVector? = null
