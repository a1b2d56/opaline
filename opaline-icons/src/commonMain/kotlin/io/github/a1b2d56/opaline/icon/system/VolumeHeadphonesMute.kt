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

/** `systemui_icon_volume_wired_mute_multi_app` */
val OpalineIcons.System.VolumeHeadphonesMute: ImageVector
    get() {
        if (_volumeHeadphonesMute != null) return _volumeHeadphonesMute!!
        _volumeHeadphonesMute = ImageVector.Builder(
            name = "VolumeHeadphonesMute",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.729f, 7.554f),
                    PathNode.CurveTo(3.792f, 9.175f, 3.279f, 11.194f, 3.279f, 13.424f),
                    PathNode.CurveTo(3.279f, 13.602f, 3.283f, 13.783f, 3.288f, 13.964f),
                    PathNode.CurveTo(3.773f, 13.219f, 4.506f, 12.631f, 5.409f, 12.337f),
                    PathNode.LineTo(5.556f, 12.297f),
                    PathNode.CurveTo(6.293f, 12.138f, 7.063f, 12.552f, 7.306f, 13.3f),
                    PathNode.LineTo(9.625f, 20.436f),
                    PathNode.CurveTo(9.884f, 21.234f, 9.435f, 22.078f, 8.656f, 22.331f),
                    PathNode.CurveTo(6.72f, 22.959f, 4.614f, 22.03f, 3.783f, 20.206f),
                    PathNode.CurveTo(3.731f, 20.238f, 3.676f, 20.268f, 3.617f, 20.292f),
                    PathNode.CurveTo(3.103f, 20.493f, 2.522f, 20.241f, 2.32f, 19.727f),
                    PathNode.CurveTo(1.543f, 17.751f, 1.279f, 15.466f, 1.279f, 13.424f),
                    PathNode.CurveTo(1.279f, 10.705f, 1.954f, 8.152f, 3.275f, 6.1f),
                    PathNode.LineTo(4.729f, 7.554f),
                    PathNode.Close,
                    PathNode.MoveTo(18.935f, 21.76f),
                    PathNode.CurveTo(17.93f, 22.488f, 16.599f, 22.74f, 15.339f, 22.331f),
                    PathNode.CurveTo(14.56f, 22.078f, 14.112f, 21.234f, 14.371f, 20.436f),
                    PathNode.LineTo(15.165f, 17.99f),
                    PathNode.LineTo(18.935f, 21.76f),
                    PathNode.Close,
                    PathNode.MoveTo(2.745f, 2.517f),
                    PathNode.CurveTo(3.018f, 2.244f, 3.461f, 2.244f, 3.735f, 2.517f),
                    PathNode.LineTo(21.735f, 20.517f),
                    PathNode.CurveTo(22.008f, 20.791f, 22.008f, 21.234f, 21.735f, 21.507f),
                    PathNode.CurveTo(21.462f, 21.781f, 21.018f, 21.781f, 20.745f, 21.507f),
                    PathNode.LineTo(2.745f, 3.507f),
                    PathNode.CurveTo(2.471f, 3.234f, 2.471f, 2.791f, 2.745f, 2.517f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 1.473f),
                    PathNode.CurveTo(15.383f, 1.473f, 18.097f, 2.825f, 19.949f, 5.04f),
                    PathNode.CurveTo(21.784f, 7.235f, 22.721f, 10.215f, 22.721f, 13.424f),
                    PathNode.CurveTo(22.721f, 15.247f, 22.508f, 17.262f, 21.911f, 19.08f),
                    PathNode.LineTo(16.551f, 13.72f),
                    PathNode.LineTo(16.689f, 13.3f),
                    PathNode.CurveTo(16.932f, 12.552f, 17.702f, 12.138f, 18.439f, 12.297f),
                    PathNode.LineTo(18.586f, 12.337f),
                    PathNode.CurveTo(19.491f, 12.632f, 20.226f, 13.223f, 20.711f, 13.97f),
                    PathNode.CurveTo(20.716f, 13.787f, 20.721f, 13.605f, 20.721f, 13.424f),
                    PathNode.CurveTo(20.721f, 10.587f, 19.892f, 8.091f, 18.414f, 6.323f),
                    PathNode.CurveTo(16.951f, 4.574f, 14.805f, 3.473f, 12.0f, 3.473f),
                    PathNode.CurveTo(10.237f, 3.473f, 8.733f, 3.908f, 7.497f, 4.666f),
                    PathNode.LineTo(6.05f, 3.219f),
                    PathNode.CurveTo(7.678f, 2.107f, 9.682f, 1.473f, 12.0f, 1.473f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeHeadphonesMute!!
    }

private var _volumeHeadphonesMute: ImageVector? = null
