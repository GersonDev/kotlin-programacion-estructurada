package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `ingresando un numero calcular si es de divisible de 14`() {
        val siEsDivisible = calcularDivisibleDeCatorse(28)
        assertTrue(siEsDivisible)
    }
}