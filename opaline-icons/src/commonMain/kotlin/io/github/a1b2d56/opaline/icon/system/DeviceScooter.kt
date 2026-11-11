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

/** `icon_car_two_wheel_in_use` */
val OpalineIcons.System.DeviceScooter: ImageVector
    get() {
        if (_deviceScooter != null) return _deviceScooter!!
        _deviceScooter = ImageVector.Builder(
            name = "DeviceScooter",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.002f, 18.002f),
                    PathNode.MoveTo(0.002f, 18.002f),
                    PathNode.CurveTo(0.002f, 16.573f, 0.764f, 15.252f, 2.002f, 14.538f),
                    PathNode.CurveTo(3.24f, 13.823f, 4.764f, 13.823f, 6.002f, 14.538f),
                    PathNode.CurveTo(7.24f, 15.252f, 8.002f, 16.573f, 8.002f, 18.002f),
                    PathNode.CurveTo(8.002f, 20.211f, 6.211f, 22.002f, 4.002f, 22.002f),
                    PathNode.CurveTo(1.793f, 22.002f, 0.002f, 20.211f, 0.002f, 18.002f),
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.002f, 4.502f),
                    PathNode.CurveTo(14.002f, 4.778f, 13.778f, 5.002f, 13.502f, 5.002f),
                    PathNode.LineTo(2.502f, 5.002f),
                    PathNode.CurveTo(2.226f, 5.002f, 2.002f, 4.778f, 2.002f, 4.502f),
                    PathNode.LineTo(2.002f, 3.502f),
                    PathNode.CurveTo(2.002f, 3.226f, 2.226f, 3.002f, 2.502f, 3.002f),
                    PathNode.LineTo(13.502f, 3.002f),
                    PathNode.CurveTo(13.778f, 3.002f, 14.002f, 3.226f, 14.002f, 3.502f),
                    PathNode.LineTo(14.002f, 4.502f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.002f, 22.002f),
                    PathNode.CurveTo(21.211f, 22.002f, 23.002f, 20.211f, 23.002f, 18.002f),
                    PathNode.LineTo(15.002f, 18.002f),
                    PathNode.CurveTo(15.002f, 20.211f, 16.793f, 22.002f, 19.002f, 22.002f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.002f, 8.002f),
                    PathNode.CurveTo(23.107f, 8.002f, 24.002f, 8.897f, 24.002f, 10.002f),
                    PathNode.CurveTo(24.002f, 10.367f, 23.903f, 10.708f, 23.732f, 11.002f),
                    PathNode.LineTo(14.271f, 11.002f),
                    PathNode.CurveTo(14.101f, 10.708f, 14.002f, 10.367f, 14.002f, 10.002f),
                    PathNode.CurveTo(14.002f, 8.897f, 14.897f, 8.002f, 16.002f, 8.002f),
                    PathNode.LineTo(22.002f, 8.002f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.412f, 2.002f),
                    PathNode.CurveTo(7.96f, 2.002f, 8.235f, 2.002f, 8.461f, 2.056f),
                    PathNode.CurveTo(9.199f, 2.23f, 9.774f, 2.805f, 9.948f, 3.543f),
                    PathNode.CurveTo(10.002f, 3.769f, 10.002f, 4.044f, 10.002f, 4.592f),
                    PathNode.LineTo(10.002f, 10.002f),
                    PathNode.CurveTo(10.002f, 11.106f, 10.897f, 12.002f, 12.002f, 12.002f),
                    PathNode.LineTo(13.002f, 12.002f),
                    PathNode.CurveTo(13.52f, 12.002f, 13.946f, 11.609f, 13.997f, 11.104f),
                    PathNode.LineTo(14.007f, 10.899f),
                    PathNode.CurveTo(14.058f, 10.395f, 14.484f, 10.002f, 15.002f, 10.002f),
                    PathNode.LineTo(22.402f, 10.002f),
                    PathNode.CurveTo(22.962f, 10.002f, 23.242f, 10.001f, 23.456f, 10.11f),
                    PathNode.CurveTo(23.644f, 10.206f, 23.797f, 10.36f, 23.893f, 10.548f),
                    PathNode.CurveTo(24.001f, 10.762f, 24.002f, 11.042f, 24.002f, 11.602f),
                    PathNode.LineTo(24.002f, 16.401f),
                    PathNode.CurveTo(24.002f, 16.961f, 24.002f, 17.242f, 23.893f, 17.456f),
                    PathNode.CurveTo(23.797f, 17.644f, 23.644f, 17.797f, 23.456f, 17.893f),
                    PathNode.CurveTo(23.242f, 18.001f, 22.962f, 18.002f, 22.402f, 18.002f),
                    PathNode.LineTo(12.202f, 18.002f),
                    PathNode.CurveTo(11.376f, 18.002f, 10.962f, 18.002f, 10.692f, 17.925f),
                    PathNode.CurveTo(10.286f, 17.809f, 10.367f, 17.849f, 10.031f, 17.593f),
                    PathNode.CurveTo(9.808f, 17.423f, 9.209f, 16.62f, 8.013f, 15.016f),
                    PathNode.CurveTo(7.101f, 13.793f, 5.644f, 13.002f, 4.002f, 13.002f),
                    PathNode.CurveTo(3.515f, 13.002f, 3.045f, 13.071f, 2.6f, 13.201f),
                    PathNode.CurveTo(1.889f, 13.408f, 1.002f, 12.945f, 1.002f, 12.205f),
                    PathNode.CurveTo(1.002f, 12.071f, 1.032f, 11.939f, 1.09f, 11.818f),
                    PathNode.LineTo(2.002f, 9.908f),
                    PathNode.LineTo(2.002f, 10.002f),
                    PathNode.LineTo(7.002f, 10.002f),
                    PathNode.CurveTo(7.554f, 10.002f, 8.002f, 9.554f, 8.002f, 9.002f),
                    PathNode.CurveTo(8.002f, 8.45f, 7.554f, 8.002f, 7.002f, 8.002f),
                    PathNode.LineTo(2.913f, 8.002f),
                    PathNode.LineTo(5.075f, 3.476f),
                    PathNode.CurveTo(5.23f, 3.152f, 5.308f, 2.99f, 5.403f, 2.854f),
                    PathNode.CurveTo(5.711f, 2.415f, 6.182f, 2.118f, 6.71f, 2.029f),
                    PathNode.CurveTo(6.874f, 2.002f, 7.053f, 2.002f, 7.412f, 2.002f),
                    PathNode.Close,
                    PathNode.MoveTo(18.002f, 14.002f),
                    PathNode.LineTo(18.002f, 15.502f),
                    PathNode.LineTo(22.002f, 15.502f),
                    PathNode.LineTo(22.002f, 14.002f),
                    PathNode.LineTo(18.002f, 14.002f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceScooter!!
    }

private var _deviceScooter: ImageVector? = null
