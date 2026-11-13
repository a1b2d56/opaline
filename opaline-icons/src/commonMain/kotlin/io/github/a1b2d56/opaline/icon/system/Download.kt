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

/** `ic_menu_download_new` */
val OpalineIcons.System.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = ImageVector.Builder(
            name = "Download",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.818f, 3.078f),
                    PathNode.CurveTo(12.205f, 3.078f, 12.518f, 3.392f, 12.518f, 3.778f),
                    PathNode.LineTo(12.518f, 12.724f),
                    PathNode.LineTo(13.778f, 11.465f),
                    PathNode.CurveTo(14.051f, 11.191f, 14.495f, 11.191f, 14.768f, 11.465f),
                    PathNode.CurveTo(15.041f, 11.738f, 15.041f, 12.182f, 14.768f, 12.455f),
                    PathNode.LineTo(12.32f, 14.902f),
                    PathNode.CurveTo(12.193f, 15.033f, 12.015f, 15.115f, 11.818f, 15.115f),
                    PathNode.CurveTo(11.709f, 15.115f, 11.606f, 15.089f, 11.513f, 15.045f),
                    PathNode.CurveTo(11.455f, 15.017f, 11.4f, 14.98f, 11.35f, 14.935f),
                    PathNode.CurveTo(11.34f, 14.926f, 11.33f, 14.917f, 11.321f, 14.907f),
                    PathNode.LineTo(8.869f, 12.455f),
                    PathNode.CurveTo(8.595f, 12.182f, 8.595f, 11.738f, 8.869f, 11.465f),
                    PathNode.CurveTo(9.142f, 11.191f, 9.585f, 11.191f, 9.859f, 11.465f),
                    PathNode.LineTo(11.118f, 12.724f),
                    PathNode.LineTo(11.118f, 3.778f),
                    PathNode.CurveTo(11.118f, 3.392f, 11.432f, 3.078f, 11.818f, 3.078f),
                    PathNode.Close,
                    PathNode.MoveTo(9.819f, 6.157f),
                    PathNode.LineTo(9.819f, 4.643f),
                    PathNode.CurveTo(7.751f, 5.37f, 6.201f, 7.194f, 5.866f, 9.417f),
                    PathNode.CurveTo(3.7f, 10.045f, 2.117f, 12.043f, 2.117f, 14.412f),
                    PathNode.CurveTo(2.117f, 17.284f, 4.445f, 19.612f, 7.317f, 19.612f),
                    PathNode.LineTo(16.317f, 19.612f),
                    PathNode.CurveTo(19.189f, 19.612f, 21.517f, 17.284f, 21.517f, 14.412f),
                    PathNode.CurveTo(21.517f, 12.043f, 19.934f, 10.045f, 17.768f, 9.417f),
                    PathNode.CurveTo(17.433f, 7.196f, 15.884f, 5.372f, 13.819f, 4.644f),
                    PathNode.LineTo(13.819f, 6.158f),
                    PathNode.CurveTo(15.284f, 6.864f, 16.319f, 8.32f, 16.426f, 10.028f),
                    PathNode.CurveTo(16.446f, 10.349f, 16.683f, 10.616f, 17.0f, 10.673f),
                    PathNode.CurveTo(18.773f, 10.994f, 20.117f, 12.547f, 20.117f, 14.412f),
                    PathNode.CurveTo(20.117f, 16.511f, 18.416f, 18.212f, 16.317f, 18.212f),
                    PathNode.LineTo(7.317f, 18.212f),
                    PathNode.CurveTo(5.219f, 18.212f, 3.517f, 16.511f, 3.517f, 14.412f),
                    PathNode.CurveTo(3.517f, 12.547f, 4.861f, 10.994f, 6.634f, 10.673f),
                    PathNode.CurveTo(6.951f, 10.616f, 7.188f, 10.349f, 7.208f, 10.028f),
                    PathNode.CurveTo(7.315f, 8.319f, 8.352f, 6.862f, 9.819f, 6.157f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _download!!
    }

private var _download: ImageVector? = null
