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

/** `pb_dr_detail_sms_normal` */
val OpalineIcons.System.MessagesFill: ImageVector
    get() {
        if (_messagesFill != null) return _messagesFill!!
        _messagesFill = ImageVector.Builder(
            name = "MessagesFill",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.773f, 3.0f),
                    PathNode.CurveTo(18.432f, 3.0f, 18.974f, 2.999f, 19.414f, 3.035f),
                    PathNode.CurveTo(19.863f, 3.072f, 20.276f, 3.151f, 20.663f, 3.348f),
                    PathNode.CurveTo(21.264f, 3.654f, 21.752f, 4.143f, 22.058f, 4.743f),
                    PathNode.CurveTo(22.254f, 5.13f, 22.333f, 5.542f, 22.37f, 5.991f),
                    PathNode.CurveTo(22.406f, 6.431f, 22.405f, 6.973f, 22.405f, 7.632f),
                    PathNode.LineTo(22.405f, 13.05f),
                    PathNode.CurveTo(22.405f, 13.708f, 22.406f, 14.251f, 22.37f, 14.69f),
                    PathNode.CurveTo(22.333f, 15.139f, 22.255f, 15.552f, 22.058f, 15.939f),
                    PathNode.CurveTo(21.752f, 16.539f, 21.263f, 17.028f, 20.663f, 17.334f),
                    PathNode.CurveTo(20.276f, 17.531f, 19.863f, 17.61f, 19.414f, 17.646f),
                    PathNode.CurveTo(18.974f, 17.682f, 18.432f, 17.682f, 17.773f, 17.682f),
                    PathNode.LineTo(13.132f, 17.682f),
                    PathNode.CurveTo(12.579f, 17.682f, 12.416f, 17.685f, 12.269f, 17.717f),
                    PathNode.CurveTo(12.121f, 17.748f, 11.979f, 17.801f, 11.846f, 17.872f),
                    PathNode.CurveTo(11.713f, 17.943f, 11.586f, 18.045f, 11.163f, 18.402f),
                    PathNode.LineTo(7.877f, 21.182f),
                    PathNode.CurveTo(7.699f, 21.332f, 7.524f, 21.481f, 7.373f, 21.587f),
                    PathNode.CurveTo(7.236f, 21.683f, 6.982f, 21.847f, 6.652f, 21.854f),
                    PathNode.CurveTo(6.269f, 21.861f, 5.902f, 21.691f, 5.66f, 21.394f),
                    PathNode.CurveTo(5.452f, 21.137f, 5.414f, 20.837f, 5.398f, 20.67f),
                    PathNode.CurveTo(5.382f, 20.486f, 5.383f, 20.257f, 5.383f, 20.024f),
                    PathNode.LineTo(5.383f, 17.681f),
                    PathNode.CurveTo(4.851f, 17.681f, 4.463f, 17.684f, 4.124f, 17.613f),
                    PathNode.CurveTo(2.886f, 17.353f, 1.919f, 16.385f, 1.658f, 15.148f),
                    PathNode.CurveTo(1.586f, 14.802f, 1.59f, 14.404f, 1.59f, 13.856f),
                    PathNode.LineTo(1.59f, 7.632f),
                    PathNode.CurveTo(1.59f, 6.973f, 1.589f, 6.431f, 1.625f, 5.991f),
                    PathNode.CurveTo(1.662f, 5.542f, 1.741f, 5.13f, 1.937f, 4.743f),
                    PathNode.CurveTo(2.243f, 4.143f, 2.733f, 3.654f, 3.333f, 3.348f),
                    PathNode.CurveTo(3.72f, 3.151f, 4.132f, 3.072f, 4.581f, 3.035f),
                    PathNode.CurveTo(5.021f, 2.999f, 5.563f, 3.0f, 6.222f, 3.0f),
                    PathNode.LineTo(17.773f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.996f, 11.577f),
                    PathNode.CurveTo(7.61f, 11.577f, 7.296f, 11.891f, 7.296f, 12.277f),
                    PathNode.CurveTo(7.296f, 12.664f, 7.61f, 12.977f, 7.996f, 12.977f),
                    PathNode.LineTo(12.996f, 12.977f),
                    PathNode.CurveTo(13.382f, 12.977f, 13.696f, 12.664f, 13.696f, 12.277f),
                    PathNode.CurveTo(13.696f, 11.891f, 13.383f, 11.577f, 12.996f, 11.577f),
                    PathNode.LineTo(7.996f, 11.577f),
                    PathNode.Close,
                    PathNode.MoveTo(7.996f, 7.577f),
                    PathNode.CurveTo(7.61f, 7.577f, 7.296f, 7.891f, 7.296f, 8.277f),
                    PathNode.CurveTo(7.296f, 8.664f, 7.61f, 8.978f, 7.996f, 8.978f),
                    PathNode.LineTo(15.996f, 8.978f),
                    PathNode.CurveTo(16.382f, 8.978f, 16.696f, 8.664f, 16.696f, 8.277f),
                    PathNode.CurveTo(16.696f, 7.891f, 16.383f, 7.577f, 15.996f, 7.577f),
                    PathNode.LineTo(7.996f, 7.577f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _messagesFill!!
    }

private var _messagesFill: ImageVector? = null
