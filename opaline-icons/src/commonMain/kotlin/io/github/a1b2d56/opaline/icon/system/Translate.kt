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

/** `deep_link_base_translate` */
val OpalineIcons.System.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = ImageVector.Builder(
            name = "Translate",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.959f, 4.5f),
                    PathNode.CurveTo(5.959f, 4.294f, 6.02f, 4.093f, 6.135f, 3.922f),
                    PathNode.CurveTo(6.249f, 3.75f, 6.412f, 3.617f, 6.602f, 3.538f),
                    PathNode.CurveTo(6.792f, 3.459f, 7.002f, 3.438f, 7.204f, 3.479f),
                    PathNode.CurveTo(7.406f, 3.519f, 7.592f, 3.618f, 7.737f, 3.764f),
                    PathNode.CurveTo(7.883f, 3.909f, 7.982f, 4.095f, 8.022f, 4.297f),
                    PathNode.CurveTo(8.063f, 4.499f, 8.042f, 4.709f, 7.963f, 4.899f),
                    PathNode.CurveTo(7.884f, 5.089f, 7.751f, 5.252f, 7.579f, 5.366f),
                    PathNode.CurveTo(7.408f, 5.481f, 7.207f, 5.542f, 7.001f, 5.542f),
                    PathNode.CurveTo(6.725f, 5.542f, 6.46f, 5.432f, 6.264f, 5.237f),
                    PathNode.CurveTo(6.069f, 5.041f, 5.959f, 4.777f, 5.959f, 4.5f),
                    PathNode.Close,
                    PathNode.MoveTo(21.084f, 17.635f),
                    PathNode.LineTo(19.134f, 17.635f),
                    PathNode.LineTo(18.624f, 16.097f),
                    PathNode.LineTo(15.695f, 16.097f),
                    PathNode.LineTo(15.195f, 17.635f),
                    PathNode.LineTo(13.343f, 17.635f),
                    PathNode.LineTo(16.251f, 9.575f),
                    PathNode.LineTo(18.167f, 9.575f),
                    PathNode.LineTo(21.084f, 17.635f),
                    PathNode.Close,
                    PathNode.MoveTo(18.197f, 14.775f),
                    PathNode.LineTo(17.713f, 13.269f),
                    PathNode.CurveTo(17.489f, 12.567f, 17.315f, 11.85f, 17.193f, 11.124f),
                    PathNode.LineTo(17.167f, 11.124f),
                    PathNode.CurveTo(17.026f, 11.848f, 16.846f, 12.564f, 16.627f, 13.269f),
                    PathNode.LineTo(16.127f, 14.775f),
                    PathNode.LineTo(18.197f, 14.775f),
                    PathNode.Close,
                    PathNode.MoveTo(15.463f, 3.073f),
                    PathNode.LineTo(10.281f, 13.323f),
                    PathNode.CurveTo(9.385f, 12.981f, 8.553f, 12.491f, 7.819f, 11.874f),
                    PathNode.CurveTo(8.662f, 10.761f, 9.298f, 9.505f, 9.695f, 8.167f),
                    PathNode.LineTo(11.167f, 8.167f),
                    PathNode.LineTo(11.167f, 6.667f),
                    PathNode.LineTo(2.834f, 6.667f),
                    PathNode.LineTo(2.834f, 8.167f),
                    PathNode.LineTo(8.127f, 8.167f),
                    PathNode.CurveTo(7.809f, 9.088f, 7.359f, 9.959f, 6.792f, 10.752f),
                    PathNode.CurveTo(6.435f, 10.252f, 6.178f, 9.689f, 6.034f, 9.092f),
                    PathNode.LineTo(4.574f, 9.435f),
                    PathNode.CurveTo(4.791f, 10.349f, 5.207f, 11.204f, 5.794f, 11.939f),
                    PathNode.CurveTo(4.85f, 12.917f, 3.72f, 13.694f, 2.469f, 14.225f),
                    PathNode.LineTo(3.048f, 15.609f),
                    PathNode.CurveTo(4.471f, 15.005f, 5.759f, 14.123f, 6.837f, 13.014f),
                    PathNode.CurveTo(7.662f, 13.712f, 8.595f, 14.271f, 9.601f, 14.669f),
                    PathNode.LineTo(7.201f, 19.416f),
                    PathNode.LineTo(8.539f, 20.094f),
                    PathNode.LineTo(16.801f, 3.75f),
                    PathNode.LineTo(15.463f, 3.073f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _translate!!
    }

private var _translate: ImageVector? = null
