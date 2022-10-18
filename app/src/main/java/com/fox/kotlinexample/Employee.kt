package com.fox.kotlinexample

import java.util.*

class Employee(val name:String, val post: String, val startYear: Int ) {

    val stage: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Работаю")
    }
}