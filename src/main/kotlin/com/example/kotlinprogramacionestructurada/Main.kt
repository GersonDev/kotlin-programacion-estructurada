package com.example.kotlinprogramacionestructurada

fun main() {
    println("**Programa para calcular el area el perimetro del pentagono:")
    println("Ingrese el numero de lado:")
    val lado = readLine()!!.toInt()
    println("Ingrese el apotema:")
    val apotema = readLine()!!.toInt()
    val area = calcularAreaPentagono(lado, apotema)
    val perimetro = calcularPerimetroPentagono(lado)
    imprimirAreaYPerimetroDelPentagono(area, perimetro)
}