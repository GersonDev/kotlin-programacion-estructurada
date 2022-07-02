package com.example.kotlinprogramacionestructurada

fun main() {
    println("programa que realize operaciones aritmeticas")
    println("1:SUMA,2:RESTA,3:MULTIPLICACION,4:DIVISION,5:POTENCIACION")
    val operacion = readLine()!!.toInt()
    println("Ingrese primer numero")
    val primerNumero = readLine()!!.toInt()
    println("Ingrese Segundo Numero")
    val segundoNumero = readLine()!!.toInt()
    calcularOperacionAritmeticas(operacion, primerNumero, segundoNumero)
}