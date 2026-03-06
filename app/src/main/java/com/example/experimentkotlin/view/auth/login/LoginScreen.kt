package com.example.experimentkotlin.view.auth.login

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.experimentkotlin.R

@Preview
@Composable

fun LoginScreen(loginViewModel: LoginViewModel = viewModel()) {
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
            Text(
                "Español (España)",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(top = 22.dp)
            )
            Spacer(Modifier.weight(1f))
            Image(
                modifier = Modifier.size(72.dp),
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "ExperimentKotlin"
            )
            Spacer(Modifier.weight(1.3f))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(30),
                value = uiState.email,
                label = { Text("Usuario, correo electronico o móvil", color = MaterialTheme.colorScheme.onBackground) },
                onValueChange = { loginViewModel.onEmailChanged(it) })
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(30),
                value = uiState.password,
                label = { Text("Contraseña", color = MaterialTheme.colorScheme.onBackground) },
                onValueChange = { loginViewModel.onPasswordChanged(it) })
            Spacer(Modifier.height(8.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                onClick = {},
                enabled = uiState.isLoginEnable,
                shape = MaterialTheme.shapes.extraLarge
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 4.dp),
                    text = "Iniciar sesión",color = MaterialTheme.colorScheme.onPrimary
                )
            }
            TextButton(onClick = { }) { Text("¿Has olvidado la contraseña?", color = MaterialTheme.colorScheme.onSurfaceVariant) }
            Spacer(Modifier.weight(1f))
            OutlinedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {}, border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)) { Text("Crear cuenta nueva",  color = MaterialTheme.colorScheme.primary) }
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