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

/** `pb_dr_voice_mail_normal` */
val OpalineIcons.System.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = ImageVector.Builder(
            name = "Voicemail",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.723f, 6.67f),
                    PathNode.CurveTo(21.666f, 6.67f, 24.052f, 9.057f, 24.052f, 12.0f),
                    PathNode.CurveTo(24.052f, 14.851f, 21.812f, 17.179f, 18.996f, 17.322f),
                    PathNode.LineTo(18.723f, 17.329f),
                    PathNode.LineTo(5.282f, 17.329f),
                    PathNode.LineTo(5.282f, 17.328f),
                    PathNode.LineTo(5.281f, 17.329f),
                    PathNode.CurveTo(2.338f, 17.329f, -0.049f, 14.943f, -0.049f, 12.0f),
                    PathNode.CurveTo(-0.049f, 9.056f, 2.338f, 6.67f, 5.281f, 6.67f),
                    PathNode.CurveTo(8.225f, 6.67f, 10.61f, 9.056f, 10.61f, 12.0f),
                    PathNode.CurveTo(10.61f, 13.403f, 10.068f, 14.678f, 9.182f, 15.63f),
                    PathNode.LineTo(14.821f, 15.63f),
                    PathNode.CurveTo(13.935f, 14.678f, 13.393f, 13.403f, 13.393f, 12.0f),
                    PathNode.CurveTo(13.393f, 9.056f, 15.779f, 6.67f, 18.723f, 6.67f),
                    PathNode.Close,
                    PathNode.MoveTo(5.281f, 8.369f),
                    PathNode.CurveTo(3.277f, 8.369f, 1.65f, 9.995f, 1.65f, 12.0f),
                    PathNode.CurveTo(1.651f, 14.004f, 3.277f, 15.63f, 5.281f, 15.63f),
                    PathNode.CurveTo(7.286f, 15.63f, 8.911f, 14.004f, 8.911f, 12.0f),
                    PathNode.CurveTo(8.911f, 9.995f, 7.286f, 8.369f, 5.281f, 8.369f),
                    PathNode.Close,
                    PathNode.MoveTo(18.723f, 8.369f),
                    PathNode.CurveTo(16.718f, 8.369f, 15.092f, 9.995f, 15.092f, 12.0f),
                    PathNode.CurveTo(15.092f, 14.004f, 16.718f, 15.63f, 18.723f, 15.63f),
                    PathNode.CurveTo(20.727f, 15.629f, 22.352f, 14.004f, 22.353f, 12.0f),
                    PathNode.CurveTo(22.353f, 9.995f, 20.727f, 8.37f, 18.723f, 8.369f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
