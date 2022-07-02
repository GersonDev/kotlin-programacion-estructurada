package com.example.kotlinprogramacionestructurada

fun calcularMultiploDeSeis(primerNumero: Int): Boolean {
    if (primerNumero % 6 == 0) return true
    return false
}

fun imprimirMensaje(primerNumero: Int): Unit {
    val calcularMultiploDeSeis = calcularMultiploDeSeis(primerNumero)
    if (calcularMultiploDeSeis)
        println("El $primerNumero si es divisible de 14")
    else
        println("EL $primerNumero no es divisible de 14")
}