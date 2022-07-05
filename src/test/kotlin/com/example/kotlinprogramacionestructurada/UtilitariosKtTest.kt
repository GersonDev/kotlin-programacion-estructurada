package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado un radio 5 entonces el perimetro debe ser 31`() {
        val perimetro = calcularPerimetro(5.0)
        assertTrue(perimetro == 31.400000000000002)
    }
    @Test
    fun `dado un radio de 5 entonces el area debe ser 78`() {
        val area = calcularArea(5.0)
        assertTrue(area == 78.5)
    }
}