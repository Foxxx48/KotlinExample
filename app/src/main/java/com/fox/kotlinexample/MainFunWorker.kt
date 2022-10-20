package com.fox.kotlinexample

import com.fox.kotlinexample.Months.*
import com.fox.kotlinexample.Seasons.*


fun main() {
    val worker1 = Programmer("Stanley", 34, "Java")
    val worker2 = Seller("John", 22)
    val worker3 = Seller("Sam", 21)
    val worker4 = Programmer("Steven", 45, "Kotlin")
    val worker5 = Director("Sam", 50)
    val workers = mutableListOf<Worker>(worker2, worker3, worker4, worker1, worker5)

//    workers.forEach {
//        println("My name is ${it.name}-${it.javaClass.simpleName} ")
//        it.work()
//        if (it is Cleanable) {
//            it.clean()
//        }
//        if (it is Programmer){
//            println(it.lang)
//        }

//        val cleaners = mappingList(workers) {
//            it.filter { it is Cleanable }.map { it as Cleanable }
//        }
//        cleaners.forEach {
//            it.clean()
//        }
        val cl = mappingList2(workers)
        cl.forEach {
            it.clean()
        }

    }

    val month = SEPTEMBER

    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN

    }

//    println(season)


fun mappingList(list: MutableList<Worker>, operator: (MutableList<Worker>) -> List<Cleanable> ): List<Cleanable>{
    return operator(list)
}

fun mappingList2(list: MutableList<Worker>): List<Cleanable> {
    return list.filter { it is Cleanable }.map { it as Cleanable }
}