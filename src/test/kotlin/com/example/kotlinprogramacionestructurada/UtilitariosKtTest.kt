package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado un numero 12 entonces dar que es divisible de 6`() {
        val siEsMultiploDeSeis = calcularMultiploDeSeis(12)
        assertTrue(siEsMultiploDeSeis)
    }
}