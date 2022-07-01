package com.example.kotlinprogramacionestructurada

fun esUnNumeroPar(primerNumero: Int): Boolean {
    if (primerNumero % 2 == 0) return true
    return false
}

fun imprimirParOImpar(primerNumero: Int): Unit {
    val identificarSiEsParOImpar = esUnNumeroPar(primerNumero)
    if (identificarSiEsParOImpar)
        println("El $primerNumero es un numero par")
    else {
        println("El $primerNumero es un numero impar")
    }
}