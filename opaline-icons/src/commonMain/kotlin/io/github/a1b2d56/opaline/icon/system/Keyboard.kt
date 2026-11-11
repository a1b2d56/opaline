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

/** `tile_icon_imput_method` */
val OpalineIcons.System.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = ImageVector.Builder(
            name = "Keyboard",
            defaultWidth = 36.0f.dp,
            defaultHeight = 36.0f.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.833f, 2.889f),
                    PathNode.CurveTo(2.268f, 2.889f, 1.0f, 4.157f, 1.0f, 5.722f),
                    PathNode.LineTo(1.0f, 33.111f),
                    PathNode.LineTo(32.167f, 33.111f),
                    PathNode.CurveTo(33.731f, 33.111f, 35.0f, 31.843f, 35.0f, 30.278f),
                    PathNode.LineTo(35.0f, 5.722f),
                    PathNode.CurveTo(35.0f, 4.157f, 33.731f, 2.889f, 32.167f, 2.889f),
                    PathNode.LineTo(3.833f, 2.889f),
                    PathNode.Close,
                    PathNode.MoveTo(5.25f, 13.467f),
                    PathNode.LineTo(9.5f, 13.467f),
                    PathNode.LineTo(9.5f, 10.444f),
                    PathNode.LineTo(5.25f, 10.444f),
                    PathNode.LineTo(5.25f, 13.467f),
                    PathNode.Close,
                    PathNode.MoveTo(16.583f, 13.467f),
                    PathNode.LineTo(12.333f, 13.467f),
                    PathNode.LineTo(12.333f, 10.444f),
                    PathNode.LineTo(16.583f, 10.444f),
                    PathNode.LineTo(16.583f, 13.467f),
                    PathNode.Close,
                    PathNode.MoveTo(5.25f, 19.511f),
                    PathNode.LineTo(9.5f, 19.511f),
                    PathNode.LineTo(9.5f, 16.489f),
                    PathNode.LineTo(5.25f, 16.489f),
                    PathNode.LineTo(5.25f, 19.511f),
                    PathNode.Close,
                    PathNode.MoveTo(16.583f, 19.511f),
                    PathNode.LineTo(12.333f, 19.511f),
                    PathNode.LineTo(12.333f, 16.489f),
                    PathNode.LineTo(16.583f, 16.489f),
                    PathNode.LineTo(16.583f, 19.511f),
                    PathNode.Close,
                    PathNode.MoveTo(23.667f, 16.489f),
                    PathNode.LineTo(19.417f, 16.489f),
                    PathNode.LineTo(19.417f, 19.511f),
                    PathNode.LineTo(23.667f, 19.511f),
                    PathNode.LineTo(23.667f, 16.489f),
                    PathNode.Close,
                    PathNode.MoveTo(30.75f, 13.467f),
                    PathNode.LineTo(26.5f, 13.467f),
                    PathNode.LineTo(26.5f, 10.444f),
                    PathNode.LineTo(30.75f, 10.444f),
                    PathNode.LineTo(30.75f, 13.467f),
                    PathNode.Close,
                    PathNode.MoveTo(26.5f, 19.511f),
                    PathNode.LineTo(30.75f, 19.511f),
                    PathNode.LineTo(30.75f, 16.489f),
                    PathNode.LineTo(26.5f, 16.489f),
                    PathNode.LineTo(26.5f, 19.511f),
                    PathNode.Close,
                    PathNode.MoveTo(12.333f, 22.533f),
                    PathNode.LineTo(23.667f, 22.533f),
                    PathNode.LineTo(23.667f, 25.555f),
                    PathNode.LineTo(12.333f, 25.555f),
                    PathNode.LineTo(12.333f, 22.533f),
                    PathNode.Close,
                    PathNode.MoveTo(19.417f, 13.467f),
                    PathNode.LineTo(23.667f, 13.467f),
                    PathNode.LineTo(23.667f, 10.444f),
                    PathNode.LineTo(19.417f, 10.444f),
                    PathNode.LineTo(19.417f, 13.467f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
