package com.example.kotlinprogramacionestructurada

fun main() {
    println("Programa que de cuantos elementos positivos da el usuarios:")
    println("¿De que tamanaño quieres que sea tu vector")
    val tamañoDelVector = readLine()!!.toInt()
    imprimirElementosPositivos(tamañoDelVector)
}