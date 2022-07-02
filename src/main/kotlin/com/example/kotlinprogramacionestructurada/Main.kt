package com.example.kotlinprogramacionestructurada

fun main() {
    println("Ingrese la cantidad de numeros: ")
    var cantidadDeNumeros = readLine()!!.toInt()
    calcularGrandePequeñoMedio(cantidadDeNumeros)
}