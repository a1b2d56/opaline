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

/** `icon_pencil_in_use` */
val OpalineIcons.System.DeviceStylus: ImageVector
    get() {
        if (_deviceStylus != null) return _deviceStylus!!
        _deviceStylus = ImageVector.Builder(
            name = "DeviceStylus",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.142f, 3.235f),
                    PathNode.CurveTo(21.819f, 3.912f, 21.942f, 4.886f, 21.417f, 5.411f),
                    PathNode.LineTo(7.094f, 19.734f),
                    PathNode.CurveTo(6.924f, 19.905f, 6.722f, 20.042f, 6.495f, 20.143f),
                    PathNode.LineTo(5.948f, 20.384f),
                    PathNode.CurveTo(5.872f, 20.418f, 5.784f, 20.401f, 5.726f, 20.343f),
                    PathNode.LineTo(3.657f, 18.274f),
                    PathNode.CurveTo(3.599f, 18.216f, 3.582f, 18.127f, 3.615f, 18.052f),
                    PathNode.LineTo(3.858f, 17.506f),
                    PathNode.CurveTo(3.958f, 17.279f, 4.095f, 17.076f, 4.266f, 16.905f),
                    PathNode.LineTo(18.589f, 2.582f),
                    PathNode.CurveTo(19.114f, 2.058f, 20.088f, 2.181f, 20.765f, 2.858f),
                    PathNode.LineTo(21.142f, 3.235f),
                    PathNode.Close,
                    PathNode.MoveTo(9.541f, 14.46f),
                    PathNode.CurveTo(9.287f, 14.206f, 8.876f, 14.206f, 8.622f, 14.46f),
                    PathNode.LineTo(6.005f, 17.076f),
                    PathNode.CurveTo(5.751f, 17.33f, 5.751f, 17.742f, 6.005f, 17.996f),
                    PathNode.CurveTo(6.259f, 18.25f, 6.671f, 18.249f, 6.924f, 17.995f),
                    PathNode.LineTo(9.541f, 15.379f),
                    PathNode.CurveTo(9.795f, 15.125f, 9.794f, 14.714f, 9.541f, 14.46f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.92f, 20.952f),
                    PathNode.LineTo(3.043f, 19.075f),
                    PathNode.LineTo(2.399f, 20.991f),
                    PathNode.CurveTo(2.311f, 21.261f, 2.739f, 21.689f, 3.008f, 21.601f),
                    PathNode.LineTo(4.92f, 20.952f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceStylus!!
    }

private var _deviceStylus: ImageVector? = null
