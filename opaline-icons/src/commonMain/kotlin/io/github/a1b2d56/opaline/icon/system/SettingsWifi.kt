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

/** `settings_search_wifi_ic_oplus` */
val OpalineIcons.System.SettingsWifi: ImageVector
    get() {
        if (_settingsWifi != null) return _settingsWifi!!
        _settingsWifi = ImageVector.Builder(
            name = "SettingsWifi",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.237f, 9.358f),
                    PathNode.CurveTo(5.582f, 7.117f, 8.689f, 5.875f, 11.996f, 5.875f),
                    PathNode.CurveTo(15.286f, 5.875f, 18.392f, 7.109f, 20.764f, 9.366f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.575f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.73f, 11.85f),
                    PathNode.CurveTo(7.428f, 10.258f, 9.642f, 9.383f, 11.995f, 9.383f),
                    PathNode.CurveTo(14.34f, 9.383f, 16.554f, 10.258f, 18.269f, 11.859f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.575f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.224f, 14.346f),
                    PathNode.CurveTo(9.248f, 13.419f, 10.587f, 12.902f, 11.995f, 12.902f),
                    PathNode.CurveTo(13.413f, 12.902f, 14.743f, 13.419f, 15.784f, 14.346f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.575f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.325f, 16.387f),
                    PathNode.CurveTo(10.777f, 15.994f, 11.366f, 15.766f, 12.004f, 15.766f),
                    PathNode.CurveTo(12.642f, 15.766f, 13.231f, 15.994f, 13.684f, 16.387f),
                    PathNode.CurveTo(13.812f, 16.499f, 13.888f, 16.659f, 13.894f, 16.828f),
                    PathNode.CurveTo(13.9f, 16.998f, 13.835f, 17.163f, 13.714f, 17.283f),
                    PathNode.LineTo(12.437f, 18.557f),
                    PathNode.CurveTo(12.198f, 18.796f, 11.811f, 18.796f, 11.572f, 18.557f),
                    PathNode.LineTo(10.294f, 17.283f),
                    PathNode.CurveTo(10.174f, 17.163f, 10.109f, 16.998f, 10.115f, 16.828f),
                    PathNode.CurveTo(10.12f, 16.659f, 10.197f, 16.499f, 10.325f, 16.387f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsWifi!!
    }

private var _settingsWifi: ImageVector? = null
