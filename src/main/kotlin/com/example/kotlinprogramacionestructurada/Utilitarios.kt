package com.example.kotlinprogramacionestructurada

fun numerosIzquierda(numero: Double) {
    var c: Double = 0.0
    do {
        var numero = numero / 10
        c = c + 1
    } while (numero >= 1)
    print("Los digitos de la izquierda son: $c)")
}