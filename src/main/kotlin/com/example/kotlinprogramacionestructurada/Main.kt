package com.example.kotlinprogramacionestructurada

fun main() {
    println("Programa que indique cual es el mayor de cuatro numeros enteros ")
    println("Ingrese 4 numeros:")
    val primerNumero= readLine()!!.toInt()
    val segundoNumero= readLine()!!.toInt()
    val tercerNumero= readLine()!!.toInt()
    val cuartoNumero= readLine()!!.toInt()

    calcularElMayor(primerNumero,segundoNumero,tercerNumero,cuartoNumero)
}