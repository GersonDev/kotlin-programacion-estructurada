package com.example.kotlinprogramacionestructurada

import org.junit.Test
import org.junit.Assert.*

class UtilitariosKtTest {

    @Test
    fun `dado el ingreso del monto que es 1000 y el costo que es 500 dar el resultado `():Unit {
        val vueltoDelCliente= calcularCambio(1000, 500)
        assertTrue(vueltoDelCliente == 500)
    }
    @Test
    fun `dado el ingreso del monto que es 100 y el costo que es 500 dar el resultado `():Unit {
    val faltanteDelCliente= calcularCambio(100, 500)
    assertTrue(faltanteDelCliente == 400)
}
}