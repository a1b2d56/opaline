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

/** `pb_dr_video_call_normal` */
val OpalineIcons.System.VideoCallFill: ImageVector
    get() {
        if (_videoCallFill != null) return _videoCallFill!!
        _videoCallFill = ImageVector.Builder(
            name = "VideoCallFill",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.595f, 4.323f),
                    PathNode.CurveTo(14.252f, 4.323f, 14.797f, 4.322f, 15.24f, 4.358f),
                    PathNode.CurveTo(15.693f, 4.395f, 16.114f, 4.474f, 16.511f, 4.676f),
                    PathNode.CurveTo(17.122f, 4.988f, 17.619f, 5.486f, 17.931f, 6.097f),
                    PathNode.CurveTo(18.132f, 6.493f, 18.212f, 6.914f, 18.249f, 7.367f),
                    PathNode.CurveTo(18.285f, 7.809f, 18.285f, 8.354f, 18.285f, 9.012f),
                    PathNode.LineTo(18.285f, 14.988f),
                    PathNode.CurveTo(18.285f, 15.646f, 18.285f, 16.191f, 18.249f, 16.633f),
                    PathNode.CurveTo(18.212f, 17.086f, 18.132f, 17.507f, 17.931f, 17.903f),
                    PathNode.CurveTo(17.619f, 18.514f, 17.122f, 19.011f, 16.511f, 19.323f),
                    PathNode.CurveTo(16.114f, 19.525f, 15.693f, 19.605f, 15.24f, 19.642f),
                    PathNode.CurveTo(14.798f, 19.678f, 14.252f, 19.677f, 13.595f, 19.677f),
                    PathNode.LineTo(5.669f, 19.677f),
                    PathNode.CurveTo(5.011f, 19.677f, 4.466f, 19.678f, 4.023f, 19.642f),
                    PathNode.CurveTo(3.571f, 19.605f, 3.15f, 19.525f, 2.754f, 19.323f),
                    PathNode.CurveTo(2.143f, 19.011f, 1.645f, 18.514f, 1.333f, 17.903f),
                    PathNode.CurveTo(1.131f, 17.507f, 1.052f, 17.086f, 1.015f, 16.633f),
                    PathNode.CurveTo(0.978f, 16.191f, 0.979f, 15.646f, 0.979f, 14.988f),
                    PathNode.LineTo(0.979f, 9.012f),
                    PathNode.CurveTo(0.979f, 8.354f, 0.979f, 7.809f, 1.015f, 7.367f),
                    PathNode.CurveTo(1.052f, 6.914f, 1.131f, 6.493f, 1.333f, 6.097f),
                    PathNode.CurveTo(1.645f, 5.486f, 2.143f, 4.988f, 2.754f, 4.676f),
                    PathNode.CurveTo(3.15f, 4.475f, 3.571f, 4.395f, 4.023f, 4.358f),
                    PathNode.CurveTo(4.466f, 4.322f, 5.011f, 4.323f, 5.669f, 4.323f),
                    PathNode.LineTo(13.595f, 4.323f),
                    PathNode.Close,
                    PathNode.MoveTo(21.435f, 6.864f),
                    PathNode.CurveTo(22.132f, 6.444f, 23.02f, 6.945f, 23.021f, 7.758f),
                    PathNode.LineTo(23.021f, 16.241f),
                    PathNode.CurveTo(23.02f, 17.054f, 22.132f, 17.555f, 21.435f, 17.135f),
                    PathNode.LineTo(19.534f, 15.988f),
                    PathNode.LineTo(19.534f, 8.01f),
                    PathNode.LineTo(21.435f, 6.864f),
                    PathNode.Close,
                    PathNode.MoveTo(5.464f, 7.651f),
                    PathNode.CurveTo(4.801f, 7.651f, 4.264f, 8.188f, 4.264f, 8.851f),
                    PathNode.CurveTo(4.264f, 9.514f, 4.801f, 10.051f, 5.464f, 10.051f),
                    PathNode.CurveTo(6.126f, 10.051f, 6.663f, 9.514f, 6.663f, 8.851f),
                    PathNode.CurveTo(6.663f, 8.189f, 6.126f, 7.651f, 5.464f, 7.651f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _videoCallFill!!
    }

private var _videoCallFill: ImageVector? = null
