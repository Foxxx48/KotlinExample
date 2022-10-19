package com.fox.kotlinexample

import com.fox.kotlinexample.Months.*
import com.fox.kotlinexample.Seasons.*

fun main() {
    val month = SEPTEMBER

    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN

    }

    println(season)
}