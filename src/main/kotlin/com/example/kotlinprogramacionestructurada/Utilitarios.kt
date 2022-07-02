package com.example.kotlinprogramacionestructurada

fun calcularAngulo(numeroDeAngulo: Int): Boolean {
    if (numeroDeAngulo >= 0) {
        if (numeroDeAngulo < 90) {
            return true
        }
    } else if (numeroDeAngulo > 90) {
        return true
    }
    return false
}

fun imprimirAngulo(numeroDeAngulo: Int): Unit {
    val calcularAngulo = calcularAngulo(numeroDeAngulo)
    if (calcularAngulo) {
        print("Angulo agudo...")
    } else if (calcularAngulo) {
        print("Angulo Obtuso...")
    } else {
        print("Error...")
    }
}