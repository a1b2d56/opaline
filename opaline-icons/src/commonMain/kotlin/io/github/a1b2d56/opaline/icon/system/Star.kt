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

/** `mms_dr_menu_lock` */
val OpalineIcons.System.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = ImageVector.Builder(
            name = "Star",
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
                    PathNode.LineTo(15.18f, 7.523f),
                    PathNode.CurveTo(15.189f, 7.549f, 15.196f, 7.571f, 15.203f, 7.592f),
                    PathNode.CurveTo(15.224f, 7.592f, 15.248f, 7.592f, 15.275f, 7.592f),
                    PathNode.LineTo(20.981f, 7.592f),
                    PathNode.CurveTo(21.329f, 7.592f, 21.633f, 7.592f, 21.867f, 7.611f),
                    PathNode.CurveTo(22.063f, 7.627f, 22.427f, 7.665f, 22.695f, 7.917f),
                    PathNode.CurveTo(22.995f, 8.198f, 23.13f, 8.613f, 23.053f, 9.017f),
                    PathNode.CurveTo(22.984f, 9.378f, 22.711f, 9.623f, 22.563f, 9.751f),
                    PathNode.CurveTo(22.385f, 9.904f, 22.138f, 10.083f, 21.857f, 10.288f),
                    PathNode.LineTo(17.241f, 13.641f),
                    PathNode.CurveTo(17.219f, 13.657f, 17.2f, 13.671f, 17.182f, 13.684f),
                    PathNode.CurveTo(17.189f, 13.704f, 17.196f, 13.727f, 17.205f, 13.753f),
                    PathNode.LineTo(18.968f, 19.179f),
                    PathNode.CurveTo(19.075f, 19.51f, 19.169f, 19.799f, 19.223f, 20.028f),
                    PathNode.CurveTo(19.268f, 20.219f, 19.345f, 20.577f, 19.188f, 20.91f),
                    PathNode.CurveTo(19.013f, 21.282f, 18.66f, 21.538f, 18.253f, 21.59f),
                    PathNode.CurveTo(17.888f, 21.636f, 17.571f, 21.452f, 17.403f, 21.35f),
                    PathNode.CurveTo(17.202f, 21.229f, 16.956f, 21.049f, 16.674f, 20.845f),
                    PathNode.LineTo(12.059f, 17.492f),
                    PathNode.CurveTo(12.037f, 17.476f, 12.017f, 17.461f, 12.0f, 17.449f),
                    PathNode.CurveTo(11.983f, 17.461f, 11.963f, 17.476f, 11.941f, 17.492f),
                    PathNode.LineTo(7.326f, 20.845f),
                    PathNode.CurveTo(7.044f, 21.049f, 6.798f, 21.229f, 6.597f, 21.35f),
                    PathNode.CurveTo(6.429f, 21.452f, 6.112f, 21.636f, 5.747f, 21.59f),
                    PathNode.CurveTo(5.34f, 21.538f, 4.987f, 21.282f, 4.812f, 20.91f),
                    PathNode.CurveTo(4.655f, 20.577f, 4.732f, 20.219f, 4.777f, 20.028f),
                    PathNode.CurveTo(4.831f, 19.799f, 4.925f, 19.51f, 5.032f, 19.179f),
                    PathNode.LineTo(6.795f, 13.753f),
                    PathNode.CurveTo(6.804f, 13.727f, 6.811f, 13.704f, 6.818f, 13.684f),
                    PathNode.CurveTo(6.8f, 13.671f, 6.781f, 13.657f, 6.759f, 13.641f),
                    PathNode.LineTo(2.143f, 10.288f),
                    PathNode.CurveTo(1.862f, 10.083f, 1.616f, 9.904f, 1.438f, 9.751f),
                    PathNode.CurveTo(1.289f, 9.623f, 1.016f, 9.378f, 0.947f, 9.017f),
                    PathNode.CurveTo(0.87f, 8.613f, 1.005f, 8.198f, 1.305f, 7.917f),
                    PathNode.CurveTo(1.573f, 7.665f, 1.937f, 7.627f, 2.133f, 7.611f),
                    PathNode.CurveTo(2.367f, 7.592f, 2.671f, 7.592f, 3.019f, 7.592f),
                    PathNode.LineTo(8.725f, 7.592f),
                    PathNode.CurveTo(8.752f, 7.592f, 8.776f, 7.592f, 8.797f, 7.592f),
                    PathNode.CurveTo(8.804f, 7.571f, 8.811f, 7.549f, 8.82f, 7.523f),
                    PathNode.LineTo(10.583f, 2.097f),
                    PathNode.CurveTo(10.69f, 1.766f, 10.784f, 1.476f, 10.875f, 1.259f),
                    PathNode.CurveTo(10.951f, 1.078f, 11.099f, 0.744f, 11.422f, 0.566f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 2.267f),
                    PathNode.CurveTo(11.972f, 2.353f, 11.94f, 2.45f, 11.905f, 2.558f),
                    PathNode.LineTo(10.151f, 7.955f),
                    PathNode.CurveTo(10.147f, 7.968f, 10.142f, 7.983f, 10.138f, 7.998f),
                    PathNode.CurveTo(10.091f, 8.144f, 10.018f, 8.374f, 9.867f, 8.557f),
                    PathNode.CurveTo(9.738f, 8.712f, 9.572f, 8.833f, 9.384f, 8.907f),
                    PathNode.CurveTo(9.164f, 8.995f, 8.923f, 8.993f, 8.769f, 8.992f),
                    PathNode.CurveTo(8.753f, 8.992f, 8.738f, 8.992f, 8.725f, 8.992f),
                    PathNode.LineTo(3.049f, 8.992f),
                    PathNode.CurveTo(2.936f, 8.992f, 2.834f, 8.992f, 2.743f, 8.992f),
                    PathNode.CurveTo(2.817f, 9.046f, 2.899f, 9.106f, 2.991f, 9.173f),
                    PathNode.LineTo(7.582f, 12.508f),
                    PathNode.CurveTo(7.593f, 12.517f, 7.605f, 12.525f, 7.618f, 12.534f),
                    PathNode.CurveTo(7.743f, 12.624f, 7.939f, 12.764f, 8.066f, 12.964f),
                    PathNode.CurveTo(8.174f, 13.135f, 8.238f, 13.33f, 8.251f, 13.532f),
                    PathNode.CurveTo(8.265f, 13.769f, 8.189f, 13.997f, 8.141f, 14.143f),
                    PathNode.CurveTo(8.136f, 14.158f, 8.131f, 14.172f, 8.127f, 14.185f),
                    PathNode.LineTo(6.373f, 19.583f),
                    PathNode.CurveTo(6.338f, 19.691f, 6.307f, 19.788f, 6.279f, 19.874f),
                    PathNode.CurveTo(6.353f, 19.821f, 6.435f, 19.761f, 6.527f, 19.695f),
                    PathNode.LineTo(11.118f, 16.359f),
                    PathNode.CurveTo(11.13f, 16.351f, 11.142f, 16.342f, 11.154f, 16.333f),
                    PathNode.CurveTo(11.278f, 16.241f, 11.472f, 16.098f, 11.702f, 16.039f),
                    PathNode.CurveTo(11.897f, 15.989f, 12.103f, 15.989f, 12.298f, 16.039f),
                    PathNode.CurveTo(12.528f, 16.098f, 12.722f, 16.241f, 12.846f, 16.333f),
                    PathNode.CurveTo(12.858f, 16.342f, 12.87f, 16.351f, 12.882f, 16.359f),
                    PathNode.LineTo(17.473f, 19.695f),
                    PathNode.CurveTo(17.565f, 19.761f, 17.647f, 19.821f, 17.721f, 19.874f),
                    PathNode.CurveTo(17.693f, 19.788f, 17.662f, 19.691f, 17.627f, 19.583f),
                    PathNode.LineTo(15.873f, 14.185f),
                    PathNode.CurveTo(15.869f, 14.172f, 15.864f, 14.158f, 15.859f, 14.143f),
                    PathNode.CurveTo(15.811f, 13.997f, 15.734f, 13.768f, 15.749f, 13.532f),
                    PathNode.CurveTo(15.762f, 13.33f, 15.825f, 13.135f, 15.934f, 12.964f),
                    PathNode.CurveTo(16.061f, 12.764f, 16.257f, 12.624f, 16.382f, 12.534f),
                    PathNode.CurveTo(16.395f, 12.525f, 16.407f, 12.517f, 16.418f, 12.508f),
                    PathNode.LineTo(21.009f, 9.173f),
                    PathNode.CurveTo(21.101f, 9.106f, 21.184f, 9.046f, 21.257f, 8.992f),
                    PathNode.CurveTo(21.166f, 8.992f, 21.064f, 8.992f, 20.951f, 8.992f),
                    PathNode.LineTo(15.275f, 8.992f),
                    PathNode.CurveTo(15.262f, 8.992f, 15.247f, 8.992f, 15.231f, 8.992f),
                    PathNode.CurveTo(15.077f, 8.993f, 14.836f, 8.995f, 14.616f, 8.907f),
                    PathNode.CurveTo(14.428f, 8.833f, 14.262f, 8.712f, 14.133f, 8.557f),
                    PathNode.CurveTo(13.982f, 8.374f, 13.909f, 8.144f, 13.862f, 7.998f),
                    PathNode.CurveTo(13.858f, 7.983f, 13.853f, 7.968f, 13.849f, 7.955f),
                    PathNode.LineTo(12.095f, 2.558f),
                    PathNode.CurveTo(12.06f, 2.45f, 12.028f, 2.353f, 12.0f, 2.267f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _star!!
    }

private var _star: ImageVector? = null
