package com.pjlaapps.navegacaosimples

import androidx.compose.runtime.Composable

@Composable
fun Tela2(onNavigate: (Tela) -> Unit) {
    ScreenTemplate("Tela 2", "Ir para Tela 3") {
        onNavigate(Tela.Tela3)
    }
}