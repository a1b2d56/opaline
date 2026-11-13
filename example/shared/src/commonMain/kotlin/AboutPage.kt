// Copyright 2025, compose-miuix-ui contributors
// Modifications Copyright 2026, COUI contributors and Opaline contributors
// SPDX-License-Identifier: Apache-2.0
@file:OptIn(ExperimentalScrollBarApi::class)

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import component.BackNavigationIcon
import io.github.a1b2d56.opaline.basic.Card
import io.github.a1b2d56.opaline.basic.HorizontalDivider
import io.github.a1b2d56.opaline.basic.OpalineScrollBehavior
import io.github.a1b2d56.opaline.basic.Scaffold
import io.github.a1b2d56.opaline.basic.Text
import io.github.a1b2d56.opaline.basic.VerticalScrollBar
import io.github.a1b2d56.opaline.basic.rememberScrollBarAdapter
import io.github.a1b2d56.opaline.blur.layerBackdrop
import io.github.a1b2d56.opaline.interfaces.ExperimentalScrollBarApi
import io.github.a1b2d56.opaline.preference.ArrowPreference
import io.github.a1b2d56.opaline.shared.generated.resources.Res
import io.github.a1b2d56.opaline.shared.generated.resources.ic_launcher
import io.github.a1b2d56.opaline.theme.OpalineTheme
import misc.VersionInfo
import navigation3.Route
import org.jetbrains.compose.resources.painterResource
import utils.AdaptiveTopAppBar
import utils.BlurredBar
import utils.pageContentPadding
import utils.pageScrollModifiers
import utils.rememberBlurBackdrop

@Composable
fun AboutPage(
    padding: PaddingValues,
) {
    val appState = LocalAppState.current
    val isWideScreen = LocalIsWideScreen.current
    val navigator = LocalNavigator.current
    val uriHandler = LocalUriHandler.current
    val backdrop = rememberBlurBackdrop()
    val blurActive = backdrop != null
    val barColor = if (blurActive) Color.Transparent else OpalineTheme.colorScheme.surface
    val topAppBarScrollBehavior = OpalineScrollBehavior()

    Scaffold(
        topBar = {
            BlurredBar(backdrop, blurActive) {
                AdaptiveTopAppBar(
                    title = "About",
                    showTopAppBar = appState.showTopAppBar,
                    isWideScreen = isWideScreen,
                    scrollBehavior = topAppBarScrollBehavior,
                    color = barColor,
                    navigationIcon = {
                        BackNavigationIcon(
                            onClick = { navigator.pop() },
                        )
                    },
                )
            }
        },
    ) { innerPadding ->
        val lazyListState = rememberLazyListState()
        val contentPadding = pageContentPadding(
            innerPadding,
            padding,
            isWideScreen,
            extraTop = 12.dp,
            extraStart = WindowInsets.displayCutout.asPaddingValues().calculateLeftPadding(LayoutDirection.Ltr),
            extraEnd = WindowInsets.displayCutout.asPaddingValues().calculateRightPadding(LayoutDirection.Ltr),
        )
        Box(modifier = if (backdrop != null) Modifier.layerBackdrop(backdrop) else Modifier) {
            LazyColumn(
                state = lazyListState,
                modifier = Modifier.pageScrollModifiers(
                    appState.enableScrollEndHaptic,
                    appState.showTopAppBar,
                    topAppBarScrollBehavior,
                ),
                contentPadding = contentPadding,
            ) {
                item(key = "header") {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 28.dp, bottom = 36.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Image(
                            modifier = Modifier
                                .size(72.dp)
                                .clip(RoundedCornerShape(18.dp)),
                            painter = painterResource(Res.drawable.ic_launcher),
                            contentDescription = null,
                        )
                        Text(
                            modifier = Modifier.padding(top = 16.dp),
                            text = "Opaline",
                            style = OpalineTheme.textStyles.title2,
                            color = OpalineTheme.colorScheme.onBackground,
                        )
                        Text(
                            modifier = Modifier.padding(top = 4.dp),
                            text = "Version ${VersionInfo.VERSION_NAME} (${VersionInfo.VERSION_CODE})",
                            style = OpalineTheme.textStyles.body2,
                            color = OpalineTheme.colorScheme.onSurfaceVariantSummary,
                        )
                    }
                }
                item(key = "links") {
                    Card(modifier = Modifier.padding(horizontal = 16.dp)) {
                        ArrowPreference(
                            title = "View Source",
                            endActions = { ValueText("GitHub") },
                            onClick = { uriHandler.openUri("https://github.com/a1b2d56/opaline") },
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Documentation",
                            endActions = { ValueText("Website") },
                            onClick = { uriHandler.openUri("https://a1b2d56.github.io/opaline/") },
                        )
                    }
                }
                item(key = "licenses") {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .padding(top = 16.dp),
                    ) {
                        ArrowPreference(
                            title = "License",
                            endActions = { ValueText("Apache-2.0") },
                            onClick = { uriHandler.openUri("https://www.apache.org/licenses/LICENSE-2.0.txt") },
                        )
                        HorizontalDivider(Modifier.padding(horizontal = 16.dp))
                        ArrowPreference(
                            title = "Third Party Licenses",
                            onClick = { navigator.push(Route.License) },
                        )
                    }
                    Spacer(modifier = Modifier.height(32.dp))
                }
            }
            VerticalScrollBar(
                adapter = rememberScrollBarAdapter(lazyListState),
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                trackPadding = contentPadding,
            )
        }
    }
}

@Composable
private fun ValueText(text: String) {
    Text(
        text = text,
        fontSize = OpalineTheme.textStyles.body2.fontSize,
        color = OpalineTheme.colorScheme.onSurfaceVariantActions,
    )
}
