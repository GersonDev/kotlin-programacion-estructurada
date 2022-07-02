package com.example.kotlinprogramacionestructurada

fun calcularCambio(monto: Int, costo: Int): Int {
    val resultado = monto - costo
    val faltante = costo - monto
    if (monto >= costo) return resultado
    return faltante
}
fun imprimirMensaje(monto: Int, costo: Int): Unit {

    val cambioCalculado = calcularCambio(monto, costo)
    when {
        cambioCalculado > 0 -> {
            println("Su vuelto es $cambioCalculado")
        }
        cambioCalculado < 0 -> {
            println("Le falta $cambioCalculado")
        }
        else -> {
            println("Se realizo su compra exitosamente")
        }
    }
}