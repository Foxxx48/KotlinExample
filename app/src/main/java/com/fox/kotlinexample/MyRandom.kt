package com.fox.kotlinexample

import kotlin.random.Random

class MyRandom {

    companion object {
        fun randomNumber(number: Int, to: Int): Int {
            return Random.nextInt(number, to)
        }

        fun randomBoolean(): Boolean {
            return Random.nextBoolean()
        }

        fun randomDay(): String {
            return Days.values()[Random.nextInt(Days.values().size)].toString()
        }
    }

}