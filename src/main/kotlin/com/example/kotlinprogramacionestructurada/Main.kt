package com.example.kotlinprogramacionestructurada

fun main() {
   println("Programa que calcula cuadrado y cubo de un numero:")
    println("Dame un numero:")
    val primerNumero= readLine()!!.toInt()
    val cubo= calcularCubo(primerNumero)
    val cuadrado= calcularCuadrado(primerNumero)
    imprimirResultado(cuadrado,cubo)
}