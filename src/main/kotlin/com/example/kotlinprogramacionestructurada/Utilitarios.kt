package com.example.kotlinprogramacionestructurada

fun calcularCuadrado(primerNumero:Int):Int {
    return primerNumero*primerNumero
}
fun calcularCubo(primerNumero:Int):Int {
    return primerNumero*primerNumero*primerNumero
}
fun imprimirResultado(cuadrado:Int,cubo:Int){
    println("Cuadrado es:$cuadrado")
    println("Cubo es:$cubo")
}