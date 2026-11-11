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

/** `coui_number_keyboard_delete` */
val OpalineIcons.System.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = ImageVector.Builder(
            name = "Backspace",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.056f, 5.074f),
                    PathNode.LineTo(20.769f, 5.074f),
                    PathNode.CurveTo(21.213f, 5.074f, 21.639f, 5.251f, 21.953f, 5.565f),
                    PathNode.CurveTo(22.267f, 5.879f, 22.444f, 6.305f, 22.444f, 6.749f),
                    PathNode.LineTo(22.444f, 17.25f),
                    PathNode.CurveTo(22.444f, 17.694f, 22.267f, 18.12f, 21.953f, 18.434f),
                    PathNode.CurveTo(21.639f, 18.748f, 21.213f, 18.924f, 20.769f, 18.924f),
                    PathNode.LineTo(8.056f, 18.924f),
                    PathNode.CurveTo(7.809f, 18.924f, 7.565f, 18.869f, 7.342f, 18.764f),
                    PathNode.CurveTo(7.118f, 18.659f, 6.921f, 18.505f, 6.764f, 18.315f),
                    PathNode.LineTo(1.974f, 12.509f),
                    PathNode.LineTo(1.554f, 11.999f),
                    PathNode.LineTo(1.974f, 11.49f),
                    PathNode.LineTo(6.764f, 5.684f),
                    PathNode.LineTo(6.764f, 5.684f),
                    PathNode.CurveTo(6.921f, 5.493f, 7.118f, 5.34f, 7.342f, 5.235f),
                    PathNode.CurveTo(7.565f, 5.129f, 7.809f, 5.075f, 8.056f, 5.074f),
                    PathNode.Close,
                    PathNode.MoveTo(8.057f, 6.674f),
                    PathNode.CurveTo(8.046f, 6.674f, 8.035f, 6.677f, 8.025f, 6.682f),
                    PathNode.CurveTo(8.015f, 6.686f, 8.006f, 6.693f, 7.999f, 6.702f),
                    PathNode.LineTo(7.999f, 6.702f),
                    PathNode.LineTo(3.628f, 11.999f),
                    PathNode.LineTo(7.999f, 17.297f),
                    PathNode.LineTo(7.999f, 17.297f),
                    PathNode.CurveTo(8.006f, 17.306f, 8.015f, 17.313f, 8.025f, 17.317f),
                    PathNode.CurveTo(8.035f, 17.322f, 8.046f, 17.325f, 8.057f, 17.325f),
                    PathNode.LineTo(20.769f, 17.325f),
                    PathNode.CurveTo(20.789f, 17.325f, 20.808f, 17.317f, 20.822f, 17.302f),
                    PathNode.CurveTo(20.836f, 17.288f, 20.844f, 17.269f, 20.844f, 17.25f),
                    PathNode.LineTo(20.844f, 6.749f),
                    PathNode.CurveTo(20.844f, 6.73f, 20.836f, 6.71f, 20.822f, 6.696f),
                    PathNode.CurveTo(20.808f, 6.682f, 20.789f, 6.674f, 20.769f, 6.674f),
                    PathNode.LineTo(8.057f, 6.674f),
                    PathNode.Close,
                    PathNode.MoveTo(14.9f, 11.999f),
                    PathNode.LineTo(17.397f, 14.496f),
                    PathNode.LineTo(16.266f, 15.628f),
                    PathNode.LineTo(13.769f, 13.131f),
                    PathNode.LineTo(11.272f, 15.628f),
                    PathNode.LineTo(10.141f, 14.496f),
                    PathNode.LineTo(12.638f, 11.999f),
                    PathNode.LineTo(10.141f, 9.503f),
                    PathNode.LineTo(11.272f, 8.371f),
                    PathNode.LineTo(13.769f, 10.868f),
                    PathNode.LineTo(16.266f, 8.371f),
                    PathNode.LineTo(17.397f, 9.503f),
                    PathNode.LineTo(14.9f, 11.999f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
