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

/** `color_tool_menu_recycle_bin_detail` */
val OpalineIcons.System.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = ImageVector.Builder(
            name = "Info",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.002f, 1.221f),
                    PathNode.CurveTo(17.955f, 1.221f, 22.78f, 6.048f, 22.78f, 12.0f),
                    PathNode.CurveTo(22.78f, 17.953f, 17.955f, 22.779f, 12.002f, 22.779f),
                    PathNode.CurveTo(6.049f, 22.779f, 1.223f, 17.953f, 1.223f, 12.0f),
                    PathNode.CurveTo(1.223f, 6.048f, 6.049f, 1.221f, 12.002f, 1.221f),
                    PathNode.Close,
                    PathNode.MoveTo(12.002f, 2.622f),
                    PathNode.CurveTo(6.822f, 2.622f, 2.623f, 6.821f, 2.623f, 12.0f),
                    PathNode.CurveTo(2.623f, 17.18f, 6.822f, 21.379f, 12.002f, 21.379f),
                    PathNode.CurveTo(17.181f, 21.379f, 21.381f, 17.18f, 21.381f, 12.0f),
                    PathNode.CurveTo(21.381f, 6.821f, 17.181f, 2.622f, 12.002f, 2.622f),
                    PathNode.Close,
                    PathNode.MoveTo(12.001f, 9.676f),
                    PathNode.CurveTo(12.387f, 9.676f, 12.701f, 9.99f, 12.701f, 10.377f),
                    PathNode.LineTo(12.701f, 17.201f),
                    PathNode.CurveTo(12.701f, 17.587f, 12.387f, 17.9f, 12.001f, 17.9f),
                    PathNode.CurveTo(11.615f, 17.9f, 11.301f, 17.587f, 11.301f, 17.201f),
                    PathNode.LineTo(11.301f, 10.377f),
                    PathNode.CurveTo(11.301f, 9.99f, 11.615f, 9.676f, 12.001f, 9.676f),
                    PathNode.Close,
                    PathNode.MoveTo(12.002f, 5.964f),
                    PathNode.CurveTo(12.554f, 5.964f, 13.002f, 6.412f, 13.002f, 6.964f),
                    PathNode.CurveTo(13.002f, 7.517f, 12.554f, 7.964f, 12.002f, 7.964f),
                    PathNode.CurveTo(11.45f, 7.964f, 11.002f, 7.517f, 11.002f, 6.964f),
                    PathNode.CurveTo(11.002f, 6.412f, 11.45f, 5.964f, 12.002f, 5.964f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _info!!
    }

private var _info: ImageVector? = null
