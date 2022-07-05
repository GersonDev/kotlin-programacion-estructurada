package com.example.kotlinprogramacionestructurada

fun imprimirElementosPositivos(tamañoDelVector:Int){
    val array: Array<Int> = Array(tamañoDelVector) { 0 }
    var p=0
    if (tamañoDelVector > 0 && tamañoDelVector <= 100) {
        for (i in 0..tamañoDelVector - 1) {
            println("DAME UN NUMERO")
            array[i] = readLine()!!.toInt()
            if(array[i]>0)
                p += 1
        }
        println("Elementos positivos $p")
    } else {
        println("ERROR")
    }
}