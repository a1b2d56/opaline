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

/** `mms_dr_menu_favorite_remove` */
val OpalineIcons.System.StarOff: ImageVector
    get() {
        if (_starOff != null) return _starOff!!
        _starOff = ImageVector.Builder(
            name = "StarOff",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.422f, 0.566f),
                    PathNode.CurveTo(11.782f, 0.368f, 12.218f, 0.368f, 12.578f, 0.566f),
                    PathNode.CurveTo(12.901f, 0.744f, 13.049f, 1.078f, 13.125f, 1.259f),
                    PathNode.CurveTo(13.216f, 1.476f, 13.31f, 1.766f, 13.417f, 2.097f),
                    PathNode.LineTo(15.203f, 7.592f),
                    PathNode.LineTo(20.981f, 7.592f),
                    PathNode.CurveTo(21.329f, 7.592f, 21.633f, 7.592f, 21.867f, 7.611f),
                    PathNode.CurveTo(22.063f, 7.627f, 22.427f, 7.665f, 22.695f, 7.917f),
                    PathNode.CurveTo(22.995f, 8.198f, 23.13f, 8.613f, 23.053f, 9.017f),
                    PathNode.CurveTo(22.984f, 9.378f, 22.712f, 9.623f, 22.563f, 9.751f),
                    PathNode.CurveTo(22.385f, 9.904f, 22.138f, 10.083f, 21.857f, 10.287f),
                    PathNode.LineTo(17.182f, 13.684f),
                    PathNode.LineTo(17.963f, 16.086f),
                    PathNode.LineTo(22.489f, 20.499f),
                    PathNode.CurveTo(22.765f, 20.769f, 22.771f, 21.212f, 22.501f, 21.489f),
                    PathNode.CurveTo(22.231f, 21.765f, 21.788f, 21.771f, 21.511f, 21.501f),
                    PathNode.LineTo(18.893f, 18.948f),
                    PathNode.LineTo(18.894f, 18.952f),
                    PathNode.LineTo(16.74f, 16.854f),
                    PathNode.LineTo(16.738f, 16.847f),
                    PathNode.LineTo(8.681f, 8.992f),
                    PathNode.LineTo(8.668f, 8.992f),
                    PathNode.LineTo(7.231f, 7.592f),
                    PathNode.LineTo(7.245f, 7.592f),
                    PathNode.LineTo(1.511f, 2.001f),
                    PathNode.CurveTo(1.235f, 1.731f, 1.229f, 1.288f, 1.499f, 1.011f),
                    PathNode.CurveTo(1.769f, 0.734f, 2.212f, 0.729f, 2.489f, 0.999f),
                    PathNode.LineTo(8.906f, 7.256f),
                    PathNode.LineTo(10.583f, 2.097f),
                    PathNode.CurveTo(10.69f, 1.766f, 10.784f, 1.476f, 10.875f, 1.259f),
                    PathNode.CurveTo(10.951f, 1.078f, 11.099f, 0.744f, 11.422f, 0.566f),
                    PathNode.Close,
                    PathNode.MoveTo(10.01f, 8.332f),
                    PathNode.LineTo(15.81f, 13.987f),
                    PathNode.CurveTo(15.773f, 13.856f, 15.739f, 13.696f, 15.75f, 13.532f),
                    PathNode.CurveTo(15.762f, 13.33f, 15.826f, 13.135f, 15.934f, 12.964f),
                    PathNode.CurveTo(16.061f, 12.764f, 16.257f, 12.624f, 16.382f, 12.534f),
                    PathNode.LineTo(16.418f, 12.508f),
                    PathNode.LineTo(21.009f, 9.173f),
                    PathNode.CurveTo(21.101f, 9.106f, 21.184f, 9.046f, 21.257f, 8.992f),
                    PathNode.CurveTo(21.166f, 8.992f, 21.065f, 8.992f, 20.951f, 8.992f),
                    PathNode.LineTo(15.276f, 8.992f),
                    PathNode.LineTo(15.231f, 8.992f),
                    PathNode.CurveTo(15.077f, 8.993f, 14.836f, 8.995f, 14.616f, 8.907f),
                    PathNode.CurveTo(14.428f, 8.833f, 14.262f, 8.712f, 14.133f, 8.557f),
                    PathNode.CurveTo(13.982f, 8.374f, 13.909f, 8.144f, 13.863f, 7.998f),
                    PathNode.LineTo(13.849f, 7.955f),
                    PathNode.LineTo(12.095f, 2.558f),
                    PathNode.CurveTo(12.06f, 2.45f, 12.029f, 2.353f, 12.0f, 2.267f),
                    PathNode.CurveTo(11.972f, 2.353f, 11.94f, 2.45f, 11.905f, 2.558f),
                    PathNode.LineTo(10.151f, 7.955f),
                    PathNode.LineTo(10.138f, 7.998f),
                    PathNode.CurveTo(10.109f, 8.088f, 10.071f, 8.209f, 10.01f, 8.332f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.08f, 21.0f),
                    PathNode.CurveTo(18.888f, 21.273f, 18.591f, 21.547f, 18.253f, 21.59f),
                    PathNode.CurveTo(17.888f, 21.636f, 17.571f, 21.452f, 17.403f, 21.35f),
                    PathNode.CurveTo(17.202f, 21.229f, 16.956f, 21.049f, 16.674f, 20.845f),
                    PathNode.LineTo(12.0f, 17.449f),
                    PathNode.LineTo(7.326f, 20.845f),
                    PathNode.CurveTo(7.044f, 21.049f, 6.798f, 21.229f, 6.597f, 21.35f),
                    PathNode.CurveTo(6.429f, 21.452f, 6.113f, 21.636f, 5.747f, 21.59f),
                    PathNode.CurveTo(5.34f, 21.538f, 4.987f, 21.282f, 4.812f, 20.91f),
                    PathNode.CurveTo(4.655f, 20.577f, 4.732f, 20.219f, 4.777f, 20.028f),
                    PathNode.CurveTo(4.831f, 19.799f, 4.925f, 19.51f, 5.033f, 19.179f),
                    PathNode.LineTo(6.818f, 13.684f),
                    PathNode.LineTo(2.144f, 10.288f),
                    PathNode.CurveTo(1.862f, 10.083f, 1.616f, 9.904f, 1.438f, 9.751f),
                    PathNode.CurveTo(1.289f, 9.623f, 1.017f, 9.378f, 0.948f, 9.017f),
                    PathNode.CurveTo(0.871f, 8.613f, 1.005f, 8.198f, 1.305f, 7.917f),
                    PathNode.CurveTo(1.573f, 7.665f, 1.937f, 7.627f, 2.133f, 7.611f),
                    PathNode.CurveTo(2.367f, 7.592f, 2.672f, 7.592f, 3.019f, 7.592f),
                    PathNode.LineTo(5.224f, 7.592f),
                    PathNode.LineTo(6.662f, 8.992f),
                    PathNode.LineTo(3.05f, 8.992f),
                    PathNode.CurveTo(2.936f, 8.992f, 2.834f, 8.992f, 2.743f, 8.992f),
                    PathNode.CurveTo(2.817f, 9.046f, 2.899f, 9.106f, 2.991f, 9.173f),
                    PathNode.LineTo(7.582f, 12.508f),
                    PathNode.LineTo(7.618f, 12.534f),
                    PathNode.CurveTo(7.743f, 12.624f, 7.939f, 12.764f, 8.066f, 12.964f),
                    PathNode.CurveTo(8.175f, 13.135f, 8.238f, 13.33f, 8.251f, 13.532f),
                    PathNode.CurveTo(8.266f, 13.769f, 8.19f, 13.997f, 8.141f, 14.143f),
                    PathNode.LineTo(8.127f, 14.185f),
                    PathNode.LineTo(6.373f, 19.583f),
                    PathNode.CurveTo(6.338f, 19.691f, 6.307f, 19.788f, 6.279f, 19.874f),
                    PathNode.CurveTo(6.353f, 19.821f, 6.435f, 19.761f, 6.527f, 19.695f),
                    PathNode.LineTo(11.118f, 16.359f),
                    PathNode.LineTo(11.154f, 16.333f),
                    PathNode.CurveTo(11.278f, 16.241f, 11.472f, 16.098f, 11.702f, 16.039f),
                    PathNode.CurveTo(11.898f, 15.989f, 12.103f, 15.989f, 12.299f, 16.039f),
                    PathNode.CurveTo(12.528f, 16.098f, 12.722f, 16.241f, 12.846f, 16.333f),
                    PathNode.LineTo(12.882f, 16.359f),
                    PathNode.LineTo(17.473f, 19.695f),
                    PathNode.CurveTo(17.473f, 19.695f, 18.536f, 20.47f, 19.08f, 21.0f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _starOff!!
    }

private var _starOff: ImageVector? = null
