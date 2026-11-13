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

/** `pb_ic_cloud_synced` */
val OpalineIcons.System.CloudDone: ImageVector
    get() {
        if (_cloudDone != null) return _cloudDone!!
        _cloudDone = ImageVector.Builder(
            name = "CloudDone",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.204f, 9.633f),
                    PathNode.CurveTo(6.394f, 6.601f, 8.913f, 4.201f, 11.993f, 4.201f),
                    PathNode.CurveTo(15.073f, 4.201f, 17.592f, 6.601f, 17.781f, 9.633f),
                    PathNode.CurveTo(17.802f, 9.954f, 18.038f, 10.22f, 18.355f, 10.278f),
                    PathNode.CurveTo(20.595f, 10.684f, 22.293f, 12.645f, 22.293f, 15.001f),
                    PathNode.CurveTo(22.293f, 17.652f, 20.144f, 19.801f, 17.493f, 19.801f),
                    PathNode.LineTo(6.493f, 19.801f),
                    PathNode.CurveTo(3.842f, 19.801f, 1.693f, 17.652f, 1.693f, 15.001f),
                    PathNode.CurveTo(1.693f, 12.645f, 3.391f, 10.684f, 5.631f, 10.278f),
                    PathNode.CurveTo(5.948f, 10.22f, 6.184f, 9.954f, 6.204f, 9.633f),
                    PathNode.Close,
                    PathNode.MoveTo(11.993f, 2.801f),
                    PathNode.CurveTo(8.35f, 2.801f, 5.339f, 5.506f, 4.859f, 9.018f),
                    PathNode.CurveTo(2.228f, 9.735f, 0.293f, 12.142f, 0.293f, 15.001f),
                    PathNode.CurveTo(0.293f, 18.425f, 3.069f, 21.201f, 6.493f, 21.201f),
                    PathNode.LineTo(17.493f, 21.201f),
                    PathNode.CurveTo(20.917f, 21.201f, 23.693f, 18.425f, 23.693f, 15.001f),
                    PathNode.CurveTo(23.693f, 12.142f, 21.758f, 9.736f, 19.126f, 9.018f),
                    PathNode.CurveTo(18.647f, 5.506f, 15.636f, 2.801f, 11.993f, 2.801f),
                    PathNode.Close,
                    PathNode.MoveTo(15.997f, 11.991f),
                    PathNode.CurveTo(16.266f, 11.714f, 16.26f, 11.271f, 15.983f, 11.001f),
                    PathNode.CurveTo(15.706f, 10.731f, 15.263f, 10.737f, 14.993f, 11.014f),
                    PathNode.LineTo(10.449f, 15.683f),
                    PathNode.LineTo(8.365f, 13.599f),
                    PathNode.CurveTo(8.092f, 13.325f, 7.648f, 13.325f, 7.375f, 13.599f),
                    PathNode.CurveTo(7.102f, 13.872f, 7.102f, 14.315f, 7.375f, 14.589f),
                    PathNode.LineTo(9.961f, 17.174f),
                    PathNode.CurveTo(10.093f, 17.307f, 10.273f, 17.381f, 10.46f, 17.379f),
                    PathNode.CurveTo(10.648f, 17.378f, 10.827f, 17.302f, 10.957f, 17.168f),
                    PathNode.LineTo(15.997f, 11.991f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _cloudDone!!
    }

private var _cloudDone: ImageVector? = null
