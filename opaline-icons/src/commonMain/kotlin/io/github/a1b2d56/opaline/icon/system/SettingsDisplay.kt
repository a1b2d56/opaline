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

/** `settings_search_brightness_ic_oplus` */
val OpalineIcons.System.SettingsDisplay: ImageVector
    get() {
        if (_settingsDisplay != null) return _settingsDisplay!!
        _settingsDisplay = ImageVector.Builder(
            name = "SettingsDisplay",
            defaultWidth = 16.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.997f, 2.461f),
                    PathNode.CurveTo(12.431f, 2.461f, 12.784f, 2.814f, 12.784f, 3.248f),
                    PathNode.LineTo(12.784f, 4.998f),
                    PathNode.CurveTo(12.784f, 5.433f, 12.431f, 5.786f, 11.997f, 5.786f),
                    PathNode.CurveTo(11.562f, 5.786f, 11.209f, 5.433f, 11.209f, 4.998f),
                    PathNode.LineTo(11.209f, 3.248f),
                    PathNode.CurveTo(11.209f, 2.814f, 11.562f, 2.461f, 11.997f, 2.461f),
                    PathNode.Close,
                    PathNode.MoveTo(11.997f, 8.411f),
                    PathNode.CurveTo(10.015f, 8.411f, 8.409f, 10.017f, 8.409f, 11.998f),
                    PathNode.CurveTo(8.409f, 13.98f, 10.015f, 15.586f, 11.997f, 15.586f),
                    PathNode.CurveTo(13.978f, 15.586f, 15.584f, 13.98f, 15.584f, 11.998f),
                    PathNode.CurveTo(15.584f, 10.017f, 13.978f, 8.411f, 11.997f, 8.411f),
                    PathNode.Close,
                    PathNode.MoveTo(6.834f, 11.998f),
                    PathNode.CurveTo(6.834f, 9.147f, 9.145f, 6.836f, 11.997f, 6.836f),
                    PathNode.CurveTo(14.848f, 6.836f, 17.159f, 9.147f, 17.159f, 11.998f),
                    PathNode.CurveTo(17.159f, 14.85f, 14.848f, 17.161f, 11.997f, 17.161f),
                    PathNode.CurveTo(9.145f, 17.161f, 6.834f, 14.85f, 6.834f, 11.998f),
                    PathNode.Close,
                    PathNode.MoveTo(18.74f, 6.369f),
                    PathNode.CurveTo(19.048f, 6.061f, 19.048f, 5.563f, 18.74f, 5.255f),
                    PathNode.CurveTo(18.433f, 4.948f, 17.934f, 4.948f, 17.626f, 5.255f),
                    PathNode.LineTo(16.389f, 6.492f),
                    PathNode.CurveTo(16.081f, 6.8f, 16.081f, 7.299f, 16.389f, 7.606f),
                    PathNode.CurveTo(16.696f, 7.914f, 17.195f, 7.914f, 17.503f, 7.606f),
                    PathNode.LineTo(18.74f, 6.369f),
                    PathNode.Close,
                    PathNode.MoveTo(18.209f, 11.998f),
                    PathNode.CurveTo(18.209f, 11.564f, 18.562f, 11.211f, 18.997f, 11.211f),
                    PathNode.LineTo(20.747f, 11.211f),
                    PathNode.CurveTo(21.181f, 11.211f, 21.534f, 11.564f, 21.534f, 11.998f),
                    PathNode.CurveTo(21.534f, 12.433f, 21.181f, 12.786f, 20.747f, 12.786f),
                    PathNode.LineTo(18.997f, 12.786f),
                    PathNode.CurveTo(18.562f, 12.786f, 18.209f, 12.433f, 18.209f, 11.998f),
                    PathNode.Close,
                    PathNode.MoveTo(17.503f, 16.391f),
                    PathNode.CurveTo(17.195f, 16.083f, 16.696f, 16.083f, 16.389f, 16.391f),
                    PathNode.CurveTo(16.081f, 16.698f, 16.081f, 17.197f, 16.389f, 17.504f),
                    PathNode.LineTo(17.626f, 18.742f),
                    PathNode.CurveTo(17.934f, 19.049f, 18.433f, 19.049f, 18.74f, 18.742f),
                    PathNode.CurveTo(19.048f, 18.434f, 19.048f, 17.936f, 18.74f, 17.628f),
                    PathNode.LineTo(17.503f, 16.391f),
                    PathNode.Close,
                    PathNode.MoveTo(11.997f, 18.211f),
                    PathNode.CurveTo(12.431f, 18.211f, 12.784f, 18.563f, 12.784f, 18.998f),
                    PathNode.LineTo(12.784f, 20.748f),
                    PathNode.CurveTo(12.784f, 21.183f, 12.431f, 21.536f, 11.997f, 21.536f),
                    PathNode.CurveTo(11.562f, 21.536f, 11.209f, 21.183f, 11.209f, 20.748f),
                    PathNode.LineTo(11.209f, 18.998f),
                    PathNode.CurveTo(11.209f, 18.563f, 11.562f, 18.211f, 11.997f, 18.211f),
                    PathNode.Close,
                    PathNode.MoveTo(7.604f, 17.504f),
                    PathNode.CurveTo(7.912f, 17.197f, 7.912f, 16.698f, 7.604f, 16.391f),
                    PathNode.CurveTo(7.297f, 16.083f, 6.798f, 16.083f, 6.491f, 16.391f),
                    PathNode.LineTo(5.253f, 17.628f),
                    PathNode.CurveTo(4.946f, 17.936f, 4.946f, 18.434f, 5.253f, 18.742f),
                    PathNode.CurveTo(5.561f, 19.049f, 6.059f, 19.049f, 6.367f, 18.742f),
                    PathNode.LineTo(7.604f, 17.504f),
                    PathNode.Close,
                    PathNode.MoveTo(2.459f, 11.998f),
                    PathNode.CurveTo(2.459f, 11.564f, 2.812f, 11.211f, 3.246f, 11.211f),
                    PathNode.LineTo(4.996f, 11.211f),
                    PathNode.CurveTo(5.431f, 11.211f, 5.784f, 11.564f, 5.784f, 11.998f),
                    PathNode.CurveTo(5.784f, 12.433f, 5.431f, 12.786f, 4.996f, 12.786f),
                    PathNode.LineTo(3.246f, 12.786f),
                    PathNode.CurveTo(2.812f, 12.786f, 2.459f, 12.433f, 2.459f, 11.998f),
                    PathNode.Close,
                    PathNode.MoveTo(6.367f, 5.255f),
                    PathNode.CurveTo(6.059f, 4.948f, 5.561f, 4.948f, 5.253f, 5.255f),
                    PathNode.CurveTo(4.946f, 5.563f, 4.946f, 6.061f, 5.253f, 6.369f),
                    PathNode.LineTo(6.491f, 7.606f),
                    PathNode.CurveTo(6.798f, 7.914f, 7.297f, 7.914f, 7.604f, 7.606f),
                    PathNode.CurveTo(7.912f, 7.299f, 7.912f, 6.8f, 7.604f, 6.492f),
                    PathNode.LineTo(6.367f, 5.255f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _settingsDisplay!!
    }

private var _settingsDisplay: ImageVector? = null
