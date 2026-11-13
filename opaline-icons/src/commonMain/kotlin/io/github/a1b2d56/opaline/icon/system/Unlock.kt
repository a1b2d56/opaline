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

/** `ic_oplus_task_shortcut_unlock` */
val OpalineIcons.System.Unlock: ImageVector
    get() {
        if (_unlock != null) return _unlock!!
        _unlock = ImageVector.Builder(
            name = "Unlock",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 0.256f),
                    PathNode.CurveTo(14.571f, 0.256f, 16.7f, 2.271f, 16.7f, 4.81f),
                    PathNode.LineTo(16.7f, 6.299f),
                    PathNode.CurveTo(16.7f, 6.686f, 16.386f, 7.0f, 16.0f, 7.0f),
                    PathNode.CurveTo(15.613f, 7.0f, 15.3f, 6.686f, 15.3f, 6.299f),
                    PathNode.LineTo(15.3f, 4.81f),
                    PathNode.CurveTo(15.3f, 3.093f, 13.847f, 1.657f, 12.0f, 1.657f),
                    PathNode.CurveTo(10.153f, 1.657f, 8.7f, 3.093f, 8.7f, 4.81f),
                    PathNode.LineTo(8.7f, 9.6f),
                    PathNode.LineTo(19.119f, 9.6f),
                    PathNode.CurveTo(20.279f, 9.6f, 21.2f, 10.554f, 21.2f, 11.705f),
                    PathNode.LineTo(21.2f, 19.697f),
                    PathNode.CurveTo(21.2f, 20.847f, 20.279f, 21.8f, 19.119f, 21.8f),
                    PathNode.LineTo(4.881f, 21.8f),
                    PathNode.CurveTo(3.721f, 21.8f, 2.8f, 20.847f, 2.8f, 19.697f),
                    PathNode.LineTo(2.8f, 11.705f),
                    PathNode.CurveTo(2.8f, 10.554f, 3.721f, 9.6f, 4.881f, 9.6f),
                    PathNode.LineTo(7.3f, 9.6f),
                    PathNode.LineTo(7.3f, 4.81f),
                    PathNode.CurveTo(7.3f, 2.271f, 9.429f, 0.256f, 12.0f, 0.256f),
                    PathNode.Close,
                    PathNode.MoveTo(4.881f, 11.0f),
                    PathNode.CurveTo(4.516f, 11.001f, 4.2f, 11.305f, 4.2f, 11.705f),
                    PathNode.LineTo(4.2f, 19.697f),
                    PathNode.CurveTo(4.201f, 20.096f, 4.516f, 20.4f, 4.881f, 20.4f),
                    PathNode.LineTo(19.119f, 20.4f),
                    PathNode.CurveTo(19.484f, 20.4f, 19.799f, 20.096f, 19.8f, 19.697f),
                    PathNode.LineTo(19.8f, 11.705f),
                    PathNode.CurveTo(19.8f, 11.305f, 19.484f, 11.001f, 19.119f, 11.0f),
                    PathNode.LineTo(4.881f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 12.815f),
                    PathNode.CurveTo(12.828f, 12.815f, 13.5f, 13.486f, 13.5f, 14.315f),
                    PathNode.CurveTo(13.5f, 14.891f, 13.175f, 15.39f, 12.699f, 15.641f),
                    PathNode.LineTo(12.699f, 17.699f),
                    PathNode.CurveTo(12.699f, 18.085f, 12.386f, 18.399f, 11.999f, 18.399f),
                    PathNode.CurveTo(11.613f, 18.399f, 11.299f, 18.085f, 11.299f, 17.699f),
                    PathNode.LineTo(11.299f, 15.64f),
                    PathNode.CurveTo(10.824f, 15.388f, 10.5f, 14.89f, 10.5f, 14.315f),
                    PathNode.CurveTo(10.5f, 13.486f, 11.172f, 12.815f, 12.0f, 12.815f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
