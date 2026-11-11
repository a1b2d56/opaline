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

/** `systemui_icon_volume_media_multi_app` */
val OpalineIcons.System.VolumeMedia: ImageVector
    get() {
        if (_volumeMedia != null) return _volumeMedia!!
        _volumeMedia = ImageVector.Builder(
            name = "VolumeMedia",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.723f, 1.73f),
                    PathNode.CurveTo(12.889f, 1.743f, 13.049f, 1.798f, 13.189f, 1.888f),
                    PathNode.CurveTo(13.643f, 2.184f, 13.643f, 3.148f, 13.643f, 5.076f),
                    PathNode.LineTo(13.643f, 18.927f),
                    PathNode.CurveTo(13.643f, 20.853f, 13.643f, 21.816f, 13.189f, 22.112f),
                    PathNode.CurveTo(13.049f, 22.203f, 12.889f, 22.257f, 12.723f, 22.27f),
                    PathNode.CurveTo(12.182f, 22.313f, 11.593f, 21.548f, 10.416f, 20.018f),
                    PathNode.LineTo(9.045f, 18.235f),
                    PathNode.CurveTo(8.626f, 17.691f, 8.416f, 17.419f, 8.146f, 17.219f),
                    PathNode.CurveTo(8.057f, 17.153f, 7.964f, 17.093f, 7.866f, 17.04f),
                    PathNode.CurveTo(7.572f, 16.879f, 7.236f, 16.804f, 6.566f, 16.654f),
                    PathNode.LineTo(4.478f, 16.185f),
                    PathNode.CurveTo(3.702f, 16.011f, 3.314f, 15.925f, 3.054f, 15.677f),
                    PathNode.CurveTo(2.969f, 15.596f, 2.895f, 15.504f, 2.835f, 15.403f),
                    PathNode.CurveTo(2.65f, 15.094f, 2.65f, 14.697f, 2.65f, 13.902f),
                    PathNode.LineTo(2.65f, 10.098f),
                    PathNode.CurveTo(2.65f, 9.304f, 2.65f, 8.906f, 2.835f, 8.597f),
                    PathNode.CurveTo(2.895f, 8.497f, 2.969f, 8.405f, 3.054f, 8.324f),
                    PathNode.CurveTo(3.314f, 8.076f, 3.702f, 7.989f, 4.478f, 7.815f),
                    PathNode.LineTo(6.566f, 7.346f),
                    PathNode.CurveTo(7.236f, 7.196f, 7.572f, 7.12f, 7.866f, 6.96f),
                    PathNode.CurveTo(7.964f, 6.907f, 8.057f, 6.847f, 8.146f, 6.781f),
                    PathNode.CurveTo(8.416f, 6.581f, 8.626f, 6.31f, 9.045f, 5.765f),
                    PathNode.LineTo(10.416f, 3.981f),
                    PathNode.CurveTo(11.593f, 2.452f, 12.182f, 1.687f, 12.723f, 1.73f),
                    PathNode.Close,
                    PathNode.MoveTo(18.073f, 6.481f),
                    PathNode.CurveTo(18.347f, 6.208f, 18.79f, 6.208f, 19.063f, 6.481f),
                    PathNode.CurveTo(22.112f, 9.53f, 22.112f, 14.472f, 19.063f, 17.52f),
                    PathNode.CurveTo(18.79f, 17.794f, 18.347f, 17.794f, 18.073f, 17.52f),
                    PathNode.CurveTo(17.8f, 17.247f, 17.801f, 16.804f, 18.074f, 16.531f),
                    PathNode.CurveTo(20.576f, 14.029f, 20.575f, 9.973f, 18.073f, 7.471f),
                    PathNode.CurveTo(17.8f, 7.198f, 17.8f, 6.755f, 18.073f, 6.481f),
                    PathNode.Close,
                    PathNode.MoveTo(15.839f, 8.714f),
                    PathNode.CurveTo(16.112f, 8.44f, 16.556f, 8.44f, 16.829f, 8.714f),
                    PathNode.CurveTo(18.644f, 10.528f, 18.644f, 13.471f, 16.829f, 15.286f),
                    PathNode.CurveTo(16.556f, 15.559f, 16.112f, 15.559f, 15.839f, 15.286f),
                    PathNode.CurveTo(15.566f, 15.012f, 15.567f, 14.57f, 15.84f, 14.297f),
                    PathNode.CurveTo(17.108f, 13.028f, 17.107f, 10.972f, 15.839f, 9.704f),
                    PathNode.CurveTo(15.566f, 9.431f, 15.566f, 8.987f, 15.839f, 8.714f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _volumeMedia!!
    }

private var _volumeMedia: ImageVector? = null
