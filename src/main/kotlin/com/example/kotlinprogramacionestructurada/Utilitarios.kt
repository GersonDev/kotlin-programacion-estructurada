package com.example.kotlinprogramacionestructurada

 fun calcularSiEsDivisible(primerNumero: Int):Boolean{
    if(primerNumero % 2 == 0 && primerNumero % 5 == 0)return true
    return false
}
fun imprimirSiesDivisible(primerNumero: Int){
    val identificarSiEsDivisible=calcularSiEsDivisible(primerNumero)
    if (identificarSiEsDivisible)
        println("El $primerNumero es divisible entre 2 y 5")
    else
    {
        println("El $primerNumero no es divisible entre 2 y 5")
    }
}