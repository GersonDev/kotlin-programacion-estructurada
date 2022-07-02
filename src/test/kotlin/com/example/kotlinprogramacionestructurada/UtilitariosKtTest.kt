package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `calcular el porcentaje dando la cantidad y el porcentaje`() {
        val porcentaje = calcularPorcentaje(100, 10)
        assertTrue(porcentaje == 10)
    }
}