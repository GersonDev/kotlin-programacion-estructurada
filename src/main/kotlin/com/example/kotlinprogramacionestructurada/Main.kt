package com.example.kotlinprogramacionestructurada

fun main() {
    println("Escribir un programa que indique cuantos números hay a la izquierda de una cantidad.:")
    println("Dame dato:")
    var primerNumero = readLine()!!.toInt()
    var c = 0
    do {
        primerNumero /= 10
        c += 1
    } while (primerNumero > 1)
    println("digitos a la izquierda:$c")
}