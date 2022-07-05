package com.example.kotlinprogramacionestructurada

fun main() {
    println("Programa para comprobar si un numero es multiplo de 6")
    println("Dame un numero")
    val primerNumero= readLine()!!.toInt()
    imprimirMultiplo(primerNumero)
}