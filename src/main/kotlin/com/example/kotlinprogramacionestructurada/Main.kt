package com.example.kotlinprogramacionestructurada

fun main() {
    println("Programa que calcule la suma de 2 numeros enteros:")
    println("Dame 1er numero:")
    val primerNumero = readLine()!!.toInt()
    println("Dame 2do numero:")
    val segundoNumero = readLine()!!.toInt()
    val suma = calcularSuma(primerNumero, segundoNumero)
    imprimirResultado(suma)
}