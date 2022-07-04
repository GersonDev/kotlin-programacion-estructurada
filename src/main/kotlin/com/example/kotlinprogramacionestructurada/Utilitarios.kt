package com.example.kotlinprogramacionestructurada

fun calcularPresionMayorYMenor(){
    var a = 0
    var ma = 0
    var x = 0
    var y = 0
    var me = 0
    var h = 0
    var k = 0
    val filas = 3
    val columnas = 3
    val matriz = arrayOf(
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1)
    )
    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            println("Dame tu presion del dia:$j del mes:$i")
            matriz[i][j] = readLine()!!.toInt()
            a += matriz[i][j]
            if (i == 1 && j == 1) {
                ma = matriz[i][j]
                x = i
                y = j
                me = matriz[i][j]
                h = i
                k = j
            }
            if (matriz[i][j] > ma) {
                ma = matriz[i][j]
                x = i
                y = j
            }
            if (matriz[i][j] < me) {
                me = matriz[i][j]
                h = i
                k = j
            }
        }
    }
    println("Dia en el que tuvo mas presion:$y,en el mes:$x")
    println("Dia en el que menor presion:$k,en el mes:$h")
}