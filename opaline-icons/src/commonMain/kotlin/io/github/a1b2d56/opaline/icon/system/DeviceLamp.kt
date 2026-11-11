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

/** `icon_lamp_in_use` */
val OpalineIcons.System.DeviceLamp: ImageVector
    get() {
        if (_deviceLamp != null) return _deviceLamp!!
        _deviceLamp = ImageVector.Builder(
            name = "DeviceLamp",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.599f, 21.586f),
                    PathNode.CurveTo(13.985f, 21.587f, 14.299f, 21.9f, 14.299f, 22.287f),
                    PathNode.CurveTo(14.299f, 22.673f, 13.985f, 22.986f, 13.599f, 22.987f),
                    PathNode.LineTo(10.365f, 22.987f),
                    PathNode.CurveTo(9.979f, 22.987f, 9.665f, 22.673f, 9.665f, 22.287f),
                    PathNode.CurveTo(9.665f, 21.9f, 9.979f, 21.586f, 10.365f, 21.586f),
                    PathNode.LineTo(13.599f, 21.586f),
                    PathNode.Close,
                    PathNode.MoveTo(14.904f, 18.897f),
                    PathNode.CurveTo(15.291f, 18.897f, 15.604f, 19.211f, 15.604f, 19.597f),
                    PathNode.CurveTo(15.604f, 19.984f, 15.291f, 20.297f, 14.904f, 20.297f),
                    PathNode.LineTo(9.061f, 20.297f),
                    PathNode.CurveTo(8.674f, 20.297f, 8.36f, 19.984f, 8.36f, 19.597f),
                    PathNode.CurveTo(8.36f, 19.211f, 8.674f, 18.897f, 9.061f, 18.897f),
                    PathNode.LineTo(14.904f, 18.897f),
                    PathNode.Close,
                    PathNode.MoveTo(11.999f, 1.715f),
                    PathNode.CurveTo(13.99f, 1.774f, 16.011f, 2.616f, 17.385f, 4.059f),
                    PathNode.CurveTo(18.758f, 5.502f, 19.506f, 7.429f, 19.466f, 9.42f),
                    PathNode.LineTo(19.466f, 9.431f),
                    PathNode.CurveTo(19.404f, 11.298f, 18.642f, 13.074f, 17.331f, 14.405f),
                    PathNode.CurveTo(16.977f, 14.766f, 16.697f, 15.195f, 16.508f, 15.664f),
                    PathNode.LineTo(15.861f, 17.284f),
                    PathNode.CurveTo(15.785f, 17.473f, 15.601f, 17.598f, 15.396f, 17.598f),
                    PathNode.LineTo(11.999f, 17.598f),
                    PathNode.LineTo(11.999f, 17.593f),
                    PathNode.LineTo(8.601f, 17.593f),
                    PathNode.CurveTo(8.396f, 17.593f, 8.212f, 17.469f, 8.136f, 17.279f),
                    PathNode.LineTo(7.49f, 15.66f),
                    PathNode.CurveTo(7.301f, 15.191f, 7.021f, 14.761f, 6.666f, 14.4f),
                    PathNode.CurveTo(5.355f, 13.069f, 4.593f, 11.294f, 4.531f, 9.427f),
                    PathNode.LineTo(4.531f, 9.415f),
                    PathNode.CurveTo(4.491f, 7.424f, 5.239f, 5.498f, 6.612f, 4.055f),
                    PathNode.CurveTo(7.986f, 2.612f, 10.008f, 1.77f, 11.999f, 1.711f),
                    PathNode.LineTo(11.999f, 1.715f),
                    PathNode.Close,
                    PathNode.MoveTo(10.835f, 4.524f),
                    PathNode.CurveTo(10.702f, 4.19f, 10.324f, 4.028f, 9.99f, 4.161f),
                    PathNode.CurveTo(8.516f, 4.748f, 7.36f, 5.961f, 6.851f, 7.474f),
                    PathNode.CurveTo(6.736f, 7.814f, 6.92f, 8.183f, 7.26f, 8.297f),
                    PathNode.CurveTo(7.6f, 8.411f, 7.968f, 8.229f, 8.083f, 7.889f),
                    PathNode.CurveTo(8.47f, 6.74f, 9.35f, 5.814f, 10.472f, 5.368f),
                    PathNode.CurveTo(10.805f, 5.235f, 10.967f, 4.857f, 10.835f, 4.524f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceLamp!!
    }

private var _deviceLamp: ImageVector? = null
