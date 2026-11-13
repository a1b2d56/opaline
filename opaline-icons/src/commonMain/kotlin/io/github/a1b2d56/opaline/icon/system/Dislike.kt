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

/** `agent_fb_bad` */
val OpalineIcons.System.Dislike: ImageVector
    get() {
        if (_dislike != null) return _dislike!!
        _dislike = ImageVector.Builder(
            name = "Dislike",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.084f, 1.8f),
                    PathNode.CurveTo(1.468f, 1.8f, 0.967f, 2.3f, 0.967f, 2.916f),
                    PathNode.LineTo(0.967f, 10.416f),
                    PathNode.CurveTo(0.967f, 11.033f, 1.467f, 11.533f, 2.084f, 11.533f),
                    PathNode.LineTo(4.786f, 11.533f),
                    PathNode.LineTo(5.04f, 11.793f),
                    PathNode.CurveTo(6.774f, 13.57f, 7.976f, 15.797f, 8.509f, 18.222f),
                    PathNode.LineTo(8.532f, 18.309f),
                    PathNode.CurveTo(8.666f, 18.736f, 9.063f, 19.033f, 9.518f, 19.033f),
                    PathNode.LineTo(9.572f, 19.033f),
                    PathNode.CurveTo(11.457f, 19.033f, 12.908f, 17.37f, 12.653f, 15.503f),
                    PathNode.LineTo(12.303f, 12.95f),
                    PathNode.LineTo(16.481f, 12.95f),
                    PathNode.CurveTo(18.288f, 12.95f, 19.586f, 11.208f, 19.068f, 9.476f),
                    PathNode.LineTo(17.348f, 3.726f),
                    PathNode.CurveTo(17.006f, 2.583f, 15.954f, 1.8f, 14.761f, 1.8f),
                    PathNode.LineTo(2.084f, 1.8f),
                    PathNode.Close,
                    PathNode.MoveTo(14.761f, 3.199f),
                    PathNode.CurveTo(15.335f, 3.199f, 15.841f, 3.577f, 16.006f, 4.127f),
                    PathNode.LineTo(17.727f, 9.877f),
                    PathNode.CurveTo(17.976f, 10.711f, 17.351f, 11.55f, 16.481f, 11.55f),
                    PathNode.LineTo(11.978f, 11.55f),
                    PathNode.CurveTo(11.301f, 11.55f, 10.78f, 12.148f, 10.871f, 12.819f),
                    PathNode.LineTo(11.265f, 15.693f),
                    PathNode.CurveTo(11.395f, 16.641f, 10.723f, 17.493f, 9.803f, 17.617f),
                    PathNode.CurveTo(9.182f, 15.055f, 7.885f, 12.705f, 6.042f, 10.816f),
                    PathNode.LineTo(5.7f, 10.466f),
                    PathNode.LineTo(5.7f, 3.199f),
                    PathNode.LineTo(14.761f, 3.199f),
                    PathNode.Close,
                    PathNode.MoveTo(4.3f, 10.133f),
                    PathNode.LineTo(2.367f, 10.133f),
                    PathNode.LineTo(2.367f, 3.199f),
                    PathNode.LineTo(4.3f, 3.199f),
                    PathNode.LineTo(4.3f, 10.133f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
