package com.example.kotlinprogramacionestructurada

fun calcularDiagonal() {
    val matriz = arrayOf(
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1)
    )
    for (i in 0..2) {
        println("Dame dato")
        matriz[i][i] = readLine()!!.toInt()
    }
    for (i in 0..2) {
        println(matriz[i][i])
    }
}