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

/** `item_state_start` */
val OpalineIcons.System.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = ImageVector.Builder(
            name = "Play",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.621f, 10.965f),
                    PathNode.CurveTo(20.46f, 11.425f, 20.46f, 12.575f, 19.621f, 13.035f),
                    PathNode.LineTo(8.137f, 19.338f),
                    PathNode.CurveTo(7.298f, 19.798f, 6.25f, 19.223f, 6.25f, 18.303f),
                    PathNode.LineTo(6.25f, 5.697f),
                    PathNode.CurveTo(6.25f, 4.777f, 7.298f, 4.202f, 8.137f, 4.662f),
                    PathNode.LineTo(19.621f, 10.965f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _play!!
    }

private var _play: ImageVector? = null
