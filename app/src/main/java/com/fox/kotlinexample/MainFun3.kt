package com.fox.kotlinexample

fun main() {
    val bicycle = Bicycle("Canyon")
    val car = Car("Nissan")
    val car1: Transport = Car("BMW")
    val bicycle2: Transport = Bicycle("Cannondale")
    val transports = mutableListOf<Transport> (bicycle, bicycle2, car, car1)


    bicycle.apply {
        drive()
    }

    car.apply {

        if (startEngine()) {
            drive()
        }
    }

    car1.apply {
        println("Car name: $name")
        if (isStop()) {
            drive()
        } else {
            println("Engin not working")
        }
    }

    bicycle2.apply {
        drive()
    }

    transports.forEach {
        it.stop()
    }

}