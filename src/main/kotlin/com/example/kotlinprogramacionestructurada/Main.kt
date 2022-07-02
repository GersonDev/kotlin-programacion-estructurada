package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa para indicar si una persona tiene sobrepeso ****")
    println("Ingrese estatura: ")
    val estatura = readLine()!!.toInt()
    println("Ingrese peso: ")
    val peso = readLine()!!.toInt()
    calcularSobrepeso(estatura, peso)
}