package com.kotlindebolsillo.core_ui.wrapper

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.kotlindebolsillo.core_ui.Dimensions
import com.kotlindebolsillo.core_ui.LocalSpacing

@Composable
fun ComposeLocalWrapper(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalSpacing provides Dimensions(),
        content = content
    )
}