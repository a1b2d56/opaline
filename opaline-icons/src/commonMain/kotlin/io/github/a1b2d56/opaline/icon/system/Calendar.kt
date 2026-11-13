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

/** `deep_link_new_schedule` */
val OpalineIcons.System.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = ImageVector.Builder(
            name = "Calendar",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.439f, 4.153f),
                    PathNode.LineTo(7.439f, 3.0f),
                    PathNode.LineTo(9.039f, 3.0f),
                    PathNode.LineTo(9.039f, 4.153f),
                    PathNode.LineTo(15.029f, 4.153f),
                    PathNode.LineTo(15.029f, 3.0f),
                    PathNode.LineTo(16.629f, 3.0f),
                    PathNode.LineTo(16.629f, 4.153f),
                    PathNode.LineTo(19.003f, 4.153f),
                    PathNode.CurveTo(19.997f, 4.153f, 20.803f, 4.959f, 20.803f, 5.953f),
                    PathNode.LineTo(20.803f, 19.07f),
                    PathNode.CurveTo(20.803f, 20.064f, 19.997f, 20.87f, 19.003f, 20.87f),
                    PathNode.LineTo(5.003f, 20.87f),
                    PathNode.CurveTo(4.009f, 20.87f, 3.203f, 20.064f, 3.203f, 19.07f),
                    PathNode.LineTo(3.203f, 5.953f),
                    PathNode.CurveTo(3.203f, 4.959f, 4.009f, 4.153f, 5.003f, 4.153f),
                    PathNode.LineTo(7.439f, 4.153f),
                    PathNode.Close,
                    PathNode.MoveTo(7.439f, 4.154f),
                    PathNode.LineTo(6.349f, 4.154f),
                    PathNode.LineTo(6.349f, 5.753f),
                    PathNode.LineTo(5.003f, 5.753f),
                    PathNode.CurveTo(4.893f, 5.753f, 4.803f, 5.843f, 4.803f, 5.953f),
                    PathNode.LineTo(4.803f, 19.07f),
                    PathNode.CurveTo(4.803f, 19.181f, 4.893f, 19.27f, 5.003f, 19.27f),
                    PathNode.LineTo(19.003f, 19.27f),
                    PathNode.CurveTo(19.114f, 19.27f, 19.203f, 19.181f, 19.203f, 19.07f),
                    PathNode.LineTo(19.203f, 5.953f),
                    PathNode.CurveTo(19.203f, 5.843f, 19.114f, 5.753f, 19.003f, 5.753f),
                    PathNode.LineTo(17.666f, 5.753f),
                    PathNode.LineTo(17.666f, 4.154f),
                    PathNode.LineTo(16.629f, 4.154f),
                    PathNode.LineTo(16.629f, 6.397f),
                    PathNode.LineTo(15.029f, 6.397f),
                    PathNode.LineTo(15.029f, 4.154f),
                    PathNode.LineTo(13.9f, 4.154f),
                    PathNode.LineTo(13.9f, 5.753f),
                    PathNode.LineTo(10.116f, 5.753f),
                    PathNode.LineTo(10.116f, 4.154f),
                    PathNode.LineTo(9.039f, 4.154f),
                    PathNode.LineTo(9.039f, 6.397f),
                    PathNode.LineTo(7.439f, 6.397f),
                    PathNode.LineTo(7.439f, 4.154f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
