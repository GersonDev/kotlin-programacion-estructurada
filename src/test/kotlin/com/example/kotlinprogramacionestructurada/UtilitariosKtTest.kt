package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado los numeros 5 y 6 entonces la suma debe ser 11`() {
        val suma = calcularSuma(5, 6)
        assertTrue(suma == 11)
    }
}