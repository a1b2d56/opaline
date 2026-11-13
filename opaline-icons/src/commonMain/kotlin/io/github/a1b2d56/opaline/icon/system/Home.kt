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

/** `ic_location_resident` */
val OpalineIcons.System.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = ImageVector.Builder(
            name = "Home",
            defaultWidth = 28.0f.dp,
            defaultHeight = 28.0f.dp,
            viewportWidth = 28.0f,
            viewportHeight = 28.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.328f, 6.315f),
                    PathNode.CurveTo(14.136f, 6.162f, 13.863f, 6.162f, 13.672f, 6.315f),
                    PathNode.LineTo(6.172f, 12.315f),
                    PathNode.CurveTo(5.998f, 12.455f, 5.93f, 12.689f, 6.004f, 12.899f),
                    PathNode.CurveTo(6.078f, 13.109f, 6.277f, 13.25f, 6.5f, 13.25f),
                    PathNode.LineTo(8.0f, 13.25f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 20.829f, 8.672f, 21.5f, 9.5f, 21.5f),
                    PathNode.LineTo(12.48f, 21.5f),
                    PathNode.CurveTo(12.487f, 21.5f, 12.493f, 21.5f, 12.5f, 21.5f),
                    PathNode.LineTo(15.5f, 21.5f),
                    PathNode.CurveTo(15.507f, 21.5f, 15.513f, 21.5f, 15.52f, 21.5f),
                    PathNode.LineTo(18.5f, 21.5f),
                    PathNode.CurveTo(19.703f, 21.5f, 20.0f, 20.829f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 13.25f),
                    PathNode.LineTo(21.5f, 13.25f),
                    PathNode.CurveTo(21.723f, 13.25f, 21.921f, 13.109f, 21.995f, 12.899f),
                    PathNode.CurveTo(22.069f, 12.689f, 22.002f, 12.455f, 21.828f, 12.315f),
                    PathNode.LineTo(14.328f, 6.315f),
                    PathNode.Close,
                    PathNode.MoveTo(15.5f, 20.45f),
                    PathNode.LineTo(15.5f, 16.1f),
                    PathNode.CurveTo(15.5f, 15.893f, 15.333f, 15.725f, 15.126f, 15.725f),
                    PathNode.LineTo(12.874f, 15.725f),
                    PathNode.CurveTo(12.667f, 15.725f, 12.5f, 15.893f, 12.5f, 16.1f),
                    PathNode.LineTo(12.5f, 20.45f),
                    PathNode.LineTo(15.5f, 20.45f),
                    PathNode.CurveTo(15.5f, 20.45f, 15.5f, 20.45f, 15.5f, 20.45f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _home!!
    }

private var _home: ImageVector? = null
