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

/** `pb_ic_address` */
val OpalineIcons.System.Location: ImageVector
    get() {
        if (_location != null) return _location!!
        _location = ImageVector.Builder(
            name = "Location",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.471f, 1.057f),
                    PathNode.CurveTo(17.31f, 1.302f, 21.158f, 5.303f, 21.158f, 10.203f),
                    PathNode.LineTo(21.146f, 10.602f),
                    PathNode.CurveTo(20.923f, 14.717f, 17.315f, 18.839f, 14.698f, 21.309f),
                    PathNode.CurveTo(13.535f, 22.406f, 12.953f, 22.955f, 12.0f, 22.955f),
                    PathNode.LineTo(11.825f, 22.949f),
                    PathNode.CurveTo(10.971f, 22.885f, 10.391f, 22.338f, 9.301f, 21.309f),
                    PathNode.CurveTo(6.684f, 18.839f, 3.076f, 14.717f, 2.853f, 10.602f),
                    PathNode.LineTo(2.842f, 10.203f),
                    PathNode.CurveTo(2.842f, 5.145f, 6.942f, 1.045f, 12.0f, 1.045f),
                    PathNode.LineTo(12.471f, 1.057f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 2.445f),
                    PathNode.CurveTo(7.715f, 2.445f, 4.242f, 5.919f, 4.242f, 10.203f),
                    PathNode.CurveTo(4.242f, 11.931f, 5.017f, 13.796f, 6.226f, 15.619f),
                    PathNode.CurveTo(7.422f, 17.423f, 8.953f, 19.056f, 10.262f, 20.291f),
                    PathNode.CurveTo(10.876f, 20.871f, 11.217f, 21.186f, 11.508f, 21.381f),
                    PathNode.CurveTo(11.73f, 21.529f, 11.848f, 21.556f, 12.0f, 21.556f),
                    PathNode.CurveTo(12.152f, 21.556f, 12.269f, 21.529f, 12.491f, 21.381f),
                    PathNode.CurveTo(12.782f, 21.186f, 13.123f, 20.871f, 13.737f, 20.291f),
                    PathNode.CurveTo(15.046f, 19.056f, 16.578f, 17.424f, 17.774f, 15.619f),
                    PathNode.CurveTo(18.983f, 13.796f, 19.758f, 11.931f, 19.758f, 10.203f),
                    PathNode.CurveTo(19.758f, 5.919f, 16.285f, 2.445f, 12.0f, 2.445f),
                    PathNode.Close,
                    PathNode.MoveTo(11.998f, 5.337f),
                    PathNode.CurveTo(14.685f, 5.337f, 16.863f, 7.515f, 16.863f, 10.202f),
                    PathNode.CurveTo(16.863f, 12.889f, 14.685f, 15.067f, 11.998f, 15.067f),
                    PathNode.CurveTo(9.311f, 15.067f, 7.133f, 12.889f, 7.133f, 10.202f),
                    PathNode.CurveTo(7.133f, 7.515f, 9.311f, 5.337f, 11.998f, 5.337f),
                    PathNode.Close,
                    PathNode.MoveTo(11.998f, 6.638f),
                    PathNode.CurveTo(10.029f, 6.638f, 8.434f, 8.233f, 8.434f, 10.202f),
                    PathNode.CurveTo(8.434f, 12.171f, 10.029f, 13.767f, 11.998f, 13.767f),
                    PathNode.CurveTo(13.967f, 13.767f, 15.563f, 12.171f, 15.563f, 10.202f),
                    PathNode.CurveTo(15.563f, 8.233f, 13.967f, 6.638f, 11.998f, 6.638f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _location!!
    }

private var _location: ImageVector? = null
