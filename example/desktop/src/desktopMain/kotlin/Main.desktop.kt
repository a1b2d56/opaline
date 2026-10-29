// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import io.github.a1b2d56.opaline.shared.generated.resources.Res
import io.github.a1b2d56.opaline.shared.generated.resources.icon
import org.jetbrains.compose.resources.painterResource
import java.awt.Dimension

fun main() = application {
    val state = rememberWindowState(
        size = DpSize(420.dp, 840.dp),
        position = WindowPosition.Aligned(Alignment.Center),
    )
    val isHotReloadMode = System.getProperty("app.mode") == "hot"
    Window(
        state = state,
        onCloseRequest = ::exitApplication,
        alwaysOnTop = isHotReloadMode,
        title = "Opaline",
        icon = painterResource(Res.drawable.icon),
    ) {
        window.minimumSize = Dimension(300, 600)
        App()
    }
}
