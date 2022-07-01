package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el numero 10, entonces asertar que es par`() {
        val esPar = esUnNumeroPar(10)
        assertTrue(esPar)
    }

    @Test
    fun `dado el numero 11, entonces asertar que es impar`() {
        val esPar = esUnNumeroPar(11)
        assertFalse(esPar)
    }
}