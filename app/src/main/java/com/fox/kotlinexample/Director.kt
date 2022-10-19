package com.fox.kotlinexample

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Ruling of process")
    }
}