package com.kotlindebolsillo.onboarding_presentation.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.kotlindebolsillo.core_ui.LocalSpacing
import com.kotlindebolsillo.core_ui.components.ActionButton
import com.kotlindebolsillo.core_ui.wrapper.ComposeLocalWrapper
import com.kotlindebolsillo.core.R as Core

@Composable
fun WelcomeScreen() {
    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = Core.string.welcome_text),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h1,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        ActionButton(
            text = stringResource(id = Core.string.next),
            onClick = { },
            buttonColor = MaterialTheme.colors.primary,
            isEnabled = true,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    ComposeLocalWrapper {
        WelcomeScreen()
    }
}
