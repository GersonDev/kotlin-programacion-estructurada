package com.example.kotlinprogramacionestructurada

fun imprimirDiaDeSemana(numeroDeDiaDeSemana: Int) {
    when (numeroDeDiaDeSemana) {
        1 -> {
           println("DOMINGO")
        }
        2 -> {
            println("LUNES")
        }
        3 -> {
            println("MARTES")
        }
        4 -> {
            println("MIERCOLES")
        }
        5 -> {
            println("JUEVES")
        }
        6 -> {
            println("VIERNES")
        }
        7 -> {
            println("SABADO")
        }
    }
}