package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

   @Test
    fun `dado el ingreso del  numero 10 calcular si es multiplo de 2 y 5`() {
        val siEsmultiplo = calcularSiEsDivisible(10)
        assertTrue(siEsmultiplo)
    }
}