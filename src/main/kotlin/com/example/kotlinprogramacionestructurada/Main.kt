package com.example.kotlinprogramacionestructurada

fun main() {
        println("Calcule el porcentaje de una cantidad ")
        println("Ingrese numero: ")
        val numero = readLine()!!.toInt()
        println("Ingrese el porcentaje:")
        val porcentaje = readLine()!!.toInt()
        val resultado = calcularPorcentaje(numero, porcentaje)
        imprimirResultado(resultado, numero, porcentaje)
}