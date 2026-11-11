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

/** `icon_headset_left` */
val OpalineIcons.System.DeviceEarbudLeft: ImageVector
    get() {
        if (_deviceEarbudLeft != null) return _deviceEarbudLeft!!
        _deviceEarbudLeft = ImageVector.Builder(
            name = "DeviceEarbudLeft",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.436f, 6.141f),
                    PathNode.CurveTo(14.029f, 5.928f, 14.641f, 5.939f, 15.196f, 6.119f),
                    PathNode.CurveTo(15.206f, 6.134f, 15.216f, 6.148f, 15.226f, 6.164f),
                    PathNode.CurveTo(15.911f, 6.394f, 16.501f, 6.895f, 16.833f, 7.56f),
                    PathNode.CurveTo(17.45f, 8.795f, 17.519f, 10.252f, 16.809f, 11.482f),
                    PathNode.CurveTo(16.19f, 12.552f, 15.126f, 13.2f, 13.952f, 13.403f),
                    PathNode.CurveTo(13.122f, 13.546f, 12.267f, 13.295f, 11.654f, 12.747f),
                    PathNode.CurveTo(11.632f, 12.744f, 11.609f, 12.739f, 11.586f, 12.736f),
                    PathNode.CurveTo(11.274f, 12.45f, 11.023f, 12.092f, 10.868f, 11.67f),
                    PathNode.CurveTo(10.441f, 10.511f, 10.507f, 9.18f, 11.171f, 8.03f),
                    PathNode.CurveTo(11.698f, 7.117f, 12.513f, 6.473f, 13.436f, 6.141f),
                    PathNode.Close,
                    PathNode.MoveTo(7.632f, 4.362f),
                    PathNode.CurveTo(9.323f, 2.671f, 12.167f, 3.052f, 14.095f, 4.797f),
                    PathNode.CurveTo(13.743f, 4.821f, 13.387f, 4.892f, 13.033f, 5.019f),
                    PathNode.CurveTo(11.857f, 5.442f, 10.813f, 6.266f, 10.139f, 7.434f),
                    PathNode.CurveTo(9.288f, 8.907f, 9.207f, 10.609f, 9.749f, 12.082f),
                    PathNode.CurveTo(9.757f, 12.104f, 9.767f, 12.125f, 9.775f, 12.147f),
                    PathNode.CurveTo(9.238f, 11.866f, 8.729f, 11.498f, 8.28f, 11.049f),
                    PathNode.CurveTo(6.356f, 9.124f, 5.875f, 6.12f, 7.632f, 4.362f),
                    PathNode.Close,
                    PathNode.MoveTo(15.824f, 8.559f),
                    PathNode.CurveTo(15.326f, 8.272f, 14.484f, 8.799f, 13.942f, 9.736f),
                    PathNode.CurveTo(13.401f, 10.673f, 13.365f, 11.667f, 13.863f, 11.955f),
                    PathNode.CurveTo(14.361f, 12.242f, 15.205f, 11.715f, 15.746f, 10.778f),
                    PathNode.CurveTo(16.288f, 9.84f, 16.322f, 8.847f, 15.824f, 8.559f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.498f, 12.765f),
                    PathNode.CurveTo(9.398f, 13.375f, 10.434f, 13.786f, 11.483f, 13.927f),
                    PathNode.CurveTo(11.889f, 14.155f, 12.329f, 14.313f, 12.781f, 14.397f),
                    PathNode.LineTo(12.781f, 18.475f),
                    PathNode.CurveTo(12.781f, 19.658f, 11.822f, 20.617f, 10.64f, 20.617f),
                    PathNode.CurveTo(9.457f, 20.617f, 8.498f, 19.658f, 8.498f, 18.475f),
                    PathNode.LineTo(8.498f, 12.765f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 0.29f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _deviceEarbudLeft!!
    }

private var _deviceEarbudLeft: ImageVector? = null
