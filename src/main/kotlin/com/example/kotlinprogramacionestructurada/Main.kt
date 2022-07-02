package com.example.kotlinprogramacionestructurada

fun main(args: Array<String>) {
    println("Indicar si la suma de dos valores es positiva, negativa o cero")
    println("Ingrese primer numero: ")
    val primerNumero = readLine()!!.toInt()
    println("Ingrese segundo numero:")
    val segundoNumero = readLine()!!.toInt()
    imprimirSiEsPositivoONegativo(primerNumero, segundoNumero)
}