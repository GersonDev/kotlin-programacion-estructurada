package com.example.kotlinprogramacionestructurada


fun imprimirResultado():String{
    var i = 3
    var a = 0
    while (i <= 99) {
      a = a + i
        i = i + 3
    }
    return "La suma de la serie de 3,6,9...99 es:$a"
}
