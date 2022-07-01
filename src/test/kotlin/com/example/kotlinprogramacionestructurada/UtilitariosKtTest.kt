package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado la base y altura calcular el perimetro`() {
        val perimetro = calcularPerimetro(5, 6)
        assertTrue(perimetro == 22)
    }
    @Test
    fun `dado la base y altura calcular el area`() {
        val area = calcularArea(5, 6)
        assertTrue(area == 30)
    }
}