package com.fox.kotlinexample

fun main() {
    val revenueByWeek = listOf(
        listOf(8,5,1,4,6),
        listOf(7,5,1,4,3),
        listOf(2,5,1,3,6),
        listOf(5,2,1,4,5),
        listOf(8,5,1,4,6)
    )

    val totalFlatMap = revenueByWeek.flatMap { it }

    val totalFlatMap2 = revenueByWeek.flatten()

    val total = mutableListOf<Int>()
    revenueByWeek.map {
        for (i in it) {
            total.add(i)
        }
    }

    val average = total.average()
    val average1 = totalFlatMap.average()
    val average2 = totalFlatMap2.average()

        println("Total: $average")
        println("Total1: $average1")
        println("Total2: $average2")




}