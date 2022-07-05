package com.example.kotlinprogramacionestructurada

fun calcularSumaDeUnVectorPorFila() {
    var s = 0
    var numeroDeFilas = 3
    var numeroDeColumnas = 3
    val matriz = arrayOf(
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1),
        intArrayOf(-1, -1, -1)
    )
    for (i in 0..numeroDeFilas - 1) {
        for (j in 0..numeroDeColumnas - 1) {
            println("dame dato: $i,$j")
            matriz[i][j] = readLine()!!.toInt()
        }
    }
    for (i in 0..numeroDeFilas - 1) {
        s = 0
        for (j in 0..numeroDeColumnas - 1) {
            s += matriz[i][j]
        }
        for (j in 0..numeroDeColumnas - 1) {
            println(matriz[i][j])
        }
        println("la suma de este reglon es:, $s")
        println("SALTO DE LINEA")
    }
}