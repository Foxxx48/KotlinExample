package com.fox.kotlinexample

fun main() {
    val month: String = "Septe"

    val season = when(month) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" ->"Spring"
        "June", "July", "August" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> "Not found"
    }

    println(season)
}