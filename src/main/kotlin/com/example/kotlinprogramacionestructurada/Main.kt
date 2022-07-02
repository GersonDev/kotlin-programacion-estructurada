package com.example.kotlinprogramacionestructurada

fun main() {
    print("**** Programa que calcule el area de un cuadrado, un rectangulo y triangulo ****")

    println(" --------------------------- ")
    println("|           MENU            |")
    println("|     1)Area Cuadrado       |")
    println("|     2)Area Rectangulo     |")
    println("|     3)Area Triangulo      |")
    println("|___________________________|")
    println("ingrese numero: 1-3")
    val opcion = readLine()!!.toInt()
    areaDeFiguras(opcion)
}