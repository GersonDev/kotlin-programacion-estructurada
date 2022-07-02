package com.example.kotlinprogramacionestructurada

fun calcularDivisibleDeCatorse(primerNumero: Int): Boolean {
    if (primerNumero % 14 == 0) return true
    return false
}

fun imprimirMensaje(primerNumero: Int): Unit {
    val calcularDivisibleDeCatorse = calcularDivisibleDeCatorse(primerNumero)
    if (calcularDivisibleDeCatorse)
        println("El $primerNumero si es divisible de 14")
    else
        println("EL $primerNumero no es divisible de 14")
}