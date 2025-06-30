package com.pjlaapps.navegacaosimples

import androidx.compose.runtime.Composable

@Composable
fun Tela3(onNavigate: (Tela) -> Unit) {
    ScreenTemplate("Tela 3", "Ir para Tela 4") {
        onNavigate(Tela.Tela4)
    }
}