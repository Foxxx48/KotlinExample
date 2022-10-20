package com.fox.kotlinexample

class Seller(name:String, age: Int): Worker(name,age), Cleanable {

    override fun work() {
        println("I am selling")
    }

    override fun clean() {
        println("Seller clean")
    }



}