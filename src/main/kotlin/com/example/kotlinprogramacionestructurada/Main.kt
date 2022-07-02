package com.example.kotlinprogramacionestructurada

fun main() {
    do {
        println("programa que verifica si un dato ingresado por teclado corresponde a la contraseña 252525")
        println("DAME LA CONTRASEÑA")
        val numeroIngresado = readLine()!!.toInt()
        if (numeroIngresado != 252525) println("CONTRASEÑA INCORRECTA")
    } while (numeroIngresado != 252525)
    println("CONTRASEÑA CORRECTA ")
}