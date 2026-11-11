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

/** `ic_settings_sync` */
val OpalineIcons.System.Sync: ImageVector
    get() {
        if (_sync != null) return _sync!!
        _sync = ImageVector.Builder(
            name = "Sync",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 1.0f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(15.31f, 6.0f, 18.0f, 8.69f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 13.01f, 17.75f, 13.97f, 17.3f, 14.8f),
                    PathNode.LineTo(18.76f, 16.26f),
                    PathNode.CurveTo(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.CurveTo(8.69f, 18.0f, 6.0f, 15.31f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 11.0f, 6.25f, 10.1f, 6.7f, 9.2f),
                    PathNode.LineTo(5.24f, 7.74f),
                    PathNode.CurveTo(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f),
                    PathNode.LineTo(12.0f, 23.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _sync!!
    }

private var _sync: ImageVector? = null
