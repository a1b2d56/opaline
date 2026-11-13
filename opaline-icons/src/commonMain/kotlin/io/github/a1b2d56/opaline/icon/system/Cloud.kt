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

/** `icon_tips_calendar_cloud_sync` */
val OpalineIcons.System.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = ImageVector.Builder(
            name = "Cloud",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.817f, 5.004f),
                    PathNode.LineTo(11.817f, 4.304f),
                    PathNode.LineTo(11.817f, 4.304f),
                    PathNode.LineTo(11.817f, 5.004f),
                    PathNode.Close,
                    PathNode.MoveTo(17.124f, 9.985f),
                    PathNode.LineTo(16.425f, 10.029f),
                    PathNode.CurveTo(16.445f, 10.35f, 16.682f, 10.617f, 16.999f, 10.674f),
                    PathNode.LineTo(17.124f, 9.985f),
                    PathNode.Close,
                    PathNode.MoveTo(20.817f, 14.413f),
                    PathNode.LineTo(21.517f, 14.413f),
                    PathNode.LineTo(21.517f, 14.413f),
                    PathNode.LineTo(20.817f, 14.413f),
                    PathNode.Close,
                    PathNode.MoveTo(2.817f, 14.413f),
                    PathNode.LineTo(2.117f, 14.413f),
                    PathNode.LineTo(2.117f, 14.413f),
                    PathNode.LineTo(2.817f, 14.413f),
                    PathNode.Close,
                    PathNode.MoveTo(6.509f, 9.985f),
                    PathNode.LineTo(6.634f, 10.674f),
                    PathNode.CurveTo(6.951f, 10.617f, 7.188f, 10.35f, 7.208f, 10.029f),
                    PathNode.LineTo(6.509f, 9.985f),
                    PathNode.Close,
                    PathNode.MoveTo(11.817f, 5.004f),
                    PathNode.LineTo(11.817f, 5.704f),
                    PathNode.CurveTo(14.269f, 5.704f, 16.274f, 7.615f, 16.425f, 10.029f),
                    PathNode.LineTo(17.124f, 9.985f),
                    PathNode.LineTo(17.822f, 9.942f),
                    PathNode.CurveTo(17.625f, 6.795f, 15.013f, 4.304f, 11.817f, 4.304f),
                    PathNode.LineTo(11.817f, 5.004f),
                    PathNode.Close,
                    PathNode.MoveTo(17.124f, 9.985f),
                    PathNode.LineTo(16.999f, 10.674f),
                    PathNode.CurveTo(18.772f, 10.995f, 20.117f, 12.548f, 20.117f, 14.413f),
                    PathNode.LineTo(20.817f, 14.413f),
                    PathNode.LineTo(21.517f, 14.413f),
                    PathNode.CurveTo(21.517f, 11.858f, 19.676f, 9.736f, 17.248f, 9.296f),
                    PathNode.LineTo(17.124f, 9.985f),
                    PathNode.Close,
                    PathNode.MoveTo(20.817f, 14.413f),
                    PathNode.LineTo(20.117f, 14.413f),
                    PathNode.CurveTo(20.117f, 16.512f, 18.416f, 18.213f, 16.317f, 18.213f),
                    PathNode.LineTo(16.317f, 18.913f),
                    PathNode.LineTo(16.317f, 19.613f),
                    PathNode.CurveTo(19.189f, 19.613f, 21.517f, 17.285f, 21.517f, 14.413f),
                    PathNode.LineTo(20.817f, 14.413f),
                    PathNode.Close,
                    PathNode.MoveTo(16.317f, 18.913f),
                    PathNode.LineTo(16.317f, 18.213f),
                    PathNode.LineTo(7.317f, 18.213f),
                    PathNode.LineTo(7.317f, 18.913f),
                    PathNode.LineTo(7.317f, 19.613f),
                    PathNode.LineTo(16.317f, 19.613f),
                    PathNode.LineTo(16.317f, 18.913f),
                    PathNode.Close,
                    PathNode.MoveTo(7.317f, 18.913f),
                    PathNode.LineTo(7.317f, 18.213f),
                    PathNode.CurveTo(5.218f, 18.213f, 3.517f, 16.512f, 3.517f, 14.413f),
                    PathNode.LineTo(2.817f, 14.413f),
                    PathNode.LineTo(2.117f, 14.413f),
                    PathNode.CurveTo(2.117f, 17.285f, 4.445f, 19.613f, 7.317f, 19.613f),
                    PathNode.LineTo(7.317f, 18.913f),
                    PathNode.Close,
                    PathNode.MoveTo(2.817f, 14.413f),
                    PathNode.LineTo(3.517f, 14.413f),
                    PathNode.CurveTo(3.517f, 12.548f, 4.861f, 10.995f, 6.634f, 10.674f),
                    PathNode.LineTo(6.509f, 9.985f),
                    PathNode.LineTo(6.384f, 9.296f),
                    PathNode.CurveTo(3.958f, 9.736f, 2.117f, 11.859f, 2.117f, 14.413f),
                    PathNode.LineTo(2.817f, 14.413f),
                    PathNode.Close,
                    PathNode.MoveTo(6.509f, 9.985f),
                    PathNode.LineTo(7.208f, 10.029f),
                    PathNode.CurveTo(7.359f, 7.615f, 9.365f, 5.704f, 11.817f, 5.704f),
                    PathNode.LineTo(11.817f, 5.004f),
                    PathNode.LineTo(11.817f, 4.304f),
                    PathNode.CurveTo(8.621f, 4.304f, 6.007f, 6.795f, 5.811f, 9.942f),
                    PathNode.LineTo(6.509f, 9.985f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
