package com.fox.kotlinexample

import kotlin.math.sqrt

fun main() {
    val age = 997
    println(age.isAgeValid())
    println(age.isPositive())

    if (age.isPositive()) {
        println("Your Welcome!")
    } else {
        println("Wrong age. Try again.")
    }

    when(age.isPrimeNumber()) {
        true -> println("$age is a prime number")
        false -> println("$age is not a prime number")
        else -> println("it is wrong number")
    }
}

fun Int.isAgeValid() = this in (6..100)

fun Int.isPositive() = this >= 0

//fun Int.isSimpleNumber() {
//   if (this % this == 0 || this % 1 == 0) {
//
//   }
//}

//fun Int.isSimpleNumber() = this % this == 1 && this % 2 == 0

fun Int.isPrimeNumber(): Boolean {
    if (this <= 3) return true
    for (i in 2..sqrt(this.toDouble()).toInt())
        if (this % i == 0) {
            return false
        }
    return true
}

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for(i in 2 until this){
        if (this % i == 0) return false
    }
    return true
}