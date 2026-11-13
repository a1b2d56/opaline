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

/** `pb_dr_detail_email_normal` */
val OpalineIcons.System.EmailFill: ImageVector
    get() {
        if (_emailFill != null) return _emailFill!!
        _emailFill = ImageVector.Builder(
            name = "EmailFill",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.053f, 3.3f),
                    PathNode.LineTo(4.08f, 3.3f),
                    PathNode.LineTo(19.92f, 3.3f),
                    PathNode.LineTo(19.946f, 3.3f),
                    PathNode.LineTo(19.946f, 3.3f),
                    PathNode.LineTo(19.946f, 3.3f),
                    PathNode.CurveTo(20.288f, 3.3f, 20.585f, 3.3f, 20.831f, 3.32f),
                    PathNode.CurveTo(21.091f, 3.341f, 21.354f, 3.389f, 21.608f, 3.518f),
                    PathNode.CurveTo(21.984f, 3.71f, 22.29f, 4.016f, 22.482f, 4.392f),
                    PathNode.CurveTo(22.611f, 4.646f, 22.659f, 4.909f, 22.68f, 5.169f),
                    PathNode.CurveTo(22.691f, 5.312f, 22.696f, 5.473f, 22.698f, 5.649f),
                    PathNode.LineTo(14.351f, 11.498f),
                    PathNode.CurveTo(13.673f, 11.973f, 13.211f, 12.296f, 12.826f, 12.506f),
                    PathNode.CurveTo(12.457f, 12.707f, 12.219f, 12.77f, 12.0f, 12.77f),
                    PathNode.CurveTo(11.781f, 12.77f, 11.543f, 12.707f, 11.173f, 12.506f),
                    PathNode.CurveTo(10.788f, 12.296f, 10.326f, 11.974f, 9.647f, 11.499f),
                    PathNode.LineTo(1.301f, 5.656f),
                    PathNode.CurveTo(1.303f, 5.477f, 1.308f, 5.314f, 1.32f, 5.169f),
                    PathNode.CurveTo(1.341f, 4.909f, 1.388f, 4.646f, 1.518f, 4.392f),
                    PathNode.CurveTo(1.71f, 4.016f, 2.016f, 3.71f, 2.392f, 3.518f),
                    PathNode.CurveTo(2.646f, 3.389f, 2.909f, 3.341f, 3.169f, 3.32f),
                    PathNode.CurveTo(3.414f, 3.3f, 3.712f, 3.3f, 4.053f, 3.3f),
                    PathNode.LineTo(4.053f, 3.3f),
                    PathNode.LineTo(4.053f, 3.3f),
                    PathNode.Close,
                    PathNode.MoveTo(1.3f, 7.364f),
                    PathNode.LineTo(1.3f, 17.92f),
                    PathNode.LineTo(1.3f, 17.947f),
                    PathNode.LineTo(1.3f, 17.947f),
                    PathNode.LineTo(1.3f, 17.947f),
                    PathNode.CurveTo(1.3f, 18.288f, 1.3f, 18.585f, 1.32f, 18.831f),
                    PathNode.CurveTo(1.341f, 19.091f, 1.388f, 19.354f, 1.518f, 19.608f),
                    PathNode.CurveTo(1.71f, 19.984f, 2.016f, 20.29f, 2.392f, 20.482f),
                    PathNode.CurveTo(2.646f, 20.612f, 2.909f, 20.659f, 3.169f, 20.68f),
                    PathNode.CurveTo(3.415f, 20.7f, 3.712f, 20.7f, 4.053f, 20.7f),
                    PathNode.LineTo(4.08f, 20.7f),
                    PathNode.LineTo(19.92f, 20.7f),
                    PathNode.LineTo(19.946f, 20.7f),
                    PathNode.CurveTo(20.288f, 20.7f, 20.585f, 20.7f, 20.831f, 20.68f),
                    PathNode.CurveTo(21.091f, 20.659f, 21.354f, 20.612f, 21.608f, 20.482f),
                    PathNode.CurveTo(21.984f, 20.29f, 22.29f, 19.984f, 22.482f, 19.608f),
                    PathNode.CurveTo(22.611f, 19.354f, 22.659f, 19.091f, 22.68f, 18.831f),
                    PathNode.CurveTo(22.7f, 18.585f, 22.7f, 18.288f, 22.7f, 17.947f),
                    PathNode.LineTo(22.7f, 17.92f),
                    PathNode.LineTo(22.7f, 7.358f),
                    PathNode.LineTo(15.155f, 12.644f),
                    PathNode.LineTo(15.123f, 12.667f),
                    PathNode.CurveTo(14.485f, 13.114f, 13.958f, 13.483f, 13.497f, 13.735f),
                    PathNode.CurveTo(13.011f, 13.999f, 12.538f, 14.17f, 12.0f, 14.17f),
                    PathNode.CurveTo(11.462f, 14.17f, 10.989f, 14.0f, 10.503f, 13.735f),
                    PathNode.CurveTo(10.041f, 13.483f, 9.515f, 13.115f, 8.877f, 12.668f),
                    PathNode.LineTo(8.845f, 12.646f),
                    PathNode.LineTo(1.3f, 7.364f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _emailFill!!
    }

private var _emailFill: ImageVector? = null
