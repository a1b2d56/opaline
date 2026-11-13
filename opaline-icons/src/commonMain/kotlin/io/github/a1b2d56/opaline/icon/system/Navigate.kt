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

/** `address_ic_navigate` */
val OpalineIcons.System.Navigate: ImageVector
    get() {
        if (_navigate != null) return _navigate!!
        _navigate = ImageVector.Builder(
            name = "Navigate",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.049f, 12.589f),
                    PathNode.CurveTo(4.049f, 8.125f, 7.634f, 4.551f, 11.999f, 4.551f),
                    PathNode.CurveTo(16.365f, 4.551f, 19.949f, 8.125f, 19.949f, 12.589f),
                    PathNode.CurveTo(19.949f, 14.584f, 19.231f, 16.408f, 18.049f, 17.747f),
                    PathNode.LineTo(19.249f, 18.806f),
                    PathNode.CurveTo(20.693f, 17.17f, 21.549f, 14.968f, 21.549f, 12.589f),
                    PathNode.CurveTo(21.549f, 7.252f, 17.259f, 2.951f, 11.999f, 2.951f),
                    PathNode.CurveTo(6.74f, 2.951f, 2.449f, 7.252f, 2.449f, 12.589f),
                    PathNode.CurveTo(2.449f, 14.968f, 3.306f, 17.17f, 4.749f, 18.806f),
                    PathNode.LineTo(5.949f, 17.747f),
                    PathNode.CurveTo(4.768f, 16.408f, 4.049f, 14.584f, 4.049f, 12.589f),
                    PathNode.Close,
                    PathNode.MoveTo(12.715f, 11.356f),
                    PathNode.CurveTo(12.579f, 11.085f, 12.302f, 10.913f, 11.999f, 10.913f),
                    PathNode.CurveTo(11.696f, 10.913f, 11.419f, 11.085f, 11.284f, 11.356f),
                    PathNode.LineTo(7.346f, 19.231f),
                    PathNode.CurveTo(7.199f, 19.525f, 7.247f, 19.88f, 7.468f, 20.124f),
                    PathNode.CurveTo(7.688f, 20.369f, 8.036f, 20.453f, 8.344f, 20.337f),
                    PathNode.LineTo(11.999f, 18.956f),
                    PathNode.LineTo(15.654f, 20.337f),
                    PathNode.CurveTo(15.962f, 20.453f, 16.31f, 20.369f, 16.531f, 20.124f),
                    PathNode.CurveTo(16.751f, 19.88f, 16.799f, 19.525f, 16.652f, 19.231f),
                    PathNode.LineTo(12.715f, 11.356f),
                    PathNode.Close,
                    PathNode.MoveTo(11.717f, 17.353f),
                    PathNode.LineTo(9.692f, 18.117f),
                    PathNode.LineTo(11.999f, 13.502f),
                    PathNode.LineTo(14.307f, 18.117f),
                    PathNode.LineTo(12.282f, 17.353f),
                    PathNode.CurveTo(12.1f, 17.284f, 11.899f, 17.284f, 11.717f, 17.353f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _navigate!!
    }

private var _navigate: ImageVector? = null
