package com.fox.kotlinexample

fun main(args: Array<String>) {

    val temp = 80

    var result = when {
        temp in 1..99 -> {
            "Water"
        }
        temp >= 100 -> {
            "Gas"
        }
        temp < 0 -> {
            "Ice"
        }
        else -> {
            "Not found"
        }
    }
    println(result)

}