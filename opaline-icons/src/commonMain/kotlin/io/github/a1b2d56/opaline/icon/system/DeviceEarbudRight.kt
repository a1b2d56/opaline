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

/** `icon_headset_right` */
val OpalineIcons.System.DeviceEarbudRight: ImageVector
    get() {
        if (_deviceEarbudRight != null) return _deviceEarbudRight!!
        _deviceEarbudRight = ImageVector.Builder(
            name = "DeviceEarbudRight",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.514f, 6.202f),
                    PathNode.CurveTo(9.108f, 5.697f, 7.589f, 6.445f, 6.995f, 7.742f),
                    PathNode.CurveTo(6.438f, 8.959f, 6.401f, 10.371f, 7.094f, 11.571f),
                    PathNode.CurveTo(7.693f, 12.609f, 8.707f, 13.256f, 9.833f, 13.491f),
                    PathNode.CurveTo(10.167f, 13.56f, 10.507f, 13.568f, 10.836f, 13.52f),
                    PathNode.CurveTo(11.364f, 13.439f, 11.864f, 13.215f, 12.271f, 12.871f),
                    PathNode.CurveTo(12.274f, 12.87f, 12.277f, 12.869f, 12.28f, 12.869f),
                    PathNode.CurveTo(12.631f, 12.572f, 12.913f, 12.189f, 13.082f, 11.731f),
                    PathNode.CurveTo(13.509f, 10.571f, 13.443f, 9.24f, 12.779f, 8.09f),
                    PathNode.CurveTo(12.252f, 7.178f, 11.437f, 6.533f, 10.514f, 6.202f),
                    PathNode.Close,
                    PathNode.MoveTo(16.348f, 4.379f),
                    PathNode.CurveTo(14.648f, 2.68f, 11.819f, 3.044f, 9.877f, 4.745f),
                    PathNode.CurveTo(10.234f, 4.77f, 10.597f, 4.843f, 10.956f, 4.972f),
                    PathNode.CurveTo(12.157f, 5.404f, 13.223f, 6.245f, 13.911f, 7.437f),
                    PathNode.CurveTo(14.78f, 8.941f, 14.861f, 10.679f, 14.309f, 12.182f),
                    PathNode.CurveTo(14.306f, 12.19f, 14.303f, 12.198f, 14.3f, 12.206f),
                    PathNode.CurveTo(14.802f, 11.93f, 15.277f, 11.577f, 15.699f, 11.155f),
                    PathNode.CurveTo(17.639f, 9.215f, 18.138f, 6.17f, 16.348f, 4.379f),
                    PathNode.Close,
                    PathNode.MoveTo(8.121f, 8.621f),
                    PathNode.CurveTo(8.619f, 8.333f, 9.462f, 8.86f, 10.004f, 9.797f),
                    PathNode.CurveTo(10.545f, 10.735f, 10.58f, 11.728f, 10.082f, 12.015f),
                    PathNode.CurveTo(9.584f, 12.303f, 8.742f, 11.776f, 8.2f, 10.838f),
                    PathNode.CurveTo(7.659f, 9.901f, 7.623f, 8.908f, 8.121f, 8.621f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.502f, 13.549f),
                    PathNode.CurveTo(14.582f, 14.163f, 13.523f, 14.581f, 12.447f, 14.72f),
                    PathNode.CurveTo(12.024f, 14.947f, 11.565f, 15.101f, 11.096f, 15.183f),
                    PathNode.LineTo(11.096f, 19.087f),
                    PathNode.CurveTo(11.096f, 20.304f, 12.082f, 21.291f, 13.299f, 21.292f),
                    PathNode.CurveTo(14.516f, 21.292f, 15.502f, 20.304f, 15.502f, 19.087f),
                    PathNode.LineTo(15.502f, 13.549f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceEarbudRight!!
    }

private var _deviceEarbudRight: ImageVector? = null
