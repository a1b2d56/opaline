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

/** `icon_pad_in_use` */
val OpalineIcons.System.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = ImageVector.Builder(
            name = "DeviceTablet",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.4f, 17.999f),
                    PathNode.CurveTo(4.26f, 17.999f, 4.19f, 17.999f, 4.136f, 17.972f),
                    PathNode.CurveTo(4.089f, 17.948f, 4.051f, 17.909f, 4.027f, 17.862f),
                    PathNode.CurveTo(4.0f, 17.809f, 4.0f, 17.739f, 4.0f, 17.599f),
                    PathNode.LineTo(4.0f, 6.4f),
                    PathNode.CurveTo(4.0f, 6.26f, 4.0f, 6.19f, 4.027f, 6.136f),
                    PathNode.CurveTo(4.051f, 6.089f, 4.089f, 6.051f, 4.136f, 6.027f),
                    PathNode.CurveTo(4.19f, 6.0f, 4.26f, 6.0f, 4.4f, 6.0f),
                    PathNode.LineTo(19.599f, 6.0f),
                    PathNode.CurveTo(19.739f, 6.0f, 19.809f, 6.0f, 19.862f, 6.027f),
                    PathNode.CurveTo(19.909f, 6.051f, 19.948f, 6.089f, 19.972f, 6.136f),
                    PathNode.CurveTo(19.999f, 6.19f, 19.999f, 6.26f, 19.999f, 6.4f),
                    PathNode.LineTo(19.999f, 17.599f),
                    PathNode.CurveTo(19.999f, 17.739f, 19.999f, 17.809f, 19.972f, 17.862f),
                    PathNode.CurveTo(19.948f, 17.909f, 19.909f, 17.948f, 19.862f, 17.972f),
                    PathNode.CurveTo(19.809f, 17.999f, 19.739f, 17.999f, 19.599f, 17.999f),
                    PathNode.LineTo(4.4f, 17.999f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.996f, 8.0f),
                    PathNode.CurveTo(12.41f, 8.0f, 12.746f, 7.664f, 12.746f, 7.25f),
                    PathNode.CurveTo(12.746f, 6.835f, 12.41f, 6.5f, 11.996f, 6.5f),
                    PathNode.CurveTo(11.582f, 6.5f, 11.246f, 6.835f, 11.246f, 7.25f),
                    PathNode.CurveTo(11.246f, 7.664f, 11.582f, 8.0f, 11.996f, 8.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.999f),
                    PathNode.LineTo(14.0f, 16.999f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.08f, 19.999f),
                    PathNode.CurveTo(3.352f, 19.999f, 2.988f, 19.999f, 2.71f, 19.857f),
                    PathNode.CurveTo(2.465f, 19.732f, 2.266f, 19.533f, 2.142f, 19.289f),
                    PathNode.CurveTo(2.0f, 19.011f, 2.0f, 18.647f, 2.0f, 17.919f),
                    PathNode.LineTo(2.0f, 6.08f),
                    PathNode.CurveTo(2.0f, 5.352f, 2.0f, 4.988f, 2.142f, 4.71f),
                    PathNode.CurveTo(2.266f, 4.465f, 2.465f, 4.266f, 2.71f, 4.141f),
                    PathNode.CurveTo(2.988f, 4.0f, 3.352f, 4.0f, 4.08f, 4.0f),
                    PathNode.LineTo(19.919f, 4.0f),
                    PathNode.CurveTo(20.647f, 4.0f, 21.011f, 4.0f, 21.289f, 4.141f),
                    PathNode.CurveTo(21.533f, 4.266f, 21.732f, 4.465f, 21.857f, 4.71f),
                    PathNode.CurveTo(21.999f, 4.988f, 21.999f, 5.352f, 21.999f, 6.08f),
                    PathNode.LineTo(21.999f, 17.919f),
                    PathNode.CurveTo(21.999f, 18.647f, 21.999f, 19.011f, 21.857f, 19.289f),
                    PathNode.CurveTo(21.732f, 19.533f, 21.533f, 19.732f, 21.289f, 19.857f),
                    PathNode.CurveTo(21.011f, 19.999f, 20.647f, 19.999f, 19.919f, 19.999f),
                    PathNode.LineTo(4.08f, 19.999f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
