package com.example.kotlinprogramacionestructurada

fun main() {
    println("**** Programa que lea marca y modelo de auto ****")
    print("Ingrese modelo: ")
    val modelo = readLine()!!.toString()
    print("Ingrese marca: ")
    val marca = readLine()!!.toString()
    imprimirResultado(marca, modelo)
}