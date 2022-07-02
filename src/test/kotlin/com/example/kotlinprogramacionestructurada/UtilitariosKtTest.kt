package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `calcular si es divisible entre 14`() {
        val esDivisible = calcularDivisible(14)
        assertTrue(esDivisible)
    }
}