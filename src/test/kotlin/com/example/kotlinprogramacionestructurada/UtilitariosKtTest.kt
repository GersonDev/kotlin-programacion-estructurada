package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el numero 28 verificar que es un numero divisible de 14`() {
        val esDivisible = calcularDivisible(208)
        assertTrue(esDivisible)
    }
}