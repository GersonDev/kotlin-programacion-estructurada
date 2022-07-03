package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el ingreso del apotema que tiene como valor 5 y lado que tiene como valor 6 debe calcularse el area  del pentagono`() {
        val area = calcularAreaPentagono(5, 6)
        assertTrue(area == 15)
    }
    @Test
    fun `dado el ingreso de el lado que tiene como valor 5 debe calcularse el perimetro del pentagono`() {
        val perimetro = calcularPerimetroPentagono(5)
        assertTrue(perimetro == 25)
    }
}