package com.fox.kotlinexample

fun main() {
    val sportsman = Sportsman()
    sportsman.callWaterBringer(object : WaterBringer {
        override fun bringWater() {
            println("Almost here")
        }
    })

    sportsman.invokeWaterBoy{ println("Almost invoke here")}
}