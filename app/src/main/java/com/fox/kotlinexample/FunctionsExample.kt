package com.fox.kotlinexample

fun main() {
    fun numberOfChars(s:String) : String = s.substring(0 .. 2)

    println(numberOfChars("Sergey"))
    println("Sergey".substring(0..2))
    println("Sergey".length)
}