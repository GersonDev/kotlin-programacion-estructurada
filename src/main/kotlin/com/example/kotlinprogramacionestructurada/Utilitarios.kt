package com.example.kotlinprogramacionestructurada

fun calcularDiagonal() {
    var mo = 0
    var me = 0
    var h = 0
    var k = 0
    var array: Array<Int> = Array(10) { -1 }
    for (i in 0..9) {
        println("Dame dato")
        array[i] = readLine()!!.toInt()
        if (i == 1) {
            mo = array[i]
            me = array[i]
            h = i
            k = i
        }
        if (array[i] > mo) {
            mo = array[i]
            h = i
        }
        if (array[i] < me) {
            me = array[i]
            k = i
        }
    }
    println("Mayor:$mo,posicion:$h,menor:$me,posicion:$k")
}