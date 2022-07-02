package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa que indique el numero de digitos que tiene una cantidad a la izquierda del punto decimal ****")
    println("Ingrese numero: ")
    var numero = readLine()!!.toDouble()
    numerosIzquierda(numero)
}