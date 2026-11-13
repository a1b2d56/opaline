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

/** `color_menu_ic_note_normal` */
val OpalineIcons.System.Notes: ImageVector
    get() {
        if (_notes != null) return _notes!!
        _notes = ImageVector.Builder(
            name = "Notes",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.927f, 3.0f),
                    PathNode.CurveTo(3.927f, 2.613f, 4.241f, 2.3f, 4.627f, 2.3f),
                    PathNode.LineTo(20.627f, 2.3f),
                    PathNode.CurveTo(21.014f, 2.3f, 21.327f, 2.613f, 21.327f, 3.0f),
                    PathNode.LineTo(21.327f, 17.0f),
                    PathNode.CurveTo(21.327f, 20.386f, 19.014f, 21.7f, 17.627f, 21.7f),
                    PathNode.LineTo(3.373f, 21.7f),
                    PathNode.CurveTo(3.076f, 21.7f, 2.811f, 21.512f, 2.713f, 21.231f),
                    PathNode.CurveTo(2.616f, 20.954f, 2.702f, 20.647f, 2.927f, 20.461f),
                    PathNode.CurveTo(2.929f, 20.459f, 2.933f, 20.455f, 2.94f, 20.448f),
                    PathNode.CurveTo(2.958f, 20.431f, 2.99f, 20.398f, 3.032f, 20.348f),
                    PathNode.CurveTo(3.117f, 20.247f, 3.243f, 20.073f, 3.375f, 19.811f),
                    PathNode.CurveTo(3.636f, 19.29f, 3.927f, 18.399f, 3.927f, 17.0f),
                    PathNode.LineTo(3.927f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(4.693f, 20.3f),
                    PathNode.LineTo(17.627f, 20.3f),
                    PathNode.CurveTo(18.241f, 20.3f, 19.927f, 19.613f, 19.927f, 17.0f),
                    PathNode.LineTo(19.927f, 3.7f),
                    PathNode.LineTo(5.327f, 3.7f),
                    PathNode.LineTo(5.327f, 17.0f),
                    PathNode.CurveTo(5.327f, 18.502f, 5.032f, 19.571f, 4.693f, 20.3f),
                    PathNode.Close,
                    PathNode.MoveTo(11.927f, 8.0f),
                    PathNode.CurveTo(11.927f, 7.613f, 12.241f, 7.3f, 12.627f, 7.3f),
                    PathNode.LineTo(16.627f, 7.3f),
                    PathNode.CurveTo(17.014f, 7.3f, 17.327f, 7.613f, 17.327f, 8.0f),
                    PathNode.CurveTo(17.327f, 8.386f, 17.014f, 8.7f, 16.627f, 8.7f),
                    PathNode.LineTo(12.627f, 8.7f),
                    PathNode.CurveTo(12.241f, 8.7f, 11.927f, 8.386f, 11.927f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.627f, 11.3f),
                    PathNode.CurveTo(8.241f, 11.3f, 7.927f, 11.613f, 7.927f, 12.0f),
                    PathNode.CurveTo(7.927f, 12.386f, 8.241f, 12.7f, 8.627f, 12.7f),
                    PathNode.LineTo(16.627f, 12.7f),
                    PathNode.CurveTo(17.014f, 12.7f, 17.327f, 12.386f, 17.327f, 12.0f),
                    PathNode.CurveTo(17.327f, 11.613f, 17.014f, 11.3f, 16.627f, 11.3f),
                    PathNode.LineTo(8.627f, 11.3f),
                    PathNode.Close,
                    PathNode.MoveTo(7.927f, 16.0f),
                    PathNode.CurveTo(7.927f, 15.613f, 8.241f, 15.3f, 8.627f, 15.3f),
                    PathNode.LineTo(12.627f, 15.3f),
                    PathNode.CurveTo(13.014f, 15.3f, 13.327f, 15.613f, 13.327f, 16.0f),
                    PathNode.CurveTo(13.327f, 16.386f, 13.014f, 16.7f, 12.627f, 16.7f),
                    PathNode.LineTo(8.627f, 16.7f),
                    PathNode.CurveTo(8.241f, 16.7f, 7.927f, 16.386f, 7.927f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.294f, 6.75f),
                    PathNode.LineTo(9.961f, 6.75f),
                    PathNode.CurveTo(10.191f, 6.75f, 10.377f, 6.936f, 10.377f, 7.166f),
                    PathNode.LineTo(10.377f, 8.833f),
                    PathNode.CurveTo(10.377f, 9.063f, 10.191f, 9.25f, 9.961f, 9.25f),
                    PathNode.LineTo(8.294f, 9.25f),
                    PathNode.CurveTo(8.064f, 9.25f, 7.877f, 9.063f, 7.877f, 8.833f),
                    PathNode.LineTo(7.877f, 7.166f),
                    PathNode.CurveTo(7.877f, 6.936f, 8.064f, 6.75f, 8.294f, 6.75f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _notes!!
    }

private var _notes: ImageVector? = null
