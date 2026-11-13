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

/** `pb_dr_contacts_normal` */
val OpalineIcons.System.Contacts: ImageVector
    get() {
        if (_contacts != null) return _contacts!!
        _contacts = ImageVector.Builder(
            name = "Contacts",
            defaultWidth = 24.0f.dp,
            defaultHeight = 24.0f.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.786f, 13.129f),
                    PathNode.CurveTo(18.58f, 13.129f, 21.951f, 15.04f, 23.225f, 17.903f),
                    PathNode.CurveTo(23.374f, 18.238f, 23.554f, 18.627f, 23.618f, 19.003f),
                    PathNode.CurveTo(23.698f, 19.467f, 23.611f, 19.899f, 23.337f, 20.32f),
                    PathNode.CurveTo(23.029f, 20.794f, 22.599f, 21.024f, 22.122f, 21.121f),
                    PathNode.CurveTo(21.717f, 21.204f, 21.222f, 21.199f, 20.736f, 21.199f),
                    PathNode.LineTo(8.837f, 21.199f),
                    PathNode.CurveTo(8.35f, 21.199f, 7.856f, 21.204f, 7.451f, 21.121f),
                    PathNode.CurveTo(6.973f, 21.024f, 6.543f, 20.795f, 6.235f, 20.32f),
                    PathNode.CurveTo(5.961f, 19.899f, 5.874f, 19.466f, 5.954f, 19.002f),
                    PathNode.CurveTo(6.019f, 18.627f, 6.2f, 18.237f, 6.348f, 17.903f),
                    PathNode.CurveTo(7.622f, 15.04f, 10.992f, 13.129f, 14.786f, 13.129f),
                    PathNode.Close,
                    PathNode.MoveTo(8.059f, 12.926f),
                    PathNode.CurveTo(8.199f, 12.93f, 8.339f, 12.938f, 8.478f, 12.948f),
                    PathNode.CurveTo(7.575f, 13.487f, 6.765f, 14.146f, 6.085f, 14.915f),
                    PathNode.CurveTo(4.412f, 15.307f, 3.107f, 16.256f, 2.477f, 17.396f),
                    PathNode.CurveTo(2.381f, 17.57f, 2.312f, 17.693f, 2.261f, 17.8f),
                    PathNode.CurveTo(2.214f, 17.898f, 2.196f, 17.952f, 2.19f, 17.979f),
                    PathNode.CurveTo(2.194f, 17.99f, 2.204f, 18.011f, 2.222f, 18.042f),
                    PathNode.LineTo(2.236f, 18.066f),
                    PathNode.CurveTo(2.243f, 18.07f, 2.263f, 18.079f, 2.305f, 18.088f),
                    PathNode.CurveTo(2.378f, 18.104f, 2.489f, 18.118f, 2.664f, 18.125f),
                    PathNode.CurveTo(2.84f, 18.132f, 3.045f, 18.132f, 3.308f, 18.132f),
                    PathNode.LineTo(4.252f, 18.132f),
                    PathNode.CurveTo(4.221f, 18.232f, 4.192f, 18.335f, 4.166f, 18.44f),
                    PathNode.LineTo(4.117f, 18.685f),
                    PathNode.CurveTo(4.043f, 19.109f, 4.043f, 19.527f, 4.113f, 19.933f),
                    PathNode.LineTo(2.949f, 19.933f),
                    PathNode.CurveTo(2.587f, 19.93f, 2.224f, 19.914f, 1.911f, 19.844f),
                    PathNode.CurveTo(1.406f, 19.73f, 0.971f, 19.466f, 0.671f, 18.958f),
                    PathNode.LineTo(0.671f, 18.957f),
                    PathNode.CurveTo(0.413f, 18.52f, 0.323f, 18.069f, 0.434f, 17.582f),
                    PathNode.CurveTo(0.522f, 17.196f, 0.739f, 16.818f, 0.901f, 16.525f),
                    PathNode.CurveTo(2.111f, 14.334f, 4.796f, 12.921f, 7.78f, 12.921f),
                    PathNode.LineTo(8.059f, 12.926f),
                    PathNode.Close,
                    PathNode.MoveTo(14.48f, 14.833f),
                    PathNode.CurveTo(11.33f, 14.932f, 8.809f, 16.552f, 7.901f, 18.595f),
                    PathNode.CurveTo(7.816f, 18.786f, 7.752f, 18.928f, 7.704f, 19.052f),
                    PathNode.CurveTo(7.657f, 19.174f, 7.637f, 19.247f, 7.629f, 19.292f),
                    PathNode.CurveTo(7.626f, 19.312f, 7.625f, 19.323f, 7.625f, 19.328f),
                    PathNode.CurveTo(7.627f, 19.333f, 7.634f, 19.354f, 7.66f, 19.395f),
                    PathNode.CurveTo(7.671f, 19.411f, 7.678f, 19.418f, 7.68f, 19.42f),
                    PathNode.CurveTo(7.681f, 19.421f, 7.681f, 19.421f, 7.682f, 19.422f),
                    PathNode.CurveTo(7.685f, 19.424f, 7.711f, 19.439f, 7.789f, 19.455f),
                    PathNode.CurveTo(7.987f, 19.495f, 8.278f, 19.5f, 8.837f, 19.5f),
                    PathNode.LineTo(20.736f, 19.5f),
                    PathNode.CurveTo(21.295f, 19.5f, 21.585f, 19.495f, 21.783f, 19.455f),
                    PathNode.CurveTo(21.861f, 19.439f, 21.887f, 19.424f, 21.89f, 19.422f),
                    PathNode.CurveTo(21.891f, 19.421f, 21.891f, 19.421f, 21.892f, 19.42f),
                    PathNode.CurveTo(21.894f, 19.418f, 21.901f, 19.411f, 21.912f, 19.395f),
                    PathNode.CurveTo(21.937f, 19.355f, 21.945f, 19.334f, 21.947f, 19.328f),
                    PathNode.CurveTo(21.946f, 19.334f, 21.949f, 19.327f, 21.943f, 19.292f),
                    PathNode.CurveTo(21.935f, 19.247f, 21.915f, 19.174f, 21.868f, 19.052f),
                    PathNode.CurveTo(21.82f, 18.928f, 21.757f, 18.786f, 21.672f, 18.595f),
                    PathNode.CurveTo(20.734f, 16.486f, 18.079f, 14.828f, 14.786f, 14.828f),
                    PathNode.LineTo(14.48f, 14.833f),
                    PathNode.Close,
                    PathNode.MoveTo(6.175f, 18.132f),
                    PathNode.CurveTo(6.058f, 18.402f, 5.941f, 18.7f, 5.891f, 18.99f),
                    PathNode.CurveTo(5.881f, 19.05f, 5.873f, 19.11f, 5.868f, 19.169f),
                    PathNode.CurveTo(5.873f, 19.11f, 5.88f, 19.05f, 5.89f, 18.99f),
                    PathNode.CurveTo(5.94f, 18.7f, 6.057f, 18.402f, 6.174f, 18.132f),
                    PathNode.LineTo(6.175f, 18.132f),
                    PathNode.Close,
                    PathNode.MoveTo(7.975f, 4.216f),
                    PathNode.CurveTo(8.337f, 4.216f, 8.689f, 4.264f, 9.023f, 4.354f),
                    PathNode.CurveTo(8.735f, 4.88f, 8.52f, 5.452f, 8.385f, 6.054f),
                    PathNode.CurveTo(8.325f, 6.043f, 8.265f, 6.034f, 8.203f, 6.027f),
                    PathNode.LineTo(7.975f, 6.017f),
                    PathNode.CurveTo(6.741f, 6.017f, 5.746f, 7.014f, 5.745f, 8.237f),
                    PathNode.LineTo(5.756f, 8.464f),
                    PathNode.CurveTo(5.87f, 9.581f, 6.818f, 10.457f, 7.975f, 10.457f),
                    PathNode.LineTo(8.203f, 10.446f),
                    PathNode.CurveTo(8.431f, 10.423f, 8.647f, 10.363f, 8.849f, 10.277f),
                    PathNode.CurveTo(9.11f, 10.831f, 9.447f, 11.341f, 9.845f, 11.797f),
                    PathNode.CurveTo(9.286f, 12.09f, 8.65f, 12.258f, 7.975f, 12.258f),
                    PathNode.CurveTo(5.753f, 12.258f, 3.945f, 10.46f, 3.945f, 8.237f),
                    PathNode.CurveTo(3.945f, 6.015f, 5.752f, 4.216f, 7.975f, 4.216f),
                    PathNode.Close,
                    PathNode.MoveTo(15.033f, 2.806f),
                    PathNode.CurveTo(17.515f, 2.931f, 19.492f, 4.978f, 19.493f, 7.489f),
                    PathNode.LineTo(19.487f, 7.73f),
                    PathNode.CurveTo(19.365f, 10.13f, 17.435f, 12.052f, 15.033f, 12.174f),
                    PathNode.LineTo(14.791f, 12.18f),
                    PathNode.CurveTo(12.278f, 12.179f, 10.223f, 10.21f, 10.097f, 7.73f),
                    PathNode.LineTo(10.091f, 7.489f),
                    PathNode.CurveTo(10.091f, 4.897f, 12.198f, 2.8f, 14.791f, 2.8f),
                    PathNode.LineTo(15.033f, 2.806f),
                    PathNode.Close,
                    PathNode.MoveTo(14.791f, 4.499f),
                    PathNode.CurveTo(13.132f, 4.499f, 11.79f, 5.84f, 11.79f, 7.489f),
                    PathNode.CurveTo(11.791f, 9.138f, 13.132f, 10.48f, 14.791f, 10.481f),
                    PathNode.CurveTo(16.451f, 10.481f, 17.793f, 9.138f, 17.793f, 7.489f),
                    PathNode.CurveTo(17.793f, 5.84f, 16.451f, 4.499f, 14.791f, 4.499f),
                    PathNode.Close,
                ),
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                pathFillType = PathFillType.NonZero,
            )
        }.build()
        return _contacts!!
    }

private var _contacts: ImageVector? = null
