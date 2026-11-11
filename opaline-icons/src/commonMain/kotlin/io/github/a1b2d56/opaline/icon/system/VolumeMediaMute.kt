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

/** `systemui_icon_volume_media_mute_multi_app` */
val OpalineIcons.System.VolumeMediaMute: ImageVector
    get() {
        if (_volumeMediaMute != null) return _volumeMediaMute!!
        _volumeMediaMute = ImageVector.Builder(
            name = "VolumeMediaMute",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.485f, 20.301f),
                    PathNode.CurveTo(17.461f, 21.331f, 17.372f, 21.897f, 17.042f, 22.112f),
                    PathNode.CurveTo(16.903f, 22.203f, 16.742f, 22.257f, 16.576f, 22.27f),
                    PathNode.CurveTo(16.035f, 22.313f, 15.446f, 21.549f, 14.27f, 20.019f),
                    PathNode.LineTo(12.899f, 18.235f),
                    PathNode.CurveTo(12.48f, 17.691f, 12.269f, 17.419f, 12.0f, 17.219f),
                    PathNode.CurveTo(11.911f, 17.153f, 11.817f, 17.094f, 11.72f, 17.041f),
                    PathNode.CurveTo(11.425f, 16.88f, 11.09f, 16.804f, 10.42f, 16.654f),
                    PathNode.LineTo(8.331f, 16.185f),
                    PathNode.CurveTo(7.556f, 16.011f, 7.168f, 15.924f, 6.907f, 15.677f),
                    PathNode.CurveTo(6.823f, 15.596f, 6.749f, 15.503f, 6.688f, 15.403f),
                    PathNode.CurveTo(6.504f, 15.095f, 6.504f, 14.696f, 6.504f, 13.902f),
                    PathNode.LineTo(6.504f, 10.098f),
                    PathNode.CurveTo(6.504f, 9.788f, 6.504f, 9.537f, 6.515f, 9.33f),
                    PathNode.LineTo(17.485f, 20.301f),
                    PathNode.Close,
                    PathNode.MoveTo(2.505f, 2.492f),
                    PathNode.CurveTo(2.778f, 2.219f, 3.222f, 2.219f, 3.495f, 2.492f),
                    PathNode.LineTo(21.495f, 20.492f),
                    PathNode.CurveTo(21.768f, 20.765f, 21.768f, 21.209f, 21.495f, 21.482f),
                    PathNode.CurveTo(21.222f, 21.755f, 20.778f, 21.755f, 20.505f, 21.482f),
                    PathNode.LineTo(2.505f, 3.482f),
                    PathNode.CurveTo(2.232f, 3.209f, 2.232f, 2.765f, 2.505f, 2.492f),
                    PathNode.Close,
                    PathNode.MoveTo(16.576f, 1.73f),
                    PathNode.CurveTo(16.742f, 1.743f, 16.903f, 1.798f, 17.042f, 1.888f),
                    PathNode.CurveTo(17.497f, 2.184f, 17.496f, 3.149f, 17.496f, 5.077f),
                    PathNode.LineTo(17.496f, 14.655f),
                    PathNode.LineTo(10.229f, 7.388f),
                    PathNode.LineTo(10.42f, 7.346f),
                    PathNode.CurveTo(11.09f, 7.196f, 11.425f, 7.121f, 11.72f, 6.961f),
                    PathNode.CurveTo(11.817f, 6.908f, 11.911f, 6.847f, 12.0f, 6.781f),
                    PathNode.CurveTo(12.269f, 6.581f, 12.48f, 6.31f, 12.899f, 5.765f),
                    PathNode.LineTo(14.27f, 3.982f),
                    PathNode.CurveTo(15.446f, 2.453f, 16.035f, 1.687f, 16.576f, 1.73f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeMediaMute!!
    }

private var _volumeMediaMute: ImageVector? = null
