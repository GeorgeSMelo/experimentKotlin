package com.example.experimentkotlin.view.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.experimentkotlin.R
import com.example.experimentkotlin.view.core.components.ExperimentButton
import com.example.experimentkotlin.view.core.components.ExperimentButtonSecondary
import com.example.experimentkotlin.view.core.components.ExperimentTextBody
import com.example.experimentkotlin.view.core.components.ExperimentTextField


@Composable

fun LoginScreen(loginViewModel: LoginViewModel = hiltViewModel(),
                navigateToRegister: () -> Unit, ) {
    Scaffold() { padding ->
        val uiState by loginViewModel.uiState.collectAsStateWithLifecycle()

        Column(
            Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(padding)
                .padding(horizontal = 20.dp)
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ExperimentTextBody(
                text = stringResource(R.string.login_screen_header_text_spain),
                modifier = Modifier.padding(top = 22.dp)
            )
            Spacer(Modifier.weight(1f))
            Image(
                modifier = Modifier.size(72.dp),
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "ExperimentKotlin"
            )
            Spacer(Modifier.weight(1.3f))
            ExperimentTextField(
                modifier = Modifier.fillMaxWidth(),
                value = uiState.email,
                label = stringResource(R.string.login_screen_textfield_email),
                onValueChange = { loginViewModel.onEmailChanged(it) })
            Spacer(Modifier.height(12.dp))
            ExperimentTextField(
                modifier = Modifier.fillMaxWidth(),
                value = uiState.password,
                label = stringResource(R.string.login_screen_textfield_password),
                onValueChange = { loginViewModel.onPasswordChanged(it) })
            Spacer(Modifier.height(8.dp))
            ExperimentButton(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(R.string.login_screen_button_login),
                onClick = { loginViewModel.onClickSelected() },
                enabled = uiState.isLoginEnable,
            )
            TextButton(onClick = { }) {
                ExperimentTextBody(
                    text = stringResource(R.string.login_screen_text_forgot_password),
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(Modifier.weight(1f))
            ExperimentButtonSecondary(
                modifier = Modifier.fillMaxWidth(),
                onClick = {navigateToRegister()},
                title = stringResource(R.string.login_screen_button_register)
            )
            Icon(
                modifier = Modifier
                    .width(60.dp)
                    .padding(vertical = 24.dp),
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
                tint = MaterialTheme.colorScheme.onBackground
            )

        }


    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen() { }
}