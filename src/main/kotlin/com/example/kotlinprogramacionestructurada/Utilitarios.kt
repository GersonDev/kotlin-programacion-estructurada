package com.example.kotlinprogramacionestructurada
fun calcularSumaDeUnVectorPorFila(){
var s = 0
var i = 1
var j = 2
val matriz = arrayOf(
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1),
    intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1)
)
for (i in i..10) {
    for (j in 1..10) {
        println("dame dato,$i,$j")
        matriz[i][j] = readLine()!!.toInt()
    }
}
for (i in i..10) {
    s = 0
    for (j in 1..10) {
        s += matriz[i][j]
    }
    for (j in j..10) {
        println(matriz[i][j])
    }
    println("la suma de este reglon es:, $s")
    println("SALTO DE LINEA")
}
}
