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

/** `icon_imac_in_use` */
val OpalineIcons.System.DeviceDesktop: ImageVector
    get() {
        if (_deviceDesktop != null) return _deviceDesktop!!
        _deviceDesktop = ImageVector.Builder(
            name = "DeviceDesktop",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 5.4f),
                    PathNode.CurveTo(4.0f, 5.26f, 4.0f, 5.19f, 4.027f, 5.136f),
                    PathNode.CurveTo(4.051f, 5.089f, 4.089f, 5.051f, 4.136f, 5.027f),
                    PathNode.CurveTo(4.19f, 5.0f, 4.26f, 5.0f, 4.4f, 5.0f),
                    PathNode.LineTo(19.599f, 5.0f),
                    PathNode.CurveTo(19.739f, 5.0f, 19.809f, 5.0f, 19.862f, 5.027f),
                    PathNode.CurveTo(19.909f, 5.051f, 19.948f, 5.089f, 19.972f, 5.136f),
                    PathNode.CurveTo(19.999f, 5.19f, 19.999f, 5.26f, 19.999f, 5.4f),
                    PathNode.LineTo(19.999f, 12.6f),
                    PathNode.CurveTo(19.999f, 12.74f, 19.999f, 12.81f, 19.972f, 12.863f),
                    PathNode.CurveTo(19.948f, 12.91f, 19.909f, 12.949f, 19.862f, 12.973f),
                    PathNode.CurveTo(19.809f, 13.0f, 19.739f, 13.0f, 19.599f, 13.0f),
                    PathNode.LineTo(4.4f, 13.0f),
                    PathNode.CurveTo(4.26f, 13.0f, 4.19f, 13.0f, 4.136f, 12.973f),
                    PathNode.CurveTo(4.089f, 12.949f, 4.051f, 12.91f, 4.027f, 12.863f),
                    PathNode.CurveTo(4.0f, 12.81f, 4.0f, 12.74f, 4.0f, 12.6f),
                    PathNode.LineTo(4.0f, 5.4f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.26f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.453f, 20.25f),
                    PathNode.CurveTo(6.453f, 19.836f, 6.789f, 19.5f, 7.203f, 19.5f),
                    PathNode.LineTo(16.703f, 19.5f),
                    PathNode.CurveTo(17.117f, 19.5f, 17.453f, 19.836f, 17.453f, 20.25f),
                    PathNode.CurveTo(17.453f, 20.664f, 17.117f, 21.0f, 16.703f, 21.0f),
                    PathNode.LineTo(7.203f, 21.0f),
                    PathNode.CurveTo(6.789f, 21.0f, 6.453f, 20.664f, 6.453f, 20.25f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 17.0f),
                    PathNode.CurveTo(11.453f, 17.0f, 12.453f, 17.0f, 14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 18.5f, 14.004f, 19.5f, 14.004f, 19.5f),
                    PathNode.LineTo(10.0f, 19.5f),
                    PathNode.CurveTo(10.0f, 19.5f, 10.0f, 18.5f, 10.0f, 17.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.697f, 2.3f),
                    PathNode.CurveTo(21.802f, 2.3f, 22.697f, 3.195f, 22.697f, 4.3f),
                    PathNode.LineTo(22.697f, 15.199f),
                    PathNode.CurveTo(22.697f, 16.303f, 21.802f, 17.199f, 20.697f, 17.199f),
                    PathNode.LineTo(3.299f, 17.199f),
                    PathNode.CurveTo(2.194f, 17.199f, 1.299f, 16.303f, 1.299f, 15.199f),
                    PathNode.LineTo(1.299f, 4.3f),
                    PathNode.CurveTo(1.299f, 3.195f, 2.194f, 2.3f, 3.299f, 2.3f),
                    PathNode.LineTo(20.697f, 2.3f),
                    PathNode.Close,
                    PathNode.MoveTo(11.953f, 15.25f),
                    PathNode.CurveTo(11.539f, 15.25f, 11.203f, 15.586f, 11.203f, 16.0f),
                    PathNode.CurveTo(11.203f, 16.414f, 11.539f, 16.75f, 11.953f, 16.75f),
                    PathNode.CurveTo(12.367f, 16.75f, 12.703f, 16.414f, 12.703f, 16.0f),
                    PathNode.CurveTo(12.703f, 15.586f, 12.367f, 15.25f, 11.953f, 15.25f),
                    PathNode.Close,
                    PathNode.MoveTo(3.299f, 3.7f),
                    PathNode.CurveTo(2.968f, 3.7f, 2.699f, 3.969f, 2.699f, 4.3f),
                    PathNode.LineTo(2.699f, 14.5f),
                    PathNode.LineTo(21.298f, 14.5f),
                    PathNode.LineTo(21.298f, 4.3f),
                    PathNode.CurveTo(21.298f, 3.969f, 21.028f, 3.7f, 20.697f, 3.7f),
                    PathNode.LineTo(3.299f, 3.7f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.9f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceDesktop!!
    }

private var _deviceDesktop: ImageVector? = null
