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

/** `ic_sd_card` */
val OpalineIcons.System.SdCard: ImageVector
    get() {
        if (_sdCard != null) return _sdCard!!
        _sdCard = ImageVector.Builder(
            name = "SdCard",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.LineTo(10.0f, 2.0f),
                    PathNode.LineTo(4.02f, 8.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _sdCard!!
    }

private var _sdCard: ImageVector? = null
