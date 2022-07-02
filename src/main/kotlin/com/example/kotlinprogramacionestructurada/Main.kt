package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa para calcular la hipotenusa de un triangulo rectangulo ****")
    println("Ingrese Primer Cateto:")
    val primerCateto = readLine()!!.toInt()
    println("Ingrese Segundo Cateto:")
    val segundoCateto = readLine()!!.toInt()
    val hipotenusa = calcularHipotenusa(primerCateto, segundoCateto)
    imprimirResultado(hipotenusa)
}