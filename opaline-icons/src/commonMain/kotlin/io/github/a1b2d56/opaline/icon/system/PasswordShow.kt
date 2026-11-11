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

/** `coui_btn_eye_on` */
val OpalineIcons.System.PasswordShow: ImageVector
    get() {
        if (_passwordShow != null) return _passwordShow!!
        _passwordShow = ImageVector.Builder(
            name = "PasswordShow",
            defaultWidth = 34.0f.dp,
            defaultHeight = 34.0f.dp,
            viewportWidth = 34.0f,
            viewportHeight = 34.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 17.001f),
                    PathNode.CurveTo(12.0f, 27.716f, 21.999f, 27.716f, 27.999f, 17.001f),
                    PathNode.CurveTo(21.999f, 6.286f, 12.0f, 6.286f, 6.0f, 17.001f),
                    PathNode.Close,
                    PathNode.MoveTo(13.983f, 17.003f),
                    PathNode.CurveTo(13.983f, 15.337f, 15.333f, 13.987f, 16.999f, 13.987f),
                    PathNode.CurveTo(18.665f, 13.987f, 20.015f, 15.337f, 20.015f, 17.003f),
                    PathNode.CurveTo(20.015f, 18.669f, 18.665f, 20.019f, 16.999f, 20.019f),
                    PathNode.CurveTo(15.333f, 20.019f, 13.983f, 18.669f, 13.983f, 17.003f),
                    PathNode.Close,
                    PathNode.MoveTo(16.999f, 11.983f),
                    PathNode.CurveTo(14.227f, 11.983f, 11.979f, 14.231f, 11.979f, 17.003f),
                    PathNode.CurveTo(11.979f, 19.775f, 14.227f, 22.023f, 16.999f, 22.023f),
                    PathNode.CurveTo(19.771f, 22.023f, 22.019f, 19.775f, 22.019f, 17.003f),
                    PathNode.CurveTo(22.019f, 14.231f, 19.771f, 11.983f, 16.999f, 11.983f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _passwordShow!!
    }

private var _passwordShow: ImageVector? = null
