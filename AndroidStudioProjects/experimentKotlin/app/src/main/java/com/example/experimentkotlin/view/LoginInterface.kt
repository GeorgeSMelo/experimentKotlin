package com.example.experimentkotlin.view

import android.R.attr.text
import android.widget.TextView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable

fun Interface(modifier: Modifier = Modifier){

    val context = LocalContext

    var user by remember{mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {

        Text(
            text = "Registro de Usuario",
            style = MaterialTheme.typography.headlineMedium,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )
        Text(
            text = "Crea tu cuenta para empezar a utilizar la plataforma",
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )

        OutlinedTextField(
            value = user,
            onValueChange = { user = it },
            label = {Text("Usuario")},
            modifier = modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {Text("Contraseña")},
            modifier = modifier.fillMaxWidth()
        )

        Button(
            onClick = {},
            modifier = modifier.fillMaxWidth(),
            ) { Text("Continuar")}

        Button(
            onClick = {},
            modifier = modifier.fillMaxWidth(),
        ) { Text("Crear Cuenta")}


    }

}