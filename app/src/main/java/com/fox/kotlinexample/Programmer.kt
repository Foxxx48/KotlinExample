package com.fox.kotlinexample

class Programmer(name: String, age: Int, val lang: String) : Worker(name, age), Cleanable {

    override fun work() {
        println("I am writing code")
    }

    override fun clean() {
        println("Programmer clean")
    }
}