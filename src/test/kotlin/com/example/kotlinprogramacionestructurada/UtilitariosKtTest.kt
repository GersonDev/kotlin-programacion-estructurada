package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dar como resultado de 243 al cuadrado`() {
        val cuadrado = CalcularCuadrado()
        assertTrue(cuadrado == 59049)
    }
}