package com.example.kotlinprogramacionestructurada

fun calcularNumerosALaIzquierda(){
    var c = 0
    do {
        primerNumero /= 10
        c += 1
    } while (primerNumero > 1)
    println("digitos a la izquierda:$c")

}