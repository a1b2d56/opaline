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

/** `settings_search_position_exp_ic_oplus` */
val OpalineIcons.System.SettingsLocation: ImageVector
    get() {
        if (_settingsLocation != null) return _settingsLocation!!
        _settingsLocation = ImageVector.Builder(
            name = "SettingsLocation",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.936f, 10.803f),
                    PathNode.CurveTo(5.936f, 7.497f, 8.642f, 4.805f, 11.995f, 4.805f),
                    PathNode.CurveTo(15.349f, 4.805f, 18.055f, 7.497f, 18.055f, 10.803f),
                    PathNode.CurveTo(18.055f, 12.297f, 17.504f, 13.663f, 16.59f, 14.714f),
                    PathNode.LineTo(16.584f, 14.721f),
                    PathNode.LineTo(16.578f, 14.728f),
                    PathNode.CurveTo(15.157f, 16.445f, 13.627f, 18.068f, 11.996f, 19.587f),
                    PathNode.CurveTo(10.536f, 18.228f, 9.156f, 16.785f, 7.864f, 15.266f),
                    PathNode.CurveTo(7.714f, 15.089f, 7.565f, 14.912f, 7.418f, 14.734f),
                    PathNode.LineTo(7.411f, 14.726f),
                    PathNode.LineTo(7.405f, 14.719f),
                    PathNode.CurveTo(7.167f, 14.446f, 6.953f, 14.151f, 6.767f, 13.838f),
                    PathNode.CurveTo(6.238f, 12.948f, 5.936f, 11.911f, 5.936f, 10.803f),
                    PathNode.Close,
                    PathNode.MoveTo(11.995f, 3.305f),
                    PathNode.CurveTo(7.827f, 3.305f, 4.436f, 6.655f, 4.436f, 10.803f),
                    PathNode.CurveTo(4.436f, 12.674f, 5.127f, 14.385f, 6.268f, 15.697f),
                    PathNode.CurveTo(7.849f, 17.606f, 9.562f, 19.403f, 11.394f, 21.072f),
                    PathNode.LineTo(11.476f, 21.147f),
                    PathNode.CurveTo(11.771f, 21.416f, 12.22f, 21.416f, 12.515f, 21.148f),
                    PathNode.LineTo(12.598f, 21.072f),
                    PathNode.CurveTo(14.432f, 19.401f, 16.146f, 17.603f, 17.728f, 15.691f),
                    PathNode.CurveTo(18.866f, 14.38f, 19.555f, 12.671f, 19.555f, 10.803f),
                    PathNode.CurveTo(19.555f, 6.655f, 16.164f, 3.305f, 11.995f, 3.305f),
                    PathNode.Close,
                    PathNode.MoveTo(9.667f, 10.802f),
                    PathNode.CurveTo(9.667f, 9.538f, 10.703f, 8.501f, 11.995f, 8.501f),
                    PathNode.CurveTo(13.288f, 8.501f, 14.324f, 9.538f, 14.324f, 10.802f),
                    PathNode.CurveTo(14.324f, 12.066f, 13.288f, 13.103f, 11.995f, 13.103f),
                    PathNode.CurveTo(10.703f, 13.103f, 9.667f, 12.066f, 9.667f, 10.802f),
                    PathNode.Close,
                    PathNode.MoveTo(11.995f, 7.001f),
                    PathNode.CurveTo(9.887f, 7.001f, 8.167f, 8.697f, 8.167f, 10.802f),
                    PathNode.CurveTo(8.167f, 12.908f, 9.887f, 14.603f, 11.995f, 14.603f),
                    PathNode.CurveTo(14.103f, 14.603f, 15.824f, 12.908f, 15.824f, 10.802f),
                    PathNode.CurveTo(15.824f, 8.697f, 14.103f, 7.001f, 11.995f, 7.001f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsLocation!!
    }

private var _settingsLocation: ImageVector? = null
