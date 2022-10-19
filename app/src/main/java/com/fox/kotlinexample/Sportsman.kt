package com.fox.kotlinexample

class Sportsman {
    fun callWaterBringer(waterBringer: WaterBringer) {
        waterBringer.bringWater()
    }
    inline fun invokeWaterBoy (bringWat: ()->Unit) {
        bringWat()
    }
}