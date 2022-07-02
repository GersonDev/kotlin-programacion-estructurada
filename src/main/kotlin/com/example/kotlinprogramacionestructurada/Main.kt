package com.example.kotlinprogramacionestructurada

fun main() {
    print("**** Programa que indique si un numero es divisibble entre 14 ****")
    print("Ingrese numero: ")
    val numero = readLine()!!.toInt()
    imprimirDivisible(numero)
}