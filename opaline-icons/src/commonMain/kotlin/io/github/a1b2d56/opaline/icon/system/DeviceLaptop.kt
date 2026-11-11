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

/** `icon_notebook_in_use` */
val OpalineIcons.System.DeviceLaptop: ImageVector
    get() {
        if (_deviceLaptop != null) return _deviceLaptop!!
        _deviceLaptop = ImageVector.Builder(
            name = "DeviceLaptop",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.097f, 15.307f),
                    PathNode.CurveTo(21.318f, 15.338f, 21.515f, 15.474f, 21.62f, 15.676f),
                    PathNode.LineTo(22.925f, 18.176f),
                    PathNode.CurveTo(22.989f, 18.299f, 23.013f, 18.437f, 22.999f, 18.572f),
                    PathNode.LineTo(22.999f, 19.0f),
                    PathNode.CurveTo(22.999f, 19.552f, 22.551f, 20.0f, 21.999f, 20.0f),
                    PathNode.LineTo(1.999f, 20.0f),
                    PathNode.CurveTo(1.447f, 20.0f, 0.999f, 19.552f, 0.999f, 19.0f),
                    PathNode.LineTo(0.999f, 18.562f),
                    PathNode.CurveTo(0.987f, 18.43f, 1.011f, 18.296f, 1.074f, 18.176f),
                    PathNode.LineTo(2.379f, 15.676f),
                    PathNode.LineTo(2.43f, 15.594f),
                    PathNode.CurveTo(2.56f, 15.411f, 2.772f, 15.3f, 3.0f, 15.3f),
                    PathNode.LineTo(21.0f, 15.3f),
                    PathNode.LineTo(21.097f, 15.307f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.5f, 6.4f),
                    PathNode.CurveTo(5.5f, 6.26f, 5.5f, 6.19f, 5.527f, 6.136f),
                    PathNode.CurveTo(5.551f, 6.089f, 5.589f, 6.051f, 5.636f, 6.027f),
                    PathNode.CurveTo(5.69f, 6.0f, 5.76f, 6.0f, 5.9f, 6.0f),
                    PathNode.LineTo(18.1f, 6.0f),
                    PathNode.CurveTo(18.24f, 6.0f, 18.31f, 6.0f, 18.364f, 6.027f),
                    PathNode.CurveTo(18.41f, 6.051f, 18.449f, 6.089f, 18.473f, 6.136f),
                    PathNode.CurveTo(18.5f, 6.19f, 18.5f, 6.26f, 18.5f, 6.4f),
                    PathNode.LineTo(18.5f, 13.6f),
                    PathNode.CurveTo(18.5f, 13.74f, 18.5f, 13.81f, 18.473f, 13.863f),
                    PathNode.CurveTo(18.449f, 13.91f, 18.41f, 13.949f, 18.364f, 13.973f),
                    PathNode.CurveTo(18.31f, 14.0f, 18.24f, 14.0f, 18.1f, 14.0f),
                    PathNode.LineTo(5.9f, 14.0f),
                    PathNode.CurveTo(5.76f, 14.0f, 5.69f, 14.0f, 5.636f, 13.973f),
                    PathNode.CurveTo(5.589f, 13.949f, 5.551f, 13.91f, 5.527f, 13.863f),
                    PathNode.CurveTo(5.5f, 13.81f, 5.5f, 13.74f, 5.5f, 13.6f),
                    PathNode.LineTo(5.5f, 6.4f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.5f, 14.0f),
                    PathNode.LineTo(20.5f, 6.08f),
                    PathNode.CurveTo(20.5f, 5.352f, 20.5f, 4.988f, 20.358f, 4.71f),
                    PathNode.CurveTo(20.234f, 4.465f, 20.035f, 4.266f, 19.79f, 4.142f),
                    PathNode.CurveTo(19.512f, 4.0f, 19.148f, 4.0f, 18.42f, 4.0f),
                    PathNode.LineTo(5.58f, 4.0f),
                    PathNode.CurveTo(4.852f, 4.0f, 4.488f, 4.0f, 4.21f, 4.142f),
                    PathNode.CurveTo(3.965f, 4.266f, 3.766f, 4.465f, 3.642f, 4.71f),
                    PathNode.CurveTo(3.5f, 4.988f, 3.5f, 5.352f, 3.5f, 6.08f),
                    PathNode.LineTo(3.5f, 14.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceLaptop!!
    }

private var _deviceLaptop: ImageVector? = null
