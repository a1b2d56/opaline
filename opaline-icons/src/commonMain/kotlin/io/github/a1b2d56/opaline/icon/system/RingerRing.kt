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

/** `op_ic_ring` */
val OpalineIcons.System.RingerRing: ImageVector
    get() {
        if (_ringerRing != null) return _ringerRing!!
        _ringerRing = ImageVector.Builder(
            name = "RingerRing",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.251f, 19.035f),
                    PathNode.CurveTo(14.366f, 19.035f, 14.451f, 19.143f, 14.415f, 19.252f),
                    PathNode.CurveTo(14.08f, 20.267f, 13.126f, 20.998f, 12.0f, 20.999f),
                    PathNode.CurveTo(10.873f, 20.998f, 9.919f, 20.267f, 9.585f, 19.252f),
                    PathNode.CurveTo(9.549f, 19.143f, 9.634f, 19.035f, 9.749f, 19.035f),
                    PathNode.LineTo(14.251f, 19.035f),
                    PathNode.Close,
                    PathNode.MoveTo(11.999f, 3.0f),
                    PathNode.CurveTo(12.685f, 3.0f, 13.263f, 3.462f, 13.439f, 4.092f),
                    PathNode.CurveTo(13.457f, 4.158f, 13.507f, 4.211f, 13.572f, 4.23f),
                    PathNode.CurveTo(15.939f, 4.912f, 17.671f, 7.094f, 17.671f, 9.68f),
                    PathNode.LineTo(17.786f, 12.033f),
                    PathNode.CurveTo(17.808f, 12.486f, 17.819f, 12.713f, 17.857f, 12.931f),
                    PathNode.CurveTo(17.945f, 13.435f, 18.14f, 13.915f, 18.429f, 14.337f),
                    PathNode.CurveTo(18.554f, 14.52f, 18.704f, 14.69f, 19.004f, 15.03f),
                    PathNode.CurveTo(19.571f, 15.671f, 19.855f, 15.992f, 19.935f, 16.247f),
                    PathNode.CurveTo(20.125f, 16.853f, 19.83f, 17.505f, 19.251f, 17.764f),
                    PathNode.CurveTo(19.007f, 17.873f, 18.579f, 17.873f, 17.723f, 17.873f),
                    PathNode.LineTo(6.276f, 17.873f),
                    PathNode.CurveTo(5.419f, 17.873f, 4.99f, 17.872f, 4.746f, 17.763f),
                    PathNode.CurveTo(4.168f, 17.504f, 3.874f, 16.854f, 4.062f, 16.249f),
                    PathNode.CurveTo(4.142f, 15.993f, 4.425f, 15.671f, 4.993f, 15.029f),
                    PathNode.CurveTo(5.293f, 14.689f, 5.444f, 14.518f, 5.569f, 14.335f),
                    PathNode.CurveTo(5.857f, 13.915f, 6.051f, 13.436f, 6.139f, 12.934f),
                    PathNode.CurveTo(6.177f, 12.716f, 6.189f, 12.489f, 6.212f, 12.036f),
                    PathNode.LineTo(6.329f, 9.68f),
                    PathNode.CurveTo(6.329f, 7.096f, 8.058f, 4.915f, 10.422f, 4.232f),
                    PathNode.CurveTo(10.488f, 4.213f, 10.538f, 4.159f, 10.556f, 4.093f),
                    PathNode.CurveTo(10.732f, 3.462f, 11.312f, 3.0f, 11.999f, 3.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _ringerRing!!
    }

private var _ringerRing: ImageVector? = null
