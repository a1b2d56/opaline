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

/** `ic_embedded_top_tips_anti_fraud_shield` */
val OpalineIcons.System.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = ImageVector.Builder(
            name = "Shield",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.473f, 1.167f),
                    PathNode.CurveTo(11.823f, 1.116f, 12.179f, 1.116f, 12.53f, 1.167f),
                    PathNode.CurveTo(12.95f, 1.228f, 13.348f, 1.383f, 13.856f, 1.573f),
                    PathNode.LineTo(19.174f, 3.567f),
                    PathNode.CurveTo(19.885f, 3.834f, 20.507f, 4.049f, 20.979f, 4.465f),
                    PathNode.CurveTo(21.364f, 4.804f, 21.661f, 5.234f, 21.844f, 5.714f),
                    PathNode.CurveTo(22.067f, 6.301f, 22.051f, 6.96f, 22.051f, 7.72f),
                    PathNode.LineTo(22.051f, 10.969f),
                    PathNode.CurveTo(22.051f, 17.184f, 18.32f, 21.474f, 13.163f, 23.664f),
                    PathNode.CurveTo(13.153f, 23.669f, 13.143f, 23.674f, 13.132f, 23.679f),
                    PathNode.CurveTo(12.921f, 23.768f, 12.678f, 23.877f, 12.375f, 23.926f),
                    PathNode.CurveTo(12.142f, 23.963f, 11.86f, 23.963f, 11.627f, 23.926f),
                    PathNode.CurveTo(11.476f, 23.901f, 11.339f, 23.862f, 11.214f, 23.817f),
                    PathNode.LineTo(10.87f, 23.679f),
                    PathNode.LineTo(10.389f, 23.468f),
                    PathNode.CurveTo(5.466f, 21.223f, 1.952f, 17.002f, 1.951f, 10.969f),
                    PathNode.LineTo(1.951f, 7.72f),
                    PathNode.CurveTo(1.951f, 6.96f, 1.935f, 6.301f, 2.158f, 5.714f),
                    PathNode.CurveTo(2.341f, 5.234f, 2.638f, 4.804f, 3.024f, 4.465f),
                    PathNode.CurveTo(3.495f, 4.049f, 4.117f, 3.834f, 4.828f, 3.567f),
                    PathNode.LineTo(10.147f, 1.573f),
                    PathNode.CurveTo(10.654f, 1.383f, 11.052f, 1.228f, 11.473f, 1.167f),
                    PathNode.Close,
                    PathNode.MoveTo(12.004f, 14.653f),
                    PathNode.CurveTo(11.4f, 14.653f, 10.911f, 15.143f, 10.91f, 15.747f),
                    PathNode.CurveTo(10.91f, 16.351f, 11.4f, 16.841f, 12.004f, 16.841f),
                    PathNode.CurveTo(12.608f, 16.84f, 13.098f, 16.351f, 13.098f, 15.747f),
                    PathNode.CurveTo(13.098f, 15.143f, 12.608f, 14.653f, 12.004f, 14.653f),
                    PathNode.Close,
                    PathNode.MoveTo(11.992f, 6.806f),
                    PathNode.CurveTo(11.395f, 6.806f, 10.926f, 7.319f, 10.979f, 7.914f),
                    PathNode.LineTo(11.428f, 12.926f),
                    PathNode.CurveTo(11.455f, 13.226f, 11.706f, 13.456f, 12.007f, 13.456f),
                    PathNode.CurveTo(12.31f, 13.456f, 12.563f, 13.223f, 12.588f, 12.922f),
                    PathNode.LineTo(13.006f, 7.908f),
                    PathNode.CurveTo(13.056f, 7.315f, 12.587f, 6.806f, 11.992f, 6.806f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _shield!!
    }

private var _shield: ImageVector? = null
