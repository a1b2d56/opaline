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

/** `pb_dr_business_normal` */
val OpalineIcons.System.Store: ImageVector
    get() {
        if (_store != null) return _store!!
        _store = ImageVector.Builder(
            name = "Store",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.861f, 1.934f),
                    PathNode.CurveTo(17.572f, 1.934f, 18.232f, 2.303f, 18.605f, 2.908f),
                    PathNode.LineTo(21.531f, 7.662f),
                    PathNode.CurveTo(21.84f, 8.165f, 22.188f, 8.972f, 21.887f, 9.825f),
                    PathNode.CurveTo(21.603f, 10.631f, 20.998f, 11.285f, 20.227f, 11.64f),
                    PathNode.LineTo(20.227f, 19.3f),
                    PathNode.CurveTo(20.227f, 19.621f, 20.227f, 19.913f, 20.207f, 20.155f),
                    PathNode.CurveTo(20.187f, 20.408f, 20.14f, 20.68f, 20.003f, 20.948f),
                    PathNode.CurveTo(19.807f, 21.333f, 19.494f, 21.646f, 19.109f, 21.843f),
                    PathNode.CurveTo(18.841f, 21.979f, 18.568f, 22.026f, 18.316f, 22.047f),
                    PathNode.CurveTo(18.073f, 22.067f, 17.781f, 22.066f, 17.459f, 22.066f),
                    PathNode.LineTo(6.547f, 22.066f),
                    PathNode.CurveTo(6.226f, 22.066f, 5.933f, 22.067f, 5.691f, 22.047f),
                    PathNode.CurveTo(5.439f, 22.026f, 5.167f, 21.979f, 4.899f, 21.843f),
                    PathNode.CurveTo(4.514f, 21.646f, 4.2f, 21.334f, 4.003f, 20.948f),
                    PathNode.CurveTo(3.867f, 20.68f, 3.82f, 20.408f, 3.799f, 20.155f),
                    PathNode.CurveTo(3.779f, 19.913f, 3.781f, 19.621f, 3.781f, 19.3f),
                    PathNode.LineTo(3.781f, 11.644f),
                    PathNode.CurveTo(3.005f, 11.29f, 2.398f, 10.634f, 2.113f, 9.825f),
                    PathNode.CurveTo(1.812f, 8.972f, 2.161f, 8.165f, 2.47f, 7.662f),
                    PathNode.LineTo(5.396f, 2.908f),
                    PathNode.CurveTo(5.769f, 2.302f, 6.429f, 1.934f, 7.14f, 1.934f),
                    PathNode.LineTo(16.861f, 1.934f),
                    PathNode.Close,
                    PathNode.MoveTo(11.998f, 10.923f),
                    PathNode.CurveTo(11.423f, 11.54f, 10.605f, 11.929f, 9.695f, 11.929f),
                    PathNode.CurveTo(8.784f, 11.929f, 7.966f, 11.541f, 7.39f, 10.924f),
                    PathNode.CurveTo(6.899f, 11.45f, 6.231f, 11.809f, 5.48f, 11.903f),
                    PathNode.LineTo(5.48f, 19.3f),
                    PathNode.CurveTo(5.48f, 19.649f, 5.481f, 19.861f, 5.494f, 20.018f),
                    PathNode.CurveTo(5.502f, 20.125f, 5.514f, 20.167f, 5.518f, 20.177f),
                    PathNode.CurveTo(5.551f, 20.242f, 5.605f, 20.295f, 5.67f, 20.328f),
                    PathNode.CurveTo(5.68f, 20.332f, 5.722f, 20.344f, 5.83f, 20.353f),
                    PathNode.CurveTo(5.987f, 20.365f, 6.198f, 20.366f, 6.547f, 20.366f),
                    PathNode.LineTo(9.311f, 20.366f),
                    PathNode.LineTo(9.311f, 15.502f),
                    PathNode.CurveTo(9.311f, 15.387f, 9.31f, 15.249f, 9.32f, 15.13f),
                    PathNode.CurveTo(9.33f, 15.001f, 9.357f, 14.819f, 9.454f, 14.631f),
                    PathNode.CurveTo(9.579f, 14.384f, 9.78f, 14.183f, 10.027f, 14.058f),
                    PathNode.CurveTo(10.216f, 13.962f, 10.396f, 13.934f, 10.526f, 13.924f),
                    PathNode.CurveTo(10.645f, 13.914f, 10.783f, 13.915f, 10.898f, 13.915f),
                    PathNode.LineTo(13.11f, 13.915f),
                    PathNode.CurveTo(13.225f, 13.915f, 13.362f, 13.914f, 13.482f, 13.924f),
                    PathNode.CurveTo(13.579f, 13.932f, 13.705f, 13.948f, 13.842f, 13.997f),
                    PathNode.LineTo(13.982f, 14.058f),
                    PathNode.LineTo(14.072f, 14.108f),
                    PathNode.CurveTo(14.277f, 14.234f, 14.444f, 14.415f, 14.554f, 14.631f),
                    PathNode.CurveTo(14.65f, 14.819f, 14.677f, 15.001f, 14.688f, 15.13f),
                    PathNode.CurveTo(14.698f, 15.249f, 14.698f, 15.387f, 14.698f, 15.502f),
                    PathNode.LineTo(14.698f, 20.366f),
                    PathNode.LineTo(17.459f, 20.366f),
                    PathNode.CurveTo(17.809f, 20.366f, 18.02f, 20.365f, 18.177f, 20.353f),
                    PathNode.CurveTo(18.283f, 20.344f, 18.326f, 20.332f, 18.336f, 20.328f),
                    PathNode.CurveTo(18.402f, 20.295f, 18.455f, 20.242f, 18.489f, 20.177f),
                    PathNode.CurveTo(18.492f, 20.167f, 18.504f, 20.126f, 18.513f, 20.018f),
                    PathNode.CurveTo(18.526f, 19.861f, 18.527f, 19.649f, 18.527f, 19.3f),
                    PathNode.LineTo(18.527f, 11.904f),
                    PathNode.CurveTo(17.773f, 11.811f, 17.103f, 11.452f, 16.61f, 10.924f),
                    PathNode.CurveTo(16.034f, 11.541f, 15.216f, 11.929f, 14.306f, 11.929f),
                    PathNode.CurveTo(13.396f, 11.929f, 12.575f, 11.541f, 11.998f, 10.923f),
                    PathNode.Close,
                    PathNode.MoveTo(11.01f, 20.366f),
                    PathNode.LineTo(12.998f, 20.366f),
                    PathNode.LineTo(12.998f, 15.614f),
                    PathNode.LineTo(11.01f, 15.614f),
                    PathNode.LineTo(11.01f, 20.366f),
                    PathNode.Close,
                    PathNode.MoveTo(7.14f, 3.633f),
                    PathNode.CurveTo(7.019f, 3.633f, 6.907f, 3.696f, 6.843f, 3.799f),
                    PathNode.LineTo(3.917f, 8.553f),
                    PathNode.CurveTo(3.691f, 8.921f, 3.677f, 9.147f, 3.716f, 9.259f),
                    PathNode.CurveTo(3.916f, 9.825f, 4.455f, 10.229f, 5.086f, 10.229f),
                    PathNode.CurveTo(5.889f, 10.229f, 6.54f, 9.578f, 6.54f, 8.775f),
                    PathNode.CurveTo(6.54f, 8.306f, 6.921f, 7.925f, 7.39f, 7.925f),
                    PathNode.CurveTo(7.859f, 7.925f, 8.241f, 8.306f, 8.241f, 8.775f),
                    PathNode.CurveTo(8.241f, 9.578f, 8.892f, 10.229f, 9.695f, 10.229f),
                    PathNode.CurveTo(10.497f, 10.229f, 11.149f, 9.578f, 11.149f, 8.775f),
                    PathNode.CurveTo(11.149f, 8.306f, 11.529f, 7.925f, 11.998f, 7.925f),
                    PathNode.CurveTo(12.468f, 7.925f, 12.848f, 8.306f, 12.848f, 8.775f),
                    PathNode.CurveTo(12.848f, 9.577f, 13.502f, 10.229f, 14.306f, 10.229f),
                    PathNode.CurveTo(15.109f, 10.229f, 15.76f, 9.578f, 15.76f, 8.775f),
                    PathNode.CurveTo(15.76f, 8.306f, 16.14f, 7.925f, 16.61f, 7.925f),
                    PathNode.CurveTo(17.079f, 7.925f, 17.46f, 8.306f, 17.46f, 8.775f),
                    PathNode.CurveTo(17.461f, 9.578f, 18.111f, 10.229f, 18.913f, 10.229f),
                    PathNode.CurveTo(19.545f, 10.229f, 20.085f, 9.825f, 20.285f, 9.259f),
                    PathNode.CurveTo(20.324f, 9.147f, 20.309f, 8.921f, 20.082f, 8.553f),
                    PathNode.LineTo(17.158f, 3.799f),
                    PathNode.CurveTo(17.094f, 3.696f, 16.982f, 3.633f, 16.861f, 3.633f),
                    PathNode.LineTo(7.14f, 3.633f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _store!!
    }

private var _store: ImageVector? = null
