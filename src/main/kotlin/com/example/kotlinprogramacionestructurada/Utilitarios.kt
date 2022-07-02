package com.example.kotlinprogramacionestructurada

 fun sumaDeDosNumeros(primerNumero: Int, segundoNumero: Int): Int {
    val suma = primerNumero + segundoNumero
    return suma
}

fun imprimirSiEsPositivoONegativo(primerNumero: Int, segundoNumero: Int){
    val suma = sumaDeDosNumeros(primerNumero, segundoNumero)
    when {
        suma > 0 -> {
            print("$suma es positivo")
        }
        suma < 0 -> {
            print("$suma es negativo")
        }
        else -> {
            print("el $suma  es un numero Neutro")
        }
    }
}
