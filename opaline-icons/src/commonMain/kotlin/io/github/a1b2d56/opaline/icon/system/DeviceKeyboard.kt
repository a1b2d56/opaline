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

/** `icon_keyboard_in_use` */
val OpalineIcons.System.DeviceKeyboard: ImageVector
    get() {
        if (_deviceKeyboard != null) return _deviceKeyboard!!
        _deviceKeyboard = ImageVector.Builder(
            name = "DeviceKeyboard",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 5.3f),
                    PathNode.CurveTo(2.0f, 4.582f, 2.582f, 4.0f, 3.3f, 4.0f),
                    PathNode.LineTo(20.698f, 4.0f),
                    PathNode.CurveTo(21.417f, 4.0f, 21.999f, 4.582f, 21.999f, 5.3f),
                    PathNode.LineTo(21.999f, 18.698f),
                    PathNode.CurveTo(21.999f, 19.417f, 21.417f, 19.999f, 20.698f, 19.999f),
                    PathNode.LineTo(3.3f, 19.999f),
                    PathNode.CurveTo(2.582f, 19.999f, 2.0f, 19.417f, 2.0f, 18.698f),
                    PathNode.LineTo(2.0f, 5.3f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.25f),
                    PathNode.CurveTo(4.0f, 6.111f, 4.112f, 6.0f, 4.25f, 6.0f),
                    PathNode.LineTo(19.749f, 6.0f),
                    PathNode.CurveTo(19.887f, 6.0f, 19.999f, 6.111f, 19.999f, 6.25f),
                    PathNode.LineTo(19.999f, 17.749f),
                    PathNode.CurveTo(19.999f, 17.887f, 19.887f, 17.999f, 19.749f, 17.999f),
                    PathNode.LineTo(4.25f, 17.999f),
                    PathNode.CurveTo(4.112f, 17.999f, 4.0f, 17.887f, 4.0f, 17.749f),
                    PathNode.LineTo(4.0f, 6.25f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 7.0f),
                    PathNode.LineTo(8.0f, 7.0f),
                    PathNode.CurveTo(8.276f, 7.0f, 8.5f, 7.224f, 8.5f, 7.5f),
                    PathNode.LineTo(8.5f, 8.5f),
                    PathNode.CurveTo(8.5f, 8.776f, 8.276f, 9.0f, 8.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(5.724f, 9.0f, 5.5f, 8.776f, 5.5f, 8.5f),
                    PathNode.LineTo(5.5f, 7.5f),
                    PathNode.CurveTo(5.5f, 7.224f, 5.724f, 7.0f, 6.0f, 7.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 10.999f),
                    PathNode.LineTo(8.0f, 10.999f),
                    PathNode.CurveTo(8.276f, 10.999f, 8.5f, 11.223f, 8.5f, 11.499f),
                    PathNode.LineTo(8.5f, 12.499f),
                    PathNode.CurveTo(8.5f, 12.775f, 8.276f, 12.999f, 8.0f, 12.999f),
                    PathNode.LineTo(6.0f, 12.999f),
                    PathNode.CurveTo(5.724f, 12.999f, 5.5f, 12.775f, 5.5f, 12.499f),
                    PathNode.LineTo(5.5f, 11.499f),
                    PathNode.CurveTo(5.5f, 11.223f, 5.724f, 10.999f, 6.0f, 10.999f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.CurveTo(13.276f, 7.0f, 13.5f, 7.224f, 13.5f, 7.5f),
                    PathNode.LineTo(13.5f, 8.5f),
                    PathNode.CurveTo(13.5f, 8.776f, 13.276f, 9.0f, 13.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(10.724f, 9.0f, 10.5f, 8.776f, 10.5f, 8.5f),
                    PathNode.LineTo(10.5f, 7.5f),
                    PathNode.CurveTo(10.5f, 7.224f, 10.724f, 7.0f, 11.0f, 7.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.998f, 7.0f),
                    PathNode.LineTo(17.998f, 7.0f),
                    PathNode.CurveTo(18.274f, 7.0f, 18.498f, 7.224f, 18.498f, 7.5f),
                    PathNode.LineTo(18.498f, 8.5f),
                    PathNode.CurveTo(18.498f, 8.776f, 18.274f, 9.0f, 17.998f, 9.0f),
                    PathNode.LineTo(15.998f, 9.0f),
                    PathNode.CurveTo(15.722f, 9.0f, 15.498f, 8.776f, 15.498f, 8.5f),
                    PathNode.LineTo(15.498f, 7.5f),
                    PathNode.CurveTo(15.498f, 7.224f, 15.722f, 7.0f, 15.998f, 7.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 10.999f),
                    PathNode.LineTo(13.0f, 10.999f),
                    PathNode.CurveTo(13.276f, 10.999f, 13.5f, 11.223f, 13.5f, 11.499f),
                    PathNode.LineTo(13.5f, 12.499f),
                    PathNode.CurveTo(13.5f, 12.775f, 13.276f, 12.999f, 13.0f, 12.999f),
                    PathNode.LineTo(11.0f, 12.999f),
                    PathNode.CurveTo(10.724f, 12.999f, 10.5f, 12.775f, 10.5f, 12.499f),
                    PathNode.LineTo(10.5f, 11.499f),
                    PathNode.CurveTo(10.5f, 11.223f, 10.724f, 10.999f, 11.0f, 10.999f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.998f, 10.999f),
                    PathNode.LineTo(17.998f, 10.999f),
                    PathNode.CurveTo(18.274f, 10.999f, 18.498f, 11.223f, 18.498f, 11.499f),
                    PathNode.LineTo(18.498f, 12.499f),
                    PathNode.CurveTo(18.498f, 12.775f, 18.274f, 12.999f, 17.998f, 12.999f),
                    PathNode.LineTo(15.998f, 12.999f),
                    PathNode.CurveTo(15.722f, 12.999f, 15.498f, 12.775f, 15.498f, 12.499f),
                    PathNode.LineTo(15.498f, 11.499f),
                    PathNode.CurveTo(15.498f, 11.223f, 15.722f, 10.999f, 15.998f, 10.999f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 15.499f),
                    PathNode.CurveTo(7.0f, 15.223f, 7.224f, 14.999f, 7.5f, 14.999f),
                    PathNode.LineTo(16.5f, 14.999f),
                    PathNode.CurveTo(16.776f, 14.999f, 17.0f, 15.223f, 17.0f, 15.499f),
                    PathNode.LineTo(17.0f, 16.499f),
                    PathNode.CurveTo(17.0f, 16.775f, 16.776f, 16.999f, 16.5f, 16.999f),
                    PathNode.LineTo(7.5f, 16.999f),
                    PathNode.CurveTo(7.224f, 16.999f, 7.0f, 16.775f, 7.0f, 16.499f),
                    PathNode.LineTo(7.0f, 15.499f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _deviceKeyboard!!
    }

private var _deviceKeyboard: ImageVector? = null
