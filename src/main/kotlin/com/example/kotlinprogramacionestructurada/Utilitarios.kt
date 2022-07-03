package com.example.kotlinprogramacionestructurada

fun imprimirSuma() {
    var total = 0
    for (i in 1..25) {
        println("Dame un numero:")
        var primerNumero = readLine()!!.toInt()
        total += primerNumero
    }
    println("la suma es $total")
}
