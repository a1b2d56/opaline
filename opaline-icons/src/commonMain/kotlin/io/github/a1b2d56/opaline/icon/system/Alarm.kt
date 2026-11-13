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

/** `tab_alarm` */
val OpalineIcons.System.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = ImageVector.Builder(
            name = "Alarm",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.948f, 3.24f),
                    PathNode.CurveTo(17.035f, 3.24f, 21.16f, 7.364f, 21.16f, 12.451f),
                    PathNode.CurveTo(21.16f, 14.468f, 20.51f, 16.332f, 19.409f, 17.849f),
                    PathNode.CurveTo(19.19f, 18.152f, 19.08f, 18.304f, 19.073f, 18.457f),
                    PathNode.CurveTo(19.067f, 18.61f, 19.156f, 18.757f, 19.333f, 19.053f),
                    PathNode.LineTo(20.07f, 20.282f),
                    PathNode.CurveTo(20.224f, 20.538f, 20.184f, 20.868f, 19.973f, 21.08f),
                    PathNode.CurveTo(19.761f, 21.291f, 19.432f, 21.331f, 19.175f, 21.177f),
                    PathNode.LineTo(17.785f, 20.344f),
                    PathNode.CurveTo(17.517f, 20.183f, 17.382f, 20.102f, 17.241f, 20.102f),
                    PathNode.CurveTo(17.1f, 20.102f, 16.954f, 20.189f, 16.663f, 20.363f),
                    PathNode.CurveTo(15.284f, 21.187f, 13.672f, 21.663f, 11.948f, 21.663f),
                    PathNode.CurveTo(10.211f, 21.663f, 8.587f, 21.181f, 7.2f, 20.344f),
                    PathNode.CurveTo(6.909f, 20.168f, 6.763f, 20.08f, 6.621f, 20.08f),
                    PathNode.CurveTo(6.48f, 20.08f, 6.344f, 20.161f, 6.074f, 20.323f),
                    PathNode.LineTo(4.651f, 21.177f),
                    PathNode.CurveTo(4.394f, 21.331f, 4.065f, 21.291f, 3.854f, 21.08f),
                    PathNode.CurveTo(3.642f, 20.868f, 3.601f, 20.539f, 3.755f, 20.282f),
                    PathNode.LineTo(4.524f, 19.0f),
                    PathNode.CurveTo(4.7f, 18.706f, 4.787f, 18.559f, 4.781f, 18.407f),
                    PathNode.CurveTo(4.775f, 18.255f, 4.667f, 18.103f, 4.451f, 17.801f),
                    PathNode.CurveTo(3.373f, 16.293f, 2.737f, 14.446f, 2.737f, 12.451f),
                    PathNode.CurveTo(2.738f, 7.364f, 6.862f, 3.24f, 11.948f, 3.24f),
                    PathNode.Close,
                    PathNode.MoveTo(11.948f, 4.939f),
                    PathNode.CurveTo(7.8f, 4.939f, 4.437f, 8.303f, 4.437f, 12.451f),
                    PathNode.CurveTo(4.437f, 16.599f, 7.8f, 19.962f, 11.948f, 19.962f),
                    PathNode.CurveTo(16.097f, 19.962f, 19.46f, 16.599f, 19.46f, 12.451f),
                    PathNode.CurveTo(19.46f, 8.303f, 16.097f, 4.939f, 11.948f, 4.939f),
                    PathNode.Close,
                    PathNode.MoveTo(11.924f, 6.276f),
                    PathNode.CurveTo(12.058f, 6.276f, 12.187f, 6.329f, 12.289f, 6.423f),
                    PathNode.CurveTo(12.391f, 6.518f, 12.457f, 6.647f, 12.467f, 6.781f),
                    PathNode.CurveTo(12.473f, 6.866f, 12.48f, 6.951f, 12.486f, 7.036f),
                    PathNode.CurveTo(12.599f, 8.564f, 12.71f, 10.094f, 12.822f, 11.623f),
                    PathNode.CurveTo(12.823f, 11.628f, 12.823f, 11.634f, 12.823f, 11.64f),
                    PathNode.CurveTo(12.855f, 11.739f, 12.872f, 11.841f, 12.868f, 11.941f),
                    PathNode.CurveTo(12.864f, 12.074f, 12.825f, 12.197f, 12.761f, 12.307f),
                    PathNode.CurveTo(12.722f, 12.387f, 12.671f, 12.461f, 12.607f, 12.526f),
                    PathNode.CurveTo(12.533f, 12.6f, 12.444f, 12.658f, 12.347f, 12.703f),
                    PathNode.CurveTo(11.419f, 13.417f, 10.491f, 14.133f, 9.564f, 14.847f),
                    PathNode.CurveTo(9.511f, 14.887f, 9.458f, 14.928f, 9.406f, 14.968f),
                    PathNode.CurveTo(9.302f, 15.048f, 9.163f, 15.084f, 9.026f, 15.073f),
                    PathNode.CurveTo(8.89f, 15.061f, 8.764f, 15.004f, 8.675f, 14.908f),
                    PathNode.CurveTo(8.586f, 14.812f, 8.537f, 14.683f, 8.535f, 14.545f),
                    PathNode.CurveTo(8.534f, 14.408f, 8.579f, 14.273f, 8.666f, 14.174f),
                    PathNode.CurveTo(8.71f, 14.125f, 8.753f, 14.075f, 8.797f, 14.026f),
                    PathNode.CurveTo(9.543f, 13.185f, 10.288f, 12.342f, 11.034f, 11.5f),
                    PathNode.CurveTo(11.144f, 10.012f, 11.252f, 8.524f, 11.361f, 7.036f),
                    PathNode.CurveTo(11.368f, 6.951f, 11.375f, 6.866f, 11.381f, 6.781f),
                    PathNode.CurveTo(11.391f, 6.647f, 11.457f, 6.518f, 11.559f, 6.423f),
                    PathNode.CurveTo(11.661f, 6.329f, 11.79f, 6.276f, 11.924f, 6.276f),
                    PathNode.Close,
                    PathNode.MoveTo(17.804f, 2.595f),
                    PathNode.CurveTo(18.916f, 2.351f, 20.125f, 2.661f, 20.989f, 3.526f),
                    PathNode.CurveTo(21.854f, 4.391f, 22.164f, 5.6f, 21.92f, 6.711f),
                    PathNode.CurveTo(21.797f, 7.274f, 21.734f, 7.555f, 21.348f, 7.668f),
                    PathNode.CurveTo(20.962f, 7.781f, 20.702f, 7.522f, 20.185f, 7.004f),
                    PathNode.LineTo(17.511f, 4.331f),
                    PathNode.CurveTo(16.993f, 3.813f, 16.734f, 3.554f, 16.847f, 3.168f),
                    PathNode.CurveTo(16.96f, 2.781f, 17.242f, 2.719f, 17.804f, 2.595f),
                    PathNode.Close,
                    PathNode.MoveTo(3.012f, 3.485f),
                    PathNode.CurveTo(3.877f, 2.62f, 5.086f, 2.31f, 6.197f, 2.554f),
                    PathNode.CurveTo(6.759f, 2.678f, 7.04f, 2.739f, 7.153f, 3.126f),
                    PathNode.CurveTo(7.267f, 3.512f, 7.008f, 3.772f, 6.49f, 4.29f),
                    PathNode.LineTo(3.816f, 6.963f),
                    PathNode.CurveTo(3.298f, 7.481f, 3.039f, 7.74f, 2.652f, 7.627f),
                    PathNode.CurveTo(2.266f, 7.514f, 2.204f, 7.233f, 2.08f, 6.67f),
                    PathNode.CurveTo(1.836f, 5.559f, 2.147f, 4.35f, 3.012f, 3.485f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
