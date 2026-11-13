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

/** `ic_group_cover_gifts` */
val OpalineIcons.System.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = ImageVector.Builder(
            name = "Gift",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.3f, 22.513f),
                    PathNode.LineTo(5.301f, 22.513f),
                    PathNode.CurveTo(4.196f, 22.513f, 3.301f, 21.617f, 3.301f, 20.513f),
                    PathNode.LineTo(3.301f, 12.807f),
                    PathNode.LineTo(11.3f, 12.807f),
                    PathNode.LineTo(11.3f, 22.513f),
                    PathNode.Close,
                    PathNode.MoveTo(20.701f, 20.513f),
                    PathNode.CurveTo(20.701f, 21.617f, 19.805f, 22.513f, 18.701f, 22.513f),
                    PathNode.LineTo(12.7f, 22.513f),
                    PathNode.LineTo(12.7f, 12.807f),
                    PathNode.LineTo(20.701f, 12.807f),
                    PathNode.LineTo(20.701f, 20.513f),
                    PathNode.Close,
                    PathNode.MoveTo(13.689f, 2.155f),
                    PathNode.CurveTo(14.976f, 1.267f, 16.894f, 1.13f, 17.878f, 2.6f),
                    PathNode.CurveTo(18.585f, 3.657f, 18.435f, 5.045f, 17.491f, 6.113f),
                    PathNode.LineTo(20.199f, 6.113f),
                    PathNode.CurveTo(21.303f, 6.113f, 22.199f, 7.008f, 22.199f, 8.113f),
                    PathNode.LineTo(22.199f, 10.813f),
                    PathNode.CurveTo(22.199f, 11.199f, 21.885f, 11.513f, 21.499f, 11.513f),
                    PathNode.LineTo(21.19f, 11.513f),
                    PathNode.CurveTo(21.169f, 11.511f, 21.147f, 11.506f, 21.125f, 11.506f),
                    PathNode.LineTo(2.656f, 11.506f),
                    PathNode.CurveTo(2.634f, 11.506f, 2.612f, 11.511f, 2.591f, 11.513f),
                    PathNode.LineTo(2.499f, 11.513f),
                    PathNode.CurveTo(2.113f, 11.513f, 1.799f, 11.199f, 1.799f, 10.813f),
                    PathNode.LineTo(1.799f, 8.113f),
                    PathNode.CurveTo(1.799f, 7.008f, 2.694f, 6.113f, 3.799f, 6.113f),
                    PathNode.LineTo(6.509f, 6.113f),
                    PathNode.CurveTo(5.565f, 5.045f, 5.415f, 3.657f, 6.122f, 2.6f),
                    PathNode.CurveTo(7.106f, 1.13f, 9.024f, 1.267f, 10.311f, 2.155f),
                    PathNode.CurveTo(10.316f, 2.158f, 10.321f, 2.162f, 10.326f, 2.165f),
                    PathNode.CurveTo(10.329f, 2.167f, 10.332f, 2.168f, 10.335f, 2.17f),
                    PathNode.LineTo(10.334f, 2.17f),
                    PathNode.CurveTo(11.105f, 2.672f, 11.634f, 3.343f, 12.0f, 3.996f),
                    PathNode.CurveTo(12.366f, 3.343f, 12.895f, 2.672f, 13.666f, 2.17f),
                    PathNode.LineTo(13.665f, 2.17f),
                    PathNode.CurveTo(13.668f, 2.168f, 13.671f, 2.167f, 13.674f, 2.165f),
                    PathNode.CurveTo(13.679f, 2.162f, 13.684f, 2.158f, 13.689f, 2.155f),
                    PathNode.Close,
                    PathNode.MoveTo(9.531f, 3.316f),
                    PathNode.CurveTo(8.586f, 2.653f, 7.659f, 2.821f, 7.286f, 3.379f),
                    PathNode.CurveTo(6.932f, 3.909f, 6.962f, 4.891f, 8.089f, 5.645f),
                    PathNode.CurveTo(8.317f, 5.797f, 8.656f, 5.915f, 9.088f, 5.987f),
                    PathNode.CurveTo(9.512f, 6.058f, 9.978f, 6.077f, 10.42f, 6.069f),
                    PathNode.CurveTo(10.725f, 6.063f, 11.011f, 6.042f, 11.256f, 6.02f),
                    PathNode.CurveTo(11.263f, 5.986f, 11.27f, 5.952f, 11.278f, 5.915f),
                    PathNode.CurveTo(11.235f, 5.758f, 11.183f, 5.584f, 11.115f, 5.402f),
                    PathNode.CurveTo(10.84f, 4.667f, 10.365f, 3.852f, 9.556f, 3.332f),
                    PathNode.LineTo(9.542f, 3.325f),
                    PathNode.LineTo(9.531f, 3.316f),
                    PathNode.Close,
                    PathNode.MoveTo(16.714f, 3.379f),
                    PathNode.CurveTo(16.34f, 2.821f, 15.413f, 2.653f, 14.469f, 3.316f),
                    PathNode.LineTo(14.458f, 3.325f),
                    PathNode.LineTo(14.444f, 3.332f),
                    PathNode.CurveTo(13.635f, 3.852f, 13.16f, 4.667f, 12.885f, 5.402f),
                    PathNode.CurveTo(12.817f, 5.584f, 12.764f, 5.758f, 12.721f, 5.915f),
                    PathNode.CurveTo(12.729f, 5.952f, 12.736f, 5.986f, 12.743f, 6.02f),
                    PathNode.CurveTo(12.988f, 6.042f, 13.275f, 6.063f, 13.58f, 6.069f),
                    PathNode.CurveTo(14.022f, 6.077f, 14.488f, 6.058f, 14.912f, 5.987f),
                    PathNode.CurveTo(15.344f, 5.915f, 15.683f, 5.797f, 15.911f, 5.645f),
                    PathNode.CurveTo(17.038f, 4.891f, 17.068f, 3.909f, 16.714f, 3.379f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _gift!!
    }

private var _gift: ImageVector? = null
