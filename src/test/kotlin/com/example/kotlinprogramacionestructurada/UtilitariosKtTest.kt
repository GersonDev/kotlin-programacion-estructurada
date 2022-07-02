package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado ingresa el peso como la estarura calcular peso ideal`() {
        val pesoIdeal = calcularPesoIdeal( 173 )
        assertTrue(pesoIdeal == 73)
    }
}