package com.fox.kotlinexample

import kotlin.random.Random

fun main() {
  val array = mutableListOf<Int>()
    for (i in 0 until 1000) {
        array.add(Random.nextInt(0,1000))
    }

//    println(array.toList())

    val sortedArrayOfString = array.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in sortedArrayOfString) {
        println(i)
    }
}