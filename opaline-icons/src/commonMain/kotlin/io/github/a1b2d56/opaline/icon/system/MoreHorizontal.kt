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

/** `settings_search_default_ic_oplus` */
val OpalineIcons.System.MoreHorizontal: ImageVector
    get() {
        if (_moreHorizontal != null) return _moreHorizontal!!
        _moreHorizontal = ImageVector.Builder(
            name = "MoreHorizontal",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.539f, 12.0f),
                    PathNode.CurveTo(10.539f, 12.886f, 11.257f, 13.604f, 12.143f, 13.604f),
                    PathNode.CurveTo(13.029f, 13.604f, 13.747f, 12.886f, 13.747f, 12.0f),
                    PathNode.CurveTo(13.747f, 11.114f, 13.029f, 10.396f, 12.143f, 10.396f),
                    PathNode.CurveTo(11.257f, 10.396f, 10.539f, 11.114f, 10.539f, 12.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.07f, 12.0f),
                    PathNode.CurveTo(17.07f, 12.886f, 17.788f, 13.604f, 18.674f, 13.604f),
                    PathNode.CurveTo(19.56f, 13.604f, 20.278f, 12.886f, 20.278f, 12.0f),
                    PathNode.CurveTo(20.278f, 11.114f, 19.56f, 10.396f, 18.674f, 10.396f),
                    PathNode.CurveTo(17.788f, 10.396f, 17.07f, 11.114f, 17.07f, 12.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.008f, 12.0f),
                    PathNode.CurveTo(4.008f, 12.886f, 4.726f, 13.604f, 5.612f, 13.604f),
                    PathNode.CurveTo(6.498f, 13.604f, 7.216f, 12.886f, 7.216f, 12.0f),
                    PathNode.CurveTo(7.216f, 11.114f, 6.498f, 10.396f, 5.612f, 10.396f),
                    PathNode.CurveTo(4.726f, 10.396f, 4.008f, 11.114f, 4.008f, 12.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _moreHorizontal!!
    }

private var _moreHorizontal: ImageVector? = null
