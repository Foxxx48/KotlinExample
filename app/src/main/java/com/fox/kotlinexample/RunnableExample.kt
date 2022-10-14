package com.fox.diexample2

import kotlin.random.Random

fun main() {
//    val result = (Math.random() * 10 + 1).toInt()
//    val result2 = Random.nextInt(0, 10)
//    println(result)
//    println(result2)

    var win = false
    val random = Random.nextInt(0, 1000_000_000)
    println("Random $random")
    val timer = Thread (object :Runnable{
        override fun run() {
            var i = 0
            try {
                while (!win){
                    println(i)
                    i++
                    Thread.sleep(1000)
                }
            } catch (_: Exception) {

            }
        }
    })


    val player = Thread(object : Runnable{
        override fun run() {
            while (!win) {
                val guessNumber = Random.nextInt(0, 1000_000_000)
                if (guessNumber == random) {
                    win = true
                    println("GessNumber $guessNumber" )
                }
            }
        }
    })
    timer.start()
    player.start()


}