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

/** `coui_search_view_icon_normal` */
val OpalineIcons.Basic.Search: ImageVector
    get() {
        if (_search != null) return _search!!
        _search = ImageVector.Builder(
            name = "Search",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.822f, 8.191f),
                    PathNode.CurveTo(2.822f, 5.226f, 5.226f, 2.822f, 8.191f, 2.822f),
                    PathNode.CurveTo(11.156f, 2.822f, 13.56f, 5.226f, 13.56f, 8.191f),
                    PathNode.CurveTo(13.56f, 11.156f, 11.156f, 13.56f, 8.191f, 13.56f),
                    PathNode.CurveTo(5.226f, 13.56f, 2.822f, 11.156f, 2.822f, 8.191f),
                    PathNode.Close,
                    PathNode.MoveTo(8.191f, 1.422f),
                    PathNode.CurveTo(4.452f, 1.422f, 1.422f, 4.452f, 1.422f, 8.191f),
                    PathNode.CurveTo(1.422f, 11.929f, 4.452f, 14.96f, 8.191f, 14.96f),
                    PathNode.CurveTo(9.735f, 14.96f, 11.159f, 14.442f, 12.298f, 13.571f),
                    PathNode.LineTo(17.075f, 18.348f),
                    PathNode.CurveTo(17.426f, 18.699f, 17.996f, 18.699f, 18.347f, 18.348f),
                    PathNode.CurveTo(18.699f, 17.997f, 18.699f, 17.427f, 18.347f, 17.075f),
                    PathNode.LineTo(13.571f, 12.299f),
                    PathNode.CurveTo(14.442f, 11.16f, 14.96f, 9.736f, 14.96f, 8.191f),
                    PathNode.CurveTo(14.96f, 4.452f, 11.929f, 1.422f, 8.191f, 1.422f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _search!!
    }

private var _search: ImageVector? = null
