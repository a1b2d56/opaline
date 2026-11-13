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

/** `pb_dr_menu_remove_group_member_normal` */
val OpalineIcons.System.RemoveContact: ImageVector
    get() {
        if (_removeContact != null) return _removeContact!!
        _removeContact = ImageVector.Builder(
            name = "RemoveContact",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.044f, 5.423f),
                    PathNode.CurveTo(11.734f, 5.423f, 10.673f, 6.485f, 10.673f, 7.795f),
                    PathNode.CurveTo(10.673f, 9.105f, 11.734f, 10.167f, 13.044f, 10.167f),
                    PathNode.CurveTo(14.354f, 10.167f, 15.416f, 9.105f, 15.416f, 7.795f),
                    PathNode.CurveTo(15.416f, 6.485f, 14.354f, 5.423f, 13.044f, 5.423f),
                    PathNode.Close,
                    PathNode.MoveTo(9.273f, 7.795f),
                    PathNode.CurveTo(9.273f, 5.712f, 10.961f, 4.023f, 13.044f, 4.023f),
                    PathNode.CurveTo(15.127f, 4.023f, 16.816f, 5.712f, 16.816f, 7.795f),
                    PathNode.CurveTo(16.816f, 9.878f, 15.127f, 11.566f, 13.044f, 11.566f),
                    PathNode.CurveTo(10.961f, 11.566f, 9.273f, 9.878f, 9.273f, 7.795f),
                    PathNode.Close,
                    PathNode.MoveTo(7.413f, 10.371f),
                    PathNode.CurveTo(7.814f, 10.371f, 8.186f, 10.244f, 8.489f, 10.028f),
                    PathNode.CurveTo(8.697f, 10.451f, 8.962f, 10.841f, 9.275f, 11.188f),
                    PathNode.CurveTo(8.747f, 11.556f, 8.105f, 11.771f, 7.413f, 11.771f),
                    PathNode.CurveTo(5.613f, 11.771f, 4.153f, 10.312f, 4.153f, 8.512f),
                    PathNode.CurveTo(4.153f, 6.711f, 5.613f, 5.252f, 7.413f, 5.252f),
                    PathNode.CurveTo(7.811f, 5.252f, 8.192f, 5.323f, 8.544f, 5.454f),
                    PathNode.CurveTo(8.33f, 5.864f, 8.171f, 6.307f, 8.076f, 6.774f),
                    PathNode.CurveTo(7.87f, 6.695f, 7.646f, 6.652f, 7.413f, 6.652f),
                    PathNode.CurveTo(6.386f, 6.652f, 5.553f, 7.485f, 5.553f, 8.512f),
                    PathNode.CurveTo(5.553f, 9.539f, 6.386f, 10.371f, 7.413f, 10.371f),
                    PathNode.Close,
                    PathNode.MoveTo(5.558f, 13.443f),
                    PathNode.CurveTo(3.915f, 13.443f, 2.348f, 14.347f, 1.853f, 15.823f),
                    PathNode.LineTo(1.118f, 18.016f),
                    PathNode.CurveTo(1.047f, 18.229f, 1.082f, 18.464f, 1.214f, 18.647f),
                    PathNode.CurveTo(1.345f, 18.83f, 1.557f, 18.938f, 1.782f, 18.938f),
                    PathNode.LineTo(3.587f, 18.938f),
                    PathNode.CurveTo(3.604f, 18.833f, 3.63f, 18.729f, 3.664f, 18.626f),
                    PathNode.LineTo(4.029f, 17.538f),
                    PathNode.LineTo(2.755f, 17.538f),
                    PathNode.LineTo(3.18f, 16.268f),
                    PathNode.CurveTo(3.401f, 15.611f, 4.103f, 15.038f, 5.047f, 14.884f),
                    PathNode.CurveTo(5.389f, 14.32f, 5.834f, 13.838f, 6.348f, 13.443f),
                    PathNode.LineTo(5.558f, 13.443f),
                    PathNode.Close,
                    PathNode.MoveTo(10.281f, 13.443f),
                    PathNode.CurveTo(8.282f, 13.443f, 6.404f, 14.541f, 5.815f, 16.299f),
                    PathNode.LineTo(4.897f, 19.039f),
                    PathNode.CurveTo(4.825f, 19.253f, 4.861f, 19.488f, 4.992f, 19.671f),
                    PathNode.CurveTo(5.124f, 19.854f, 5.335f, 19.962f, 5.561f, 19.962f),
                    PathNode.LineTo(20.918f, 19.962f),
                    PathNode.CurveTo(21.143f, 19.962f, 21.355f, 19.854f, 21.486f, 19.671f),
                    PathNode.CurveTo(21.618f, 19.488f, 21.653f, 19.253f, 21.582f, 19.039f),
                    PathNode.LineTo(20.664f, 16.299f),
                    PathNode.CurveTo(20.075f, 14.541f, 18.196f, 13.443f, 16.198f, 13.443f),
                    PathNode.LineTo(10.281f, 13.443f),
                    PathNode.Close,
                    PathNode.MoveTo(6.533f, 18.562f),
                    PathNode.LineTo(7.142f, 16.743f),
                    PathNode.CurveTo(7.495f, 15.691f, 8.729f, 14.843f, 10.281f, 14.843f),
                    PathNode.LineTo(16.198f, 14.843f),
                    PathNode.CurveTo(17.75f, 14.843f, 18.984f, 15.691f, 19.336f, 16.743f),
                    PathNode.LineTo(19.945f, 18.562f),
                    PathNode.LineTo(6.533f, 18.562f),
                    PathNode.Close,
                    PathNode.MoveTo(18.603f, 8.691f),
                    PathNode.CurveTo(18.216f, 8.691f, 17.903f, 9.004f, 17.903f, 9.391f),
                    PathNode.CurveTo(17.903f, 9.777f, 18.216f, 10.091f, 18.603f, 10.091f),
                    PathNode.LineTo(22.2f, 10.091f),
                    PathNode.CurveTo(22.587f, 10.091f, 22.9f, 9.777f, 22.9f, 9.391f),
                    PathNode.CurveTo(22.9f, 9.004f, 22.587f, 8.691f, 22.2f, 8.691f),
                    PathNode.LineTo(18.603f, 8.691f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.EvenOdd,
            )
        }.build()
        return _removeContact!!
    }

private var _removeContact: ImageVector? = null
