package com.fox.kotlinexample

fun main() {

    println(volume(10,20, 10))

}

fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c