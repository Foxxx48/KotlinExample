package com.fox.kotlinexample

class Car(name: String) : Transport(name) {
    override fun drive() {
        println("Car name:$name move")
    }

    override fun stop() {
       println("Car name:$name is stop")
    }

    fun startEngine(): Boolean {
        println("Starting engine...")
        return true
    }
}