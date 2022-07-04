package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado  los dos numeros 5 y 5 obtener la suma 10 `() {
        val suma = calcularSuma(5,5)
        assertTrue(suma == 10)
    }

}