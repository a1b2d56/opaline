// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `ic_edit_text_delete` */
val OpalineIcons.Basic.SearchCleanup: ImageVector
    get() {
        if (_searchCleanup != null) return _searchCleanup!!
        _searchCleanup = ImageVector.Builder(
            name = "SearchCleanup",
            defaultWidth = 22.0f.dp,
            defaultHeight = 22.0f.dp,
            viewportWidth = 22.0f,
            viewportHeight = 22.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 20.0f),
                    PathNode.CurveTo(15.971f, 20.0f, 20.0f, 15.971f, 20.0f, 11.0f),
                    PathNode.CurveTo(20.0f, 6.029f, 15.971f, 2.0f, 11.0f, 2.0f),
                    PathNode.CurveTo(6.029f, 2.0f, 2.0f, 6.029f, 2.0f, 11.0f),
                    PathNode.CurveTo(2.0f, 15.971f, 6.029f, 20.0f, 11.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.596f, 7.464f),
                    PathNode.LineTo(11.0f, 9.868f),
                    PathNode.LineTo(13.404f, 7.465f),
                    PathNode.CurveTo(13.716f, 7.152f, 14.223f, 7.152f, 14.535f, 7.465f),
                    PathNode.CurveTo(14.848f, 7.777f, 14.848f, 8.283f, 14.535f, 8.596f),
                    PathNode.LineTo(12.132f, 11.0f),
                    PathNode.LineTo(14.536f, 13.404f),
                    PathNode.CurveTo(14.848f, 13.716f, 14.848f, 14.223f, 14.536f, 14.535f),
                    PathNode.CurveTo(14.224f, 14.848f, 13.717f, 14.848f, 13.405f, 14.535f),
                    PathNode.LineTo(11.0f, 12.131f),
                    PathNode.LineTo(8.595f, 14.536f),
                    PathNode.CurveTo(8.283f, 14.848f, 7.777f, 14.848f, 7.464f, 14.536f),
                    PathNode.CurveTo(7.152f, 14.223f, 7.152f, 13.717f, 7.464f, 13.404f),
                    PathNode.LineTo(9.869f, 11.0f),
                    PathNode.LineTo(7.465f, 8.595f),
                    PathNode.CurveTo(7.152f, 8.283f, 7.152f, 7.777f, 7.465f, 7.464f),
                    PathNode.CurveTo(7.777f, 7.152f, 8.284f, 7.152f, 8.596f, 7.464f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _searchCleanup!!
    }

private var _searchCleanup: ImageVector? = null
