package com.example.kotlinprogramacionestructurada

fun calcularNumerosALaIzquierda(primerNumero:Int){
    var c = 0
    var primerNumero=primerNumero
    do {
        primerNumero /= 10
        c += 1
    } while (primerNumero > 1)
    println("digitos a la izquierda:$c")

}