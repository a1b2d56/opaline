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

/** `menu_ic_about_share_normal` */
val OpalineIcons.System.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = ImageVector.Builder(
            name = "Share",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.93f, 4.93f),
                    PathNode.CurveTo(15.92f, 4.93f, 15.1f, 5.74f, 15.1f, 6.75f),
                    PathNode.CurveTo(15.1f, 7.75f, 15.92f, 8.58f, 16.93f, 8.58f),
                    PathNode.CurveTo(17.93f, 8.58f, 18.75f, 7.76f, 18.75f, 6.75f),
                    PathNode.CurveTo(18.75f, 5.75f, 17.93f, 4.93f, 16.93f, 4.93f),
                    PathNode.Close,
                    PathNode.MoveTo(13.5f, 6.75f),
                    PathNode.CurveTo(13.5f, 4.85f, 15.03f, 3.33f, 16.93f, 3.33f),
                    PathNode.CurveTo(18.82f, 3.33f, 20.35f, 4.86f, 20.35f, 6.75f),
                    PathNode.CurveTo(20.35f, 8.65f, 18.82f, 10.18f, 16.92f, 10.18f),
                    PathNode.CurveTo(15.82f, 10.18f, 14.85f, 9.66f, 14.22f, 8.86f),
                    PathNode.LineTo(9.79f, 11.36f),
                    PathNode.CurveTo(9.83f, 11.56f, 9.85f, 11.78f, 9.85f, 12.0f),
                    PathNode.CurveTo(9.85f, 12.22f, 9.83f, 12.44f, 9.79f, 12.65f),
                    PathNode.LineTo(14.23f, 15.15f),
                    PathNode.CurveTo(14.85f, 14.34f, 15.83f, 13.83f, 16.93f, 13.83f),
                    PathNode.CurveTo(18.82f, 13.83f, 20.35f, 15.36f, 20.35f, 17.25f),
                    PathNode.CurveTo(20.35f, 19.15f, 18.82f, 20.68f, 16.92f, 20.68f),
                    PathNode.CurveTo(15.03f, 20.68f, 13.5f, 19.14f, 13.5f, 17.25f),
                    PathNode.CurveTo(13.5f, 17.03f, 13.52f, 16.81f, 13.56f, 16.6f),
                    PathNode.LineTo(9.12f, 14.11f),
                    PathNode.CurveTo(8.5f, 14.91f, 7.52f, 15.43f, 6.42f, 15.43f),
                    PathNode.CurveTo(4.54f, 15.43f, 3.0f, 13.89f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 10.1f, 4.53f, 8.58f, 6.42f, 8.58f),
                    PathNode.CurveTo(7.52f, 8.58f, 8.5f, 9.09f, 9.12f, 9.89f),
                    PathNode.LineTo(13.56f, 7.39f),
                    PathNode.CurveTo(13.52f, 7.19f, 13.5f, 6.97f, 13.5f, 6.75f),
                    PathNode.Close,
                    PathNode.MoveTo(6.42f, 10.18f),
                    PathNode.CurveTo(5.42f, 10.18f, 4.6f, 10.99f, 4.6f, 12.0f),
                    PathNode.CurveTo(4.6f, 13.0f, 5.42f, 13.83f, 6.43f, 13.83f),
                    PathNode.CurveTo(7.43f, 13.83f, 8.25f, 13.01f, 8.25f, 12.0f),
                    PathNode.CurveTo(8.25f, 11.0f, 7.43f, 10.18f, 6.42f, 10.18f),
                    PathNode.Close,
                    PathNode.MoveTo(15.1f, 17.25f),
                    PathNode.CurveTo(15.1f, 16.25f, 15.92f, 15.43f, 16.93f, 15.43f),
                    PathNode.CurveTo(17.93f, 15.43f, 18.75f, 16.24f, 18.75f, 17.25f),
                    PathNode.CurveTo(18.75f, 18.25f, 17.93f, 19.08f, 16.93f, 19.08f),
                    PathNode.CurveTo(15.92f, 19.08f, 15.1f, 18.26f, 15.1f, 17.25f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _share!!
    }

private var _share: ImageVector? = null
