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

/** `ic_settings_app_info_open` */
val OpalineIcons.System.Open: ImageVector
    get() {
        if (_open != null) return _open!!
        _open = ImageVector.Builder(
            name = "Open",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.27f, 7.138f),
                    PathNode.CurveTo(19.647f, 7.138f, 19.974f, 7.138f, 20.241f, 7.16f),
                    PathNode.CurveTo(20.515f, 7.183f, 20.794f, 7.235f, 21.059f, 7.377f),
                    PathNode.CurveTo(21.448f, 7.587f, 21.757f, 7.92f, 21.938f, 8.324f),
                    PathNode.CurveTo(22.06f, 8.599f, 22.09f, 8.881f, 22.093f, 9.156f),
                    PathNode.CurveTo(22.095f, 9.424f, 22.07f, 9.75f, 22.042f, 10.126f),
                    PathNode.LineTo(21.402f, 18.658f),
                    PathNode.CurveTo(21.378f, 18.986f, 21.357f, 19.273f, 21.32f, 19.509f),
                    PathNode.CurveTo(21.282f, 19.753f, 21.221f, 19.997f, 21.086f, 20.23f),
                    PathNode.CurveTo(20.885f, 20.579f, 20.584f, 20.858f, 20.222f, 21.032f),
                    PathNode.CurveTo(19.979f, 21.149f, 19.73f, 21.193f, 19.484f, 21.213f),
                    PathNode.CurveTo(19.247f, 21.232f, 18.96f, 21.23f, 18.631f, 21.23f),
                    PathNode.LineTo(5.368f, 21.23f),
                    PathNode.CurveTo(5.039f, 21.23f, 4.752f, 21.232f, 4.515f, 21.213f),
                    PathNode.CurveTo(4.269f, 21.193f, 4.02f, 21.149f, 3.777f, 21.032f),
                    PathNode.CurveTo(3.415f, 20.858f, 3.114f, 20.578f, 2.913f, 20.23f),
                    PathNode.CurveTo(2.778f, 19.997f, 2.716f, 19.753f, 2.679f, 19.509f),
                    PathNode.CurveTo(2.642f, 19.274f, 2.621f, 18.986f, 2.597f, 18.658f),
                    PathNode.LineTo(1.957f, 10.126f),
                    PathNode.CurveTo(1.929f, 9.75f, 1.904f, 9.424f, 1.906f, 9.156f),
                    PathNode.CurveTo(1.909f, 8.881f, 1.939f, 8.599f, 2.062f, 8.324f),
                    PathNode.CurveTo(2.242f, 7.92f, 2.551f, 7.587f, 2.94f, 7.377f),
                    PathNode.CurveTo(3.205f, 7.235f, 3.484f, 7.183f, 3.758f, 7.16f),
                    PathNode.CurveTo(4.025f, 7.138f, 4.352f, 7.138f, 4.729f, 7.138f),
                    PathNode.LineTo(19.27f, 7.138f),
                    PathNode.Close,
                    PathNode.MoveTo(8.725f, 2.769f),
                    PathNode.CurveTo(9.193f, 2.769f, 9.648f, 2.934f, 10.008f, 3.234f),
                    PathNode.LineTo(11.371f, 4.373f),
                    PathNode.LineTo(19.299f, 4.373f),
                    PathNode.CurveTo(20.292f, 4.373f, 21.114f, 5.098f, 21.27f, 6.048f),
                    PathNode.CurveTo(20.91f, 5.913f, 20.52f, 5.838f, 20.111f, 5.838f),
                    PathNode.LineTo(3.89f, 5.838f),
                    PathNode.CurveTo(3.476f, 5.838f, 3.08f, 5.914f, 2.717f, 6.052f),
                    PathNode.LineTo(2.717f, 4.769f),
                    PathNode.CurveTo(2.717f, 3.664f, 3.612f, 2.769f, 4.717f, 2.769f),
                    PathNode.LineTo(8.725f, 2.769f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _open!!
    }

private var _open: ImageVector? = null
