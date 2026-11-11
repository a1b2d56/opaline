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

/** `settings_search_notify_center_ic_oplus` */
val OpalineIcons.System.SettingsNotifications: ImageVector
    get() {
        if (_settingsNotifications != null) return _settingsNotifications!!
        _settingsNotifications = ImageVector.Builder(
            name = "SettingsNotifications",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.013f, 16.117f),
                    PathNode.CurveTo(19.803f, 16.852f, 19.111f, 17.386f, 18.298f, 17.386f),
                    PathNode.LineTo(6.205f, 17.386f),
                    PathNode.CurveTo(5.391f, 17.386f, 4.7f, 16.852f, 4.49f, 16.117f),
                    PathNode.CurveTo(4.543f, 16.126f, 4.586f, 16.126f, 4.639f, 16.126f),
                    PathNode.LineTo(19.864f, 16.126f),
                    PathNode.CurveTo(19.917f, 16.126f, 19.96f, 16.126f, 20.013f, 16.117f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.251f, 9.127f),
                    PathNode.LineTo(18.151f, 9.127f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.225f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.251f, 11.752f),
                    PathNode.LineTo(14.876f, 11.752f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.225f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.862f, 6.5f),
                    PathNode.LineTo(4.637f, 6.5f),
                    PathNode.CurveTo(4.009f, 6.5f, 3.5f, 7.009f, 3.5f, 7.637f),
                    PathNode.LineTo(3.5f, 13.238f),
                    PathNode.CurveTo(3.5f, 13.866f, 4.009f, 14.375f, 4.637f, 14.375f),
                    PathNode.LineTo(19.862f, 14.375f),
                    PathNode.CurveTo(20.491f, 14.375f, 21.0f, 13.866f, 21.0f, 13.238f),
                    PathNode.LineTo(21.0f, 7.637f),
                    PathNode.CurveTo(21.0f, 7.009f, 20.491f, 6.5f, 19.862f, 6.5f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.575f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.057f, 9.696f),
                    PathNode.LineTo(9.057f, 11.183f),
                    PathNode.LineTo(7.569f, 11.183f),
                    PathNode.LineTo(7.569f, 9.696f),
                    PathNode.LineTo(9.057f, 9.696f),
                    PathNode.Close,
                    PathNode.MoveTo(9.494f, 8.471f),
                    PathNode.LineTo(7.132f, 8.471f),
                    PathNode.CurveTo(6.697f, 8.471f, 6.344f, 8.823f, 6.344f, 9.258f),
                    PathNode.LineTo(6.344f, 11.621f),
                    PathNode.CurveTo(6.344f, 12.056f, 6.697f, 12.408f, 7.132f, 12.408f),
                    PathNode.LineTo(9.494f, 12.408f),
                    PathNode.CurveTo(9.929f, 12.408f, 10.282f, 12.056f, 10.282f, 11.621f),
                    PathNode.LineTo(10.282f, 9.258f),
                    PathNode.CurveTo(10.282f, 8.823f, 9.929f, 8.471f, 9.494f, 8.471f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _settingsNotifications!!
    }

private var _settingsNotifications: ImageVector? = null
