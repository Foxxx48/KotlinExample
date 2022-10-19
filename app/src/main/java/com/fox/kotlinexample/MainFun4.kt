package com.fox.kotlinexample

import kotlin.random.Random

fun main() {
    val sportsman = Sportsman()
    sportsman.callWaterBringer(object : WaterBringer {
        override fun bringWater() {
            println("Almost here")
        }
    })

    sportsman.invokeWaterBoy{ println("Almost invoke here")}

    println(Random.nextInt())
}