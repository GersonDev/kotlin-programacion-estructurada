package com.example.kotlinprogramacionestructurada

fun calcularPositivoYNegativo(){
    var p = 0
    var n = 0
    for (i in 0..9) {
        println("DAME UN NUMERO")
        val primerNumero = readLine()!!.toInt()
        if (primerNumero < 0)
            n += 1
        if (primerNumero > 0)
            p += 1
    }
    println("Positivos $p , negativo $n")
}