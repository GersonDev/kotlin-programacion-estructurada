package com.example.kotlinprogramacionestructurada

fun calcularDivisible(numero: Int): Boolean {
    if (numero % 14 == 0)
        return true
    return false
}
fun imprimirDivisible(numero: Int) {
    val divisible = calcularDivisible(numero)
    if (divisible)
        println("Es divisible entre 14")
    else
        println("No es divisible entre 14")
}