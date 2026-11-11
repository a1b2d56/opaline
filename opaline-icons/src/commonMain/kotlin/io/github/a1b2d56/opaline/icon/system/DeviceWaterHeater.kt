// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `icon_smart_water_heater_in_use` */
val OpalineIcons.System.DeviceWaterHeater: ImageVector
    get() {
        if (_deviceWaterHeater != null) return _deviceWaterHeater!!
        _deviceWaterHeater = ImageVector.Builder(
            name = "DeviceWaterHeater",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 20.0f),
                    PathNode.LineTo(8.5f, 20.0f),
                    PathNode.CurveTo(8.776f, 20.0f, 9.0f, 20.224f, 9.0f, 20.5f),
                    PathNode.LineTo(9.0f, 23.5f),
                    PathNode.CurveTo(9.0f, 23.776f, 8.776f, 24.0f, 8.5f, 24.0f),
                    PathNode.LineTo(7.5f, 24.0f),
                    PathNode.CurveTo(7.224f, 24.0f, 7.0f, 23.776f, 7.0f, 23.5f),
                    PathNode.LineTo(7.0f, 20.5f),
                    PathNode.CurveTo(7.0f, 20.224f, 7.224f, 20.0f, 7.5f, 20.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.26f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 20.0f),
                    PathNode.LineTo(16.5f, 20.0f),
                    PathNode.CurveTo(16.776f, 20.0f, 17.0f, 20.224f, 17.0f, 20.5f),
                    PathNode.LineTo(17.0f, 23.5f),
                    PathNode.CurveTo(17.0f, 23.776f, 16.776f, 24.0f, 16.5f, 24.0f),
                    PathNode.LineTo(15.5f, 24.0f),
                    PathNode.CurveTo(15.224f, 24.0f, 15.0f, 23.776f, 15.0f, 23.5f),
                    PathNode.LineTo(15.0f, 20.5f),
                    PathNode.CurveTo(15.0f, 20.224f, 15.224f, 20.0f, 15.5f, 20.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.26f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.775f, 19.5f),
                    PathNode.CurveTo(19.775f, 20.756f, 18.756f, 21.775f, 17.5f, 21.775f),
                    PathNode.LineTo(6.5f, 21.775f),
                    PathNode.CurveTo(5.244f, 21.775f, 4.225f, 20.756f, 4.225f, 19.5f),
                    PathNode.LineTo(4.225f, 18.551f),
                    PathNode.LineTo(19.775f, 18.551f),
                    PathNode.LineTo(19.775f, 19.5f),
                    PathNode.Close,
                    PathNode.MoveTo(17.5f, 1.225f),
                    PathNode.CurveTo(18.756f, 1.225f, 19.775f, 2.244f, 19.775f, 3.5f),
                    PathNode.LineTo(19.775f, 17.0f),
                    PathNode.LineTo(4.225f, 17.0f),
                    PathNode.LineTo(4.225f, 3.5f),
                    PathNode.CurveTo(4.225f, 2.244f, 5.244f, 1.225f, 6.5f, 1.225f),
                    PathNode.LineTo(17.5f, 1.225f),
                    PathNode.Close,
                    PathNode.MoveTo(11.106f, 5.397f),
                    PathNode.CurveTo(10.969f, 5.27f, 10.744f, 5.388f, 10.744f, 5.57f),
                    PathNode.CurveTo(10.744f, 5.834f, 10.705f, 6.076f, 10.642f, 6.298f),
                    PathNode.CurveTo(10.493f, 6.815f, 10.211f, 7.224f, 9.982f, 7.562f),
                    PathNode.CurveTo(9.63f, 8.081f, 8.513f, 9.086f, 8.311f, 10.618f),
                    PathNode.CurveTo(7.953f, 12.621f, 9.963f, 14.329f, 11.873f, 14.329f),
                    PathNode.CurveTo(13.97f, 14.329f, 15.376f, 12.776f, 15.263f, 10.843f),
                    PathNode.CurveTo(15.204f, 9.384f, 14.646f, 8.406f, 14.224f, 7.932f),
                    PathNode.CurveTo(14.136f, 7.834f, 13.98f, 7.899f, 13.959f, 8.025f),
                    PathNode.CurveTo(13.849f, 8.678f, 13.379f, 9.169f, 13.125f, 9.353f),
                    PathNode.CurveTo(13.083f, 7.633f, 11.937f, 6.164f, 11.106f, 5.397f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceWaterHeater!!
    }

private var _deviceWaterHeater: ImageVector? = null
