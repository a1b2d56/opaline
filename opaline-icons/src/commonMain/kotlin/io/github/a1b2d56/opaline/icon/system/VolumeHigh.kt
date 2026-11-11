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

/** `qs_icon_volume_media_max_no_theme` */
val OpalineIcons.System.VolumeHigh: ImageVector
    get() {
        if (_volumeHigh != null) return _volumeHigh!!
        _volumeHigh = ImageVector.Builder(
            name = "VolumeHigh",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.188f, 2.504f),
                    PathNode.CurveTo(11.388f, 2.304f, 11.689f, 2.244f, 11.95f, 2.353f),
                    PathNode.CurveTo(12.212f, 2.461f, 12.383f, 2.716f, 12.383f, 2.999f),
                    PathNode.LineTo(12.383f, 20.999f),
                    PathNode.CurveTo(12.383f, 21.282f, 12.212f, 21.537f, 11.95f, 21.646f),
                    PathNode.CurveTo(11.689f, 21.754f, 11.388f, 21.694f, 11.188f, 21.494f),
                    PathNode.LineTo(6.568f, 16.875f),
                    PathNode.CurveTo(6.456f, 16.763f, 6.303f, 16.699f, 6.145f, 16.699f),
                    PathNode.LineTo(2.982f, 16.699f),
                    PathNode.CurveTo(1.878f, 16.699f, 0.983f, 15.804f, 0.982f, 14.699f),
                    PathNode.LineTo(0.982f, 9.299f),
                    PathNode.CurveTo(0.983f, 8.194f, 1.878f, 7.299f, 2.982f, 7.299f),
                    PathNode.LineTo(6.145f, 7.299f),
                    PathNode.CurveTo(6.303f, 7.299f, 6.456f, 7.235f, 6.568f, 7.123f),
                    PathNode.LineTo(11.188f, 2.504f),
                    PathNode.Close,
                    PathNode.MoveTo(19.235f, 3.931f),
                    PathNode.CurveTo(19.627f, 3.625f, 20.193f, 3.695f, 20.499f, 4.087f),
                    PathNode.CurveTo(22.202f, 6.269f, 23.217f, 9.017f, 23.217f, 11.999f),
                    PathNode.CurveTo(23.217f, 14.981f, 22.202f, 17.728f, 20.499f, 19.91f),
                    PathNode.CurveTo(20.193f, 20.302f, 19.627f, 20.372f, 19.235f, 20.066f),
                    PathNode.CurveTo(18.844f, 19.761f, 18.773f, 19.195f, 19.079f, 18.803f),
                    PathNode.CurveTo(20.544f, 16.926f, 21.417f, 14.566f, 21.417f, 11.999f),
                    PathNode.CurveTo(21.417f, 9.432f, 20.544f, 7.072f, 19.079f, 5.194f),
                    PathNode.CurveTo(18.774f, 4.802f, 18.844f, 4.236f, 19.235f, 3.931f),
                    PathNode.Close,
                    PathNode.MoveTo(16.729f, 6.15f),
                    PathNode.CurveTo(17.128f, 5.854f, 17.691f, 5.938f, 17.987f, 6.337f),
                    PathNode.CurveTo(19.161f, 7.919f, 19.856f, 9.879f, 19.856f, 11.999f),
                    PathNode.CurveTo(19.856f, 14.119f, 19.161f, 16.079f, 17.987f, 17.661f),
                    PathNode.CurveTo(17.691f, 18.06f, 17.128f, 18.144f, 16.729f, 17.848f),
                    PathNode.CurveTo(16.329f, 17.551f, 16.246f, 16.988f, 16.542f, 16.589f),
                    PathNode.CurveTo(17.494f, 15.307f, 18.057f, 13.72f, 18.057f, 11.999f),
                    PathNode.CurveTo(18.057f, 10.278f, 17.494f, 8.691f, 16.542f, 7.409f),
                    PathNode.CurveTo(16.246f, 7.01f, 16.329f, 6.447f, 16.729f, 6.15f),
                    PathNode.Close,
                    PathNode.MoveTo(14.238f, 8.361f),
                    PathNode.CurveTo(14.653f, 8.088f, 15.211f, 8.202f, 15.484f, 8.617f),
                    PathNode.CurveTo(16.125f, 9.588f, 16.497f, 10.751f, 16.497f, 11.999f),
                    PathNode.CurveTo(16.497f, 13.247f, 16.125f, 14.41f, 15.484f, 15.381f),
                    PathNode.CurveTo(15.211f, 15.796f, 14.653f, 15.91f, 14.238f, 15.637f),
                    PathNode.CurveTo(13.823f, 15.363f, 13.709f, 14.805f, 13.982f, 14.39f),
                    PathNode.CurveTo(14.434f, 13.704f, 14.697f, 12.884f, 14.697f, 11.999f),
                    PathNode.CurveTo(14.697f, 11.114f, 14.435f, 10.293f, 13.982f, 9.607f),
                    PathNode.CurveTo(13.709f, 9.192f, 13.823f, 8.635f, 14.238f, 8.361f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeHigh!!
    }

private var _volumeHigh: ImageVector? = null
