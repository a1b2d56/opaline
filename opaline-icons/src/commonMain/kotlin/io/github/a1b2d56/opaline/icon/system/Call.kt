// Copyright 2026, Opaline contributors
// SPDX-License-Identifier: Apache-2.0

package io.github.a1b2d56.opaline.icon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.icon.OpalineIcons

/** `pb_dr_dialer_normal` */
val OpalineIcons.System.Call: ImageVector
    get() {
        if (_call != null) return _call!!
        _call = ImageVector.Builder(
            name = "Call",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.096f, 16.48f),
                    PathNode.LineTo(16.729f, 15.207f),
                    PathNode.LineTo(16.729f, 15.207f),
                    PathNode.CurveTo(16.65f, 15.177f, 16.61f, 15.162f, 16.573f, 15.15f),
                    PathNode.CurveTo(16.066f, 14.989f, 15.511f, 15.107f, 15.115f, 15.462f),
                    PathNode.CurveTo(15.086f, 15.488f, 15.056f, 15.518f, 14.996f, 15.578f),
                    PathNode.LineTo(14.995f, 15.578f),
                    PathNode.CurveTo(14.918f, 15.655f, 14.88f, 15.694f, 14.831f, 15.736f),
                    PathNode.CurveTo(14.199f, 16.289f, 13.158f, 16.37f, 12.447f, 15.922f),
                    PathNode.CurveTo(12.393f, 15.888f, 12.37f, 15.871f, 12.325f, 15.838f),
                    PathNode.CurveTo(11.568f, 15.29f, 10.862f, 14.693f, 10.068f, 13.899f),
                    PathNode.CurveTo(9.274f, 13.105f, 8.677f, 12.399f, 8.129f, 11.642f),
                    PathNode.CurveTo(8.096f, 11.597f, 8.079f, 11.574f, 8.045f, 11.52f),
                    PathNode.CurveTo(7.597f, 10.809f, 7.678f, 9.768f, 8.231f, 9.136f),
                    PathNode.CurveTo(8.273f, 9.087f, 8.312f, 9.049f, 8.389f, 8.971f),
                    PathNode.CurveTo(8.449f, 8.911f, 8.479f, 8.881f, 8.505f, 8.852f),
                    PathNode.CurveTo(8.86f, 8.456f, 8.978f, 7.901f, 8.817f, 7.394f),
                    PathNode.CurveTo(8.805f, 7.357f, 8.79f, 7.317f, 8.76f, 7.238f),
                    PathNode.LineTo(8.76f, 7.238f),
                    PathNode.LineTo(7.504f, 3.917f),
                    PathNode.CurveTo(7.204f, 3.122f, 7.053f, 2.724f, 6.784f, 2.481f),
                    PathNode.CurveTo(6.547f, 2.267f, 6.247f, 2.134f, 5.93f, 2.102f),
                    PathNode.CurveTo(5.568f, 2.066f, 5.173f, 2.221f, 4.381f, 2.532f),
                    PathNode.LineTo(3.674f, 2.81f),
                    PathNode.CurveTo(3.096f, 3.037f, 2.808f, 3.151f, 2.586f, 3.372f),
                    PathNode.CurveTo(2.408f, 3.551f, 2.249f, 3.835f, 2.189f, 4.081f),
                    PathNode.CurveTo(2.116f, 4.385f, 2.163f, 4.65f, 2.257f, 5.181f),
                    PathNode.CurveTo(2.894f, 8.792f, 4.829f, 12.692f, 8.033f, 15.897f),
                    PathNode.CurveTo(11.294f, 19.157f, 15.248f, 21.077f, 18.903f, 21.671f),
                    PathNode.CurveTo(19.437f, 21.758f, 19.705f, 21.802f, 20.009f, 21.723f),
                    PathNode.CurveTo(20.255f, 21.66f, 20.538f, 21.495f, 20.714f, 21.312f),
                    PathNode.CurveTo(20.933f, 21.086f, 21.041f, 20.794f, 21.257f, 20.208f),
                    PathNode.LineTo(21.498f, 19.557f),
                    PathNode.CurveTo(21.788f, 18.774f, 21.932f, 18.383f, 21.891f, 18.027f),
                    PathNode.CurveTo(21.855f, 17.714f, 21.721f, 17.42f, 21.508f, 17.187f),
                    PathNode.CurveTo(21.267f, 16.923f, 20.876f, 16.775f, 20.096f, 16.48f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.7f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _call!!
    }

private var _call: ImageVector? = null
