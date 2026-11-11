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

/** `systemui_icon_volume_odi_captions` */
val OpalineIcons.System.Captions: ImageVector
    get() {
        if (_captions != null) return _captions!!
        _captions = ImageVector.Builder(
            name = "Captions",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.47f, 5.34f),
                    PathNode.CurveTo(18.1f, 5.34f, 18.62f, 5.34f, 19.04f, 5.38f),
                    PathNode.CurveTo(19.47f, 5.41f, 19.86f, 5.48f, 20.22f, 5.66f),
                    PathNode.CurveTo(20.84f, 5.96f, 21.34f, 6.46f, 21.64f, 7.08f),
                    PathNode.CurveTo(21.82f, 7.44f, 21.89f, 7.83f, 21.92f, 8.26f),
                    PathNode.CurveTo(21.96f, 8.68f, 21.96f, 9.2f, 21.96f, 9.84f),
                    PathNode.LineTo(21.96f, 15.25f),
                    PathNode.CurveTo(21.96f, 15.89f, 21.96f, 16.41f, 21.92f, 16.83f),
                    PathNode.CurveTo(21.89f, 17.26f, 21.82f, 17.65f, 21.64f, 18.01f),
                    PathNode.CurveTo(21.34f, 18.62f, 20.84f, 19.12f, 20.22f, 19.43f),
                    PathNode.CurveTo(19.86f, 19.6f, 19.47f, 19.68f, 19.04f, 19.71f),
                    PathNode.CurveTo(18.62f, 19.74f, 18.1f, 19.74f, 17.47f, 19.74f),
                    PathNode.LineTo(6.54f, 19.74f),
                    PathNode.CurveTo(5.9f, 19.74f, 5.38f, 19.74f, 4.96f, 19.71f),
                    PathNode.CurveTo(4.53f, 19.68f, 4.15f, 19.61f, 3.78f, 19.43f),
                    PathNode.CurveTo(3.17f, 19.13f, 2.67f, 18.63f, 2.36f, 18.01f),
                    PathNode.CurveTo(2.19f, 17.64f, 2.11f, 17.26f, 2.08f, 16.83f),
                    PathNode.CurveTo(2.05f, 16.41f, 2.05f, 15.89f, 2.05f, 15.25f),
                    PathNode.LineTo(2.05f, 9.84f),
                    PathNode.CurveTo(2.05f, 9.2f, 2.05f, 8.68f, 2.08f, 8.26f),
                    PathNode.CurveTo(2.11f, 7.83f, 2.18f, 7.44f, 2.36f, 7.08f),
                    PathNode.CurveTo(2.66f, 6.46f, 3.16f, 5.96f, 3.78f, 5.66f),
                    PathNode.CurveTo(4.15f, 5.48f, 4.53f, 5.41f, 4.96f, 5.38f),
                    PathNode.CurveTo(5.38f, 5.34f, 5.9f, 5.34f, 6.54f, 5.34f),
                    PathNode.LineTo(17.47f, 5.34f),
                    PathNode.Close,
                    PathNode.MoveTo(5.79f, 15.58f),
                    PathNode.CurveTo(5.41f, 15.58f, 5.09f, 15.88f, 5.09f, 16.28f),
                    PathNode.CurveTo(5.09f, 16.66f, 5.41f, 16.98f, 5.79f, 16.98f),
                    PathNode.LineTo(9.79f, 16.98f),
                    PathNode.CurveTo(10.19f, 16.98f, 10.49f, 16.66f, 10.49f, 16.28f),
                    PathNode.CurveTo(10.49f, 15.88f, 10.19f, 15.58f, 9.79f, 15.58f),
                    PathNode.LineTo(5.79f, 15.58f),
                    PathNode.Close,
                    PathNode.MoveTo(12.49f, 15.58f),
                    PathNode.CurveTo(12.11f, 15.58f, 11.79f, 15.88f, 11.79f, 16.28f),
                    PathNode.CurveTo(11.79f, 16.66f, 12.11f, 16.98f, 12.49f, 16.98f),
                    PathNode.LineTo(14.49f, 16.98f),
                    PathNode.CurveTo(14.89f, 16.98f, 15.19f, 16.66f, 15.19f, 16.28f),
                    PathNode.CurveTo(15.19f, 15.88f, 14.89f, 15.58f, 14.49f, 15.58f),
                    PathNode.LineTo(12.49f, 15.58f),
                    PathNode.Close,
                    PathNode.MoveTo(17.2f, 15.58f),
                    PathNode.CurveTo(16.81f, 15.58f, 16.5f, 15.88f, 16.5f, 16.28f),
                    PathNode.CurveTo(16.5f, 16.66f, 16.81f, 16.98f, 17.2f, 16.98f),
                    PathNode.LineTo(18.2f, 16.98f),
                    PathNode.CurveTo(18.59f, 16.98f, 18.9f, 16.66f, 18.9f, 16.28f),
                    PathNode.CurveTo(18.9f, 15.88f, 18.59f, 15.58f, 18.2f, 15.58f),
                    PathNode.LineTo(17.2f, 15.58f),
                    PathNode.Close,
                    PathNode.MoveTo(5.8f, 12.54f),
                    PathNode.CurveTo(5.41f, 12.54f, 5.1f, 12.86f, 5.1f, 13.24f),
                    PathNode.CurveTo(5.1f, 13.64f, 5.41f, 13.94f, 5.8f, 13.94f),
                    PathNode.LineTo(6.8f, 13.94f),
                    PathNode.CurveTo(7.19f, 13.94f, 7.5f, 13.64f, 7.5f, 13.24f),
                    PathNode.CurveTo(7.5f, 12.86f, 7.19f, 12.54f, 6.8f, 12.54f),
                    PathNode.LineTo(5.8f, 12.54f),
                    PathNode.Close,
                    PathNode.MoveTo(9.5f, 12.54f),
                    PathNode.CurveTo(9.12f, 12.54f, 8.8f, 12.86f, 8.8f, 13.24f),
                    PathNode.CurveTo(8.8f, 13.64f, 9.12f, 13.94f, 9.5f, 13.94f),
                    PathNode.LineTo(11.5f, 13.94f),
                    PathNode.CurveTo(11.89f, 13.94f, 12.2f, 13.64f, 12.2f, 13.24f),
                    PathNode.CurveTo(12.2f, 12.86f, 11.89f, 12.54f, 11.5f, 12.54f),
                    PathNode.LineTo(9.5f, 12.54f),
                    PathNode.Close,
                    PathNode.MoveTo(14.2f, 12.54f),
                    PathNode.CurveTo(13.82f, 12.54f, 13.5f, 12.86f, 13.5f, 13.24f),
                    PathNode.CurveTo(13.5f, 13.64f, 13.82f, 13.94f, 14.2f, 13.94f),
                    PathNode.LineTo(18.2f, 13.94f),
                    PathNode.CurveTo(18.6f, 13.94f, 18.9f, 13.64f, 18.9f, 13.24f),
                    PathNode.CurveTo(18.9f, 12.86f, 18.6f, 12.54f, 18.2f, 12.54f),
                    PathNode.LineTo(14.2f, 12.54f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _captions!!
    }

private var _captions: ImageVector? = null
