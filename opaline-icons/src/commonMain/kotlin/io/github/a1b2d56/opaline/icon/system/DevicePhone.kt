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

/** `icon_phone_in_use` */
val OpalineIcons.System.DevicePhone: ImageVector
    get() {
        if (_devicePhone != null) return _devicePhone!!
        _devicePhone = ImageVector.Builder(
            name = "DevicePhone",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.25f, 4.0f),
                    PathNode.LineTo(15.749f, 4.0f),
                    PathNode.CurveTo(15.887f, 4.0f, 15.999f, 4.112f, 15.999f, 4.25f),
                    PathNode.LineTo(15.999f, 19.748f),
                    PathNode.CurveTo(15.999f, 19.886f, 15.887f, 19.998f, 15.749f, 19.998f),
                    PathNode.LineTo(8.25f, 19.998f),
                    PathNode.CurveTo(8.112f, 19.998f, 8.0f, 19.886f, 8.0f, 19.748f),
                    PathNode.LineTo(8.0f, 4.25f),
                    PathNode.CurveTo(8.0f, 4.112f, 8.112f, 4.0f, 8.25f, 4.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.996f, 6.0f),
                    PathNode.CurveTo(12.41f, 6.0f, 12.746f, 5.664f, 12.746f, 5.25f),
                    PathNode.CurveTo(12.746f, 4.835f, 12.41f, 4.5f, 11.996f, 4.5f),
                    PathNode.CurveTo(11.582f, 4.5f, 11.246f, 4.835f, 11.246f, 5.25f),
                    PathNode.CurveTo(11.246f, 5.664f, 11.582f, 6.0f, 11.996f, 6.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.302f, 2.0f),
                    PathNode.LineTo(16.701f, 2.0f),
                    PathNode.CurveTo(17.419f, 2.0f, 18.001f, 2.582f, 18.001f, 3.3f),
                    PathNode.LineTo(18.001f, 20.698f),
                    PathNode.CurveTo(18.001f, 21.416f, 17.419f, 21.998f, 16.701f, 21.998f),
                    PathNode.LineTo(7.302f, 21.998f),
                    PathNode.CurveTo(6.584f, 21.998f, 6.002f, 21.416f, 6.002f, 20.698f),
                    PathNode.LineTo(6.002f, 3.3f),
                    PathNode.CurveTo(6.002f, 2.582f, 6.584f, 2.0f, 7.302f, 2.0f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 18.999f),
                    PathNode.LineTo(14.0f, 18.999f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _devicePhone!!
    }

private var _devicePhone: ImageVector? = null
