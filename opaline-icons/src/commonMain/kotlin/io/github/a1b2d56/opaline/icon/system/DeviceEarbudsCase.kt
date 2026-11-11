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

/** `icon_headset_box` */
val OpalineIcons.System.DeviceEarbudsCase: ImageVector
    get() {
        if (_deviceEarbudsCase != null) return _deviceEarbudsCase!!
        _deviceEarbudsCase = ImageVector.Builder(
            name = "DeviceEarbudsCase",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.146f, 10.3f),
                    PathNode.CurveTo(7.363f, 10.715f, 7.798f, 11.0f, 8.3f, 11.0f),
                    PathNode.LineTo(15.699f, 11.0f),
                    PathNode.CurveTo(16.201f, 11.0f, 16.636f, 10.715f, 16.853f, 10.3f),
                    PathNode.LineTo(22.408f, 10.3f),
                    PathNode.CurveTo(22.447f, 10.556f, 22.473f, 10.817f, 22.487f, 11.081f),
                    PathNode.CurveTo(22.498f, 11.293f, 22.498f, 11.541f, 22.498f, 11.999f),
                    PathNode.CurveTo(22.498f, 12.457f, 22.498f, 12.705f, 22.487f, 12.918f),
                    PathNode.CurveTo(22.273f, 17.006f, 19.007f, 20.274f, 14.918f, 20.488f),
                    PathNode.CurveTo(14.705f, 20.499f, 14.457f, 20.499f, 13.999f, 20.499f),
                    PathNode.LineTo(9.999f, 20.499f),
                    PathNode.CurveTo(9.542f, 20.499f, 9.293f, 20.499f, 9.081f, 20.488f),
                    PathNode.CurveTo(4.992f, 20.274f, 1.725f, 17.006f, 1.511f, 12.918f),
                    PathNode.CurveTo(1.5f, 12.705f, 1.5f, 12.457f, 1.5f, 11.999f),
                    PathNode.CurveTo(1.5f, 11.541f, 1.5f, 11.293f, 1.511f, 11.081f),
                    PathNode.CurveTo(1.525f, 10.817f, 1.551f, 10.556f, 1.59f, 10.3f),
                    PathNode.LineTo(7.146f, 10.3f),
                    PathNode.Close,
                    PathNode.MoveTo(11.999f, 12.999f),
                    PathNode.CurveTo(11.447f, 12.999f, 10.999f, 13.447f, 10.999f, 13.999f),
                    PathNode.CurveTo(10.999f, 14.551f, 11.447f, 14.999f, 11.999f, 14.999f),
                    PathNode.CurveTo(12.551f, 14.999f, 12.999f, 14.551f, 12.999f, 13.999f),
                    PathNode.CurveTo(12.999f, 13.447f, 12.551f, 12.999f, 11.999f, 12.999f),
                    PathNode.Close,
                    PathNode.MoveTo(13.999f, 3.5f),
                    PathNode.CurveTo(14.457f, 3.5f, 14.705f, 3.499f, 14.918f, 3.51f),
                    PathNode.CurveTo(18.283f, 3.687f, 21.088f, 5.932f, 22.097f, 9.0f),
                    PathNode.LineTo(16.963f, 9.0f),
                    PathNode.CurveTo(16.827f, 8.427f, 16.314f, 8.0f, 15.699f, 8.0f),
                    PathNode.LineTo(8.3f, 8.0f),
                    PathNode.CurveTo(7.685f, 8.0f, 7.172f, 8.427f, 7.036f, 9.0f),
                    PathNode.LineTo(1.901f, 9.0f),
                    PathNode.CurveTo(2.91f, 5.932f, 5.716f, 3.687f, 9.081f, 3.51f),
                    PathNode.CurveTo(9.293f, 3.499f, 9.542f, 3.5f, 9.999f, 3.5f),
                    PathNode.LineTo(13.999f, 3.5f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceEarbudsCase!!
    }

private var _deviceEarbudsCase: ImageVector? = null
