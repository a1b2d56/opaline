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

/** `icon_smart_wash_machine_in_use` */
val OpalineIcons.System.DeviceWasher: ImageVector
    get() {
        if (_deviceWasher != null) return _deviceWasher!!
        _deviceWasher = ImageVector.Builder(
            name = "DeviceWasher",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.5f, 1.225f),
                    PathNode.CurveTo(19.756f, 1.225f, 20.775f, 2.244f, 20.775f, 3.5f),
                    PathNode.LineTo(20.775f, 20.5f),
                    PathNode.CurveTo(20.775f, 21.756f, 19.756f, 22.775f, 18.5f, 22.775f),
                    PathNode.LineTo(5.5f, 22.775f),
                    PathNode.CurveTo(4.244f, 22.775f, 3.225f, 21.756f, 3.225f, 20.5f),
                    PathNode.LineTo(3.225f, 3.5f),
                    PathNode.CurveTo(3.225f, 2.244f, 4.244f, 1.225f, 5.5f, 1.225f),
                    PathNode.LineTo(18.5f, 1.225f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 17.5f),
                    PathNode.CurveTo(16.172f, 17.5f, 15.5f, 18.172f, 15.5f, 19.0f),
                    PathNode.CurveTo(15.5f, 19.828f, 16.172f, 20.5f, 17.0f, 20.5f),
                    PathNode.CurveTo(17.828f, 20.5f, 18.5f, 19.828f, 18.5f, 19.0f),
                    PathNode.CurveTo(18.5f, 18.172f, 17.828f, 17.5f, 17.0f, 17.5f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 6.975f),
                    PathNode.CurveTo(8.811f, 6.975f, 6.225f, 9.561f, 6.225f, 12.75f),
                    PathNode.CurveTo(6.225f, 15.939f, 8.811f, 18.525f, 12.0f, 18.525f),
                    PathNode.CurveTo(15.189f, 18.525f, 17.775f, 15.939f, 17.775f, 12.75f),
                    PathNode.CurveTo(17.775f, 9.561f, 15.189f, 6.975f, 12.0f, 6.975f),
                    PathNode.Close,
                    PathNode.MoveTo(9.5f, 4.0f),
                    PathNode.CurveTo(9.224f, 4.0f, 9.0f, 4.224f, 9.0f, 4.5f),
                    PathNode.LineTo(9.0f, 5.5f),
                    PathNode.CurveTo(9.0f, 5.776f, 9.224f, 6.0f, 9.5f, 6.0f),
                    PathNode.LineTo(14.5f, 6.0f),
                    PathNode.CurveTo(14.776f, 6.0f, 15.0f, 5.776f, 15.0f, 5.5f),
                    PathNode.LineTo(15.0f, 4.5f),
                    PathNode.CurveTo(15.0f, 4.224f, 14.776f, 4.0f, 14.5f, 4.0f),
                    PathNode.LineTo(9.5f, 4.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.75f),
                    PathNode.CurveTo(16.0f, 14.959f, 14.209f, 16.75f, 12.0f, 16.75f),
                    PathNode.CurveTo(9.791f, 16.75f, 8.0f, 14.959f, 8.0f, 12.75f),
                    PathNode.CurveTo(8.0f, 10.541f, 9.791f, 8.75f, 12.0f, 8.75f),
                    PathNode.CurveTo(14.209f, 8.75f, 16.0f, 10.541f, 16.0f, 12.75f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.26f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceWasher!!
    }

private var _deviceWasher: ImageVector? = null
