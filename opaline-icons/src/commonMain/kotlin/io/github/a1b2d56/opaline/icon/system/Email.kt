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

/** `pb_dr_menu_email_normal` */
val OpalineIcons.System.Email: ImageVector
    get() {
        if (_email != null) return _email!!
        _email = ImageVector.Builder(
            name = "Email",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.081f, 3.301f),
                    PathNode.LineTo(4.054f, 3.301f),
                    PathNode.CurveTo(3.713f, 3.301f, 3.416f, 3.301f, 3.17f, 3.321f),
                    PathNode.CurveTo(2.91f, 3.342f, 2.647f, 3.389f, 2.393f, 3.519f),
                    PathNode.CurveTo(2.017f, 3.711f, 1.711f, 4.016f, 1.519f, 4.393f),
                    PathNode.CurveTo(1.389f, 4.647f, 1.342f, 4.91f, 1.321f, 5.17f),
                    PathNode.CurveTo(1.301f, 5.415f, 1.301f, 5.713f, 1.301f, 6.054f),
                    PathNode.LineTo(1.301f, 6.054f),
                    PathNode.LineTo(1.301f, 6.081f),
                    PathNode.LineTo(1.301f, 6.991f),
                    PathNode.CurveTo(1.301f, 6.997f, 1.301f, 7.003f, 1.301f, 7.009f),
                    PathNode.LineTo(1.301f, 17.921f),
                    PathNode.LineTo(1.301f, 17.947f),
                    PathNode.CurveTo(1.301f, 18.289f, 1.301f, 18.586f, 1.321f, 18.832f),
                    PathNode.CurveTo(1.342f, 19.092f, 1.389f, 19.355f, 1.519f, 19.609f),
                    PathNode.CurveTo(1.711f, 19.985f, 2.017f, 20.291f, 2.393f, 20.483f),
                    PathNode.CurveTo(2.647f, 20.612f, 2.91f, 20.66f, 3.17f, 20.681f),
                    PathNode.CurveTo(3.416f, 20.701f, 3.713f, 20.701f, 4.054f, 20.701f),
                    PathNode.LineTo(4.081f, 20.701f),
                    PathNode.LineTo(19.921f, 20.701f),
                    PathNode.LineTo(19.947f, 20.701f),
                    PathNode.CurveTo(20.289f, 20.701f, 20.586f, 20.701f, 20.832f, 20.681f),
                    PathNode.CurveTo(21.092f, 20.66f, 21.355f, 20.612f, 21.609f, 20.483f),
                    PathNode.CurveTo(21.985f, 20.291f, 22.291f, 19.985f, 22.483f, 19.609f),
                    PathNode.CurveTo(22.612f, 19.355f, 22.66f, 19.092f, 22.681f, 18.832f),
                    PathNode.CurveTo(22.701f, 18.586f, 22.701f, 18.289f, 22.701f, 17.947f),
                    PathNode.LineTo(22.701f, 17.921f),
                    PathNode.LineTo(22.701f, 7.009f),
                    PathNode.CurveTo(22.701f, 7.003f, 22.701f, 6.997f, 22.701f, 6.991f),
                    PathNode.LineTo(22.701f, 6.081f),
                    PathNode.LineTo(22.701f, 6.054f),
                    PathNode.CurveTo(22.701f, 5.713f, 22.701f, 5.416f, 22.681f, 5.17f),
                    PathNode.CurveTo(22.66f, 4.91f, 22.612f, 4.647f, 22.483f, 4.393f),
                    PathNode.CurveTo(22.291f, 4.016f, 21.985f, 3.711f, 21.609f, 3.519f),
                    PathNode.CurveTo(21.355f, 3.389f, 21.092f, 3.342f, 20.832f, 3.321f),
                    PathNode.CurveTo(20.586f, 3.301f, 20.289f, 3.301f, 19.947f, 3.301f),
                    PathNode.LineTo(19.921f, 3.301f),
                    PathNode.LineTo(4.081f, 3.301f),
                    PathNode.Close,
                    PathNode.MoveTo(21.301f, 6.636f),
                    PathNode.LineTo(21.301f, 6.081f),
                    PathNode.CurveTo(21.301f, 5.705f, 21.3f, 5.466f, 21.285f, 5.284f),
                    PathNode.CurveTo(21.271f, 5.11f, 21.248f, 5.052f, 21.235f, 5.028f),
                    PathNode.CurveTo(21.178f, 4.915f, 21.086f, 4.824f, 20.973f, 4.766f),
                    PathNode.CurveTo(20.949f, 4.754f, 20.891f, 4.73f, 20.718f, 4.716f),
                    PathNode.CurveTo(20.536f, 4.701f, 20.296f, 4.701f, 19.921f, 4.701f),
                    PathNode.LineTo(4.081f, 4.701f),
                    PathNode.CurveTo(3.705f, 4.701f, 3.466f, 4.701f, 3.284f, 4.716f),
                    PathNode.CurveTo(3.111f, 4.73f, 3.052f, 4.754f, 3.028f, 4.766f),
                    PathNode.CurveTo(2.916f, 4.824f, 2.824f, 4.915f, 2.766f, 5.028f),
                    PathNode.CurveTo(2.754f, 5.052f, 2.73f, 5.11f, 2.716f, 5.284f),
                    PathNode.CurveTo(2.701f, 5.466f, 2.701f, 5.705f, 2.701f, 6.081f),
                    PathNode.LineTo(2.701f, 6.636f),
                    PathNode.LineTo(10.2f, 11.886f),
                    PathNode.CurveTo(11.041f, 12.474f, 11.314f, 12.652f, 11.59f, 12.721f),
                    PathNode.CurveTo(11.86f, 12.788f, 12.142f, 12.788f, 12.412f, 12.721f),
                    PathNode.CurveTo(12.687f, 12.652f, 12.961f, 12.474f, 13.802f, 11.886f),
                    PathNode.LineTo(21.301f, 6.636f),
                    PathNode.Close,
                    PathNode.MoveTo(2.701f, 8.345f),
                    PathNode.LineTo(2.701f, 17.921f),
                    PathNode.CurveTo(2.701f, 18.296f, 2.701f, 18.536f, 2.716f, 18.718f),
                    PathNode.CurveTo(2.73f, 18.891f, 2.754f, 18.949f, 2.766f, 18.973f),
                    PathNode.CurveTo(2.824f, 19.086f, 2.916f, 19.178f, 3.028f, 19.235f),
                    PathNode.CurveTo(3.052f, 19.248f, 3.111f, 19.271f, 3.284f, 19.285f),
                    PathNode.CurveTo(3.466f, 19.3f, 3.705f, 19.301f, 4.081f, 19.301f),
                    PathNode.LineTo(19.921f, 19.301f),
                    PathNode.CurveTo(20.296f, 19.301f, 20.536f, 19.3f, 20.718f, 19.285f),
                    PathNode.CurveTo(20.891f, 19.271f, 20.949f, 19.248f, 20.973f, 19.235f),
                    PathNode.CurveTo(21.086f, 19.178f, 21.178f, 19.086f, 21.235f, 18.973f),
                    PathNode.CurveTo(21.248f, 18.949f, 21.271f, 18.891f, 21.285f, 18.718f),
                    PathNode.CurveTo(21.3f, 18.536f, 21.301f, 18.296f, 21.301f, 17.921f),
                    PathNode.LineTo(21.301f, 8.345f),
                    PathNode.LineTo(14.604f, 13.033f),
                    PathNode.LineTo(14.5f, 13.106f),
                    PathNode.CurveTo(13.809f, 13.59f, 13.311f, 13.94f, 12.751f, 14.079f),
                    PathNode.CurveTo(12.258f, 14.202f, 11.743f, 14.202f, 11.251f, 14.079f),
                    PathNode.CurveTo(10.691f, 13.94f, 10.193f, 13.59f, 9.502f, 13.106f),
                    PathNode.LineTo(9.502f, 13.106f),
                    PathNode.LineTo(9.397f, 13.033f),
                    PathNode.LineTo(2.701f, 8.345f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _email!!
    }

private var _email: ImageVector? = null
