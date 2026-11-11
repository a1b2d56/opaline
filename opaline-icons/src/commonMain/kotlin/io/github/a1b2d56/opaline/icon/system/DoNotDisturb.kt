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

/** `magic_key_dnd_off_icon` */
val OpalineIcons.System.DoNotDisturb: ImageVector
    get() {
        if (_doNotDisturb != null) return _doNotDisturb!!
        _doNotDisturb = ImageVector.Builder(
            name = "DoNotDisturb",
            defaultWidth = 20.0f.dp,
            defaultHeight = 20.0f.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.136f, 2.96f),
                    PathNode.CurveTo(9.274f, 2.767f, 9.282f, 2.509f, 9.155f, 2.309f),
                    PathNode.CurveTo(9.028f, 2.108f, 8.792f, 2.004f, 8.558f, 2.046f),
                    PathNode.CurveTo(4.782f, 2.727f, 1.917f, 6.029f, 1.917f, 10.001f),
                    PathNode.CurveTo(1.917f, 14.466f, 5.536f, 18.085f, 10.0f, 18.085f),
                    PathNode.CurveTo(13.973f, 18.085f, 17.276f, 15.219f, 17.956f, 11.442f),
                    PathNode.CurveTo(17.998f, 11.208f, 17.894f, 10.972f, 17.693f, 10.845f),
                    PathNode.CurveTo(17.493f, 10.718f, 17.235f, 10.726f, 17.042f, 10.864f),
                    PathNode.CurveTo(16.114f, 11.528f, 14.978f, 11.918f, 13.749f, 11.918f),
                    PathNode.CurveTo(10.62f, 11.918f, 8.083f, 9.381f, 8.083f, 6.251f),
                    PathNode.CurveTo(8.083f, 5.023f, 8.473f, 3.887f, 9.136f, 2.96f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _doNotDisturb!!
    }

private var _doNotDisturb: ImageVector? = null
