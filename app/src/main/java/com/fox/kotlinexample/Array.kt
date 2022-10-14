package com.fox.kotlinexample

fun main(args: Array<String>) {
    val array = arrayOfNulls<Int>(100)

    for (i in 0 until  100) {
        array[i] = i
    }

    for (i in 100 downTo 0 step 25) {
        println(i)
    }


}