package com.example.kotlinprogramacionestructurada

fun calcularElMayor(primernumero: Int, segundoNumero: Int, tercerNumero: Int, cuartoNumero: Int) {
    if (primernumero > segundoNumero && primernumero > tercerNumero && primernumero > cuartoNumero) {
        println("El mayor de $primernumero,$segundoNumero,$tercerNumero,$cuartoNumero es: $primernumero")
    }
    if (segundoNumero > primernumero && segundoNumero > tercerNumero && segundoNumero > cuartoNumero) {
        println("El mayor de $primernumero,$segundoNumero,$tercerNumero,$cuartoNumero es: $segundoNumero")
    }
    if (tercerNumero > primernumero && tercerNumero > segundoNumero && tercerNumero > cuartoNumero) {
        println("El mayor de $primernumero,$segundoNumero,$tercerNumero,$cuartoNumero es: $tercerNumero")

    }
    if (cuartoNumero > primernumero && cuartoNumero > segundoNumero && cuartoNumero > tercerNumero) {
        println("El mayor de $primernumero,$segundoNumero,$tercerNumero,$cuartoNumero es: $cuartoNumero")
    }
}