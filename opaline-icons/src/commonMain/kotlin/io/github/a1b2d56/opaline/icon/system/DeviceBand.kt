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

/** `icon_wristband_in_use` */
val OpalineIcons.System.DeviceBand: ImageVector
    get() {
        if (_deviceBand != null) return _deviceBand!!
        _deviceBand = ImageVector.Builder(
            name = "DeviceBand",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.499f, -0.2f),
                    PathNode.CurveTo(13.886f, -0.2f, 14.199f, 0.114f, 14.199f, 0.5f),
                    PathNode.LineTo(14.199f, 0.713f),
                    PathNode.CurveTo(14.199f, 1.523f, 14.279f, 2.331f, 14.438f, 3.125f),
                    PathNode.LineTo(14.617f, 4.025f),
                    PathNode.CurveTo(15.259f, 4.357f, 15.698f, 5.026f, 15.698f, 5.799f),
                    PathNode.LineTo(15.698f, 17.198f),
                    PathNode.CurveTo(15.698f, 17.971f, 15.259f, 18.64f, 14.617f, 18.973f),
                    PathNode.LineTo(14.438f, 19.873f),
                    PathNode.CurveTo(14.279f, 20.667f, 14.199f, 21.476f, 14.199f, 22.285f),
                    PathNode.LineTo(14.199f, 22.498f),
                    PathNode.CurveTo(14.199f, 22.885f, 13.886f, 23.198f, 13.499f, 23.198f),
                    PathNode.LineTo(10.499f, 23.198f),
                    PathNode.CurveTo(10.113f, 23.198f, 9.799f, 22.885f, 9.799f, 22.498f),
                    PathNode.LineTo(9.799f, 22.285f),
                    PathNode.CurveTo(9.799f, 21.476f, 9.719f, 20.667f, 9.561f, 19.873f),
                    PathNode.LineTo(9.38f, 18.973f),
                    PathNode.CurveTo(8.738f, 18.64f, 8.299f, 17.971f, 8.299f, 17.198f),
                    PathNode.LineTo(8.299f, 5.799f),
                    PathNode.CurveTo(8.299f, 5.026f, 8.738f, 4.357f, 9.38f, 4.024f),
                    PathNode.LineTo(9.561f, 3.125f),
                    PathNode.CurveTo(9.719f, 2.331f, 9.799f, 1.523f, 9.799f, 0.713f),
                    PathNode.LineTo(9.799f, 0.5f),
                    PathNode.CurveTo(9.799f, 0.114f, 10.113f, -0.2f, 10.499f, -0.2f),
                    PathNode.LineTo(13.499f, -0.2f),
                    PathNode.Close,
                    PathNode.MoveTo(10.852f, 19.198f),
                    PathNode.LineTo(10.933f, 19.599f),
                    PathNode.CurveTo(11.078f, 20.324f, 11.163f, 21.059f, 11.189f, 21.798f),
                    PathNode.LineTo(12.809f, 21.798f),
                    PathNode.CurveTo(12.835f, 21.059f, 12.92f, 20.324f, 13.065f, 19.599f),
                    PathNode.LineTo(13.146f, 19.198f),
                    PathNode.LineTo(10.852f, 19.198f),
                    PathNode.Close,
                    PathNode.MoveTo(10.299f, 5.199f),
                    PathNode.CurveTo(9.968f, 5.2f, 9.7f, 5.468f, 9.699f, 5.799f),
                    PathNode.LineTo(9.699f, 17.198f),
                    PathNode.CurveTo(9.699f, 17.53f, 9.968f, 17.798f, 10.299f, 17.798f),
                    PathNode.LineTo(13.698f, 17.798f),
                    PathNode.CurveTo(14.03f, 17.798f, 14.299f, 17.53f, 14.299f, 17.198f),
                    PathNode.LineTo(14.299f, 5.799f),
                    PathNode.CurveTo(14.299f, 5.468f, 14.029f, 5.199f, 13.698f, 5.199f),
                    PathNode.LineTo(10.299f, 5.199f),
                    PathNode.Close,
                    PathNode.MoveTo(11.189f, 1.2f),
                    PathNode.CurveTo(11.163f, 1.939f, 11.078f, 2.674f, 10.933f, 3.4f),
                    PathNode.LineTo(10.852f, 3.799f),
                    PathNode.LineTo(13.146f, 3.799f),
                    PathNode.LineTo(13.065f, 3.4f),
                    PathNode.CurveTo(12.92f, 2.674f, 12.835f, 1.939f, 12.809f, 1.2f),
                    PathNode.LineTo(11.189f, 1.2f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceBand!!
    }

private var _deviceBand: ImageVector? = null
