package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el ingreso de dos numero 5 y 6  calcular la suma`() {
        val suma = calcularSuma(5, 6)
        assertTrue(suma == 11)
    }
}