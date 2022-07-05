package com.example.kotlinprogramacionestructurada

fun calcularImparesYMultiplos(){
    val v: Array<Int> = Array(10) { -1 }
    val b: Array<Int> = Array(10) { -1 }
    val a: Array<Int> = Array(10) { -1 }
    var i = 1
    var j = 1
    var k = 1
    for (i in 0..9) {
        println("Dame dato:")
        v[i] = readLine()!!.toInt()
    }
    do {
        if (v[i] % 2 ==1) {
            a[i]=v[i]
            j += 1
        }
        if (v[i] % 3 ==0) {
            b[k]=v[i]
            k+=1
        }
    } while (i>10)
    for (i in 0..k) {
        println("Multipl de 3")
        println(a[k])
    }
    for (i in 0..k) {
        println("Multipl de 2")
        println(b[k])
    }
}