package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa que calcule el cambio del cliente ****")
    println("Ingrese monto:")
    val monto= readLine()!!.toInt()
    println("Ingrese Costo:")
    val costo= readLine()!!.toInt()
    calcularCambio(monto,costo)
}