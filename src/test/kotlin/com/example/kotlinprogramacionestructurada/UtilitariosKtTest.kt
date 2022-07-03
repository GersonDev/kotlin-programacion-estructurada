package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado dos numeros 10 y 5 calcular cociente`() {
        val cociente = calcularCociente(10, 5)
        assertTrue(cociente == 2)
    }
    @Test
    fun `dado dos numeros 10 y 5 calcular residuo`() {
        val residuo = calcularResiduo(10, 2)
        assertTrue(residuo == 0)
    }
}
