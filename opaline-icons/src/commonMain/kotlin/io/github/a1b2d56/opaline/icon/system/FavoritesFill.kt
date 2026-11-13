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

/** `base_ic_favorite_filled_normal` */
val OpalineIcons.System.FavoritesFill: ImageVector
    get() {
        if (_favoritesFill != null) return _favoritesFill!!
        _favoritesFill = ImageVector.Builder(
            name = "FavoritesFill",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.042f, 2.426f),
                    PathNode.CurveTo(17.802f, 2.426f, 18.554f, 2.58f, 19.253f, 2.877f),
                    PathNode.CurveTo(19.952f, 3.174f, 20.583f, 3.61f, 21.11f, 4.157f),
                    PathNode.CurveTo(22.202f, 5.292f, 22.782f, 7.012f, 22.782f, 8.528f),
                    PathNode.CurveTo(22.782f, 10.352f, 22.221f, 11.68f, 21.168f, 13.098f),
                    PathNode.CurveTo(20.472f, 14.036f, 18.442f, 16.125f, 16.551f, 17.945f),
                    PathNode.CurveTo(15.596f, 18.864f, 14.658f, 19.732f, 13.914f, 20.374f),
                    PathNode.CurveTo(13.544f, 20.694f, 13.212f, 20.965f, 12.946f, 21.16f),
                    PathNode.CurveTo(12.815f, 21.257f, 12.686f, 21.344f, 12.569f, 21.411f),
                    PathNode.CurveTo(12.511f, 21.444f, 12.442f, 21.48f, 12.369f, 21.509f),
                    PathNode.CurveTo(12.308f, 21.533f, 12.186f, 21.576f, 12.037f, 21.576f),
                    PathNode.CurveTo(11.882f, 21.576f, 11.756f, 21.529f, 11.696f, 21.505f),
                    PathNode.CurveTo(11.623f, 21.475f, 11.555f, 21.438f, 11.496f, 21.404f),
                    PathNode.CurveTo(11.378f, 21.335f, 11.246f, 21.245f, 11.11f, 21.145f),
                    PathNode.CurveTo(10.837f, 20.941f, 10.495f, 20.657f, 10.111f, 20.325f),
                    PathNode.CurveTo(9.342f, 19.658f, 8.371f, 18.76f, 7.393f, 17.821f),
                    PathNode.CurveTo(6.413f, 16.882f, 5.419f, 15.896f, 4.602f, 15.055f),
                    PathNode.CurveTo(3.804f, 14.233f, 3.141f, 13.514f, 2.84f, 13.11f),
                    PathNode.CurveTo(1.708f, 11.684f, 1.219f, 10.129f, 1.219f, 8.531f),
                    PathNode.CurveTo(1.219f, 7.015f, 1.799f, 5.295f, 2.891f, 4.16f),
                    PathNode.CurveTo(3.418f, 3.613f, 4.05f, 3.177f, 4.749f, 2.88f),
                    PathNode.CurveTo(5.448f, 2.582f, 6.2f, 2.429f, 6.96f, 2.429f),
                    PathNode.CurveTo(7.72f, 2.429f, 8.472f, 2.582f, 9.171f, 2.88f),
                    PathNode.CurveTo(9.869f, 3.177f, 10.501f, 3.612f, 11.027f, 4.158f),
                    PathNode.LineTo(11.029f, 4.16f),
                    PathNode.LineTo(12.024f, 5.182f),
                    PathNode.LineTo(12.973f, 4.157f),
                    PathNode.CurveTo(13.5f, 3.61f, 14.131f, 3.174f, 14.83f, 2.877f),
                    PathNode.CurveTo(15.529f, 2.579f, 16.282f, 2.426f, 17.042f, 2.426f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _favoritesFill!!
    }

private var _favoritesFill: ImageVector? = null
