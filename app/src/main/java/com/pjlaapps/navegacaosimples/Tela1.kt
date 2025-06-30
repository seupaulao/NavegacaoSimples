package com.pjlaapps.navegacaosimples

import androidx.compose.runtime.Composable

@Composable
fun Tela1(onNavigate: (Tela) -> Unit) {
    ScreenTemplate("Tela 1", "Ir para Tela 2") {
        onNavigate(Tela.Tela2)
    }
}