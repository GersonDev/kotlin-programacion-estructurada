package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa para calcular el perimetro y area del circulo ****")
    println("Ingrese radio:")
    val radio = readLine()!!.toDouble()
    val area : Double
    val perimetro : Double

    area = calcularArea(radio)
    perimetro = calcularPerimetro(radio)
    imprimirPerimetroYArea(area, perimetro)
}