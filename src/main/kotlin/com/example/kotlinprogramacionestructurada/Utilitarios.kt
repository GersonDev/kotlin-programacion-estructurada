package com.example.kotlinprogramacionestructurada

fun imprimirElementosPositivos(tamañoDelVector:Int){
    val array: Array<Int> = Array(tamañoDelVector) { 0 }
    var ma = 0
    var me = 0
    if (tamañoDelVector >= 1 && tamañoDelVector <= 100) {
        for (i in 0..tamañoDelVector - 1) {
            println("DAME UN NUMERO")
            array[i] = readLine()!!.toInt()
            if (i == 0) {
                ma = array[i]
                me = array[i]
            }
            if (array[i] > ma) {
                ma = array[i]
            }
            if (array[i] < me) {
                me = array[i]
            }
        }
        println("mayor, $ma ,menor, $me")
    } else {
        println("ERROR")
    }
}