package com.fox.kotlinexample

class Cat(val name: String, var age: Int, val weight: Float = 0f) {

    val isOld: Boolean
        get() = age >= 12

    fun printCatInfo() {
        println("Cat name: $name Cat age: $age Cat weight: $weight")
    }

    fun checkAge(): Boolean {
        return age > 0
    }

    private fun printCatInfo2(cat: Cat) {
        println("Cat name: ${cat.name} Cat age: ${cat.age} Cat weight: ${cat.weight}")
    }
}