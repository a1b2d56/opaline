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

/** `settings_search_digital_health_and_family_defend_ic_oplus` */
val OpalineIcons.System.SettingsWellbeing: ImageVector
    get() {
        if (_settingsWellbeing != null) return _settingsWellbeing!!
        _settingsWellbeing = ImageVector.Builder(
            name = "SettingsWellbeing",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.278f, 8.876f),
                    PathNode.CurveTo(8.408f, 8.876f, 9.323f, 7.961f, 9.323f, 6.831f),
                    PathNode.CurveTo(9.323f, 5.701f, 8.408f, 4.786f, 7.278f, 4.786f),
                    PathNode.CurveTo(6.149f, 4.786f, 5.233f, 5.701f, 5.233f, 6.831f),
                    PathNode.CurveTo(5.233f, 7.961f, 6.149f, 8.876f, 7.278f, 8.876f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.433f, 8.876f),
                    PathNode.CurveTo(17.831f, 8.876f, 18.965f, 7.742f, 18.965f, 6.344f),
                    PathNode.CurveTo(18.965f, 4.945f, 17.831f, 3.812f, 16.433f, 3.812f),
                    PathNode.CurveTo(15.035f, 3.812f, 13.901f, 4.945f, 13.901f, 6.344f),
                    PathNode.CurveTo(13.901f, 7.742f, 15.035f, 8.876f, 16.433f, 8.876f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.094f, 19.51f),
                    PathNode.LineTo(8.001f, 16.914f),
                    PathNode.LineTo(14.808f, 11.202f),
                    PathNode.CurveTo(15.909f, 10.278f, 17.552f, 10.422f, 18.476f, 11.523f),
                    PathNode.CurveTo(19.4f, 12.625f, 19.256f, 14.267f, 18.155f, 15.191f),
                    PathNode.LineTo(13.008f, 19.51f),
                    PathNode.CurveTo(12.454f, 19.975f, 11.648f, 19.975f, 11.094f, 19.51f),
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
                    PathNode.MoveTo(5.991f, 16.207f),
                    PathNode.LineTo(6.137f, 16.085f),
                    PathNode.LineTo(7.158f, 15.228f),
                    PathNode.LineTo(6.429f, 14.616f),
                    PathNode.CurveTo(5.644f, 13.958f, 5.542f, 12.789f, 6.2f, 12.005f),
                    PathNode.CurveTo(6.858f, 11.22f, 8.027f, 11.118f, 8.811f, 11.776f),
                    PathNode.LineTo(10.042f, 12.809f),
                    PathNode.LineTo(11.208f, 11.829f),
                    PathNode.LineTo(9.776f, 10.627f),
                    PathNode.CurveTo(8.357f, 9.437f, 6.242f, 9.622f, 5.051f, 11.04f),
                    PathNode.CurveTo(3.861f, 12.459f, 4.046f, 14.574f, 5.464f, 15.765f),
                    PathNode.LineTo(5.991f, 16.207f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsWellbeing!!
    }

private var _settingsWellbeing: ImageVector? = null
