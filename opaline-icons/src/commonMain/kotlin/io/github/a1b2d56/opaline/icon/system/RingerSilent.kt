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

/** `op_ic_silence` */
val OpalineIcons.System.RingerSilent: ImageVector
    get() {
        if (_ringerSilent != null) return _ringerSilent!!
        _ringerSilent = ImageVector.Builder(
            name = "RingerSilent",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.255f, 19.036f),
                    PathNode.CurveTo(14.37f, 19.036f, 14.455f, 19.143f, 14.419f, 19.253f),
                    PathNode.CurveTo(14.084f, 20.267f, 13.131f, 20.999f, 12.004f, 21.0f),
                    PathNode.CurveTo(10.878f, 21.0f, 9.923f, 20.267f, 9.588f, 19.253f),
                    PathNode.CurveTo(9.552f, 19.143f, 9.637f, 19.036f, 9.752f, 19.036f),
                    PathNode.LineTo(14.255f, 19.036f),
                    PathNode.Close,
                    PathNode.MoveTo(3.51f, 3.51f),
                    PathNode.CurveTo(3.755f, 3.266f, 4.151f, 3.266f, 4.395f, 3.51f),
                    PathNode.LineTo(7.338f, 6.454f),
                    PathNode.LineTo(7.339f, 6.454f),
                    PathNode.LineTo(20.491f, 19.605f),
                    PathNode.CurveTo(20.735f, 19.85f, 20.735f, 20.247f, 20.491f, 20.491f),
                    PathNode.CurveTo(20.246f, 20.735f, 19.849f, 20.735f, 19.605f, 20.491f),
                    PathNode.LineTo(3.51f, 4.395f),
                    PathNode.CurveTo(3.266f, 4.151f, 3.266f, 3.755f, 3.51f, 3.51f),
                    PathNode.Close,
                    PathNode.MoveTo(15.344f, 17.874f),
                    PathNode.LineTo(6.28f, 17.874f),
                    PathNode.CurveTo(5.423f, 17.874f, 4.994f, 17.874f, 4.749f, 17.764f),
                    PathNode.CurveTo(4.171f, 17.505f, 3.878f, 16.855f, 4.066f, 16.25f),
                    PathNode.CurveTo(4.145f, 15.994f, 4.429f, 15.672f, 4.997f, 15.029f),
                    PathNode.CurveTo(5.297f, 14.689f, 5.448f, 14.518f, 5.573f, 14.336f),
                    PathNode.CurveTo(5.86f, 13.915f, 6.055f, 13.437f, 6.143f, 12.934f),
                    PathNode.CurveTo(6.181f, 12.716f, 6.193f, 12.489f, 6.215f, 12.036f),
                    PathNode.LineTo(6.332f, 9.68f),
                    PathNode.CurveTo(6.332f, 9.42f, 6.35f, 9.164f, 6.384f, 8.913f),
                    PathNode.LineTo(15.344f, 17.874f),
                    PathNode.Close,
                    PathNode.MoveTo(12.002f, 2.999f),
                    PathNode.CurveTo(12.689f, 2.999f, 13.269f, 3.462f, 13.445f, 4.093f),
                    PathNode.CurveTo(13.463f, 4.158f, 13.512f, 4.212f, 13.578f, 4.231f),
                    PathNode.CurveTo(15.944f, 4.913f, 17.675f, 7.094f, 17.675f, 9.68f),
                    PathNode.LineTo(17.791f, 12.033f),
                    PathNode.CurveTo(17.813f, 12.486f, 17.824f, 12.713f, 17.862f, 12.931f),
                    PathNode.CurveTo(17.95f, 13.436f, 18.145f, 13.915f, 18.434f, 14.338f),
                    PathNode.CurveTo(18.559f, 14.52f, 18.709f, 14.691f, 19.009f, 15.031f),
                    PathNode.CurveTo(19.576f, 15.672f, 19.86f, 15.993f, 19.94f, 16.248f),
                    PathNode.CurveTo(20.052f, 16.606f, 19.993f, 16.979f, 19.808f, 17.279f),
                    PathNode.LineTo(8.097f, 5.569f),
                    PathNode.CurveTo(8.747f, 4.952f, 9.543f, 4.487f, 10.427f, 4.231f),
                    PathNode.CurveTo(10.493f, 4.212f, 10.543f, 4.158f, 10.561f, 4.093f),
                    PathNode.CurveTo(10.737f, 3.462f, 11.316f, 2.999f, 12.002f, 2.999f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _ringerSilent!!
    }

private var _ringerSilent: ImageVector? = null
