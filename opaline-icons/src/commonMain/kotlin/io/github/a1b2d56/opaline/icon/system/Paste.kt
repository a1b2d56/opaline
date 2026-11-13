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

/** `oplus_floating_toolbar_menu_icon_paste` */
val OpalineIcons.System.Paste: ImageVector
    get() {
        if (_paste != null) return _paste!!
        _paste = ImageVector.Builder(
            name = "Paste",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.616f, 3.086f),
                    PathNode.CurveTo(6.53f, 3.405f, 6.484f, 3.74f, 6.484f, 4.086f),
                    PathNode.LineTo(6.484f, 4.169f),
                    PathNode.CurveTo(6.484f, 4.491f, 6.746f, 4.753f, 7.068f, 4.753f),
                    PathNode.LineTo(13.734f, 4.753f),
                    PathNode.CurveTo(14.057f, 4.753f, 14.318f, 4.491f, 14.318f, 4.169f),
                    PathNode.LineTo(14.318f, 4.086f),
                    PathNode.CurveTo(14.318f, 3.74f, 14.272f, 3.405f, 14.186f, 3.086f),
                    PathNode.LineTo(16.485f, 3.086f),
                    PathNode.LineTo(16.485f, 15.057f),
                    PathNode.CurveTo(16.485f, 17.193f, 15.105f, 17.753f, 14.605f, 17.753f),
                    PathNode.LineTo(3.706f, 17.753f),
                    PathNode.CurveTo(4.036f, 17.148f, 4.318f, 16.272f, 4.318f, 15.057f),
                    PathNode.LineTo(4.318f, 3.086f),
                    PathNode.LineTo(6.616f, 3.086f),
                    PathNode.Close,
                    PathNode.MoveTo(7.155f, 1.919f),
                    PathNode.CurveTo(7.846f, 0.913f, 9.005f, 0.253f, 10.318f, 0.253f),
                    PathNode.LineTo(10.484f, 0.253f),
                    PathNode.CurveTo(11.797f, 0.253f, 12.956f, 0.913f, 13.647f, 1.919f),
                    PathNode.LineTo(17.068f, 1.919f),
                    PathNode.CurveTo(17.39f, 1.919f, 17.651f, 2.18f, 17.651f, 2.503f),
                    PathNode.LineTo(17.651f, 15.057f),
                    PathNode.CurveTo(17.651f, 17.839f, 15.747f, 18.919f, 14.605f, 18.919f),
                    PathNode.LineTo(2.484f, 18.919f),
                    PathNode.CurveTo(2.226f, 18.919f, 1.999f, 18.75f, 1.925f, 18.503f),
                    PathNode.CurveTo(1.852f, 18.258f, 1.947f, 17.995f, 2.157f, 17.853f),
                    PathNode.LineTo(3.152f, 2.503f),
                    PathNode.LineTo(2.163f, 17.848f),
                    PathNode.LineTo(2.158f, 17.853f),
                    PathNode.LineTo(2.16f, 17.851f),
                    PathNode.LineTo(2.162f, 17.85f),
                    PathNode.LineTo(2.163f, 17.849f),
                    PathNode.LineTo(2.163f, 17.848f),
                    PathNode.LineTo(2.175f, 17.84f),
                    PathNode.CurveTo(2.194f, 17.824f, 2.228f, 17.796f, 2.271f, 17.753f),
                    PathNode.CurveTo(2.357f, 17.669f, 2.483f, 17.526f, 2.612f, 17.315f),
                    PathNode.CurveTo(2.867f, 16.896f, 3.152f, 16.182f, 3.152f, 15.057f),
                    PathNode.LineTo(3.152f, 2.503f),
                    PathNode.CurveTo(3.152f, 2.18f, 3.413f, 1.919f, 3.735f, 1.919f),
                    PathNode.LineTo(7.155f, 1.919f),
                    PathNode.Close,
                    PathNode.MoveTo(13.104f, 3.586f),
                    PathNode.LineTo(7.698f, 3.586f),
                    PathNode.CurveTo(7.932f, 2.352f, 9.016f, 1.419f, 10.318f, 1.419f),
                    PathNode.LineTo(10.484f, 1.419f),
                    PathNode.CurveTo(11.786f, 1.419f, 12.87f, 2.352f, 13.104f, 3.586f),
                    PathNode.Close,
                    PathNode.MoveTo(10.984f, 7.503f),
                    PathNode.CurveTo(10.984f, 7.18f, 10.723f, 6.919f, 10.401f, 6.919f),
                    PathNode.CurveTo(10.079f, 6.919f, 9.818f, 7.18f, 9.818f, 7.503f),
                    PathNode.LineTo(9.818f, 10.253f),
                    PathNode.LineTo(7.068f, 10.253f),
                    PathNode.CurveTo(6.746f, 10.253f, 6.484f, 10.514f, 6.484f, 10.836f),
                    PathNode.CurveTo(6.484f, 11.158f, 6.746f, 11.419f, 7.068f, 11.419f),
                    PathNode.LineTo(9.818f, 11.419f),
                    PathNode.LineTo(9.818f, 14.169f),
                    PathNode.CurveTo(9.818f, 14.491f, 10.079f, 14.753f, 10.401f, 14.753f),
                    PathNode.CurveTo(10.723f, 14.753f, 10.984f, 14.491f, 10.984f, 14.169f),
                    PathNode.LineTo(10.984f, 11.419f),
                    PathNode.LineTo(13.734f, 11.419f),
                    PathNode.CurveTo(14.057f, 11.419f, 14.318f, 11.158f, 14.318f, 10.836f),
                    PathNode.CurveTo(14.318f, 10.514f, 14.057f, 10.253f, 13.734f, 10.253f),
                    PathNode.LineTo(10.984f, 10.253f),
                    PathNode.LineTo(10.984f, 7.503f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _paste!!
    }

private var _paste: ImageVector? = null
