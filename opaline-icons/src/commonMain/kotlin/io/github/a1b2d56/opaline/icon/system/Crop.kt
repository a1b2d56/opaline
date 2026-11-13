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

/** `crop_item` */
val OpalineIcons.System.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = ImageVector.Builder(
            name = "Crop",
            defaultWidth = 21.0f.dp,
            defaultHeight = 21.0f.dp,
            viewportWidth = 21.0f,
            viewportHeight = 21.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.236f, 16.229f),
                    PathNode.CurveTo(5.236f, 16.508f, 5.46f, 16.729f, 5.733f, 16.729f),
                    PathNode.LineTo(15.208f, 16.729f),
                    PathNode.LineTo(15.208f, 16.728f),
                    PathNode.LineTo(16.374f, 16.728f),
                    PathNode.LineTo(16.374f, 16.729f),
                    PathNode.LineTo(17.382f, 16.729f),
                    PathNode.CurveTo(17.704f, 16.73f, 17.966f, 16.992f, 17.966f, 17.313f),
                    PathNode.CurveTo(17.966f, 17.635f, 17.704f, 17.896f, 17.382f, 17.896f),
                    PathNode.LineTo(16.374f, 17.896f),
                    PathNode.LineTo(16.374f, 19.093f),
                    PathNode.CurveTo(16.374f, 19.415f, 16.113f, 19.676f, 15.791f, 19.676f),
                    PathNode.CurveTo(15.469f, 19.676f, 15.208f, 19.415f, 15.208f, 19.093f),
                    PathNode.LineTo(15.208f, 17.896f),
                    PathNode.LineTo(5.733f, 17.896f),
                    PathNode.CurveTo(4.811f, 17.896f, 4.07f, 17.148f, 4.07f, 16.229f),
                    PathNode.LineTo(4.07f, 4.84f),
                    PathNode.LineTo(5.236f, 4.84f),
                    PathNode.LineTo(5.236f, 16.229f),
                    PathNode.Close,
                    PathNode.MoveTo(4.653f, 0.691f),
                    PathNode.CurveTo(4.975f, 0.692f, 5.236f, 0.952f, 5.236f, 1.274f),
                    PathNode.LineTo(5.236f, 2.473f),
                    PathNode.LineTo(15.665f, 2.473f),
                    PathNode.CurveTo(16.588f, 2.473f, 17.329f, 3.221f, 17.329f, 4.139f),
                    PathNode.LineTo(17.329f, 15.529f),
                    PathNode.LineTo(16.162f, 15.529f),
                    PathNode.LineTo(16.162f, 4.139f),
                    PathNode.CurveTo(16.162f, 3.861f, 15.939f, 3.639f, 15.665f, 3.639f),
                    PathNode.LineTo(4.017f, 3.639f),
                    PathNode.CurveTo(3.694f, 3.639f, 3.434f, 3.378f, 3.434f, 3.056f),
                    PathNode.CurveTo(3.434f, 2.734f, 3.694f, 2.473f, 4.017f, 2.473f),
                    PathNode.LineTo(4.07f, 2.473f),
                    PathNode.LineTo(4.07f, 1.274f),
                    PathNode.CurveTo(4.07f, 0.952f, 4.331f, 0.691f, 4.653f, 0.691f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _crop!!
    }

private var _crop: ImageVector? = null
