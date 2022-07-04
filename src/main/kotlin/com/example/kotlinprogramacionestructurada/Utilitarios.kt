package com.example.kotlinprogramacionestructurada

fun calcularProduccion() {
    var a = 0
    var b = 0
    val matriz = arrayOf(
        intArrayOf(-1, -1),
        intArrayOf(-1, -1),
        intArrayOf(-1, -1),
        intArrayOf(-1, -1),
        intArrayOf(-1, -1),
        intArrayOf(-1, -1),
        intArrayOf(-1, -1)
    )
    for (i in 0..2) {
        for (j in 0..7) {
            if (i == 1) {
                println("dame produccion del dia:,$j de la planta 1")
                matriz[i][j] = readLine()!!.toInt()
                a += matriz[i][j]
            }
            if (i == 2) {
                println("dame produccion del dia:,$j de la planta 2")
                matriz[i][j] = readLine()!!.toInt()
                b += matriz[i][j]
            }
        }
    }
    if (a > b) {
        println("la primera planta tuvo mayor produccion")
    }
    if (b > a) {
        println("a segunda planta tuvo mayor produccion")
    }
}