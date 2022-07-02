package com.example.kotlinprogramacionestructurada

fun calcularHipotenusa(primerCateto: Int, segundoCateto: Int): Int {
    return ((primerCateto * segundoCateto) + (primerCateto * segundoCateto)) / 5
}

fun imprimirResultado(hipotenusa: Int) {
    println("La hipotenusa del triangulo rectangulo es: $hipotenusa")
}