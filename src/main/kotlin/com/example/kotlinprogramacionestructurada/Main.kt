package com.example.kotlinprogramacionestructurada

fun main() {
    var z = 0
    var x = 0
    var i = 0
    val array: Array<Int> = Array(10) { -1 }
    println("Programa que busca un numero en un vector, indica la posicion y veces que se repite")
    for (i in 0..9) {
        println("Dame dato $i")
        array[i] = readLine()!!.toInt()
    }
    println("Datos capturados")
    i = 1
    while (i <= 10) {
        println(array[i])
        i = i + 1
    }
    println("Dame dato que buscas")
    var a = readLine()!!.toInt()
    x = 0
    for (i in 1..10) {
        if (x == array[i]) {
            z = i
            x = x + 1
        }
        println("El data se haya en la posicion, $z")
    }
    println("Se repite, $x , veces")
}
