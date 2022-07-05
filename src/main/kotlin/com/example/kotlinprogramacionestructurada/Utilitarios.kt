package com.example.kotlinprogramacionestructurada

fun calcularMultiploDeSeis(primerNumero: Int): Boolean {
    if (primerNumero % 6 == 0)
        return true
    return false
}
fun imprimirMultiplo(primerNumero:Int){
    val esMultiploDeSeis= calcularMultiploDeSeis(primerNumero)
    if (esMultiploDeSeis)
        println("El numero si es multiplo de 6")
    else
        println("el numero no es multiplo")
}