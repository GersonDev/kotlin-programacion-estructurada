package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {
 @Test
 fun `dado el ingreso de un numero 12  calcula si es multiplo de 6`() {
     val siEsMultiplo = calcularMultiploDeSeis(12)
     assertTrue(siEsMultiplo)
 }
}