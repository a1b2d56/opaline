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

/** `pb_ic_sync_cloud` */
val OpalineIcons.System.CloudSync: ImageVector
    get() {
        if (_cloudSync != null) return _cloudSync!!
        _cloudSync = ImageVector.Builder(
            name = "CloudSync",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.245f, 16.299f),
                    PathNode.CurveTo(17.632f, 16.299f, 17.944f, 16.613f, 17.944f, 17.0f),
                    PathNode.CurveTo(17.944f, 20.285f, 15.281f, 22.949f, 11.995f, 22.949f),
                    PathNode.CurveTo(10.471f, 22.949f, 9.082f, 22.372f, 8.03f, 21.43f),
                    PathNode.LineTo(8.03f, 21.958f),
                    PathNode.CurveTo(8.03f, 22.344f, 7.717f, 22.658f, 7.33f, 22.658f),
                    PathNode.CurveTo(6.944f, 22.658f, 6.63f, 22.344f, 6.63f, 21.958f),
                    PathNode.LineTo(6.63f, 19.625f),
                    PathNode.CurveTo(6.63f, 19.238f, 6.943f, 18.924f, 7.33f, 18.924f),
                    PathNode.LineTo(9.663f, 18.924f),
                    PathNode.CurveTo(10.05f, 18.924f, 10.363f, 19.238f, 10.363f, 19.625f),
                    PathNode.CurveTo(10.363f, 20.011f, 10.05f, 20.325f, 9.663f, 20.325f),
                    PathNode.LineTo(8.894f, 20.325f),
                    PathNode.CurveTo(9.707f, 21.084f, 10.796f, 21.549f, 11.995f, 21.549f),
                    PathNode.CurveTo(14.507f, 21.549f, 16.545f, 19.512f, 16.545f, 17.0f),
                    PathNode.CurveTo(16.545f, 16.613f, 16.858f, 16.299f, 17.245f, 16.299f),
                    PathNode.Close,
                    PathNode.MoveTo(11.999f, 2.798f),
                    PathNode.CurveTo(15.642f, 2.798f, 18.649f, 5.505f, 19.128f, 9.016f),
                    PathNode.CurveTo(21.762f, 9.732f, 23.699f, 12.138f, 23.699f, 14.998f),
                    PathNode.CurveTo(23.699f, 18.284f, 21.143f, 20.971f, 17.911f, 21.183f),
                    PathNode.CurveTo(18.25f, 20.705f, 18.531f, 20.186f, 18.747f, 19.632f),
                    PathNode.CurveTo(20.792f, 19.083f, 22.299f, 17.218f, 22.299f, 14.998f),
                    PathNode.CurveTo(22.299f, 12.642f, 20.6f, 10.681f, 18.359f, 10.276f),
                    PathNode.CurveTo(18.043f, 10.218f, 17.806f, 9.952f, 17.786f, 9.631f),
                    PathNode.CurveTo(17.597f, 6.6f, 15.078f, 4.199f, 11.999f, 4.199f),
                    PathNode.CurveTo(8.919f, 4.199f, 6.4f, 6.6f, 6.211f, 9.631f),
                    PathNode.CurveTo(6.191f, 9.952f, 5.954f, 10.218f, 5.638f, 10.276f),
                    PathNode.CurveTo(3.398f, 10.682f, 1.699f, 12.642f, 1.699f, 14.998f),
                    PathNode.CurveTo(1.699f, 17.246f, 3.243f, 19.13f, 5.328f, 19.653f),
                    PathNode.LineTo(5.328f, 21.086f),
                    PathNode.CurveTo(2.464f, 20.539f, 0.299f, 18.022f, 0.299f, 14.998f),
                    PathNode.CurveTo(0.299f, 12.138f, 2.235f, 9.732f, 4.868f, 9.016f),
                    PathNode.CurveTo(5.348f, 5.504f, 8.356f, 2.798f, 11.999f, 2.798f),
                    PathNode.Close,
                    PathNode.MoveTo(11.995f, 11.05f),
                    PathNode.CurveTo(13.52f, 11.05f, 14.91f, 11.626f, 15.963f, 12.569f),
                    PathNode.LineTo(15.963f, 12.042f),
                    PathNode.CurveTo(15.963f, 11.656f, 16.277f, 11.342f, 16.663f, 11.342f),
                    PathNode.CurveTo(17.05f, 11.342f, 17.363f, 11.656f, 17.363f, 12.042f),
                    PathNode.LineTo(17.363f, 14.375f),
                    PathNode.CurveTo(17.363f, 14.762f, 17.049f, 15.076f, 16.663f, 15.076f),
                    PathNode.LineTo(14.33f, 15.076f),
                    PathNode.CurveTo(13.944f, 15.076f, 13.63f, 14.762f, 13.63f, 14.375f),
                    PathNode.CurveTo(13.63f, 13.989f, 13.943f, 13.675f, 14.33f, 13.675f),
                    PathNode.LineTo(15.1f, 13.675f),
                    PathNode.CurveTo(14.286f, 12.915f, 13.195f, 12.451f, 11.995f, 12.451f),
                    PathNode.CurveTo(9.483f, 12.451f, 7.446f, 14.487f, 7.446f, 17.0f),
                    PathNode.CurveTo(7.446f, 17.386f, 7.133f, 17.7f, 6.746f, 17.7f),
                    PathNode.CurveTo(6.36f, 17.7f, 6.046f, 17.386f, 6.046f, 17.0f),
                    PathNode.CurveTo(6.046f, 13.714f, 8.71f, 11.05f, 11.995f, 11.05f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _cloudSync!!
    }

private var _cloudSync: ImageVector? = null
