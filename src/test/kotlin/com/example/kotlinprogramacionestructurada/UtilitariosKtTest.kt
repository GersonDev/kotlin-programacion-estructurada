package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado un numero 28 debe ser divisible de 14 `() {
        val siEsDivisible = calcularDivisibleDeCatorse(28)
        assertTrue(siEsDivisible)
    }
}