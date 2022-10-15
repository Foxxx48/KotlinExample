package com.fox.kotlinexample

fun main() {
    val data = mapOf(
        "file1" to listOf(10,20,30,40,50),
        "file2" to listOf(10,20,30,40,50),
        "file3" to listOf(10,20,30,40,50,60),
    )

    val average = data.flatMap { it.value }.average()
    println(average)

    val wrongData = mapOf(
        "file1" to listOf(10,20,30,40,50),
        "file2" to listOf(10,-20,30,40,50000),
        "file3" to listOf(10,20,30,40,50,60),

    )
    val average2 = wrongData.filter { it -> it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average2)
}