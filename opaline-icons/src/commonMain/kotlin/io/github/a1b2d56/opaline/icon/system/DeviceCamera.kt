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

/** `icon_camera_in_use` */
val OpalineIcons.System.DeviceCamera: ImageVector
    get() {
        if (_deviceCamera != null) return _deviceCamera!!
        _deviceCamera = ImageVector.Builder(
            name = "DeviceCamera",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.645f, 21.827f),
                    PathNode.CurveTo(17.645f, 22.569f, 17.043f, 23.172f, 16.301f, 23.172f),
                    PathNode.LineTo(7.699f, 23.172f),
                    PathNode.CurveTo(6.957f, 23.172f, 6.355f, 22.569f, 6.355f, 21.827f),
                    PathNode.LineTo(6.355f, 19.662f),
                    PathNode.CurveTo(8.0f, 20.665f, 9.932f, 21.243f, 11.999f, 21.243f),
                    PathNode.CurveTo(14.067f, 21.243f, 16.0f, 20.665f, 17.645f, 19.661f),
                    PathNode.LineTo(17.645f, 21.827f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.041f, 10.387f),
                    PathNode.CurveTo(3.041f, 15.335f, 7.052f, 19.346f, 12.001f, 19.346f),
                    PathNode.CurveTo(16.949f, 19.346f, 20.96f, 15.335f, 20.96f, 10.387f),
                    PathNode.CurveTo(20.96f, 5.439f, 16.949f, 1.428f, 12.001f, 1.428f),
                    PathNode.CurveTo(7.052f, 1.427f, 3.041f, 5.439f, 3.041f, 10.387f),
                    PathNode.Close,
                ),
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.632f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.002f, 6.375f),
                    PathNode.CurveTo(14.167f, 6.375f, 15.923f, 8.13f, 15.923f, 10.295f),
                    PathNode.CurveTo(15.923f, 12.46f, 14.167f, 14.215f, 12.002f, 14.215f),
                    PathNode.CurveTo(9.837f, 14.215f, 8.082f, 12.46f, 8.082f, 10.295f),
                    PathNode.CurveTo(8.082f, 8.13f, 9.837f, 6.375f, 12.002f, 6.375f),
                    PathNode.Close,
                    PathNode.MoveTo(13.489f, 7.867f),
                    PathNode.CurveTo(12.97f, 7.867f, 12.549f, 8.288f, 12.549f, 8.808f),
                    PathNode.CurveTo(12.549f, 9.327f, 12.97f, 9.748f, 13.489f, 9.748f),
                    PathNode.CurveTo(14.009f, 9.748f, 14.431f, 9.327f, 14.431f, 8.808f),
                    PathNode.CurveTo(14.431f, 8.288f, 14.009f, 7.867f, 13.489f, 7.867f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.003f, 3.574f),
                    PathNode.CurveTo(15.714f, 3.574f, 18.722f, 6.583f, 18.723f, 10.294f),
                    PathNode.CurveTo(18.723f, 14.005f, 15.714f, 17.014f, 12.003f, 17.014f),
                    PathNode.CurveTo(8.292f, 17.014f, 5.283f, 14.005f, 5.283f, 10.294f),
                    PathNode.CurveTo(5.283f, 6.582f, 8.292f, 3.574f, 12.003f, 3.574f),
                    PathNode.Close,
                    PathNode.MoveTo(13.49f, 7.866f),
                    PathNode.CurveTo(12.971f, 7.866f, 12.55f, 8.287f, 12.55f, 8.806f),
                    PathNode.CurveTo(12.55f, 9.326f, 12.971f, 9.747f, 13.49f, 9.747f),
                    PathNode.CurveTo(14.01f, 9.747f, 14.432f, 9.326f, 14.432f, 8.806f),
                    PathNode.CurveTo(14.432f, 8.287f, 14.01f, 7.866f, 13.49f, 7.866f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceCamera!!
    }

private var _deviceCamera: ImageVector? = null
