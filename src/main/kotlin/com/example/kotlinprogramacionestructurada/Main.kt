package com.example.kotlinprogramacionestructurada

fun main() {
    println("**Programa que realice la suma de dos numeros enteros:")
    println("Ingrese Primer Numero:")
    val primerNumero = readLine()!!.toInt()
    println("Ingrese Segundo Numero :")
    val segundoNumero = readLine()!!.toInt()
    val suma = calcularSuma(primerNumero, segundoNumero)
    imprimirResultado(suma)
}