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

/** `systemui_icon_volume_ringer_mute_multi_app` */
val OpalineIcons.System.VolumeRingerMute: ImageVector
    get() {
        if (_volumeRingerMute != null) return _volumeRingerMute!!
        _volumeRingerMute = ImageVector.Builder(
            name = "VolumeRingerMute",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(1.505f, 1.505f),
                    PathNode.CurveTo(1.778f, 1.231f, 2.222f, 1.231f, 2.495f, 1.505f),
                    PathNode.LineTo(22.495f, 21.505f),
                    PathNode.CurveTo(22.768f, 21.778f, 22.768f, 22.222f, 22.495f, 22.495f),
                    PathNode.CurveTo(22.222f, 22.768f, 21.778f, 22.768f, 21.505f, 22.495f),
                    PathNode.LineTo(1.505f, 2.495f),
                    PathNode.CurveTo(1.231f, 2.222f, 1.231f, 1.778f, 1.505f, 1.505f),
                    PathNode.Close,
                    PathNode.MoveTo(8.474f, 11.116f),
                    PathNode.LineTo(8.474f, 18.439f),
                    PathNode.CurveTo(8.473f, 20.248f, 7.007f, 21.715f, 5.198f, 21.715f),
                    PathNode.CurveTo(3.389f, 21.715f, 1.922f, 20.248f, 1.922f, 18.439f),
                    PathNode.CurveTo(1.922f, 16.631f, 3.389f, 15.163f, 5.198f, 15.163f),
                    PathNode.CurveTo(5.896f, 15.163f, 6.542f, 15.382f, 7.073f, 15.754f),
                    PathNode.LineTo(7.073f, 9.716f),
                    PathNode.LineTo(8.474f, 11.116f),
                    PathNode.Close,
                    PathNode.MoveTo(17.701f, 20.344f),
                    PathNode.CurveTo(17.537f, 20.369f, 17.368f, 20.383f, 17.197f, 20.383f),
                    PathNode.CurveTo(15.388f, 20.382f, 13.922f, 18.915f, 13.922f, 17.106f),
                    PathNode.CurveTo(13.922f, 16.935f, 13.934f, 16.767f, 13.96f, 16.603f),
                    PathNode.LineTo(17.701f, 20.344f),
                    PathNode.Close,
                    PathNode.MoveTo(19.696f, 2.089f),
                    PathNode.CurveTo(19.894f, 2.067f, 20.092f, 2.13f, 20.24f, 2.263f),
                    PathNode.CurveTo(20.388f, 2.395f, 20.473f, 2.585f, 20.474f, 2.784f),
                    PathNode.LineTo(20.474f, 17.106f),
                    PathNode.CurveTo(20.474f, 17.263f, 20.462f, 17.417f, 20.44f, 17.567f),
                    PathNode.LineTo(16.737f, 13.864f),
                    PathNode.CurveTo(16.888f, 13.843f, 17.041f, 13.831f, 17.197f, 13.831f),
                    PathNode.CurveTo(17.895f, 13.831f, 18.542f, 14.05f, 19.073f, 14.422f),
                    PathNode.LineTo(19.073f, 6.897f),
                    PathNode.LineTo(10.699f, 7.826f),
                    PathNode.LineTo(7.073f, 4.2f),
                    PathNode.LineTo(7.073f, 4.115f),
                    PathNode.CurveTo(7.074f, 3.759f, 7.342f, 3.459f, 7.696f, 3.42f),
                    PathNode.LineTo(19.696f, 2.089f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeRingerMute!!
    }

private var _volumeRingerMute: ImageVector? = null
