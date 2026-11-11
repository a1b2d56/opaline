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

/** `icon_warning` */
val OpalineIcons.System.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = ImageVector.Builder(
            name = "Warning",
            defaultWidth = 14.0f.dp,
            defaultHeight = 16.0f.dp,
            viewportWidth = 14.0f,
            viewportHeight = 16.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.996f, 12.606f),
                    PathNode.LineTo(12.996f, 12.604f),
                    PathNode.LineTo(7.758f, 3.532f),
                    PathNode.LineTo(7.757f, 3.532f),
                    PathNode.CurveTo(7.692f, 3.29f, 7.392f, 3.109f, 7.033f, 3.109f),
                    PathNode.CurveTo(6.67f, 3.109f, 6.372f, 3.295f, 6.309f, 3.539f),
                    PathNode.LineTo(0.948f, 12.824f),
                    PathNode.LineTo(0.952f, 12.83f),
                    PathNode.CurveTo(0.83f, 12.951f, 0.853f, 13.24f, 1.02f, 13.51f),
                    PathNode.CurveTo(1.187f, 13.784f, 1.439f, 13.938f, 1.602f, 13.875f),
                    PathNode.LineTo(1.608f, 13.884f),
                    PathNode.LineTo(12.459f, 13.884f),
                    PathNode.LineTo(12.465f, 13.87f),
                    PathNode.CurveTo(12.647f, 13.898f, 12.87f, 13.739f, 13.009f, 13.455f),
                    PathNode.CurveTo(13.172f, 13.129f, 13.161f, 12.762f, 12.996f, 12.606f),
                    PathNode.Close,
                    PathNode.MoveTo(6.273f, 6.385f),
                    PathNode.CurveTo(6.273f, 5.983f, 6.6f, 5.657f, 7.0f, 5.657f),
                    PathNode.CurveTo(7.403f, 5.657f, 7.727f, 5.983f, 7.727f, 6.385f),
                    PathNode.LineTo(7.727f, 10.132f),
                    PathNode.CurveTo(7.727f, 10.533f, 7.403f, 10.859f, 7.0f, 10.859f),
                    PathNode.CurveTo(6.6f, 10.859f, 6.273f, 10.533f, 6.273f, 10.132f),
                    PathNode.LineTo(6.273f, 6.385f),
                    PathNode.Close,
                    PathNode.MoveTo(7.0f, 12.926f),
                    PathNode.CurveTo(6.564f, 12.926f, 6.209f, 12.572f, 6.209f, 12.134f),
                    PathNode.CurveTo(6.209f, 11.698f, 6.564f, 11.345f, 7.0f, 11.345f),
                    PathNode.CurveTo(7.437f, 11.345f, 7.791f, 11.698f, 7.791f, 12.134f),
                    PathNode.CurveTo(7.791f, 12.571f, 7.437f, 12.926f, 7.0f, 12.926f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _warning!!
    }

private var _warning: ImageVector? = null
