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

/** `systemui_icon_volume_accessibility_multi_app` */
val OpalineIcons.System.VolumeAccessibility: ImageVector
    get() {
        if (_volumeAccessibility != null) return _volumeAccessibility!!
        _volumeAccessibility = ImageVector.Builder(
            name = "VolumeAccessibility",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.273f, 8.681f),
                    PathNode.CurveTo(18.76f, 8.549f, 19.261f, 8.811f, 19.44f, 9.273f),
                    PathNode.LineTo(19.471f, 9.369f),
                    PathNode.LineTo(19.492f, 9.467f),
                    PathNode.CurveTo(19.573f, 9.955f, 19.275f, 10.439f, 18.787f, 10.574f),
                    PathNode.CurveTo(17.523f, 10.923f, 16.235f, 11.159f, 14.94f, 11.309f),
                    PathNode.LineTo(14.689f, 16.108f),
                    PathNode.LineTo(14.69f, 17.946f),
                    PathNode.LineTo(14.692f, 17.986f),
                    PathNode.CurveTo(14.693f, 17.993f, 14.691f, 17.999f, 14.69f, 18.005f),
                    PathNode.LineTo(14.69f, 21.918f),
                    PathNode.CurveTo(14.69f, 22.458f, 14.256f, 22.899f, 13.716f, 22.899f),
                    PathNode.CurveTo(13.175f, 22.899f, 12.74f, 22.458f, 12.74f, 21.918f),
                    PathNode.LineTo(12.74f, 17.371f),
                    PathNode.CurveTo(12.554f, 17.338f, 12.31f, 17.313f, 12.003f, 17.313f),
                    PathNode.CurveTo(11.696f, 17.313f, 11.451f, 17.338f, 11.265f, 17.371f),
                    PathNode.LineTo(11.266f, 21.918f),
                    PathNode.CurveTo(11.266f, 22.458f, 10.831f, 22.899f, 10.29f, 22.899f),
                    PathNode.CurveTo(9.749f, 22.899f, 9.314f, 22.458f, 9.314f, 21.918f),
                    PathNode.LineTo(9.314f, 16.056f),
                    PathNode.LineTo(9.063f, 11.309f),
                    PathNode.CurveTo(7.769f, 11.159f, 6.482f, 10.923f, 5.218f, 10.574f),
                    PathNode.CurveTo(4.697f, 10.431f, 4.394f, 9.889f, 4.535f, 9.369f),
                    PathNode.LineTo(4.566f, 9.273f),
                    PathNode.CurveTo(4.745f, 8.811f, 5.248f, 8.549f, 5.732f, 8.681f),
                    PathNode.LineTo(5.733f, 8.682f),
                    PathNode.CurveTo(9.824f, 9.811f, 14.181f, 9.811f, 18.271f, 8.682f),
                    PathNode.LineTo(18.273f, 8.681f),
                    PathNode.Close,
                    PathNode.MoveTo(12.566f, 1.115f),
                    PathNode.CurveTo(18.378f, 1.412f, 23.0f, 6.254f, 23.0f, 12.183f),
                    PathNode.LineTo(22.985f, 12.753f),
                    PathNode.CurveTo(22.78f, 16.83f, 20.388f, 20.324f, 16.968f, 22.071f),
                    PathNode.CurveTo(16.789f, 22.163f, 16.581f, 22.031f, 16.581f, 21.83f),
                    PathNode.LineTo(16.581f, 20.855f),
                    PathNode.CurveTo(16.581f, 20.755f, 16.636f, 20.663f, 16.723f, 20.613f),
                    PathNode.CurveTo(19.632f, 18.952f, 21.6f, 15.803f, 21.6f, 12.183f),
                    PathNode.CurveTo(21.599f, 6.825f, 17.292f, 2.501f, 12.0f, 2.501f),
                    PathNode.CurveTo(6.708f, 2.501f, 2.401f, 6.825f, 2.4f, 12.183f),
                    PathNode.CurveTo(2.4f, 15.801f, 4.366f, 18.948f, 7.272f, 20.61f),
                    PathNode.CurveTo(7.359f, 20.66f, 7.414f, 20.752f, 7.414f, 20.853f),
                    PathNode.LineTo(7.414f, 21.827f),
                    PathNode.CurveTo(7.414f, 22.028f, 7.206f, 22.161f, 7.027f, 22.069f),
                    PathNode.CurveTo(3.451f, 20.24f, 1.0f, 16.5f, 1.0f, 12.183f),
                    PathNode.CurveTo(1.0f, 6.062f, 5.925f, 1.101f, 12.0f, 1.101f),
                    PathNode.LineTo(12.566f, 1.115f),
                    PathNode.Close,
                    PathNode.MoveTo(12.003f, 5.101f),
                    PathNode.CurveTo(12.848f, 5.101f, 13.53f, 5.793f, 13.53f, 6.64f),
                    PathNode.CurveTo(13.53f, 7.487f, 12.848f, 8.177f, 12.003f, 8.178f),
                    PathNode.CurveTo(11.157f, 8.178f, 10.476f, 7.487f, 10.476f, 6.64f),
                    PathNode.CurveTo(10.476f, 5.792f, 11.157f, 5.101f, 12.003f, 5.101f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _volumeAccessibility!!
    }

private var _volumeAccessibility: ImageVector? = null
