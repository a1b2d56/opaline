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

/** `systemui_icon_volume_wired_multi_app` */
val OpalineIcons.System.VolumeHeadphones: ImageVector
    get() {
        if (_volumeHeadphones != null) return _volumeHeadphones!!
        _volumeHeadphones = ImageVector.Builder(
            name = "VolumeHeadphones",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.473f),
                    PathNode.CurveTo(15.383f, 1.473f, 18.097f, 2.825f, 19.949f, 5.04f),
                    PathNode.CurveTo(21.784f, 7.235f, 22.721f, 10.214f, 22.721f, 13.423f),
                    PathNode.CurveTo(22.721f, 15.466f, 22.457f, 17.75f, 21.68f, 19.727f),
                    PathNode.CurveTo(21.478f, 20.241f, 20.897f, 20.493f, 20.383f, 20.292f),
                    PathNode.CurveTo(20.322f, 20.268f, 20.266f, 20.237f, 20.212f, 20.204f),
                    PathNode.CurveTo(19.381f, 22.029f, 17.276f, 22.96f, 15.339f, 22.331f),
                    PathNode.CurveTo(14.56f, 22.077f, 14.111f, 21.234f, 14.371f, 20.436f),
                    PathNode.LineTo(16.689f, 13.3f),
                    PathNode.CurveTo(16.932f, 12.552f, 17.702f, 12.138f, 18.439f, 12.297f),
                    PathNode.LineTo(18.586f, 12.337f),
                    PathNode.CurveTo(19.491f, 12.632f, 20.226f, 13.223f, 20.711f, 13.97f),
                    PathNode.CurveTo(20.716f, 13.787f, 20.721f, 13.605f, 20.721f, 13.423f),
                    PathNode.CurveTo(20.721f, 10.587f, 19.892f, 8.091f, 18.414f, 6.323f),
                    PathNode.CurveTo(16.951f, 4.574f, 14.805f, 3.473f, 12.0f, 3.473f),
                    PathNode.CurveTo(9.195f, 3.473f, 7.047f, 4.574f, 5.585f, 6.323f),
                    PathNode.CurveTo(4.108f, 8.091f, 3.279f, 10.587f, 3.279f, 13.423f),
                    PathNode.CurveTo(3.279f, 13.602f, 3.283f, 13.783f, 3.288f, 13.963f),
                    PathNode.CurveTo(3.773f, 13.219f, 4.506f, 12.631f, 5.409f, 12.337f),
                    PathNode.LineTo(5.556f, 12.297f),
                    PathNode.CurveTo(6.293f, 12.138f, 7.063f, 12.552f, 7.306f, 13.3f),
                    PathNode.LineTo(9.625f, 20.436f),
                    PathNode.CurveTo(9.884f, 21.234f, 9.435f, 22.077f, 8.656f, 22.331f),
                    PathNode.CurveTo(6.72f, 22.959f, 4.614f, 22.03f, 3.783f, 20.206f),
                    PathNode.CurveTo(3.731f, 20.238f, 3.676f, 20.268f, 3.617f, 20.292f),
                    PathNode.CurveTo(3.103f, 20.493f, 2.522f, 20.241f, 2.32f, 19.727f),
                    PathNode.CurveTo(1.543f, 17.75f, 1.279f, 15.466f, 1.279f, 13.423f),
                    PathNode.CurveTo(1.279f, 10.214f, 2.216f, 7.235f, 4.051f, 5.04f),
                    PathNode.CurveTo(5.903f, 2.825f, 8.617f, 1.473f, 12.0f, 1.473f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeHeadphones!!
    }

private var _volumeHeadphones: ImageVector? = null
