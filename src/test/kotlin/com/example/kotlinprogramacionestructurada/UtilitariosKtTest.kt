package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado los 2 numeros ingresado calcular la hipotenusa de un triangulo rentangulo`() {
        val hipotanusa = calcularHipotenusa(5, 6)
        assertTrue(hipotanusa == 12)
    }
}