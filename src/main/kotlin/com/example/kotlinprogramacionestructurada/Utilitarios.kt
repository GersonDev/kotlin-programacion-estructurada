package com.example.kotlinprogramacionestructurada

fun calcularPorcentaje(numero: Int, porcentaje: Int): Int {
    return (numero * porcentaje) / 100
}

fun imprimirResultado(resultado: Int, numero: Int, porcentaje: Int) {
    println("El $porcentaje%  de $numero  es: $resultado")
}