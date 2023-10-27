@file:OptIn(ExperimentalMaterial3Api::class)

package net.cubelabs.apps.juaraandroidcompetition.ui.screens.login

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.cubelabs.apps.juaraandroidcompetition.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    LoginScreenContent()
}

@Composable
fun LoginScreenContent(modifier: Modifier = Modifier) {
    var username by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .imePadding()
            .padding(bottom = 24.dp)
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
        )
        Spacer(
            modifier = modifier
                .padding(bottom = 24.dp, top = 24.dp)
        )

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            singleLine = true,
            label = { Text(text = "Login") }
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            label = { Text("Password") }
        )

        Spacer(
            modifier = modifier
                .padding(bottom = 24.dp)
        )

        Button(
            onClick = {},
            contentPadding = PaddingValues(horizontal = 100.dp)
        ){
            Text(stringResource(R.string.login))
        }
        Spacer(
            modifier = modifier
                .padding(bottom = 8.dp)
        )
        OutlinedButton(
            onClick = {},
            contentPadding = PaddingValues(horizontal = 100.dp)
        ) {
            Text(stringResource(R.string.cancel))
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}