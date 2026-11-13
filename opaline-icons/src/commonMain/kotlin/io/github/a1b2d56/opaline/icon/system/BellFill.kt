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

/** `alarm_icon_new` */
val OpalineIcons.System.BellFill: ImageVector
    get() {
        if (_bellFill != null) return _bellFill!!
        _bellFill = ImageVector.Builder(
            name = "BellFill",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.752f, 21.0f),
                    PathNode.CurveTo(14.608f, 21.372f, 14.385f, 21.72f, 14.082f, 22.019f),
                    PathNode.LineTo(14.081f, 22.018f),
                    PathNode.CurveTo(12.927f, 23.178f, 11.064f, 23.177f, 9.912f, 22.012f),
                    PathNode.LineTo(9.912f, 22.011f),
                    PathNode.CurveTo(9.613f, 21.714f, 9.392f, 21.368f, 9.249f, 21.0f),
                    PathNode.LineTo(14.752f, 21.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 1.6f),
                    PathNode.CurveTo(12.497f, 1.6f, 12.899f, 2.003f, 12.899f, 2.5f),
                    PathNode.CurveTo(12.899f, 2.617f, 12.876f, 2.727f, 12.836f, 2.83f),
                    PathNode.CurveTo(14.734f, 2.971f, 16.211f, 3.607f, 17.241f, 4.705f),
                    PathNode.CurveTo(18.41f, 5.95f, 18.9f, 7.683f, 18.9f, 9.639f),
                    PathNode.LineTo(18.9f, 11.25f),
                    PathNode.CurveTo(18.9f, 13.99f, 19.625f, 15.281f, 20.297f, 16.122f),
                    PathNode.CurveTo(20.474f, 16.343f, 20.654f, 16.541f, 20.835f, 16.738f),
                    PathNode.CurveTo(21.01f, 16.929f, 21.2f, 17.133f, 21.364f, 17.34f),
                    PathNode.CurveTo(21.708f, 17.774f, 22.0f, 18.292f, 22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 19.387f, 21.686f, 19.701f, 21.3f, 19.701f),
                    PathNode.LineTo(2.7f, 19.701f),
                    PathNode.CurveTo(2.314f, 19.701f, 2.0f, 19.387f, 2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 18.292f, 2.292f, 17.774f, 2.636f, 17.34f),
                    PathNode.CurveTo(2.8f, 17.133f, 2.991f, 16.929f, 3.166f, 16.738f),
                    PathNode.CurveTo(3.347f, 16.54f, 3.526f, 16.343f, 3.703f, 16.122f),
                    PathNode.CurveTo(4.375f, 15.281f, 5.101f, 13.991f, 5.101f, 11.25f),
                    PathNode.LineTo(5.101f, 9.639f),
                    PathNode.CurveTo(5.101f, 7.683f, 5.591f, 5.95f, 6.76f, 4.705f),
                    PathNode.CurveTo(7.79f, 3.607f, 9.266f, 2.971f, 11.163f, 2.83f),
                    PathNode.CurveTo(11.123f, 2.728f, 11.1f, 2.617f, 11.1f, 2.5f),
                    PathNode.CurveTo(11.1f, 2.003f, 11.503f, 1.6f, 12.0f, 1.6f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _bellFill!!
    }

private var _bellFill: ImageVector? = null
