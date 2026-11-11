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

/** `oplus_ic_ksh_key_meta` */
val OpalineIcons.System.KeyMeta: ImageVector
    get() {
        if (_keyMeta != null) return _keyMeta!!
        _keyMeta = ImageVector.Builder(
            name = "KeyMeta",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.44f, 8.06f),
                    PathNode.LineTo(12.44f, 4.92f),
                    PathNode.LineTo(15.58f, 4.92f),
                    PathNode.LineTo(15.58f, 8.06f),
                    PathNode.LineTo(12.44f, 8.06f),
                    PathNode.Close,
                    PathNode.MoveTo(12.41f, 3.59f),
                    PathNode.CurveTo(12.07f, 3.59f, 11.74f, 3.73f, 11.49f, 3.97f),
                    PathNode.CurveTo(11.25f, 4.22f, 11.11f, 4.55f, 11.11f, 4.9f),
                    PathNode.LineTo(11.11f, 8.72f),
                    PathNode.LineTo(11.11f, 9.39f),
                    PathNode.LineTo(11.78f, 9.39f),
                    PathNode.LineTo(15.6f, 9.39f),
                    PathNode.CurveTo(15.95f, 9.39f, 16.28f, 9.25f, 16.53f, 9.01f),
                    PathNode.CurveTo(16.77f, 8.76f, 16.91f, 8.43f, 16.91f, 8.09f),
                    PathNode.LineTo(16.91f, 4.89f),
                    PathNode.CurveTo(16.91f, 4.55f, 16.77f, 4.22f, 16.53f, 3.97f),
                    PathNode.CurveTo(16.28f, 3.73f, 15.95f, 3.59f, 15.6f, 3.59f),
                    PathNode.LineTo(12.41f, 3.59f),
                    PathNode.Close,
                    PathNode.MoveTo(5.42f, 8.06f),
                    PathNode.LineTo(5.42f, 4.92f),
                    PathNode.LineTo(8.56f, 4.92f),
                    PathNode.LineTo(8.56f, 8.06f),
                    PathNode.LineTo(5.42f, 8.06f),
                    PathNode.Close,
                    PathNode.MoveTo(5.4f, 3.59f),
                    PathNode.CurveTo(5.05f, 3.59f, 4.72f, 3.73f, 4.47f, 3.97f),
                    PathNode.CurveTo(4.23f, 4.22f, 4.1f, 4.55f, 4.1f, 4.9f),
                    PathNode.LineTo(4.1f, 8.09f),
                    PathNode.CurveTo(4.1f, 8.43f, 4.23f, 8.76f, 4.47f, 9.0f),
                    PathNode.CurveTo(4.72f, 9.25f, 5.05f, 9.39f, 5.4f, 9.39f),
                    PathNode.LineTo(9.22f, 9.39f),
                    PathNode.LineTo(9.89f, 9.39f),
                    PathNode.LineTo(9.89f, 8.72f),
                    PathNode.LineTo(9.89f, 4.9f),
                    PathNode.CurveTo(9.89f, 4.55f, 9.75f, 4.22f, 9.51f, 3.97f),
                    PathNode.CurveTo(9.26f, 3.73f, 8.93f, 3.6f, 8.59f, 3.6f),
                    PathNode.LineTo(5.39f, 3.6f),
                    PathNode.Close,
                    PathNode.MoveTo(12.44f, 15.07f),
                    PathNode.LineTo(12.44f, 11.94f),
                    PathNode.LineTo(15.58f, 11.94f),
                    PathNode.LineTo(15.58f, 15.07f),
                    PathNode.LineTo(12.44f, 15.07f),
                    PathNode.Close,
                    PathNode.MoveTo(11.49f, 16.02f),
                    PathNode.CurveTo(11.74f, 16.27f, 12.07f, 16.4f, 12.41f, 16.4f),
                    PathNode.LineTo(15.61f, 16.4f),
                    PathNode.CurveTo(15.95f, 16.4f, 16.28f, 16.27f, 16.53f, 16.02f),
                    PathNode.CurveTo(16.77f, 15.78f, 16.91f, 15.44f, 16.91f, 15.1f),
                    PathNode.LineTo(16.91f, 11.9f),
                    PathNode.CurveTo(16.91f, 11.56f, 16.77f, 11.23f, 16.53f, 10.99f),
                    PathNode.CurveTo(16.28f, 10.74f, 15.95f, 10.6f, 15.6f, 10.6f),
                    PathNode.LineTo(11.78f, 10.6f),
                    PathNode.LineTo(11.11f, 10.6f),
                    PathNode.LineTo(11.11f, 11.27f),
                    PathNode.LineTo(11.11f, 15.1f),
                    PathNode.CurveTo(11.11f, 15.44f, 11.25f, 15.78f, 11.49f, 16.02f),
                    PathNode.Close,
                    PathNode.MoveTo(5.42f, 15.08f),
                    PathNode.LineTo(5.42f, 11.94f),
                    PathNode.LineTo(8.56f, 11.94f),
                    PathNode.LineTo(8.56f, 15.08f),
                    PathNode.LineTo(5.42f, 15.08f),
                    PathNode.Close,
                    PathNode.MoveTo(5.4f, 10.6f),
                    PathNode.CurveTo(5.05f, 10.6f, 4.72f, 10.74f, 4.47f, 10.98f),
                    PathNode.CurveTo(4.23f, 11.23f, 4.09f, 11.56f, 4.09f, 11.9f),
                    PathNode.LineTo(4.09f, 15.1f),
                    PathNode.CurveTo(4.09f, 15.44f, 4.23f, 15.77f, 4.47f, 16.02f),
                    PathNode.CurveTo(4.72f, 16.26f, 5.05f, 16.4f, 5.4f, 16.4f),
                    PathNode.LineTo(8.59f, 16.4f),
                    PathNode.CurveTo(8.93f, 16.4f, 9.26f, 16.26f, 9.51f, 16.02f),
                    PathNode.CurveTo(9.75f, 15.77f, 9.89f, 15.44f, 9.89f, 15.09f),
                    PathNode.LineTo(9.89f, 11.27f),
                    PathNode.LineTo(9.89f, 10.6f),
                    PathNode.LineTo(9.22f, 10.6f),
                    PathNode.LineTo(5.4f, 10.6f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _keyMeta!!
    }

private var _keyMeta: ImageVector? = null
