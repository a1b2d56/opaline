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

/** `ic_settings_app_info_mba` */
val OpalineIcons.System.Disable: ImageVector
    get() {
        if (_disable != null) return _disable!!
        _disable = ImageVector.Builder(
            name = "Disable",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.301f),
                    PathNode.CurveTo(17.909f, 1.301f, 22.7f, 6.092f, 22.7f, 12.001f),
                    PathNode.CurveTo(22.7f, 17.91f, 17.909f, 22.701f, 12.0f, 22.701f),
                    PathNode.CurveTo(6.091f, 22.701f, 1.3f, 17.91f, 1.3f, 12.001f),
                    PathNode.CurveTo(1.3f, 6.092f, 6.091f, 1.301f, 12.0f, 1.301f),
                    PathNode.Close,
                    PathNode.MoveTo(7.25f, 11.3f),
                    PathNode.CurveTo(6.863f, 11.3f, 6.55f, 11.613f, 6.55f, 12.0f),
                    PathNode.CurveTo(6.55f, 12.387f, 6.863f, 12.7f, 7.25f, 12.7f),
                    PathNode.LineTo(16.75f, 12.7f),
                    PathNode.CurveTo(17.137f, 12.7f, 17.45f, 12.387f, 17.45f, 12.0f),
                    PathNode.CurveTo(17.45f, 11.613f, 17.137f, 11.3f, 16.75f, 11.3f),
                    PathNode.LineTo(7.25f, 11.3f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _disable!!
    }

private var _disable: ImageVector? = null
