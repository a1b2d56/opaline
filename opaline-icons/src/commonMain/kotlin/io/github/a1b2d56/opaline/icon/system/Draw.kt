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

/** `color_menu_ic_paint_normal` */
val OpalineIcons.System.Draw: ImageVector
    get() {
        if (_draw != null) return _draw!!
        _draw = ImageVector.Builder(
            name = "Draw",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.496f, 2.331f),
                    PathNode.CurveTo(17.91f, 1.745f, 17.284f, 1.402f, 16.665f, 1.319f),
                    PathNode.CurveTo(16.035f, 1.235f, 15.454f, 1.43f, 15.046f, 1.838f),
                    PathNode.LineTo(12.802f, 4.081f),
                    PathNode.CurveTo(12.786f, 4.096f, 12.77f, 4.111f, 12.755f, 4.127f),
                    PathNode.LineTo(12.756f, 4.128f),
                    PathNode.LineTo(4.221f, 12.662f),
                    PathNode.CurveTo(4.06f, 12.823f, 3.938f, 13.018f, 3.863f, 13.232f),
                    PathNode.LineTo(4.522f, 13.462f),
                    PathNode.LineTo(3.863f, 13.232f),
                    PathNode.LineTo(2.339f, 17.594f),
                    PathNode.CurveTo(2.25f, 17.847f, 2.315f, 18.129f, 2.505f, 18.319f),
                    PathNode.CurveTo(2.695f, 18.51f, 2.977f, 18.574f, 3.231f, 18.485f),
                    PathNode.LineTo(7.592f, 16.961f),
                    PathNode.LineTo(7.592f, 16.961f),
                    PathNode.CurveTo(7.807f, 16.886f, 8.002f, 16.764f, 8.162f, 16.603f),
                    PathNode.LineTo(18.987f, 5.779f),
                    PathNode.CurveTo(19.395f, 5.371f, 19.589f, 4.79f, 19.506f, 4.161f),
                    PathNode.CurveTo(19.424f, 3.542f, 19.081f, 2.916f, 18.496f, 2.331f),
                    PathNode.Close,
                    PathNode.MoveTo(13.767f, 5.096f),
                    PathNode.LineTo(5.211f, 13.652f),
                    PathNode.CurveTo(5.199f, 13.664f, 5.19f, 13.678f, 5.185f, 13.694f),
                    PathNode.LineTo(4.14f, 16.685f),
                    PathNode.LineTo(7.13f, 15.64f),
                    PathNode.LineTo(7.13f, 15.64f),
                    PathNode.CurveTo(7.146f, 15.634f, 7.16f, 15.625f, 7.172f, 15.613f),
                    PathNode.LineTo(15.707f, 7.079f),
                    PathNode.LineTo(15.706f, 7.078f),
                    PathNode.CurveTo(15.788f, 6.996f, 15.857f, 6.857f, 15.827f, 6.634f),
                    PathNode.CurveTo(15.796f, 6.401f, 15.649f, 6.043f, 15.215f, 5.61f),
                    PathNode.CurveTo(14.781f, 5.176f, 14.422f, 5.027f, 14.189f, 4.996f),
                    PathNode.CurveTo(13.984f, 4.969f, 13.851f, 5.024f, 13.767f, 5.096f),
                    PathNode.Close,
                    PathNode.MoveTo(17.019f, 5.766f),
                    PathNode.LineTo(17.997f, 4.789f),
                    PathNode.CurveTo(18.079f, 4.707f, 18.148f, 4.568f, 18.118f, 4.345f),
                    PathNode.CurveTo(18.087f, 4.112f, 17.939f, 3.754f, 17.506f, 3.321f),
                    PathNode.CurveTo(17.072f, 2.887f, 16.713f, 2.738f, 16.479f, 2.707f),
                    PathNode.CurveTo(16.256f, 2.677f, 16.117f, 2.746f, 16.035f, 2.828f),
                    PathNode.LineTo(15.058f, 3.805f),
                    PathNode.CurveTo(15.449f, 3.977f, 15.835f, 4.25f, 16.205f, 4.62f),
                    PathNode.CurveTo(16.575f, 4.99f, 16.848f, 5.376f, 17.019f, 5.766f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.25f, 19.641f),
                    PathNode.CurveTo(5.424f, 21.976f, 7.411f, 21.749f, 12.288f, 19.955f),
                    PathNode.CurveTo(17.165f, 18.161f, 20.147f, 17.82f, 21.32f, 20.155f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _draw!!
    }

private var _draw: ImageVector? = null
