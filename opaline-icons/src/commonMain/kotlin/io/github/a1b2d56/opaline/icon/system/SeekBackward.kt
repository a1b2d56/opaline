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

/** `ic_backward` */
val OpalineIcons.System.SeekBackward: ImageVector
    get() {
        if (_seekBackward != null) return _seekBackward!!
        _seekBackward = ImageVector.Builder(
            name = "SeekBackward",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.006f, 17.632f),
                    PathNode.CurveTo(11.145f, 17.632f, 10.43f, 17.427f, 9.859f, 17.017f),
                    PathNode.CurveTo(9.296f, 16.607f, 8.946f, 16.068f, 8.81f, 15.401f),
                    PathNode.LineTo(10.317f, 14.93f),
                    PathNode.CurveTo(10.422f, 15.381f, 10.615f, 15.722f, 10.896f, 15.956f),
                    PathNode.CurveTo(11.186f, 16.181f, 11.559f, 16.293f, 12.018f, 16.293f),
                    PathNode.CurveTo(12.5f, 16.293f, 12.874f, 16.14f, 13.139f, 15.835f),
                    PathNode.CurveTo(13.405f, 15.529f, 13.537f, 15.139f, 13.537f, 14.665f),
                    PathNode.CurveTo(13.537f, 14.207f, 13.405f, 13.841f, 13.139f, 13.568f),
                    PathNode.CurveTo(12.874f, 13.294f, 12.496f, 13.158f, 12.006f, 13.158f),
                    PathNode.CurveTo(11.499f, 13.158f, 11.041f, 13.31f, 10.631f, 13.616f),
                    PathNode.LineTo(9.871f, 12.687f),
                    PathNode.LineTo(12.681f, 10.07f),
                    PathNode.LineTo(12.681f, 10.034f),
                    PathNode.LineTo(9.22f, 10.034f),
                    PathNode.LineTo(9.22f, 8.743f),
                    PathNode.LineTo(14.743f, 8.743f),
                    PathNode.LineTo(14.743f, 9.877f),
                    PathNode.LineTo(12.283f, 12.108f),
                    PathNode.LineTo(12.307f, 12.144f),
                    PathNode.CurveTo(12.42f, 12.112f, 12.552f, 12.096f, 12.705f, 12.096f),
                    PathNode.CurveTo(13.18f, 12.096f, 13.606f, 12.205f, 13.984f, 12.422f),
                    PathNode.CurveTo(14.362f, 12.631f, 14.655f, 12.928f, 14.864f, 13.314f),
                    PathNode.CurveTo(15.081f, 13.692f, 15.19f, 14.122f, 15.19f, 14.605f),
                    PathNode.CurveTo(15.19f, 15.208f, 15.053f, 15.738f, 14.78f, 16.197f),
                    PathNode.CurveTo(14.506f, 16.655f, 14.128f, 17.009f, 13.646f, 17.258f),
                    PathNode.CurveTo(13.164f, 17.507f, 12.617f, 17.632f, 12.006f, 17.632f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.628f, 0.215f),
                    PathNode.CurveTo(12.922f, 0.003f, 13.333f, 0.213f, 13.333f, 0.575f),
                    PathNode.LineTo(13.333f, 2.687f),
                    PathNode.CurveTo(18.331f, 3.34f, 22.19f, 7.612f, 22.19f, 12.787f),
                    PathNode.CurveTo(22.19f, 18.415f, 17.627f, 22.978f, 12.0f, 22.978f),
                    PathNode.CurveTo(6.372f, 22.977f, 1.81f, 18.415f, 1.81f, 12.787f),
                    PathNode.CurveTo(1.81f, 9.937f, 2.981f, 7.359f, 4.867f, 5.511f),
                    PathNode.CurveTo(5.182f, 5.201f, 5.689f, 5.206f, 5.999f, 5.521f),
                    PathNode.CurveTo(6.308f, 5.837f, 6.302f, 6.344f, 5.987f, 6.653f),
                    PathNode.CurveTo(4.396f, 8.213f, 3.41f, 10.384f, 3.41f, 12.787f),
                    PathNode.CurveTo(3.41f, 17.531f, 7.256f, 21.378f, 12.0f, 21.378f),
                    PathNode.CurveTo(16.743f, 21.378f, 20.59f, 17.531f, 20.59f, 12.787f),
                    PathNode.CurveTo(20.59f, 8.497f, 17.444f, 4.941f, 13.333f, 4.3f),
                    PathNode.LineTo(13.333f, 6.535f),
                    PathNode.CurveTo(13.333f, 6.898f, 12.922f, 7.108f, 12.628f, 6.896f),
                    PathNode.LineTo(8.5f, 3.916f),
                    PathNode.CurveTo(8.254f, 3.739f, 8.254f, 3.373f, 8.5f, 3.195f),
                    PathNode.LineTo(12.628f, 0.215f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _seekBackward!!
    }

private var _seekBackward: ImageVector? = null
