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

/** `op_ic_qs_vpn_active` */
val OpalineIcons.System.Vpn: ImageVector
    get() {
        if (_vpn != null) return _vpn!!
        _vpn = ImageVector.Builder(
            name = "Vpn",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.685f, 9.66f),
                    PathNode.CurveTo(12.937f, 9.654f, 13.145f, 9.711f, 13.319f, 9.821f),
                    PathNode.LineTo(13.329f, 9.827f),
                    PathNode.CurveTo(13.432f, 9.887f, 13.51f, 9.965f, 13.568f, 10.066f),
                    PathNode.CurveTo(13.622f, 10.183f, 13.656f, 10.342f, 13.656f, 10.552f),
                    PathNode.CurveTo(13.656f, 10.775f, 13.584f, 10.979f, 13.426f, 11.172f),
                    PathNode.CurveTo(13.287f, 11.337f, 13.068f, 11.443f, 12.717f, 11.449f),
                    PathNode.LineTo(11.362f, 11.449f),
                    PathNode.LineTo(11.362f, 9.66f),
                    PathNode.LineTo(12.679f, 9.66f),
                    PathNode.LineTo(12.685f, 9.66f),
                    PathNode.Close,
                    PathNode.MoveTo(12.618f, 8.012f),
                    PathNode.LineTo(9.654f, 8.012f),
                    PathNode.LineTo(9.654f, 15.972f),
                    PathNode.LineTo(11.362f, 15.972f),
                    PathNode.LineTo(11.362f, 13.096f),
                    PathNode.LineTo(12.764f, 13.096f),
                    PathNode.LineTo(12.77f, 13.096f),
                    PathNode.CurveTo(13.591f, 13.082f, 14.257f, 12.816f, 14.719f, 12.264f),
                    PathNode.CurveTo(15.144f, 11.767f, 15.365f, 11.204f, 15.365f, 10.582f),
                    PathNode.CurveTo(15.365f, 10.143f, 15.283f, 9.746f, 15.107f, 9.4f),
                    PathNode.CurveTo(14.946f, 9.061f, 14.73f, 8.785f, 14.453f, 8.587f),
                    PathNode.CurveTo(14.155f, 8.352f, 13.848f, 8.185f, 13.532f, 8.102f),
                    PathNode.LineTo(13.515f, 8.099f),
                    PathNode.CurveTo(13.225f, 8.041f, 12.926f, 8.012f, 12.618f, 8.012f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.861f, 13.05f),
                    PathNode.LineTo(17.652f, 8.012f),
                    PathNode.LineTo(16.455f, 8.012f),
                    PathNode.LineTo(16.455f, 15.972f),
                    PathNode.LineTo(18.163f, 15.972f),
                    PathNode.LineTo(18.163f, 11.499f),
                    PathNode.LineTo(21.026f, 16.0f),
                    PathNode.LineTo(22.569f, 15.965f),
                    PathNode.LineTo(22.569f, 8.012f),
                    PathNode.LineTo(20.861f, 8.012f),
                    PathNode.LineTo(20.861f, 13.05f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.812f, 8.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.LineTo(4.626f, 15.96f),
                    PathNode.LineTo(5.923f, 15.96f),
                    PathNode.LineTo(8.554f, 8.0f),
                    PathNode.LineTo(6.742f, 8.0f),
                    PathNode.LineTo(5.275f, 12.906f),
                    PathNode.LineTo(3.812f, 8.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _vpn!!
    }

private var _vpn: ImageVector? = null
