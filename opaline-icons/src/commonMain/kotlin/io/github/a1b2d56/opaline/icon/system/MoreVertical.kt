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

/** `coui_toolbar_menu_icon_more_normal` */
val OpalineIcons.System.MoreVertical: ImageVector
    get() {
        if (_moreVertical != null) return _moreVertical!!
        _moreVertical = ImageVector.Builder(
            name = "MoreVertical",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.75f),
                    PathNode.CurveTo(12.967f, 13.75f, 13.75f, 12.966f, 13.75f, 12.0f),
                    PathNode.CurveTo(13.75f, 11.033f, 12.967f, 10.25f, 12.0f, 10.25f),
                    PathNode.CurveTo(11.033f, 10.25f, 10.25f, 11.033f, 10.25f, 12.0f),
                    PathNode.CurveTo(10.25f, 12.966f, 11.033f, 13.75f, 12.0f, 13.75f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.625f),
                    PathNode.CurveTo(12.967f, 6.625f, 13.75f, 5.842f, 13.75f, 4.875f),
                    PathNode.CurveTo(13.75f, 3.908f, 12.967f, 3.125f, 12.0f, 3.125f),
                    PathNode.CurveTo(11.033f, 3.125f, 10.25f, 3.908f, 10.25f, 4.875f),
                    PathNode.CurveTo(10.25f, 5.842f, 11.033f, 6.625f, 12.0f, 6.625f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 20.875f),
                    PathNode.CurveTo(12.967f, 20.875f, 13.75f, 20.091f, 13.75f, 19.125f),
                    PathNode.CurveTo(13.75f, 18.158f, 12.967f, 17.375f, 12.0f, 17.375f),
                    PathNode.CurveTo(11.033f, 17.375f, 10.25f, 18.158f, 10.25f, 19.125f),
                    PathNode.CurveTo(10.25f, 20.091f, 11.033f, 20.875f, 12.0f, 20.875f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _moreVertical!!
    }

private var _moreVertical: ImageVector? = null
