package com.fox.kotlinexample

fun main() {
    val listOfNumbers = (0 .. 100).toList()
    val doubleNumbers = listOfNumbers.map { it * 2 }
    println(doubleNumbers)

    val employees = listOfNumbers.map { "Employee №$it" }

//    println(employees)

    for (i in employees) {
        println(i)
    }
    println()
    println()

    employees.forEach {
        println(it)
    }
}