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

/** `pb_ic_add_contact` */
val OpalineIcons.System.AddContact: ImageVector
    get() {
        if (_addContact != null) return _addContact!!
        _addContact = ImageVector.Builder(
            name = "AddContact",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.629f, 5.057f),
                    PathNode.CurveTo(7.629f, 4.056f, 8.441f, 3.244f, 9.443f, 3.244f),
                    PathNode.CurveTo(10.445f, 3.244f, 11.257f, 4.056f, 11.257f, 5.057f),
                    PathNode.CurveTo(11.257f, 6.059f, 10.445f, 6.871f, 9.443f, 6.871f),
                    PathNode.CurveTo(8.441f, 6.871f, 7.629f, 6.059f, 7.629f, 5.057f),
                    PathNode.Close,
                    PathNode.MoveTo(9.443f, 1.844f),
                    PathNode.CurveTo(7.668f, 1.844f, 6.229f, 3.283f, 6.229f, 5.057f),
                    PathNode.CurveTo(6.229f, 6.832f, 7.668f, 8.271f, 9.443f, 8.271f),
                    PathNode.CurveTo(11.218f, 8.271f, 12.657f, 6.832f, 12.657f, 5.057f),
                    PathNode.CurveTo(12.657f, 3.283f, 11.218f, 1.844f, 9.443f, 1.844f),
                    PathNode.Close,
                    PathNode.MoveTo(7.077f, 9.844f),
                    PathNode.LineTo(10.892f, 9.844f),
                    PathNode.CurveTo(10.396f, 10.255f, 9.951f, 10.726f, 9.567f, 11.244f),
                    PathNode.LineTo(7.077f, 11.244f),
                    PathNode.CurveTo(5.592f, 11.244f, 4.396f, 12.067f, 4.062f, 13.091f),
                    PathNode.LineTo(4.06f, 13.097f),
                    PathNode.LineTo(4.06f, 13.097f),
                    PathNode.LineTo(3.472f, 14.844f),
                    PathNode.LineTo(8.083f, 14.844f),
                    PathNode.CurveTo(8.028f, 15.222f, 8.0f, 15.608f, 8.0f, 16.001f),
                    PathNode.CurveTo(8.0f, 16.082f, 8.001f, 16.163f, 8.003f, 16.244f),
                    PathNode.LineTo(2.497f, 16.244f),
                    PathNode.CurveTo(2.271f, 16.244f, 2.06f, 16.135f, 1.928f, 15.952f),
                    PathNode.CurveTo(1.797f, 15.769f, 1.762f, 15.534f, 1.834f, 15.32f),
                    PathNode.LineTo(2.733f, 12.653f),
                    PathNode.CurveTo(3.3f, 10.919f, 5.144f, 9.844f, 7.077f, 9.844f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 10.651f),
                    PathNode.CurveTo(13.045f, 10.651f, 10.65f, 13.046f, 10.65f, 16.001f),
                    PathNode.CurveTo(10.65f, 18.955f, 13.045f, 21.351f, 16.0f, 21.351f),
                    PathNode.CurveTo(18.955f, 21.351f, 21.35f, 18.955f, 21.35f, 16.001f),
                    PathNode.CurveTo(21.35f, 13.046f, 18.955f, 10.651f, 16.0f, 10.651f),
                    PathNode.Close,
                    PathNode.MoveTo(9.35f, 16.001f),
                    PathNode.CurveTo(9.35f, 12.328f, 12.327f, 9.351f, 16.0f, 9.351f),
                    PathNode.CurveTo(19.673f, 9.351f, 22.65f, 12.328f, 22.65f, 16.001f),
                    PathNode.CurveTo(22.65f, 19.674f, 19.673f, 22.651f, 16.0f, 22.651f),
                    PathNode.CurveTo(12.327f, 22.651f, 9.35f, 19.674f, 9.35f, 16.001f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 12.301f),
                    PathNode.CurveTo(16.386f, 12.301f, 16.7f, 12.614f, 16.7f, 13.001f),
                    PathNode.LineTo(16.7f, 15.301f),
                    PathNode.LineTo(19.0f, 15.301f),
                    PathNode.CurveTo(19.386f, 15.301f, 19.7f, 15.614f, 19.7f, 16.001f),
                    PathNode.CurveTo(19.7f, 16.387f, 19.386f, 16.701f, 19.0f, 16.701f),
                    PathNode.LineTo(16.7f, 16.701f),
                    PathNode.LineTo(16.7f, 19.001f),
                    PathNode.CurveTo(16.7f, 19.387f, 16.386f, 19.701f, 16.0f, 19.701f),
                    PathNode.CurveTo(15.613f, 19.701f, 15.3f, 19.387f, 15.3f, 19.001f),
                    PathNode.LineTo(15.3f, 16.701f),
                    PathNode.LineTo(13.0f, 16.701f),
                    PathNode.CurveTo(12.613f, 16.701f, 12.3f, 16.387f, 12.3f, 16.001f),
                    PathNode.CurveTo(12.3f, 15.614f, 12.613f, 15.301f, 13.0f, 15.301f),
                    PathNode.LineTo(15.3f, 15.301f),
                    PathNode.LineTo(15.3f, 13.001f),
                    PathNode.CurveTo(15.3f, 12.614f, 15.613f, 12.301f, 16.0f, 12.301f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _addContact!!
    }

private var _addContact: ImageVector? = null
