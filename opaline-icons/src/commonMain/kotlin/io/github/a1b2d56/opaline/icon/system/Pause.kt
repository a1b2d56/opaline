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

/** `item_state_pause` */
val OpalineIcons.System.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = ImageVector.Builder(
            name = "Pause",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.26f, 4.498f),
                    PathNode.CurveTo(9.425f, 4.498f, 9.584f, 4.562f, 9.701f, 4.675f),
                    PathNode.CurveTo(9.818f, 4.788f, 9.885f, 4.942f, 9.885f, 5.102f),
                    PathNode.LineTo(9.885f, 18.895f),
                    PathNode.CurveTo(9.885f, 19.228f, 9.605f, 19.498f, 9.26f, 19.498f),
                    PathNode.LineTo(6.375f, 19.498f),
                    PathNode.CurveTo(6.209f, 19.498f, 6.05f, 19.434f, 5.933f, 19.321f),
                    PathNode.CurveTo(5.816f, 19.208f, 5.75f, 19.055f, 5.75f, 18.895f),
                    PathNode.LineTo(5.75f, 5.102f),
                    PathNode.CurveTo(5.75f, 4.768f, 6.03f, 4.498f, 6.375f, 4.498f),
                    PathNode.LineTo(9.26f, 4.498f),
                    PathNode.Close,
                    PathNode.MoveTo(17.625f, 4.498f),
                    PathNode.CurveTo(17.791f, 4.498f, 17.95f, 4.563f, 18.067f, 4.679f),
                    PathNode.CurveTo(18.185f, 4.794f, 18.25f, 4.952f, 18.25f, 5.115f),
                    PathNode.LineTo(18.25f, 18.881f),
                    PathNode.CurveTo(18.25f, 19.222f, 17.97f, 19.498f, 17.625f, 19.498f),
                    PathNode.LineTo(14.74f, 19.498f),
                    PathNode.CurveTo(14.575f, 19.498f, 14.416f, 19.433f, 14.299f, 19.317f),
                    PathNode.CurveTo(14.182f, 19.202f, 14.115f, 19.045f, 14.115f, 18.881f),
                    PathNode.LineTo(14.115f, 5.115f),
                    PathNode.CurveTo(14.115f, 4.775f, 14.395f, 4.498f, 14.74f, 4.498f),
                    PathNode.LineTo(17.625f, 4.498f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _pause!!
    }

private var _pause: ImageVector? = null
