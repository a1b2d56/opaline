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

/** `systemui_icon_volume_ringer_multi_app_multi_app` */
val OpalineIcons.System.VolumeRinger: ImageVector
    get() {
        if (_volumeRinger != null) return _volumeRinger!!
        _volumeRinger = ImageVector.Builder(
            name = "VolumeRinger",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.498f, 2.187f),
                    PathNode.CurveTo(19.696f, 2.165f, 19.894f, 2.228f, 20.042f, 2.361f),
                    PathNode.CurveTo(20.19f, 2.494f, 20.275f, 2.683f, 20.275f, 2.882f),
                    PathNode.LineTo(20.275f, 17.205f),
                    PathNode.CurveTo(20.275f, 19.014f, 18.808f, 20.481f, 16.999f, 20.481f),
                    PathNode.CurveTo(15.19f, 20.481f, 13.724f, 19.014f, 13.724f, 17.205f),
                    PathNode.CurveTo(13.724f, 15.396f, 15.19f, 13.93f, 16.999f, 13.929f),
                    PathNode.CurveTo(17.697f, 13.929f, 18.344f, 14.148f, 18.875f, 14.519f),
                    PathNode.LineTo(18.875f, 6.996f),
                    PathNode.LineTo(8.275f, 8.172f),
                    PathNode.LineTo(8.275f, 18.538f),
                    PathNode.CurveTo(8.275f, 20.347f, 6.809f, 21.813f, 5.0f, 21.813f),
                    PathNode.CurveTo(3.191f, 21.813f, 1.724f, 20.347f, 1.724f, 18.538f),
                    PathNode.CurveTo(1.724f, 16.729f, 3.191f, 15.261f, 5.0f, 15.261f),
                    PathNode.CurveTo(5.698f, 15.262f, 6.344f, 15.48f, 6.875f, 15.852f),
                    PathNode.LineTo(6.875f, 4.214f),
                    PathNode.CurveTo(6.875f, 3.857f, 7.144f, 3.558f, 7.498f, 3.518f),
                    PathNode.LineTo(19.498f, 2.187f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeRinger!!
    }

private var _volumeRinger: ImageVector? = null
