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

/** `ic_hour_overcast` */
val OpalineIcons.System.CloudFill: ImageVector
    get() {
        if (_cloudFill != null) return _cloudFill!!
        _cloudFill = ImageVector.Builder(
            name = "CloudFill",
            defaultWidth = 28.0f.dp,
            defaultHeight = 28.0f.dp,
            viewportWidth = 28.0f,
            viewportHeight = 28.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.405f, 20.906f),
                    PathNode.CurveTo(8.396f, 20.906f, 8.388f, 20.906f, 8.379f, 20.906f),
                    PathNode.CurveTo(5.895f, 20.906f, 3.882f, 18.892f, 3.882f, 16.409f),
                    PathNode.CurveTo(3.882f, 14.191f, 5.489f, 12.347f, 7.602f, 11.979f),
                    PathNode.CurveTo(8.292f, 9.175f, 10.823f, 7.094f, 13.84f, 7.094f),
                    PathNode.CurveTo(17.28f, 7.094f, 20.089f, 9.798f, 20.256f, 13.197f),
                    PathNode.LineTo(20.263f, 13.197f),
                    PathNode.CurveTo(22.392f, 13.197f, 24.118f, 14.922f, 24.118f, 17.051f),
                    PathNode.CurveTo(24.118f, 19.18f, 22.392f, 20.905f, 20.264f, 20.906f),
                    PathNode.LineTo(8.405f, 20.906f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _cloudFill!!
    }

private var _cloudFill: ImageVector? = null
