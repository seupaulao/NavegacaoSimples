package com.pjlaapps.navegacaosimples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenTemplate(titulo: String, textoBotao: String, onClick: () -> Unit) {
    Surface(
       // modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
           // modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(titulo, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onClick) {
                Text(textoBotao)
            }
        }
    }
}

@Composable
fun ScreenTemplate2(
    titulo: String,
    textoBotao1: String,
    onClickBotao1: () -> Unit,
    textoBotao2: String,
    onClickBotao2: () -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(titulo, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onClickBotao1) {
                Text(textoBotao1)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = onClickBotao2) {
                Text(textoBotao2)
            }
        }
    }
}
