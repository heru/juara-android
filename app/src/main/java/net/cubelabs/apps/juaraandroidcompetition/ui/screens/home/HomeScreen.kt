package net.cubelabs.apps.juaraandroidcompetition.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold (
        modifier = modifier,
        topBar = {

        },
        content = {
            paddingValues -> HomeScreenContent(modifier)
        }
    )
}

@Composable
fun HomeScreenContent(modifier: Modifier = Modifier) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val isScreenWidth = screenWidth > 500

    Box(modifier = modifier.fillMaxSize()) {

    }
}