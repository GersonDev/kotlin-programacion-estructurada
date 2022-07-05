package com.example.kotlinprogramacionestructurada

fun main() {
    var i = 2
    var ma = 1
    var me = 0
    var p1 = 0
    var p2 = 0
    val array: Array<Int> = arrayOf(10)
    println("Dame los datos:")
    array[i] = readLine()!!.toInt()
    me = array[i]
    val pe = 1
    do {
        array[i] = readLine()!!.toInt()
        if (array[i] > ma) {
            ma = array[i]
            p1 = 1
        }
        if (array[i] < me) {
            me = array[i]
            p2 = i
        }
        i = i + 1
        while (i > 10)
            println("Vector 1")
        i = 1
        do {
            println(array[i])
            i = i + 1
        } while (i > 10)
            println("Mayor, $ma,posicion, $i")
            println("Menor, $me,posicion, $i")
    }