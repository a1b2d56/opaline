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

/** `pb_dr_edit_contact_normal` */
val OpalineIcons.System.Edit: ImageVector
    get() {
        if (_edit != null) return _edit!!
        _edit = ImageVector.Builder(
            name = "Edit",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.7f, 20.917f),
                    PathNode.CurveTo(21.086f, 20.918f, 21.4f, 21.231f, 21.4f, 21.618f),
                    PathNode.CurveTo(21.4f, 22.004f, 21.086f, 22.318f, 20.7f, 22.318f),
                    PathNode.LineTo(4.096f, 22.318f),
                    PathNode.CurveTo(3.71f, 22.318f, 3.396f, 22.004f, 3.396f, 21.618f),
                    PathNode.CurveTo(3.396f, 21.231f, 3.71f, 20.918f, 4.096f, 20.917f),
                    PathNode.LineTo(20.7f, 20.917f),
                    PathNode.Close,
                    PathNode.MoveTo(16.315f, 1.79f),
                    PathNode.CurveTo(16.688f, 1.677f, 17.14f, 1.632f, 17.636f, 1.758f),
                    PathNode.CurveTo(18.132f, 1.885f, 18.628f, 2.17f, 19.105f, 2.647f),
                    PathNode.CurveTo(19.583f, 3.125f, 19.868f, 3.62f, 19.994f, 4.116f),
                    PathNode.CurveTo(20.12f, 4.612f, 20.074f, 5.065f, 19.961f, 5.437f),
                    PathNode.CurveTo(19.849f, 5.804f, 19.671f, 6.095f, 19.527f, 6.291f),
                    PathNode.CurveTo(19.454f, 6.389f, 19.387f, 6.468f, 19.336f, 6.524f),
                    PathNode.CurveTo(19.31f, 6.552f, 19.287f, 6.574f, 19.27f, 6.591f),
                    PathNode.CurveTo(19.265f, 6.597f, 19.26f, 6.602f, 19.256f, 6.606f),
                    PathNode.LineTo(8.823f, 17.046f),
                    PathNode.CurveTo(8.505f, 17.364f, 8.122f, 17.609f, 7.7f, 17.764f),
                    PathNode.LineTo(4.062f, 19.103f),
                    PathNode.CurveTo(3.181f, 19.427f, 2.326f, 18.57f, 2.651f, 17.69f),
                    PathNode.LineTo(3.994f, 14.054f),
                    PathNode.CurveTo(4.149f, 13.635f, 4.394f, 13.253f, 4.71f, 12.937f),
                    PathNode.LineTo(15.143f, 2.495f),
                    PathNode.CurveTo(15.148f, 2.49f, 15.153f, 2.484f, 15.159f, 2.478f),
                    PathNode.CurveTo(15.176f, 2.461f, 15.199f, 2.439f, 15.227f, 2.414f),
                    PathNode.CurveTo(15.283f, 2.362f, 15.362f, 2.295f, 15.461f, 2.222f),
                    PathNode.CurveTo(15.657f, 2.078f, 15.948f, 1.901f, 16.315f, 1.79f),
                    PathNode.Close,
                    PathNode.MoveTo(20.719f, 16.198f),
                    PathNode.CurveTo(21.106f, 16.198f, 21.42f, 16.512f, 21.42f, 16.898f),
                    PathNode.CurveTo(21.42f, 17.285f, 21.106f, 17.598f, 20.719f, 17.598f),
                    PathNode.LineTo(12.788f, 17.598f),
                    PathNode.CurveTo(12.401f, 17.598f, 12.088f, 17.285f, 12.088f, 16.898f),
                    PathNode.CurveTo(12.088f, 16.511f, 12.401f, 16.198f, 12.788f, 16.198f),
                    PathNode.LineTo(20.719f, 16.198f),
                    PathNode.Close,
                    PathNode.MoveTo(17.291f, 3.115f),
                    PathNode.CurveTo(17.079f, 3.061f, 16.889f, 3.078f, 16.721f, 3.128f),
                    PathNode.CurveTo(16.548f, 3.181f, 16.399f, 3.27f, 16.291f, 3.35f),
                    PathNode.CurveTo(16.238f, 3.389f, 16.197f, 3.423f, 16.173f, 3.445f),
                    PathNode.CurveTo(16.161f, 3.456f, 16.153f, 3.465f, 16.149f, 3.468f),
                    PathNode.LineTo(16.15f, 3.466f),
                    PathNode.LineTo(16.144f, 3.474f),
                    PathNode.LineTo(16.135f, 3.484f),
                    PathNode.LineTo(5.699f, 13.926f),
                    PathNode.CurveTo(5.526f, 14.1f, 5.392f, 14.309f, 5.307f, 14.539f),
                    PathNode.LineTo(4.189f, 17.564f),
                    PathNode.LineTo(7.217f, 16.451f),
                    PathNode.CurveTo(7.448f, 16.366f, 7.658f, 16.231f, 7.832f, 16.057f),
                    PathNode.LineTo(18.265f, 5.617f),
                    PathNode.LineTo(18.305f, 5.577f),
                    PathNode.CurveTo(18.328f, 5.552f, 18.361f, 5.511f, 18.4f, 5.459f),
                    PathNode.CurveTo(18.48f, 5.35f, 18.569f, 5.202f, 18.622f, 5.029f),
                    PathNode.CurveTo(18.673f, 4.861f, 18.69f, 4.672f, 18.636f, 4.46f),
                    PathNode.CurveTo(18.583f, 4.248f, 18.445f, 3.968f, 18.115f, 3.637f),
                    PathNode.CurveTo(17.784f, 3.307f, 17.503f, 3.169f, 17.291f, 3.115f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _edit!!
    }

private var _edit: ImageVector? = null
