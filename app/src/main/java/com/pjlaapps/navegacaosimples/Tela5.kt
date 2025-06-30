package com.pjlaapps.navegacaosimples

import androidx.compose.runtime.Composable

@Composable
fun Tela5(onNavigate: (Tela) -> Unit) {
    ScreenTemplate("Tela 5", "Voltar para Tela 1") {
        onNavigate(Tela.Tela1)
    }
}