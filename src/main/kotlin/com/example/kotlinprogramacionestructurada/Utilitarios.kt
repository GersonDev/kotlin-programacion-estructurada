package com.example.kotlinprogramacionestructurada

fun calcularCociente(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno / numeroDos
}

fun calcularResiduo(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno % numeroDos
}

fun imprimirCocienteYResiduo(cociente: Int, residuo: Int) {
    println("El cociente es:$cociente")
    println("El residuo es:$residuo")
}
