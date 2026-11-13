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

/** `mms_dr_menu_unlock` */
val OpalineIcons.System.StarFill: ImageVector
    get() {
        if (_starFill != null) return _starFill!!
        _starFill = ImageVector.Builder(
            name = "StarFill",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.578f, 0.566f),
                    PathNode.CurveTo(12.218f, 0.368f, 11.782f, 0.368f, 11.422f, 0.566f),
                    PathNode.CurveTo(11.099f, 0.744f, 10.951f, 1.078f, 10.875f, 1.259f),
                    PathNode.CurveTo(10.784f, 1.476f, 10.69f, 1.766f, 10.583f, 2.097f),
                    PathNode.LineTo(8.797f, 7.592f),
                    PathNode.LineTo(3.019f, 7.592f),
                    PathNode.CurveTo(2.671f, 7.592f, 2.367f, 7.592f, 2.133f, 7.611f),
                    PathNode.CurveTo(1.937f, 7.627f, 1.573f, 7.665f, 1.305f, 7.917f),
                    PathNode.CurveTo(1.005f, 8.198f, 0.87f, 8.613f, 0.947f, 9.017f),
                    PathNode.CurveTo(1.016f, 9.378f, 1.289f, 9.623f, 1.438f, 9.751f),
                    PathNode.CurveTo(1.616f, 9.904f, 1.862f, 10.083f, 2.143f, 10.288f),
                    PathNode.LineTo(6.818f, 13.684f),
                    PathNode.LineTo(5.032f, 19.179f),
                    PathNode.CurveTo(4.925f, 19.51f, 4.831f, 19.799f, 4.777f, 20.028f),
                    PathNode.CurveTo(4.732f, 20.219f, 4.655f, 20.577f, 4.812f, 20.91f),
                    PathNode.CurveTo(4.987f, 21.282f, 5.34f, 21.538f, 5.747f, 21.59f),
                    PathNode.CurveTo(6.112f, 21.636f, 6.429f, 21.452f, 6.597f, 21.35f),
                    PathNode.CurveTo(6.798f, 21.229f, 7.044f, 21.049f, 7.326f, 20.845f),
                    PathNode.LineTo(12.0f, 17.449f),
                    PathNode.LineTo(16.674f, 20.845f),
                    PathNode.CurveTo(16.956f, 21.049f, 17.202f, 21.229f, 17.403f, 21.35f),
                    PathNode.CurveTo(17.571f, 21.452f, 17.888f, 21.636f, 18.253f, 21.59f),
                    PathNode.CurveTo(18.66f, 21.538f, 19.013f, 21.282f, 19.188f, 20.91f),
                    PathNode.CurveTo(19.345f, 20.577f, 19.268f, 20.219f, 19.223f, 20.028f),
                    PathNode.CurveTo(19.169f, 19.799f, 19.075f, 19.51f, 18.968f, 19.179f),
                    PathNode.LineTo(17.182f, 13.684f),
                    PathNode.LineTo(21.857f, 10.288f),
                    PathNode.CurveTo(22.138f, 10.083f, 22.385f, 9.904f, 22.563f, 9.751f),
                    PathNode.CurveTo(22.711f, 9.623f, 22.984f, 9.378f, 23.053f, 9.017f),
                    PathNode.CurveTo(23.13f, 8.613f, 22.995f, 8.198f, 22.695f, 7.917f),
                    PathNode.CurveTo(22.427f, 7.665f, 22.063f, 7.627f, 21.867f, 7.611f),
                    PathNode.CurveTo(21.633f, 7.592f, 21.329f, 7.592f, 20.981f, 7.592f),
                    PathNode.LineTo(15.203f, 7.592f),
                    PathNode.LineTo(13.417f, 2.097f),
                    PathNode.CurveTo(13.31f, 1.766f, 13.216f, 1.476f, 13.125f, 1.259f),
                    PathNode.CurveTo(13.049f, 1.078f, 12.901f, 0.744f, 12.578f, 0.566f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _starFill!!
    }

private var _starFill: ImageVector? = null
