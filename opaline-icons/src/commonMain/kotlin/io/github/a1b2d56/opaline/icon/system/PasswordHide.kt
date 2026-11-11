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

/** `coui_btn_eye_off` */
val OpalineIcons.System.PasswordHide: ImageVector
    get() {
        if (_passwordHide != null) return _passwordHide!!
        _passwordHide = ImageVector.Builder(
            name = "PasswordHide",
            defaultWidth = 34.0f.dp,
            defaultHeight = 34.0f.dp,
            viewportWidth = 34.0f,
            viewportHeight = 34.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.706f, 6.734f),
                    PathNode.CurveTo(6.315f, 7.124f, 6.315f, 7.757f, 6.706f, 8.148f),
                    PathNode.LineTo(10.245f, 11.686f),
                    PathNode.CurveTo(8.702f, 12.992f, 7.263f, 14.773f, 6.0f, 17.028f),
                    PathNode.CurveTo(10.299f, 24.705f, 16.652f, 26.882f, 22.115f, 23.557f),
                    PathNode.LineTo(25.824f, 27.266f),
                    PathNode.CurveTo(26.215f, 27.657f, 26.848f, 27.657f, 27.239f, 27.266f),
                    PathNode.CurveTo(27.629f, 26.876f, 27.629f, 26.243f, 27.239f, 25.852f),
                    PathNode.LineTo(8.12f, 6.734f),
                    PathNode.CurveTo(7.73f, 6.343f, 7.096f, 6.343f, 6.706f, 6.734f),
                    PathNode.Close,
                    PathNode.MoveTo(19.772f, 21.214f),
                    PathNode.LineTo(18.306f, 19.748f),
                    PathNode.CurveTo(17.911f, 19.939f, 17.468f, 20.046f, 16.999f, 20.046f),
                    PathNode.CurveTo(15.333f, 20.046f, 13.983f, 18.695f, 13.983f, 17.029f),
                    PathNode.CurveTo(13.983f, 16.561f, 14.09f, 16.118f, 14.28f, 15.722f),
                    PathNode.LineTo(12.814f, 14.256f),
                    PathNode.CurveTo(12.286f, 15.051f, 11.979f, 16.004f, 11.979f, 17.029f),
                    PathNode.CurveTo(11.979f, 19.802f, 14.227f, 22.049f, 16.999f, 22.049f),
                    PathNode.CurveTo(18.024f, 22.049f, 18.978f, 21.742f, 19.772f, 21.214f),
                    PathNode.Close,
                    PathNode.MoveTo(16.819f, 14.019f),
                    PathNode.LineTo(20.01f, 17.209f),
                    PathNode.CurveTo(20.013f, 17.15f, 20.015f, 17.09f, 20.015f, 17.029f),
                    PathNode.CurveTo(20.015f, 15.364f, 18.665f, 14.013f, 16.999f, 14.013f),
                    PathNode.CurveTo(16.939f, 14.013f, 16.879f, 14.015f, 16.819f, 14.019f),
                    PathNode.Close,
                    PathNode.MoveTo(22.019f, 17.029f),
                    PathNode.CurveTo(22.019f, 17.679f, 21.896f, 18.3f, 21.671f, 18.87f),
                    PathNode.LineTo(24.496f, 21.696f),
                    PathNode.CurveTo(25.759f, 20.473f, 26.941f, 18.917f, 27.999f, 17.028f),
                    PathNode.CurveTo(23.937f, 9.774f, 18.044f, 7.431f, 12.798f, 9.997f),
                    PathNode.LineTo(15.158f, 12.358f),
                    PathNode.CurveTo(15.728f, 12.133f, 16.349f, 12.009f, 16.999f, 12.009f),
                    PathNode.CurveTo(19.771f, 12.009f, 22.019f, 14.257f, 22.019f, 17.029f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _passwordHide!!
    }

private var _passwordHide: ImageVector? = null
