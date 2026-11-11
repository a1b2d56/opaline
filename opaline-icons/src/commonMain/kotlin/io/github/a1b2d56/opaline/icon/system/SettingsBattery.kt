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

/** `settings_search_power_manage_ic_oplus` */
val OpalineIcons.System.SettingsBattery: ImageVector
    get() {
        if (_settingsBattery != null) return _settingsBattery!!
        _settingsBattery = ImageVector.Builder(
            name = "SettingsBattery",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.753f, 12.152f),
                    PathNode.LineTo(10.87f, 8.586f),
                    PathNode.CurveTo(10.995f, 8.376f, 11.317f, 8.465f, 11.317f, 8.709f),
                    PathNode.LineTo(11.317f, 11.242f),
                    PathNode.LineTo(12.689f, 11.242f),
                    PathNode.CurveTo(13.0f, 11.242f, 13.192f, 11.581f, 13.034f, 11.848f),
                    PathNode.LineTo(10.916f, 15.414f),
                    PathNode.CurveTo(10.791f, 15.624f, 10.469f, 15.535f, 10.469f, 15.291f),
                    PathNode.LineTo(10.469f, 12.758f),
                    PathNode.LineTo(9.097f, 12.758f),
                    PathNode.CurveTo(8.786f, 12.758f, 8.594f, 12.419f, 8.753f, 12.152f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.81f, 15.958f),
                    PathNode.LineTo(18.81f, 8.042f),
                    PathNode.CurveTo(18.81f, 7.466f, 18.344f, 7.0f, 17.768f, 7.0f),
                    PathNode.LineTo(4.018f, 7.0f),
                    PathNode.CurveTo(3.443f, 7.0f, 2.977f, 7.466f, 2.977f, 8.042f),
                    PathNode.LineTo(2.977f, 15.958f),
                    PathNode.CurveTo(2.977f, 16.534f, 3.443f, 17.0f, 4.018f, 17.0f),
                    PathNode.LineTo(17.768f, 17.0f),
                    PathNode.CurveTo(18.344f, 17.0f, 18.81f, 16.534f, 18.81f, 15.958f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.471f, 9.917f),
                    PathNode.LineTo(20.487f, 9.917f),
                    PathNode.CurveTo(20.941f, 9.917f, 21.31f, 10.286f, 21.31f, 10.74f),
                    PathNode.LineTo(21.31f, 13.261f),
                    PathNode.CurveTo(21.31f, 13.715f, 20.941f, 14.083f, 20.487f, 14.083f),
                    PathNode.LineTo(20.471f, 14.083f),
                    PathNode.CurveTo(20.244f, 14.083f, 20.06f, 13.899f, 20.06f, 13.672f),
                    PathNode.LineTo(20.06f, 10.329f),
                    PathNode.CurveTo(20.06f, 10.102f, 20.244f, 9.917f, 20.471f, 9.917f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _settingsBattery!!
    }

private var _settingsBattery: ImageVector? = null
