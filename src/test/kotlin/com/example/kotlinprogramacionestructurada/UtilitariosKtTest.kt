package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el ingreso de un numero de valor 100 y el porcentaje 10% calcular dar como resultado el prorcentaje de la cantidad`() {
        val porcentaje = calcularPorcentaje(100, 10)
        assertTrue(porcentaje == 10)
    }
}