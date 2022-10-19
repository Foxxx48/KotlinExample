package com.fox.kotlinexample

class Bicycle(name: String) : Transport(name) {
    override fun drive() {
        println("Bicycle name:$name move")
    }

    override fun stop() {
        println("Bicycle name:$name is stop")
    }
}