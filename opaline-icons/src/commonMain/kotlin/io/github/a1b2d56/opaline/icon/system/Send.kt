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

/** `agent_input_ic_send_enable_normal` */
val OpalineIcons.System.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = ImageVector.Builder(
            name = "Send",
            defaultWidth = 22.0f.dp,
            defaultHeight = 22.0f.dp,
            viewportWidth = 22.0f,
            viewportHeight = 22.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.719f, 10.996f),
                    PathNode.CurveTo(21.719f, 11.249f, 21.584f, 11.467f, 21.358f, 11.58f),
                    PathNode.LineTo(6.731f, 18.895f),
                    PathNode.CurveTo(6.437f, 19.041f, 6.188f, 18.924f, 6.095f, 18.865f),
                    PathNode.CurveTo(6.002f, 18.808f, 5.785f, 18.638f, 5.785f, 18.31f),
                    PathNode.LineTo(5.785f, 12.83f),
                    PathNode.CurveTo(5.785f, 12.172f, 6.32f, 11.638f, 6.977f, 11.638f),
                    PathNode.LineTo(12.81f, 11.638f),
                    PathNode.CurveTo(13.164f, 11.638f, 13.452f, 11.351f, 13.452f, 10.996f),
                    PathNode.CurveTo(13.452f, 10.642f, 13.164f, 10.354f, 12.81f, 10.354f),
                    PathNode.LineTo(6.977f, 10.354f),
                    PathNode.CurveTo(6.32f, 10.354f, 5.785f, 9.82f, 5.785f, 9.163f),
                    PathNode.LineTo(5.785f, 3.683f),
                    PathNode.CurveTo(5.785f, 3.354f, 6.002f, 3.185f, 6.095f, 3.128f),
                    PathNode.CurveTo(6.188f, 3.069f, 6.437f, 2.951f, 6.73f, 3.098f),
                    PathNode.LineTo(21.358f, 10.413f),
                    PathNode.CurveTo(21.584f, 10.525f, 21.719f, 10.744f, 21.719f, 10.996f),
                    PathNode.Close,
                    PathNode.MoveTo(3.667f, 7.604f),
                    PathNode.LineTo(2.751f, 7.604f),
                    PathNode.CurveTo(2.396f, 7.604f, 2.109f, 7.892f, 2.109f, 8.246f),
                    PathNode.CurveTo(2.109f, 8.601f, 2.396f, 8.888f, 2.751f, 8.888f),
                    PathNode.LineTo(3.667f, 8.888f),
                    PathNode.CurveTo(4.022f, 8.888f, 4.309f, 8.601f, 4.309f, 8.246f),
                    PathNode.CurveTo(4.309f, 7.892f, 4.022f, 7.604f, 3.667f, 7.604f),
                    PathNode.Close,
                    PathNode.MoveTo(3.667f, 13.104f),
                    PathNode.LineTo(2.751f, 13.104f),
                    PathNode.CurveTo(2.396f, 13.104f, 2.109f, 13.392f, 2.109f, 13.746f),
                    PathNode.CurveTo(2.109f, 14.101f, 2.396f, 14.388f, 2.751f, 14.388f),
                    PathNode.LineTo(3.667f, 14.388f),
                    PathNode.CurveTo(4.022f, 14.388f, 4.309f, 14.101f, 4.309f, 13.746f),
                    PathNode.CurveTo(4.309f, 13.392f, 4.022f, 13.104f, 3.667f, 13.104f),
                    PathNode.Close,
                    PathNode.MoveTo(3.667f, 10.354f),
                    PathNode.LineTo(0.917f, 10.354f),
                    PathNode.CurveTo(0.563f, 10.354f, 0.275f, 10.642f, 0.275f, 10.996f),
                    PathNode.CurveTo(0.275f, 11.351f, 0.563f, 11.638f, 0.917f, 11.638f),
                    PathNode.LineTo(3.667f, 11.638f),
                    PathNode.CurveTo(4.022f, 11.638f, 4.309f, 11.351f, 4.309f, 10.996f),
                    PathNode.CurveTo(4.309f, 10.642f, 4.022f, 10.354f, 3.667f, 10.354f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _send!!
    }

private var _send: ImageVector? = null
