package com.pjlaapps.navegacaosimples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.pjlaapps.navegacaosimples.ui.theme.NavegacaoSimplesTheme

sealed class Tela {
    object Tela1 : Tela()
    object Tela2 : Tela()
    object Tela3 : Tela()
    object Tela4 : Tela()
    object Tela5 : Tela()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacaoSimplesTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    var telaAtual = remember { mutableStateOf<Tela>(Tela.Tela1) }

    when (telaAtual.value) {
        is Tela.Tela1 -> Tela1 { telaAtual.value = it }
        is Tela.Tela2 -> Tela2 { telaAtual.value = it }
        is Tela.Tela3 -> Tela3 { telaAtual.value = it }
        is Tela.Tela4 -> Tela4 { telaAtual.value = it }
        is Tela.Tela5 -> Tela5 { telaAtual.value = it }
    }
}



@Preview(showBackground = true)
@Composable
fun AppPreview() {
    NavegacaoSimplesTheme {
       App()
    }
}