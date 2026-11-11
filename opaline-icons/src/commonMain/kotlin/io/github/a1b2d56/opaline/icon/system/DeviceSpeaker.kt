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

/** `icon_third_bluetooth_in_use` */
val OpalineIcons.System.DeviceSpeaker: ImageVector
    get() {
        if (_deviceSpeaker != null) return _deviceSpeaker!!
        _deviceSpeaker = ImageVector.Builder(
            name = "DeviceSpeaker",
            defaultWidth = 28.0f.dp,
            defaultHeight = 28.0f.dp,
            viewportWidth = 28.0f,
            viewportHeight = 28.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.063f, 5.0f),
                    PathNode.CurveTo(16.063f, 4.717f, 15.892f, 4.462f, 15.631f, 4.353f),
                    PathNode.CurveTo(15.369f, 4.245f, 15.068f, 4.305f, 14.868f, 4.505f),
                    PathNode.LineTo(10.249f, 9.124f),
                    PathNode.CurveTo(10.136f, 9.237f, 9.984f, 9.3f, 9.825f, 9.3f),
                    PathNode.LineTo(6.663f, 9.3f),
                    PathNode.CurveTo(5.559f, 9.3f, 4.663f, 10.195f, 4.663f, 11.3f),
                    PathNode.LineTo(4.663f, 16.7f),
                    PathNode.CurveTo(4.663f, 17.805f, 5.558f, 18.7f, 6.663f, 18.7f),
                    PathNode.LineTo(9.825f, 18.7f),
                    PathNode.CurveTo(9.984f, 18.7f, 10.136f, 18.763f, 10.249f, 18.876f),
                    PathNode.LineTo(14.868f, 23.495f),
                    PathNode.CurveTo(15.068f, 23.695f, 15.369f, 23.755f, 15.631f, 23.647f),
                    PathNode.CurveTo(15.892f, 23.538f, 16.063f, 23.283f, 16.063f, 23.0f),
                    PathNode.LineTo(16.063f, 5.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.414f, 11.113f),
                    PathNode.CurveTo(18.96f, 11.942f, 19.278f, 12.934f, 19.278f, 14.0f),
                    PathNode.CurveTo(19.278f, 15.066f, 18.96f, 16.058f, 18.414f, 16.886f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 0.2f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.945f, 8.874f),
                    PathNode.CurveTo(22.008f, 10.306f, 22.637f, 12.08f, 22.637f, 14.0f),
                    PathNode.CurveTo(22.637f, 15.921f, 22.008f, 17.694f, 20.945f, 19.126f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 0.2f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceSpeaker!!
    }

private var _deviceSpeaker: ImageVector? = null
