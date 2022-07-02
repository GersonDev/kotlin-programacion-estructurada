package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa que indique el numero de digitos que tiene una cantidad a la izquierda del punto decimal ****")
    println("Ingrese numero: ")
    var x = readLine()!!.toDouble()
    var c = 0
    do {
        x /= 10
        c += 1
    } while (x > 1)
    println("Digitos a la izquierda:$c")
}