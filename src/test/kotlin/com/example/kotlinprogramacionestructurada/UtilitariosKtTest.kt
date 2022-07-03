package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado  ingresa el numero 243 obtener su cuadrado`() {
        val cuadrado = CalcularCuadrado()
        assertTrue(cuadrado == 59049)
    }
}