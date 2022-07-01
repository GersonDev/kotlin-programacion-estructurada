package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado los numeros dos numero calcular cociente`() {
        val cociente = calcularCociente(5, 6)
        assertTrue(cociente == 0)
    }
    @Test
    fun `dado los numeros dos numero calcular residuo`() {
        val residuo = calcularResiduo(5, 6)
        assertTrue(residuo == 5)
    }
}
