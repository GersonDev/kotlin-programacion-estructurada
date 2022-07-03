package com.example.kotlinprogramacionestructurada

fun calcularElQueVendioMas() {
    var a = 0
    var h = 0
    var k = 0
    var ma = 0
    //INCIO DE UNA MATRIZ
    val filas = 3
    val columnas = 3
    val matriz = arrayOf(
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1)
    )
    //FINAL DE LA MATRIZ
    for (i in 0..filas - 1) {
        for (j in 0..columnas - 1) {
            println("Dame el dato del cajero: $i , del dia $j")
            matriz[i][j] = readLine()!!.toInt()
            a += matriz[i][j]
            if (i == 1 && j == 1) {
                ma = matriz[i][j]
                h = 1
                k = 1
            }
            if (matriz[i][j] > ma) {
                ma = matriz[i][j]
                h = i
                k = j
            }
        }
    }
    println("El cajero que vendio mas: $h en el dia $k  y total de ventas fue: $a")
}
