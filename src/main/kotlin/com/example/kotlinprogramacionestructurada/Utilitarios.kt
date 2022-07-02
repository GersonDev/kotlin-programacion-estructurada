package com.example.kotlinprogramacionestructurada

fun areaDeFiguras(opcion:Int){
    when (opcion) {
        1 -> {
            println("CUADRADO")
            println("DAME LA MEDIDA DE UN LADO")
            val medida = readLine()!!.toInt()
            val A = medida * medida
            println("Area es igual a: $A")
        }
        2 -> {
            println("RECTANGULO")
            println("DAME LAS MEDIDAS DE SUS LADOS:")
            val primerLado = readLine()!!.toInt()
            val segundoLado = readLine()!!.toInt()
            val A = primerLado * segundoLado
            println("Area es: $A")
        }
        3 -> {
            println("TRIANGULO")
            println("DAME BASE Y ALTURA:")
            val base = readLine()!!.toInt()
            val altura = readLine()!!.toInt()
            val A = (base * altura) / 2
            println("Area es: $A")

        }
        else -> {
            println("FIN DEL PROGRAMA")
        }
    }
}