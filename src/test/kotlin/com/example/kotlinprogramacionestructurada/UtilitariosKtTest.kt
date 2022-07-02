package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `calcular si el numero que se ingreso si es multuipli de seis`() {
        val siEsMultiploDeSeis = calcularMultiploDeSeis(12)
        assertTrue(siEsMultiploDeSeis)
    }
}