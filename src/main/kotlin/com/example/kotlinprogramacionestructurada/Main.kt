package com.example.kotlinprogramacionestructurada

fun main(args: Array<String>) {
    println("**** Programa que indique si un numero es par o impar ****")
    println("Ingrese un Numero:")
    val primerNumero = readLine()!!.toInt()
    imprimirParOImpar(primerNumero)
}