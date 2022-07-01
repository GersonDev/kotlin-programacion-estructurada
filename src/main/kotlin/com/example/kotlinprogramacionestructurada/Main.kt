package com.example.kotlinprogramacionestructurada

fun main(){
    println("**** Programa que calcule el perimetro y area del rectangulo ****")
    println("Ingrese base: ")
    val base = readLine()!!.toInt()
    println("Ingrese haltura: ")
    val haltura = readLine()!!.toInt()

    var perimetro = calcularPerimetro(base, haltura)
    var area = calcularArea(base, haltura)

    imprimirResultado(perimetro, area)
}