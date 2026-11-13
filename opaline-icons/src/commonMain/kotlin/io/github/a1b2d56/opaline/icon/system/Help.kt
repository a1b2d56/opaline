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

/** `bh_vector_menu_helper` */
val OpalineIcons.System.Help: ImageVector
    get() {
        if (_help != null) return _help!!
        _help = ImageVector.Builder(
            name = "Help",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.3f),
                    PathNode.CurveTo(6.333f, 1.3f, 1.8f, 6.125f, 1.8f, 12.0f),
                    PathNode.CurveTo(1.8f, 14.42f, 2.595f, 16.622f, 3.883f, 18.406f),
                    PathNode.LineTo(1.903f, 21.634f),
                    PathNode.CurveTo(1.771f, 21.85f, 1.765f, 22.121f, 1.889f, 22.342f),
                    PathNode.CurveTo(2.013f, 22.563f, 2.247f, 22.7f, 2.5f, 22.7f),
                    PathNode.LineTo(12.0f, 22.7f),
                    PathNode.CurveTo(17.667f, 22.7f, 22.2f, 17.875f, 22.2f, 12.0f),
                    PathNode.CurveTo(22.2f, 6.125f, 17.667f, 1.3f, 12.0f, 1.3f),
                    PathNode.Close,
                    PathNode.MoveTo(3.2f, 12.0f),
                    PathNode.CurveTo(3.2f, 6.829f, 7.173f, 2.7f, 12.0f, 2.7f),
                    PathNode.CurveTo(16.827f, 2.7f, 20.8f, 6.829f, 20.8f, 12.0f),
                    PathNode.CurveTo(20.8f, 17.17f, 16.827f, 21.3f, 12.0f, 21.3f),
                    PathNode.LineTo(3.751f, 21.3f),
                    PathNode.LineTo(5.326f, 18.731f),
                    PathNode.CurveTo(5.479f, 18.481f, 5.46f, 18.161f, 5.278f, 17.931f),
                    PathNode.CurveTo(3.998f, 16.312f, 3.2f, 14.263f, 3.2f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.076f, 8.505f),
                    PathNode.CurveTo(11.799f, 8.492f, 11.525f, 8.553f, 11.281f, 8.684f),
                    PathNode.CurveTo(11.037f, 8.814f, 10.833f, 9.008f, 10.691f, 9.245f),
                    PathNode.CurveTo(10.549f, 9.482f, 10.474f, 9.754f, 10.474f, 10.03f),
                    PathNode.CurveTo(10.474f, 10.417f, 10.161f, 10.731f, 9.774f, 10.731f),
                    PathNode.CurveTo(9.388f, 10.731f, 9.074f, 10.418f, 9.074f, 10.031f),
                    PathNode.CurveTo(9.074f, 9.501f, 9.217f, 8.981f, 9.49f, 8.526f),
                    PathNode.CurveTo(9.762f, 8.071f, 10.153f, 7.699f, 10.621f, 7.449f),
                    PathNode.CurveTo(11.089f, 7.199f, 11.616f, 7.081f, 12.145f, 7.107f),
                    PathNode.CurveTo(12.675f, 7.133f, 13.187f, 7.303f, 13.628f, 7.598f),
                    PathNode.CurveTo(14.068f, 7.893f, 14.42f, 8.302f, 14.646f, 8.782f),
                    PathNode.CurveTo(14.873f, 9.262f, 14.964f, 9.794f, 14.911f, 10.321f),
                    PathNode.CurveTo(14.858f, 10.849f, 14.663f, 11.352f, 14.346f, 11.777f),
                    PathNode.CurveTo(14.032f, 12.199f, 13.611f, 12.528f, 13.125f, 12.73f),
                    PathNode.CurveTo(12.997f, 12.79f, 12.888f, 12.885f, 12.813f, 13.004f),
                    PathNode.CurveTo(12.736f, 13.126f, 12.696f, 13.268f, 12.699f, 13.413f),
                    PathNode.LineTo(12.699f, 13.42f),
                    PathNode.LineTo(12.699f, 13.427f),
                    PathNode.LineTo(12.699f, 13.739f),
                    PathNode.CurveTo(12.699f, 14.126f, 12.386f, 14.439f, 11.999f, 14.439f),
                    PathNode.CurveTo(11.613f, 14.439f, 11.299f, 14.126f, 11.299f, 13.739f),
                    PathNode.LineTo(11.299f, 13.434f),
                    PathNode.CurveTo(11.292f, 13.017f, 11.407f, 12.608f, 11.63f, 12.256f),
                    PathNode.CurveTo(11.854f, 11.901f, 12.178f, 11.621f, 12.56f, 11.449f),
                    PathNode.LineTo(12.57f, 11.445f),
                    PathNode.LineTo(12.58f, 11.441f),
                    PathNode.CurveTo(12.836f, 11.335f, 13.059f, 11.163f, 13.224f, 10.941f),
                    PathNode.CurveTo(13.389f, 10.719f, 13.491f, 10.457f, 13.518f, 10.182f),
                    PathNode.CurveTo(13.546f, 9.906f, 13.498f, 9.629f, 13.38f, 9.379f),
                    PathNode.CurveTo(13.262f, 9.129f, 13.079f, 8.915f, 12.849f, 8.761f),
                    PathNode.CurveTo(12.619f, 8.608f, 12.352f, 8.519f, 12.076f, 8.505f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 16.896f),
                    PathNode.CurveTo(12.497f, 16.896f, 12.9f, 16.493f, 12.9f, 15.996f),
                    PathNode.CurveTo(12.9f, 15.499f, 12.497f, 15.096f, 12.0f, 15.096f),
                    PathNode.CurveTo(11.503f, 15.096f, 11.1f, 15.499f, 11.1f, 15.996f),
                    PathNode.CurveTo(11.1f, 16.493f, 11.503f, 16.896f, 12.0f, 16.896f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _help!!
    }

private var _help: ImageVector? = null
