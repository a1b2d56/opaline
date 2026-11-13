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

/** `ic_oplus_task_shortcut_lock` */
val OpalineIcons.System.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = ImageVector.Builder(
            name = "Lock",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(14.571f, 1.0f, 16.7f, 3.015f, 16.7f, 5.554f),
                    PathNode.LineTo(16.7f, 9.6f),
                    PathNode.LineTo(19.119f, 9.6f),
                    PathNode.CurveTo(20.279f, 9.6f, 21.2f, 10.553f, 21.2f, 11.704f),
                    PathNode.LineTo(21.2f, 19.696f),
                    PathNode.CurveTo(21.2f, 20.847f, 20.279f, 21.799f, 19.119f, 21.8f),
                    PathNode.LineTo(4.881f, 21.8f),
                    PathNode.CurveTo(3.721f, 21.8f, 2.8f, 20.847f, 2.8f, 19.696f),
                    PathNode.LineTo(2.8f, 11.704f),
                    PathNode.CurveTo(2.8f, 10.553f, 3.721f, 9.6f, 4.881f, 9.6f),
                    PathNode.LineTo(7.3f, 9.6f),
                    PathNode.LineTo(7.3f, 5.554f),
                    PathNode.CurveTo(7.3f, 3.015f, 9.429f, 1.0f, 12.0f, 1.0f),
                    PathNode.Close,
                    PathNode.MoveTo(4.881f, 11.0f),
                    PathNode.CurveTo(4.516f, 11.0f, 4.2f, 11.305f, 4.2f, 11.704f),
                    PathNode.LineTo(4.2f, 19.696f),
                    PathNode.CurveTo(4.2f, 20.096f, 4.516f, 20.399f, 4.881f, 20.399f),
                    PathNode.LineTo(19.119f, 20.399f),
                    PathNode.CurveTo(19.484f, 20.399f, 19.8f, 20.096f, 19.8f, 19.696f),
                    PathNode.LineTo(19.8f, 11.704f),
                    PathNode.CurveTo(19.8f, 11.305f, 19.484f, 11.0f, 19.119f, 11.0f),
                    PathNode.LineTo(4.881f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 12.814f),
                    PathNode.CurveTo(12.828f, 12.814f, 13.5f, 13.486f, 13.5f, 14.314f),
                    PathNode.CurveTo(13.5f, 14.89f, 13.175f, 15.389f, 12.699f, 15.641f),
                    PathNode.LineTo(12.699f, 17.698f),
                    PathNode.CurveTo(12.699f, 18.085f, 12.386f, 18.398f, 11.999f, 18.398f),
                    PathNode.CurveTo(11.612f, 18.398f, 11.299f, 18.085f, 11.299f, 17.698f),
                    PathNode.LineTo(11.299f, 15.64f),
                    PathNode.CurveTo(10.824f, 15.388f, 10.5f, 14.889f, 10.5f, 14.314f),
                    PathNode.CurveTo(10.5f, 13.486f, 11.172f, 12.814f, 12.0f, 12.814f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 2.4f),
                    PathNode.CurveTo(10.153f, 2.4f, 8.7f, 3.837f, 8.7f, 5.554f),
                    PathNode.LineTo(8.7f, 9.6f),
                    PathNode.LineTo(15.3f, 9.6f),
                    PathNode.LineTo(15.3f, 5.554f),
                    PathNode.CurveTo(15.3f, 3.837f, 13.847f, 2.4f, 12.0f, 2.4f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _lock!!
    }

private var _lock: ImageVector? = null
