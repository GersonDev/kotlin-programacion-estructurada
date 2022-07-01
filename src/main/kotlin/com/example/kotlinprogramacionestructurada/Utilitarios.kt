package com.example.kotlinprogramacionestructurada

fun calcularPerimetro(base: Int, haltura: Int) : Int{
    return 2 * (base + haltura)
}
fun calcularArea(base: Int, haltura: Int): Int{
    return base * haltura
}

fun imprimirResultado(perimetro: Int, area:Int){
    println("El perimetro del rectangulo es: $perimetro")
    println("El area del rectangulo es: $area")}