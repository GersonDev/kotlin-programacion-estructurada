package com.example.kotlinprogramacionestructurada

fun main() {
    println("calcule el más grande, el más pequeño y la media de N números.")
    println("Ingrese la cantidad de numeros: ")
    var cantidadDeNumeros = readLine()!!.toInt()
    calcularGrandePequeñoMedio(cantidadDeNumeros)
}