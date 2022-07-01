package com.example.kotlinprogramacionestructurada

fun main(args: Array<String>) {
    println("Programa para calcular cociente y residuo")
    println("Ingrese primer numero:")
    val numeroUno = readLine()!!.toInt()
    println("Ingrese segundo numero:")
    val numeroDos = readLine()!!.toInt()
    val cociente = calcularCociente(numeroUno, numeroDos)
    val residuo = calcularResiduo(numeroUno, numeroDos)
    imprimirCocienteYResiduo(cociente, residuo)
}