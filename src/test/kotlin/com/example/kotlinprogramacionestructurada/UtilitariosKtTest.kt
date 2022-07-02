package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado los numeros 5 y 6 entonces la suma debe ser 11`():Unit {
        val cambioDeCliente= calcularCambio(100, 500)
        assertTrue(cambioDeCliente == 400)
    }
}