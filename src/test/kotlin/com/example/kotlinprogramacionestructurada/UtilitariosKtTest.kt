package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `calcular su perimetro dado el radio`() {
        val perimetro = calcularPerimetro(5.0)
        assertTrue(perimetro == 31.400000000000002)
    }
    @Test
    fun `calcular su area dado el radio`() {
        val area = calcularArea(5.0)
        assertTrue(area == 78.5)
    }
}