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

/** `ic_menu_rename_new` */
val OpalineIcons.System.Rename: ImageVector
    get() {
        if (_rename != null) return _rename!!
        _rename = ImageVector.Builder(
            name = "Rename",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.752f, 1.862f),
                    PathNode.CurveTo(18.371f, 1.945f, 18.997f, 2.288f, 19.583f, 2.874f),
                    PathNode.CurveTo(20.168f, 3.459f, 20.511f, 4.085f, 20.593f, 4.704f),
                    PathNode.CurveTo(20.676f, 5.333f, 20.481f, 5.914f, 20.073f, 6.322f),
                    PathNode.LineTo(9.249f, 17.146f),
                    PathNode.CurveTo(9.088f, 17.307f, 8.894f, 17.429f, 8.679f, 17.504f),
                    PathNode.LineTo(8.679f, 17.504f),
                    PathNode.LineTo(4.318f, 19.028f),
                    PathNode.CurveTo(4.064f, 19.117f, 3.782f, 19.053f, 3.592f, 18.862f),
                    PathNode.CurveTo(3.402f, 18.673f, 3.337f, 18.39f, 3.426f, 18.137f),
                    PathNode.LineTo(4.95f, 13.775f),
                    PathNode.LineTo(5.609f, 14.005f),
                    PathNode.LineTo(4.95f, 13.775f),
                    PathNode.CurveTo(5.025f, 13.561f, 5.147f, 13.366f, 5.308f, 13.205f),
                    PathNode.LineTo(13.842f, 4.671f),
                    PathNode.LineTo(13.842f, 4.671f),
                    PathNode.LineTo(13.858f, 4.655f),
                    PathNode.LineTo(16.132f, 2.381f),
                    PathNode.CurveTo(16.541f, 1.972f, 17.122f, 1.778f, 17.752f, 1.862f),
                    PathNode.Close,
                    PathNode.MoveTo(6.298f, 14.195f),
                    PathNode.LineTo(14.839f, 5.654f),
                    PathNode.CurveTo(14.922f, 5.576f, 15.059f, 5.512f, 15.275f, 5.541f),
                    PathNode.CurveTo(15.509f, 5.572f, 15.868f, 5.72f, 16.302f, 6.155f),
                    PathNode.CurveTo(16.736f, 6.588f, 16.883f, 6.946f, 16.914f, 7.179f),
                    PathNode.CurveTo(16.944f, 7.402f, 16.875f, 7.541f, 16.793f, 7.622f),
                    PathNode.LineTo(16.793f, 7.622f),
                    PathNode.LineTo(8.259f, 16.156f),
                    PathNode.CurveTo(8.247f, 16.168f, 8.233f, 16.177f, 8.217f, 16.183f),
                    PathNode.LineTo(8.217f, 16.183f),
                    PathNode.LineTo(5.227f, 17.228f),
                    PathNode.LineTo(6.272f, 14.237f),
                    PathNode.CurveTo(6.277f, 14.221f, 6.286f, 14.207f, 6.298f, 14.195f),
                    PathNode.Close,
                    PathNode.MoveTo(19.084f, 5.332f),
                    PathNode.LineTo(18.106f, 6.309f),
                    PathNode.CurveTo(17.934f, 5.92f, 17.662f, 5.534f, 17.292f, 5.165f),
                    PathNode.CurveTo(16.922f, 4.794f, 16.535f, 4.521f, 16.144f, 4.349f),
                    PathNode.LineTo(17.122f, 3.371f),
                    PathNode.CurveTo(17.204f, 3.289f, 17.343f, 3.22f, 17.566f, 3.25f),
                    PathNode.CurveTo(17.8f, 3.281f, 18.159f, 3.43f, 18.593f, 3.864f),
                    PathNode.CurveTo(19.026f, 4.297f, 19.174f, 4.655f, 19.205f, 4.888f),
                    PathNode.CurveTo(19.235f, 5.111f, 19.165f, 5.25f, 19.084f, 5.332f),
                    PathNode.Close,
                    PathNode.MoveTo(4.0f, 20.757f),
                    PathNode.CurveTo(3.613f, 20.757f, 3.3f, 21.07f, 3.3f, 21.457f),
                    PathNode.CurveTo(3.3f, 21.843f, 3.613f, 22.157f, 4.0f, 22.157f),
                    PathNode.LineTo(20.0f, 22.157f),
                    PathNode.CurveTo(20.386f, 22.157f, 20.7f, 21.843f, 20.7f, 21.457f),
                    PathNode.CurveTo(20.7f, 21.07f, 20.386f, 20.757f, 20.0f, 20.757f),
                    PathNode.LineTo(4.0f, 20.757f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _rename!!
    }

private var _rename: ImageVector? = null
