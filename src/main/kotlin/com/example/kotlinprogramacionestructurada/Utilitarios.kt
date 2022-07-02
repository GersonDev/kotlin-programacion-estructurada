package com.example.kotlinprogramacionestructurada

fun calcularPesoIdeal(estatura: Int): Int {
    val pesoIdeal = estatura - 100
    return pesoIdeal
}
fun calcularSobrepeso(estatura: Int, peso: Int): Unit {
    val pesoIdeal = calcularPesoIdeal(estatura)
    if (pesoIdeal > 0 && peso > 0 && estatura > 0) {
        when {
            peso > pesoIdeal -> println("SOBREPESO")
            peso == pesoIdeal -> println("PESOIDEAL")
            else -> println("PESOBAJO")
        }
    } else {
        println("Error")
    }
}