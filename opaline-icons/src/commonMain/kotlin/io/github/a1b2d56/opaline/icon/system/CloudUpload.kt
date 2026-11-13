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

/** `color_tool_menu_ic_upload_cloud` */
val OpalineIcons.System.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) return _cloudUpload!!
        _cloudUpload = ImageVector.Builder(
            name = "CloudUpload",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.211f, 9.632f),
                    PathNode.CurveTo(6.4f, 6.599f, 8.92f, 4.198f, 12.0f, 4.198f),
                    PathNode.CurveTo(15.08f, 4.198f, 17.6f, 6.599f, 17.788f, 9.632f),
                    PathNode.CurveTo(17.809f, 9.953f, 18.045f, 10.219f, 18.362f, 10.277f),
                    PathNode.CurveTo(20.602f, 10.683f, 22.3f, 12.644f, 22.3f, 15.0f),
                    PathNode.CurveTo(22.3f, 17.651f, 20.151f, 19.8f, 17.5f, 19.8f),
                    PathNode.LineTo(14.0f, 19.8f),
                    PathNode.LineTo(14.0f, 21.2f),
                    PathNode.LineTo(17.5f, 21.2f),
                    PathNode.CurveTo(20.924f, 21.2f, 23.7f, 18.424f, 23.7f, 15.0f),
                    PathNode.CurveTo(23.7f, 12.141f, 21.765f, 9.735f, 19.134f, 9.017f),
                    PathNode.CurveTo(18.655f, 5.505f, 15.644f, 2.798f, 12.0f, 2.798f),
                    PathNode.CurveTo(8.356f, 2.798f, 5.345f, 5.505f, 4.866f, 9.017f),
                    PathNode.CurveTo(2.235f, 9.735f, 0.3f, 12.141f, 0.3f, 15.0f),
                    PathNode.CurveTo(0.3f, 18.424f, 3.076f, 21.2f, 6.5f, 21.2f),
                    PathNode.LineTo(10.0f, 21.2f),
                    PathNode.LineTo(10.0f, 19.8f),
                    PathNode.LineTo(6.5f, 19.8f),
                    PathNode.CurveTo(3.849f, 19.8f, 1.7f, 17.651f, 1.7f, 15.0f),
                    PathNode.CurveTo(1.7f, 12.644f, 3.398f, 10.683f, 5.637f, 10.277f),
                    PathNode.CurveTo(5.954f, 10.219f, 6.191f, 9.953f, 6.211f, 9.632f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
