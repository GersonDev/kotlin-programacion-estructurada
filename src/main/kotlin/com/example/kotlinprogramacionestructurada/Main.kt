package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa para indicar si un numero es divisible entre 2 y 5 ****")
    println("Ingrese numero: ")
    val primerNumero = readLine()!!.toInt()
    imprimirSiesDivisible(primerNumero)
}