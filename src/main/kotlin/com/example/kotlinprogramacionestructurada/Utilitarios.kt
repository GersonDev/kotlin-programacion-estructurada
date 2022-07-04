package com.example.kotlinprogramacionestructurada

fun calcularBusqueda(){
    val array: Array<Int> = Array(10) { -1 }
    for (i in 0..9) {
        println("INGRESE EL NUMERO  EN LA POSICION $i ")
        array[i] = readLine()!!.toInt()
    }
    println("INGRESE NUMERO A BUSCAR")
    val numeroABuscar = readLine()!!.toInt()
    var posicion = 0
    for (i in 0..9) {
        if (array[i] == numeroABuscar) {
            println("el  numero $numeroABuscar se encuentra en la posicion $i")
            posicion = i
        }
    }
    if (posicion != 0) {
        println("NUMERO NO ENCONTRADO")
    }
}