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

/** `ic_settings_app_info_uninstall` */
val OpalineIcons.System.Uninstall: ImageVector
    get() {
        if (_uninstall != null) return _uninstall!!
        _uninstall = ImageVector.Builder(
            name = "Uninstall",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.075f, 1.526f),
                    PathNode.CurveTo(13.441f, 1.53f, 13.77f, 1.554f, 14.07f, 1.672f),
                    PathNode.CurveTo(14.397f, 1.8f, 14.686f, 2.009f, 14.911f, 2.278f),
                    PathNode.CurveTo(15.187f, 2.608f, 15.318f, 3.041f, 15.482f, 3.533f),
                    PathNode.LineTo(15.851f, 4.636f),
                    PathNode.LineTo(21.253f, 4.636f),
                    PathNode.CurveTo(21.639f, 4.636f, 21.953f, 4.949f, 21.953f, 5.336f),
                    PathNode.CurveTo(21.953f, 5.723f, 21.639f, 6.036f, 21.253f, 6.036f),
                    PathNode.LineTo(19.813f, 6.036f),
                    PathNode.LineTo(19.121f, 18.144f),
                    PathNode.CurveTo(19.085f, 18.768f, 19.057f, 19.282f, 19.0f, 19.697f),
                    PathNode.CurveTo(18.942f, 20.122f, 18.846f, 20.506f, 18.646f, 20.863f),
                    PathNode.CurveTo(18.332f, 21.422f, 17.855f, 21.873f, 17.279f, 22.154f),
                    PathNode.CurveTo(16.911f, 22.334f, 16.522f, 22.406f, 16.095f, 22.44f),
                    PathNode.CurveTo(15.677f, 22.474f, 15.163f, 22.474f, 14.537f, 22.474f),
                    PathNode.LineTo(9.473f, 22.474f),
                    PathNode.CurveTo(8.847f, 22.474f, 8.333f, 22.474f, 7.915f, 22.44f),
                    PathNode.CurveTo(7.488f, 22.406f, 7.098f, 22.334f, 6.729f, 22.154f),
                    PathNode.CurveTo(6.154f, 21.873f, 5.677f, 21.422f, 5.363f, 20.863f),
                    PathNode.CurveTo(5.163f, 20.506f, 5.068f, 20.122f, 5.01f, 19.697f),
                    PathNode.CurveTo(4.953f, 19.282f, 4.923f, 18.768f, 4.888f, 18.144f),
                    PathNode.LineTo(4.196f, 6.036f),
                    PathNode.LineTo(2.747f, 6.036f),
                    PathNode.CurveTo(2.361f, 6.036f, 2.047f, 5.722f, 2.047f, 5.336f),
                    PathNode.CurveTo(2.047f, 4.949f, 2.361f, 4.636f, 2.747f, 4.636f),
                    PathNode.LineTo(8.471f, 4.636f),
                    PathNode.LineTo(8.839f, 3.533f),
                    PathNode.CurveTo(9.003f, 3.041f, 9.135f, 2.608f, 9.41f, 2.278f),
                    PathNode.CurveTo(9.635f, 2.009f, 9.924f, 1.8f, 10.251f, 1.672f),
                    PathNode.CurveTo(10.551f, 1.554f, 10.881f, 1.53f, 11.246f, 1.526f),
                    PathNode.LineTo(13.075f, 1.526f),
                    PathNode.Close,
                    PathNode.MoveTo(12.004f, 9.183f),
                    PathNode.CurveTo(11.618f, 9.183f, 11.304f, 9.497f, 11.304f, 9.883f),
                    PathNode.LineTo(11.304f, 17.617f),
                    PathNode.CurveTo(11.304f, 18.004f, 11.618f, 18.317f, 12.004f, 18.317f),
                    PathNode.CurveTo(12.39f, 18.317f, 12.704f, 18.003f, 12.704f, 17.617f),
                    PathNode.LineTo(12.704f, 9.883f),
                    PathNode.CurveTo(12.704f, 9.497f, 12.39f, 9.183f, 12.004f, 9.183f),
                    PathNode.Close,
                    PathNode.MoveTo(8.737f, 9.184f),
                    PathNode.CurveTo(8.351f, 9.196f, 8.048f, 9.519f, 8.061f, 9.905f),
                    PathNode.LineTo(8.311f, 17.64f),
                    PathNode.CurveTo(8.323f, 18.026f, 8.647f, 18.329f, 9.033f, 18.316f),
                    PathNode.CurveTo(9.419f, 18.303f, 9.722f, 17.981f, 9.71f, 17.595f),
                    PathNode.LineTo(9.459f, 9.86f),
                    PathNode.CurveTo(9.446f, 9.474f, 9.123f, 9.172f, 8.737f, 9.184f),
                    PathNode.Close,
                    PathNode.MoveTo(15.269f, 9.184f),
                    PathNode.CurveTo(14.883f, 9.171f, 14.56f, 9.474f, 14.547f, 9.86f),
                    PathNode.LineTo(14.297f, 17.595f),
                    PathNode.CurveTo(14.285f, 17.981f, 14.587f, 18.304f, 14.974f, 18.316f),
                    PathNode.CurveTo(15.36f, 18.329f, 15.683f, 18.026f, 15.695f, 17.64f),
                    PathNode.LineTo(15.946f, 9.905f),
                    PathNode.CurveTo(15.958f, 9.519f, 15.655f, 9.196f, 15.269f, 9.184f),
                    PathNode.Close,
                    PathNode.MoveTo(11.623f, 2.927f),
                    PathNode.CurveTo(10.985f, 2.927f, 10.857f, 2.938f, 10.764f, 2.975f),
                    PathNode.CurveTo(10.655f, 3.017f, 10.559f, 3.087f, 10.484f, 3.177f),
                    PathNode.CurveTo(10.42f, 3.253f, 10.368f, 3.371f, 10.167f, 3.976f),
                    PathNode.LineTo(9.947f, 4.636f),
                    PathNode.LineTo(14.374f, 4.636f),
                    PathNode.LineTo(14.154f, 3.976f),
                    PathNode.CurveTo(13.953f, 3.371f, 13.901f, 3.253f, 13.837f, 3.177f),
                    PathNode.CurveTo(13.762f, 3.087f, 13.666f, 3.017f, 13.558f, 2.975f),
                    PathNode.CurveTo(13.465f, 2.938f, 13.337f, 2.927f, 12.698f, 2.927f),
                    PathNode.LineTo(11.623f, 2.927f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _uninstall!!
    }

private var _uninstall: ImageVector? = null
