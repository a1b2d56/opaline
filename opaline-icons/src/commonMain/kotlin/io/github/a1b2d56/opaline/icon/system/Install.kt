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

/** `ic_settings_install` */
val OpalineIcons.System.Install: ImageVector
    get() {
        if (_install != null) return _install!!
        _install = ImageVector.Builder(
            name = "Install",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.75f, 12.0f),
                    PathNode.CurveTo(20.75f, 16.83f, 16.83f, 20.75f, 12.0f, 20.75f),
                    PathNode.CurveTo(7.17f, 20.75f, 3.25f, 16.83f, 3.25f, 12.0f),
                    PathNode.CurveTo(3.25f, 7.17f, 7.17f, 3.25f, 12.0f, 3.25f),
                    PathNode.CurveTo(16.83f, 3.25f, 20.75f, 7.17f, 20.75f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.86f, 11.78f),
                    PathNode.LineTo(12.9f, 13.74f),
                    PathNode.LineTo(12.9f, 7.54f),
                    PathNode.LineTo(11.1f, 7.54f),
                    PathNode.LineTo(11.1f, 13.74f),
                    PathNode.LineTo(9.14f, 11.78f),
                    PathNode.LineTo(7.86f, 13.05f),
                    PathNode.LineTo(11.36f, 16.55f),
                    PathNode.CurveTo(11.71f, 16.9f, 12.28f, 16.9f, 12.64f, 16.55f),
                    PathNode.LineTo(16.14f, 13.05f),
                    PathNode.LineTo(14.86f, 11.78f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _install!!
    }

private var _install: ImageVector? = null
