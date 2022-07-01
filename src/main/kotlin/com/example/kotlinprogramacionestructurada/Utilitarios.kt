package com.example.kotlinprogramacionestructurada
private val PI: Double = 3.14
fun calcularArea(radio: Double): Double {
    return PI * (radio * radio)
}
fun calcularPerimetro(radio: Double): Double {
    return 2 * PI * radio
}
fun imprimirPerimetroYArea(area: Double, perimetro: Double) {
    println("El area del circulo es: $area")
    println("El perimetro de del circulo es:  $perimetro")
}