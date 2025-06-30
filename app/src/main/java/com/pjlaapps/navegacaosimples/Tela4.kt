package com.pjlaapps.navegacaosimples

import androidx.compose.runtime.Composable

@Composable
fun Tela4(onNavigate: (Tela) -> Unit) {
    ScreenTemplate2(
       "Tela 4",
        "Ir para Tela 5", {
            onNavigate(Tela.Tela5)
        }, "Voltar para Tela 3") {
            onNavigate(Tela.Tela3)
        }
}