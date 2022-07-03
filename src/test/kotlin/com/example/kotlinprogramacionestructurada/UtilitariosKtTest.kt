package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el ingreso de la estatura determinar cual es el peso ideal`() {
        val pesoIdeal = calcularPesoIdeal( 173 )
        assertTrue(pesoIdeal == 73)
    }
}