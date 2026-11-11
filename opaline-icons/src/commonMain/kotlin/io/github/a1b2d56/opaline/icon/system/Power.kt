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

/** `oplus_qs_shutdown_tile_icon` */
val OpalineIcons.System.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = ImageVector.Builder(
            name = "Power",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.622f, 4.445f),
                    PathNode.CurveTo(15.909f, 3.953f, 16.519f, 3.767f, 17.026f, 3.997f),
                    PathNode.LineTo(17.127f, 4.049f),
                    PathNode.LineTo(17.414f, 4.223f),
                    PathNode.CurveTo(18.834f, 5.115f, 20.021f, 6.351f, 20.857f, 7.829f),
                    PathNode.CurveTo(22.031f, 9.903f, 22.44f, 12.322f, 22.013f, 14.666f),
                    PathNode.CurveTo(21.585f, 17.01f, 20.349f, 19.13f, 18.52f, 20.656f),
                    PathNode.CurveTo(16.69f, 22.182f, 14.382f, 23.018f, 12.0f, 23.019f),
                    PathNode.CurveTo(9.617f, 23.018f, 7.31f, 22.182f, 5.48f, 20.656f),
                    PathNode.CurveTo(3.651f, 19.13f, 2.415f, 17.01f, 1.987f, 14.666f),
                    PathNode.CurveTo(1.56f, 12.322f, 1.968f, 9.903f, 3.142f, 7.829f),
                    PathNode.CurveTo(4.034f, 6.252f, 5.325f, 4.951f, 6.873f, 4.049f),
                    PathNode.CurveTo(7.398f, 3.743f, 8.071f, 3.921f, 8.377f, 4.445f),
                    PathNode.CurveTo(8.683f, 4.97f, 8.505f, 5.643f, 7.98f, 5.949f),
                    PathNode.CurveTo(6.768f, 6.657f, 5.756f, 7.676f, 5.057f, 8.912f),
                    PathNode.CurveTo(4.137f, 10.538f, 3.816f, 12.434f, 4.151f, 14.271f),
                    PathNode.CurveTo(4.486f, 16.109f, 5.456f, 17.771f, 6.89f, 18.967f),
                    PathNode.CurveTo(8.324f, 20.163f, 10.132f, 20.818f, 12.0f, 20.818f),
                    PathNode.CurveTo(13.867f, 20.818f, 15.676f, 20.163f, 17.11f, 18.967f),
                    PathNode.CurveTo(18.544f, 17.771f, 19.513f, 16.109f, 19.848f, 14.271f),
                    PathNode.CurveTo(20.183f, 12.434f, 19.863f, 10.538f, 18.943f, 8.912f),
                    PathNode.CurveTo(18.288f, 7.753f, 17.357f, 6.785f, 16.243f, 6.086f),
                    PathNode.LineTo(16.019f, 5.949f),
                    PathNode.LineTo(15.924f, 5.888f),
                    PathNode.CurveTo(15.473f, 5.56f, 15.336f, 4.937f, 15.622f, 4.445f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 0.898f),
                    PathNode.CurveTo(12.607f, 0.898f, 13.099f, 1.391f, 13.1f, 1.998f),
                    PathNode.LineTo(13.1f, 10.998f),
                    PathNode.CurveTo(13.1f, 11.606f, 12.608f, 12.098f, 12.0f, 12.098f),
                    PathNode.CurveTo(11.392f, 12.098f, 10.9f, 11.606f, 10.9f, 10.998f),
                    PathNode.LineTo(10.9f, 1.998f),
                    PathNode.CurveTo(10.901f, 1.391f, 11.393f, 0.898f, 12.0f, 0.898f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _power!!
    }

private var _power: ImageVector? = null
