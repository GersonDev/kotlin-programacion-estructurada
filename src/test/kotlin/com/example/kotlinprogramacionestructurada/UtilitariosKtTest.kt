package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado  el numero 3 obtener el cuadrado que es 9 `() {
        val cuadrado = calcularCuadrado(3)
        assertTrue(cuadrado == 9)
    }
    @Test
    fun `dado  el numero 3 obtener el cubo que es 27 `() {
        val cubo = calcularCubo(3)
        assertTrue(cubo == 27)
    }
}