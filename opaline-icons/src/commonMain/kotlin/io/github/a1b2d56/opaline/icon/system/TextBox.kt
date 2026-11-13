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

/** `de_convert` */
val OpalineIcons.System.TextBox: ImageVector
    get() {
        if (_textBox != null) return _textBox!!
        _textBox = ImageVector.Builder(
            name = "TextBox",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.404f, 1.909f),
                    PathNode.CurveTo(17.336f, 1.91f, 18.091f, 2.665f, 18.092f, 3.597f),
                    PathNode.LineTo(18.092f, 16.403f),
                    PathNode.CurveTo(18.092f, 17.335f, 17.336f, 18.09f, 16.404f, 18.091f),
                    PathNode.LineTo(3.598f, 18.091f),
                    PathNode.CurveTo(2.666f, 18.091f, 1.91f, 17.335f, 1.91f, 16.403f),
                    PathNode.LineTo(1.91f, 3.597f),
                    PathNode.CurveTo(1.91f, 2.665f, 2.666f, 1.909f, 3.598f, 1.909f),
                    PathNode.LineTo(16.404f, 1.909f),
                    PathNode.Close,
                    PathNode.MoveTo(3.598f, 3.091f),
                    PathNode.CurveTo(3.318f, 3.091f, 3.092f, 3.317f, 3.092f, 3.597f),
                    PathNode.LineTo(3.092f, 16.403f),
                    PathNode.CurveTo(3.092f, 16.683f, 3.318f, 16.909f, 3.598f, 16.909f),
                    PathNode.LineTo(16.404f, 16.909f),
                    PathNode.CurveTo(16.684f, 16.909f, 16.91f, 16.683f, 16.91f, 16.403f),
                    PathNode.LineTo(16.91f, 3.597f),
                    PathNode.CurveTo(16.91f, 3.318f, 16.683f, 3.091f, 16.404f, 3.091f),
                    PathNode.LineTo(3.598f, 3.091f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.748f, 5.611f),
                    PathNode.CurveTo(13.981f, 5.612f, 14.17f, 5.801f, 14.17f, 6.033f),
                    PathNode.LineTo(14.17f, 7.018f),
                    PathNode.CurveTo(14.17f, 7.25f, 13.981f, 7.439f, 13.748f, 7.439f),
                    PathNode.LineTo(13.622f, 7.439f),
                    PathNode.CurveTo(13.508f, 7.439f, 13.4f, 7.393f, 13.32f, 7.312f),
                    PathNode.LineTo(13.296f, 7.287f),
                    PathNode.CurveTo(12.978f, 6.962f, 12.542f, 6.778f, 12.088f, 6.777f),
                    PathNode.LineTo(10.835f, 6.777f),
                    PathNode.LineTo(10.835f, 12.021f),
                    PathNode.CurveTo(10.835f, 12.433f, 11.068f, 12.811f, 11.436f, 12.995f),
                    PathNode.CurveTo(11.578f, 13.066f, 11.668f, 13.211f, 11.668f, 13.369f),
                    PathNode.LineTo(11.668f, 13.856f),
                    PathNode.CurveTo(11.668f, 14.088f, 11.479f, 14.277f, 11.246f, 14.277f),
                    PathNode.LineTo(8.757f, 14.277f),
                    PathNode.CurveTo(8.524f, 14.277f, 8.335f, 14.088f, 8.335f, 13.856f),
                    PathNode.LineTo(8.335f, 13.369f),
                    PathNode.CurveTo(8.335f, 13.211f, 8.425f, 13.066f, 8.566f, 12.995f),
                    PathNode.CurveTo(8.935f, 12.811f, 9.168f, 12.433f, 9.168f, 12.021f),
                    PathNode.LineTo(9.168f, 6.777f),
                    PathNode.LineTo(7.919f, 6.777f),
                    PathNode.CurveTo(7.464f, 6.777f, 7.029f, 6.962f, 6.711f, 7.287f),
                    PathNode.LineTo(6.687f, 7.312f),
                    PathNode.CurveTo(6.607f, 7.393f, 6.498f, 7.439f, 6.385f, 7.439f),
                    PathNode.LineTo(6.258f, 7.439f),
                    PathNode.CurveTo(6.025f, 7.439f, 5.836f, 7.25f, 5.836f, 7.018f),
                    PathNode.LineTo(5.836f, 6.033f),
                    PathNode.CurveTo(5.836f, 5.8f, 6.025f, 5.612f, 6.258f, 5.611f),
                    PathNode.LineTo(13.748f, 5.611f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _textBox!!
    }

private var _textBox: ImageVector? = null
