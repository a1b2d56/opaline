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

/** `svg_calculator_history` */
val OpalineIcons.System.History: ImageVector
    get() {
        if (_history != null) return _history!!
        _history = ImageVector.Builder(
            name = "History",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.7f, 2.698f),
                    PathNode.LineTo(11.7f, 3.796f),
                    PathNode.CurveTo(11.7f, 4.02f, 11.593f, 4.23f, 11.413f, 4.362f),
                    PathNode.CurveTo(11.233f, 4.493f, 11.0f, 4.531f, 10.787f, 4.463f),
                    PathNode.LineTo(7.769f, 3.5f),
                    PathNode.CurveTo(7.492f, 3.411f, 7.298f, 3.16f, 7.283f, 2.87f),
                    PathNode.CurveTo(7.268f, 2.579f, 7.434f, 2.309f, 7.7f, 2.192f),
                    PathNode.CurveTo(9.017f, 1.614f, 10.472f, 1.293f, 12.0f, 1.293f),
                    PathNode.CurveTo(17.91f, 1.293f, 22.7f, 6.084f, 22.7f, 11.993f),
                    PathNode.CurveTo(22.7f, 17.902f, 17.91f, 22.693f, 12.0f, 22.693f),
                    PathNode.CurveTo(6.091f, 22.693f, 1.3f, 17.902f, 1.3f, 11.993f),
                    PathNode.CurveTo(1.3f, 10.888f, 1.468f, 9.821f, 1.78f, 8.817f),
                    PathNode.CurveTo(1.894f, 8.447f, 2.286f, 8.241f, 2.656f, 8.356f),
                    PathNode.CurveTo(3.025f, 8.47f, 3.231f, 8.863f, 3.117f, 9.232f),
                    PathNode.CurveTo(2.846f, 10.103f, 2.7f, 11.03f, 2.7f, 11.993f),
                    PathNode.CurveTo(2.7f, 17.129f, 6.864f, 21.293f, 12.0f, 21.293f),
                    PathNode.CurveTo(17.136f, 21.293f, 21.3f, 17.129f, 21.3f, 11.993f),
                    PathNode.CurveTo(21.3f, 6.857f, 17.136f, 2.693f, 12.0f, 2.693f),
                    PathNode.CurveTo(11.9f, 2.693f, 11.8f, 2.695f, 11.7f, 2.698f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.674f, 7.938f),
                    PathNode.CurveTo(12.653f, 7.563f, 12.342f, 7.27f, 11.967f, 7.27f),
                    PathNode.CurveTo(11.59f, 7.27f, 11.28f, 7.563f, 11.259f, 7.939f),
                    PathNode.LineTo(10.974f, 13.068f),
                    PathNode.CurveTo(10.966f, 13.219f, 11.029f, 13.365f, 11.144f, 13.462f),
                    PathNode.LineTo(14.708f, 16.467f),
                    PathNode.CurveTo(14.991f, 16.705f, 15.408f, 16.687f, 15.669f, 16.426f),
                    PathNode.CurveTo(15.94f, 16.155f, 15.948f, 15.718f, 15.686f, 15.438f),
                    PathNode.LineTo(12.935f, 12.497f),
                    PathNode.LineTo(12.674f, 7.938f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _history!!
    }

private var _history: ImageVector? = null
