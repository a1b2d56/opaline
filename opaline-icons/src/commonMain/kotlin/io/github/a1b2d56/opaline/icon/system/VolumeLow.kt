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

/** `qs_icon_volume_media_min_no_theme` */
val OpalineIcons.System.VolumeLow: ImageVector
    get() {
        if (_volumeLow != null) return _volumeLow!!
        _volumeLow = ImageVector.Builder(
            name = "VolumeLow",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.548f, 2.504f),
                    PathNode.CurveTo(14.748f, 2.304f, 15.049f, 2.244f, 15.311f, 2.353f),
                    PathNode.CurveTo(15.572f, 2.461f, 15.743f, 2.716f, 15.743f, 2.999f),
                    PathNode.LineTo(15.743f, 20.999f),
                    PathNode.CurveTo(15.743f, 21.282f, 15.572f, 21.537f, 15.311f, 21.646f),
                    PathNode.CurveTo(15.049f, 21.754f, 14.748f, 21.694f, 14.548f, 21.494f),
                    PathNode.LineTo(9.929f, 16.875f),
                    PathNode.CurveTo(9.816f, 16.763f, 9.664f, 16.699f, 9.505f, 16.699f),
                    PathNode.LineTo(6.343f, 16.699f),
                    PathNode.CurveTo(5.238f, 16.699f, 4.343f, 15.804f, 4.343f, 14.699f),
                    PathNode.LineTo(4.343f, 9.299f),
                    PathNode.CurveTo(4.343f, 8.194f, 5.238f, 7.299f, 6.343f, 7.299f),
                    PathNode.LineTo(9.505f, 7.299f),
                    PathNode.CurveTo(9.664f, 7.299f, 9.816f, 7.235f, 9.929f, 7.123f),
                    PathNode.LineTo(14.548f, 2.504f),
                    PathNode.Close,
                    PathNode.MoveTo(17.599f, 8.361f),
                    PathNode.CurveTo(18.014f, 8.088f, 18.571f, 8.202f, 18.845f, 8.617f),
                    PathNode.CurveTo(19.485f, 9.588f, 19.857f, 10.751f, 19.857f, 11.999f),
                    PathNode.CurveTo(19.857f, 13.247f, 19.485f, 14.41f, 18.845f, 15.381f),
                    PathNode.CurveTo(18.571f, 15.796f, 18.014f, 15.91f, 17.599f, 15.637f),
                    PathNode.CurveTo(17.184f, 15.363f, 17.069f, 14.805f, 17.343f, 14.39f),
                    PathNode.CurveTo(17.795f, 13.704f, 18.058f, 12.884f, 18.058f, 11.999f),
                    PathNode.CurveTo(18.058f, 11.114f, 17.795f, 10.293f, 17.343f, 9.607f),
                    PathNode.CurveTo(17.069f, 9.192f, 17.184f, 8.635f, 17.599f, 8.361f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeLow!!
    }

private var _volumeLow: ImageVector? = null
