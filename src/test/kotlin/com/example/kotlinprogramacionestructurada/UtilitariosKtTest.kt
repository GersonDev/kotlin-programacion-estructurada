package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el ingreso de 2 numeros enteros calcular la suma`() {
        val suma = calcularSuma(5, 6)
        assertTrue(suma == 11)
    }
}