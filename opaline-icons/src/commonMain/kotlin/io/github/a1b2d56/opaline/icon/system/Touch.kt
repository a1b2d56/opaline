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

/** `oplus_tile_icon_show_taps` */
val OpalineIcons.System.Touch: ImageVector
    get() {
        if (_touch != null) return _touch!!
        _touch = ImageVector.Builder(
            name = "Touch",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 11.24f),
                    PathNode.LineTo(9.0f, 7.5f),
                    PathNode.CurveTo(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f),
                    PathNode.CurveTo(12.88f, 5.0f, 14.0f, 6.12f, 14.0f, 7.5f),
                    PathNode.LineTo(14.0f, 11.24f),
                    PathNode.CurveTo(15.21f, 10.43f, 16.0f, 9.06f, 16.0f, 7.5f),
                    PathNode.CurveTo(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f),
                    PathNode.CurveTo(9.01f, 3.0f, 7.0f, 5.01f, 7.0f, 7.5f),
                    PathNode.CurveTo(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f),
                    PathNode.Close,
                    PathNode.MoveTo(18.84f, 15.87f),
                    PathNode.LineTo(14.3f, 13.61f),
                    PathNode.CurveTo(14.13f, 13.54f, 13.95f, 13.5f, 13.76f, 13.5f),
                    PathNode.LineTo(13.0f, 13.5f),
                    PathNode.LineTo(13.0f, 7.5f),
                    PathNode.CurveTo(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f),
                    PathNode.CurveTo(10.67f, 6.0f, 10.0f, 6.67f, 10.0f, 7.5f),
                    PathNode.LineTo(10.0f, 18.24f),
                    PathNode.LineTo(6.57f, 17.52f),
                    PathNode.CurveTo(6.49f, 17.51f, 6.42f, 17.49f, 6.33f, 17.49f),
                    PathNode.CurveTo(6.02f, 17.49f, 5.74f, 17.62f, 5.54f, 17.82f),
                    PathNode.LineTo(4.75f, 18.62f),
                    PathNode.LineTo(9.69f, 23.56f),
                    PathNode.CurveTo(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f),
                    PathNode.LineTo(17.54f, 24.0f),
                    PathNode.CurveTo(18.29f, 24.0f, 18.87f, 23.45f, 18.98f, 22.72f),
                    PathNode.LineTo(19.73f, 17.45f),
                    PathNode.CurveTo(19.74f, 17.38f, 19.75f, 17.31f, 19.75f, 17.25f),
                    PathNode.CurveTo(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _touch!!
    }

private var _touch: ImageVector? = null
