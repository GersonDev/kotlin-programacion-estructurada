package com.example.kotlinprogramacionestructurada

fun main() {
    println("programa que indique mayor y menor")
    println("INGRESE EL TAMAÑO DEL VECTOR")
    val tamañoDelVector = readLine()!!.toInt()
    imprimirElementosPositivos(tamañoDelVector)
}