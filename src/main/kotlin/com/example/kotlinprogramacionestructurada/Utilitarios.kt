package com.example.kotlinprogramacionestructurada
fun calcularAreaPentagono(lado: Int, apotema: Int): Int {
    return (lado * apotema) / 2
}

fun calcularPerimetroPentagono(lado: Int): Int  {
    return 5 * lado
}

fun imprimirAreaYPerimetroDelPentagono(area: Int, perimetro: Int) {
    println("El area es: $area")
    println("El perimetro es: $perimetro")
}