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

/** `color_menu_ic_undo_normal` */
val OpalineIcons.System.Undo: ImageVector
    get() {
        if (_undo != null) return _undo!!
        _undo = ImageVector.Builder(
            name = "Undo",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.7f, 7.5f),
                    PathNode.CurveTo(3.7f, 7.113f, 3.387f, 6.8f, 3.0f, 6.8f),
                    PathNode.CurveTo(2.613f, 6.8f, 2.3f, 7.113f, 2.3f, 7.5f),
                    PathNode.LineTo(2.3f, 13.5f),
                    PathNode.CurveTo(2.3f, 13.886f, 2.613f, 14.2f, 3.0f, 14.2f),
                    PathNode.LineTo(9.0f, 14.2f),
                    PathNode.CurveTo(9.387f, 14.2f, 9.7f, 13.886f, 9.7f, 13.5f),
                    PathNode.CurveTo(9.7f, 13.113f, 9.387f, 12.8f, 9.0f, 12.8f),
                    PathNode.LineTo(4.865f, 12.8f),
                    PathNode.CurveTo(5.64f, 11.45f, 6.79f, 10.345f, 8.184f, 9.625f),
                    PathNode.CurveTo(9.844f, 8.767f, 11.75f, 8.507f, 13.579f, 8.889f),
                    PathNode.CurveTo(15.409f, 9.271f, 17.051f, 10.272f, 18.229f, 11.723f),
                    PathNode.CurveTo(19.408f, 13.174f, 20.05f, 14.986f, 20.049f, 16.855f),
                    PathNode.CurveTo(20.049f, 17.242f, 20.362f, 17.556f, 20.748f, 17.556f),
                    PathNode.CurveTo(21.135f, 17.556f, 21.449f, 17.243f, 21.449f, 16.857f),
                    PathNode.CurveTo(21.451f, 14.666f, 20.697f, 12.541f, 19.316f, 10.84f),
                    PathNode.CurveTo(17.935f, 9.14f, 16.01f, 7.967f, 13.866f, 7.519f),
                    PathNode.CurveTo(11.721f, 7.071f, 9.488f, 7.375f, 7.541f, 8.381f),
                    PathNode.CurveTo(5.937f, 9.21f, 4.608f, 10.474f, 3.7f, 12.017f),
                    PathNode.LineTo(3.7f, 7.5f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _undo!!
    }

private var _undo: ImageVector? = null
