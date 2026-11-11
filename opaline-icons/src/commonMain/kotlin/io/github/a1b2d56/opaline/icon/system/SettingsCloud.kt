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

/** `settings_search_cloud_service_ic_oplus` */
val OpalineIcons.System.SettingsCloud: ImageVector
    get() {
        if (_settingsCloud != null) return _settingsCloud!!
        _settingsCloud = ImageVector.Builder(
            name = "SettingsCloud",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.492f, 6.723f),
                    PathNode.CurveTo(5.492f, 5.337f, 6.615f, 4.215f, 8.0f, 4.215f),
                    PathNode.CurveTo(9.252f, 4.215f, 10.29f, 5.132f, 10.478f, 6.33f),
                    PathNode.CurveTo(10.523f, 6.616f, 10.79f, 6.811f, 11.076f, 6.766f),
                    PathNode.CurveTo(11.361f, 6.722f, 11.557f, 6.454f, 11.512f, 6.168f),
                    PathNode.CurveTo(11.245f, 4.468f, 9.775f, 3.168f, 8.0f, 3.168f),
                    PathNode.CurveTo(6.037f, 3.168f, 4.446f, 4.759f, 4.446f, 6.723f),
                    PathNode.CurveTo(4.446f, 6.893f, 4.458f, 7.062f, 4.481f, 7.227f),
                    PathNode.CurveTo(3.86f, 7.29f, 3.255f, 7.559f, 2.779f, 8.035f),
                    PathNode.CurveTo(1.681f, 9.133f, 1.681f, 10.912f, 2.779f, 12.009f),
                    PathNode.CurveTo(3.876f, 13.107f, 5.655f, 13.107f, 6.753f, 12.009f),
                    PathNode.LineTo(9.987f, 8.775f),
                    PathNode.CurveTo(10.676f, 8.087f, 11.792f, 8.087f, 12.481f, 8.775f),
                    PathNode.CurveTo(13.17f, 9.464f, 13.17f, 10.581f, 12.481f, 11.269f),
                    PathNode.CurveTo(11.792f, 11.958f, 10.676f, 11.958f, 9.987f, 11.269f),
                    PathNode.LineTo(9.717f, 11.0f),
                    PathNode.CurveTo(9.513f, 10.795f, 9.182f, 10.795f, 8.977f, 11.0f),
                    PathNode.CurveTo(8.773f, 11.204f, 8.773f, 11.536f, 8.977f, 11.74f),
                    PathNode.LineTo(9.247f, 12.009f),
                    PathNode.CurveTo(10.344f, 13.107f, 12.124f, 13.107f, 13.221f, 12.009f),
                    PathNode.CurveTo(14.318f, 10.912f, 14.318f, 9.133f, 13.221f, 8.035f),
                    PathNode.CurveTo(12.124f, 6.938f, 10.344f, 6.938f, 9.247f, 8.035f),
                    PathNode.LineTo(6.013f, 11.269f),
                    PathNode.CurveTo(5.324f, 11.958f, 4.208f, 11.958f, 3.519f, 11.269f),
                    PathNode.CurveTo(2.83f, 10.581f, 2.83f, 9.464f, 3.519f, 8.775f),
                    PathNode.CurveTo(4.208f, 8.087f, 5.324f, 8.087f, 6.013f, 8.775f),
                    PathNode.LineTo(6.282f, 9.045f),
                    PathNode.CurveTo(6.487f, 9.249f, 6.818f, 9.249f, 7.022f, 9.045f),
                    PathNode.CurveTo(7.227f, 8.841f, 7.227f, 8.509f, 7.022f, 8.305f),
                    PathNode.LineTo(6.753f, 8.035f),
                    PathNode.CurveTo(6.41f, 7.692f, 6.0f, 7.457f, 5.566f, 7.328f),
                    PathNode.CurveTo(5.518f, 7.135f, 5.492f, 6.932f, 5.492f, 6.723f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsCloud!!
    }

private var _settingsCloud: ImageVector? = null
