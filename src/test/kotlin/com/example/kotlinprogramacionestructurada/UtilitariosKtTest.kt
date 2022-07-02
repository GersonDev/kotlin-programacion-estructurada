package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

   @Test
    fun `dado el ingreso de un numero calcular si es multiplo de 2 y 5`() {
        val siElmultiplo = calcularSiEsDivisible(10)
        assertTrue(siElmultiplo)
    }
}