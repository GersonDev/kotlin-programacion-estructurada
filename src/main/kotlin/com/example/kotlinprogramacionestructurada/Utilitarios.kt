package com.example.kotlinprogramacionestructurada

fun imprimirCalcularParesYImpares() {
    val array: Array<Int> = arrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1)
    for (posicion in 0..9) {
        if (posicion % 2 == 0) {
            array[posicion] = 0
        }
        if (posicion % 2 != 0) {
            array[posicion] = 1
        }
    }
    println("Nuevo Vector")
    for (posicion in 0..9) {
        println(array[posicion])
    }
}