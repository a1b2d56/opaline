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

/** `mms_dr_menu_action_add_to_blacklist` */
val OpalineIcons.System.BlockContact: ImageVector
    get() {
        if (_blockContact != null) return _blockContact!!
        _blockContact = ImageVector.Builder(
            name = "BlockContact",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.63f, 5.057f),
                    PathNode.CurveTo(7.63f, 4.055f, 8.442f, 3.243f, 9.443f, 3.243f),
                    PathNode.CurveTo(10.445f, 3.243f, 11.257f, 4.055f, 11.257f, 5.057f),
                    PathNode.CurveTo(11.257f, 6.058f, 10.445f, 6.87f, 9.443f, 6.87f),
                    PathNode.CurveTo(8.442f, 6.87f, 7.63f, 6.058f, 7.63f, 5.057f),
                    PathNode.Close,
                    PathNode.MoveTo(9.443f, 1.843f),
                    PathNode.CurveTo(7.669f, 1.843f, 6.23f, 3.282f, 6.23f, 5.057f),
                    PathNode.CurveTo(6.23f, 6.832f, 7.669f, 8.27f, 9.443f, 8.27f),
                    PathNode.CurveTo(11.218f, 8.27f, 12.657f, 6.832f, 12.657f, 5.057f),
                    PathNode.CurveTo(12.657f, 3.282f, 11.218f, 1.843f, 9.443f, 1.843f),
                    PathNode.Close,
                    PathNode.MoveTo(7.077f, 9.843f),
                    PathNode.LineTo(10.892f, 9.843f),
                    PathNode.CurveTo(10.396f, 10.255f, 9.951f, 10.725f, 9.568f, 11.243f),
                    PathNode.LineTo(7.077f, 11.243f),
                    PathNode.CurveTo(5.592f, 11.243f, 4.397f, 12.066f, 4.063f, 13.09f),
                    PathNode.LineTo(4.061f, 13.097f),
                    PathNode.LineTo(4.061f, 13.097f),
                    PathNode.LineTo(3.472f, 14.843f),
                    PathNode.LineTo(8.083f, 14.843f),
                    PathNode.CurveTo(8.029f, 15.221f, 8.0f, 15.607f, 8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 16.082f, 8.001f, 16.163f, 8.004f, 16.243f),
                    PathNode.LineTo(2.497f, 16.243f),
                    PathNode.CurveTo(2.272f, 16.243f, 2.06f, 16.135f, 1.929f, 15.952f),
                    PathNode.CurveTo(1.797f, 15.769f, 1.762f, 15.533f, 1.834f, 15.32f),
                    PathNode.LineTo(2.733f, 12.653f),
                    PathNode.CurveTo(3.3f, 10.919f, 5.144f, 9.843f, 7.077f, 9.843f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 10.65f),
                    PathNode.CurveTo(13.045f, 10.65f, 10.65f, 13.046f, 10.65f, 16.0f),
                    PathNode.CurveTo(10.65f, 17.205f, 11.049f, 18.317f, 11.721f, 19.211f),
                    PathNode.LineTo(19.211f, 11.721f),
                    PathNode.CurveTo(18.317f, 11.049f, 17.205f, 10.65f, 16.0f, 10.65f),
                    PathNode.Close,
                    PathNode.MoveTo(20.212f, 12.7f),
                    PathNode.LineTo(12.7f, 20.212f),
                    PathNode.CurveTo(13.609f, 20.925f, 14.755f, 21.35f, 16.0f, 21.35f),
                    PathNode.CurveTo(18.955f, 21.35f, 21.35f, 18.955f, 21.35f, 16.0f),
                    PathNode.CurveTo(21.35f, 14.755f, 20.925f, 13.609f, 20.212f, 12.7f),
                    PathNode.Close,
                    PathNode.MoveTo(9.35f, 16.0f),
                    PathNode.CurveTo(9.35f, 12.328f, 12.328f, 9.35f, 16.0f, 9.35f),
                    PathNode.CurveTo(19.673f, 9.35f, 22.65f, 12.328f, 22.65f, 16.0f),
                    PathNode.CurveTo(22.65f, 19.673f, 19.673f, 22.65f, 16.0f, 22.65f),
                    PathNode.CurveTo(12.328f, 22.65f, 9.35f, 19.673f, 9.35f, 16.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _blockContact!!
    }

private var _blockContact: ImageVector? = null
