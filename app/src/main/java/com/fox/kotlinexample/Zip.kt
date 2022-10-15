package com.fox.kotlinexample

import kotlin.concurrent.fixedRateTimer
import kotlin.random.Random

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()

    for (i in 0..10) {
        names.add("Name$i")
        phones.add(79_000_000_000 + Random.nextLong(0, 1_000_000_000))
    }
    println(names)
    println(phones)

    val users = names.zip(phones)
    for (user in users) {
        println("User: ${user.first} Phone: ${user.second}")
    }

    println()
    println()

    val fullNames = mutableListOf<String>()

    for (i in 0..10) {
        fullNames.add("First Name:$i SecondName:$i")
    }
    val secondNames = fullNames.map { it.substringAfterLast(" ") }
    for (i in secondNames) {
        println(i)
    }
    println()

    val firstNames = fullNames.map { it.substringBefore("SecondName:") }
    for (i in firstNames) {
        println(i)
    }
    println()
    println()

    val zipFullNames = firstNames.zip(secondNames)
    for (i in zipFullNames) {
        println("${i.first}  ${i.second}")
    }


}