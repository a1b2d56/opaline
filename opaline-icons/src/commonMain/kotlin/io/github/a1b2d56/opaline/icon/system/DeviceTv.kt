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

/** `icon_tv_in_use` */
val OpalineIcons.System.DeviceTv: ImageVector
    get() {
        if (_deviceTv != null) return _deviceTv!!
        _deviceTv = ImageVector.Builder(
            name = "DeviceTv",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.25f, 6.5f),
                    PathNode.LineTo(20.749f, 6.5f),
                    PathNode.CurveTo(20.887f, 6.5f, 20.999f, 6.612f, 20.999f, 6.75f),
                    PathNode.LineTo(20.999f, 15.249f),
                    PathNode.CurveTo(20.999f, 15.387f, 20.887f, 15.499f, 20.749f, 15.499f),
                    PathNode.LineTo(3.25f, 15.499f),
                    PathNode.CurveTo(3.112f, 15.499f, 3.0f, 15.387f, 3.0f, 15.249f),
                    PathNode.LineTo(3.0f, 6.75f),
                    PathNode.CurveTo(3.0f, 6.612f, 3.112f, 6.5f, 3.25f, 6.5f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.697f, 3.8f),
                    PathNode.CurveTo(22.802f, 3.8f, 23.697f, 4.695f, 23.697f, 5.8f),
                    PathNode.LineTo(23.697f, 16.199f),
                    PathNode.CurveTo(23.697f, 17.303f, 22.802f, 18.199f, 21.697f, 18.199f),
                    PathNode.LineTo(14.698f, 18.199f),
                    PathNode.LineTo(14.698f, 19.299f),
                    PathNode.LineTo(17.999f, 19.299f),
                    PathNode.CurveTo(18.385f, 19.299f, 18.699f, 19.612f, 18.699f, 19.999f),
                    PathNode.CurveTo(18.699f, 20.385f, 18.385f, 20.699f, 17.999f, 20.699f),
                    PathNode.LineTo(5.999f, 20.699f),
                    PathNode.CurveTo(5.613f, 20.699f, 5.299f, 20.385f, 5.299f, 19.999f),
                    PathNode.CurveTo(5.299f, 19.612f, 5.612f, 19.299f, 5.999f, 19.299f),
                    PathNode.LineTo(9.298f, 19.299f),
                    PathNode.LineTo(9.298f, 18.199f),
                    PathNode.LineTo(2.299f, 18.199f),
                    PathNode.CurveTo(1.194f, 18.199f, 0.299f, 17.303f, 0.299f, 16.199f),
                    PathNode.LineTo(0.299f, 5.8f),
                    PathNode.CurveTo(0.299f, 4.695f, 1.194f, 3.8f, 2.299f, 3.8f),
                    PathNode.LineTo(21.697f, 3.8f),
                    PathNode.Close,
                    PathNode.MoveTo(10.698f, 18.199f),
                    PathNode.LineTo(10.698f, 19.299f),
                    PathNode.LineTo(13.298f, 19.299f),
                    PathNode.LineTo(13.298f, 18.199f),
                    PathNode.LineTo(10.698f, 18.199f),
                    PathNode.Close,
                    PathNode.MoveTo(2.299f, 5.2f),
                    PathNode.CurveTo(1.968f, 5.2f, 1.699f, 5.468f, 1.699f, 5.8f),
                    PathNode.LineTo(1.699f, 16.199f),
                    PathNode.CurveTo(1.699f, 16.53f, 1.968f, 16.799f, 2.299f, 16.799f),
                    PathNode.LineTo(21.697f, 16.799f),
                    PathNode.CurveTo(22.028f, 16.799f, 22.298f, 16.53f, 22.298f, 16.199f),
                    PathNode.LineTo(22.298f, 5.8f),
                    PathNode.CurveTo(22.298f, 5.468f, 22.028f, 5.2f, 21.697f, 5.2f),
                    PathNode.LineTo(2.299f, 5.2f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceTv!!
    }

private var _deviceTv: ImageVector? = null
