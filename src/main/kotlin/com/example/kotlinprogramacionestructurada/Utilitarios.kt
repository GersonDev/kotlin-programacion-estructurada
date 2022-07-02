package com.example.kotlinprogramacionestructurada

fun calcularOperacionAritmeticas(operacion: Int, primerNumero: Int, segundoNumero: Int): Unit {

    when (operacion) {
        1 -> {
            println("LA SUMA ES: ${primerNumero + segundoNumero}")
        }
        2 -> {
            println("LA RESTA ES: ${primerNumero - segundoNumero}")
        }
        3 -> {
            println("LA MULTIPLICACION ES: ${primerNumero * segundoNumero}")
        }
        4 -> {
            println("LA DIVISION ES: ${primerNumero / segundoNumero}")
        }
        5 -> {
            println("LA POTENCIACION ES: ${(primerNumero * primerNumero) + (segundoNumero * segundoNumero)}")
        }
        else -> {
            println("ERRROR")
        }
    }
}