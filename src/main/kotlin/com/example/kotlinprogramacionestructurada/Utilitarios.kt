package com.example.kotlinprogramacionestructurada

fun contraseñaCorrecta() {
    do {
        println("DAME LA CONTRASEÑA")
        val numeroIngresado = readLine()!!.toInt()
        if (numeroIngresado != 252525) println("CONTRASEÑA INCORRECTA")
    } while (numeroIngresado != 252525)
    println("CONTRASEÑA CORRECTA ")
}
