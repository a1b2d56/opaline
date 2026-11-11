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

/** `ic_settings_app_info_stop` */
val OpalineIcons.System.ForceStop: ImageVector
    get() {
        if (_forceStop != null) return _forceStop!!
        _forceStop = ImageVector.Builder(
            name = "ForceStop",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.8f),
                    PathNode.CurveTo(17.633f, 1.8f, 22.2f, 6.367f, 22.2f, 12.0f),
                    PathNode.CurveTo(22.2f, 17.633f, 17.633f, 22.2f, 12.0f, 22.2f),
                    PathNode.CurveTo(6.367f, 22.2f, 1.8f, 17.633f, 1.8f, 12.0f),
                    PathNode.CurveTo(1.8f, 6.367f, 6.367f, 1.8f, 12.0f, 1.8f),
                    PathNode.Close,
                    PathNode.MoveTo(16.031f, 7.968f),
                    PathNode.CurveTo(15.758f, 7.694f, 15.314f, 7.695f, 15.041f, 7.968f),
                    PathNode.LineTo(12.0f, 11.009f),
                    PathNode.LineTo(8.96f, 7.969f),
                    PathNode.CurveTo(8.687f, 7.695f, 8.243f, 7.695f, 7.97f, 7.969f),
                    PathNode.CurveTo(7.696f, 8.242f, 7.696f, 8.686f, 7.97f, 8.959f),
                    PathNode.LineTo(11.01f, 11.999f),
                    PathNode.LineTo(7.97f, 15.039f),
                    PathNode.CurveTo(7.696f, 15.312f, 7.696f, 15.756f, 7.97f, 16.029f),
                    PathNode.CurveTo(8.243f, 16.303f, 8.687f, 16.303f, 8.96f, 16.029f),
                    PathNode.LineTo(12.0f, 12.989f),
                    PathNode.LineTo(15.041f, 16.03f),
                    PathNode.CurveTo(15.314f, 16.303f, 15.758f, 16.304f, 16.031f, 16.03f),
                    PathNode.CurveTo(16.305f, 15.757f, 16.304f, 15.313f, 16.031f, 15.04f),
                    PathNode.LineTo(12.99f, 11.999f),
                    PathNode.LineTo(16.031f, 8.958f),
                    PathNode.CurveTo(16.304f, 8.685f, 16.305f, 8.241f, 16.031f, 7.968f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _forceStop!!
    }

private var _forceStop: ImageVector? = null
