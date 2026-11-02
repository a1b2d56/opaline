// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.a1b2d56.opaline.basic.Surface
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.theme.OpalineTheme

@Composable
fun SurfaceDemo() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(demoBackground()),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            Modifier
                .padding(16.dp)
                .widthIn(max = 600.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Surface(
                modifier = Modifier
                    .size(height = 200.dp, width = 400.dp)
                    .padding(16.dp),
                color = OpalineTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp),
                shadowElevation = 4.dp,
            ) {
                Text(
                    text = "Surface Example\n\n" +
                        "Size: height = 200.dp, width = 400.dp\n" +
                        "color: OpalineTheme.colorScheme.background\n" +
                        "shape: RoundedCornerShape(16.dp)\n" +
                        "shadowElevation: 4.dp\n" +
                        "isSystemInDarkTheme: ${isSystemInDarkTheme()}",
                    modifier = Modifier.padding(16.dp).fillMaxSize(),
                )
            }
        }
    }
}
