package com.fox.kotlinexample

fun main(args: Array<String>) {
    val time = 50
    val temp = 40

    val day = time in 7 until 23
    val night = time in 23 until 25
    val wrongTime = time >= 25
    val wrongTemp = temp >= 40

    val cold = temp < 15
    val niceWeather = temp in 15 until 25
    val hot = temp >= 25
    val sleep = time in 0 until 7


//    if (day && cold) println("Читаем книги, смотрим фильмы")
//    if (day && niceWeather) println("Идём гулять")
//    if (day && hot) println("Едем на море")
//    if (night) println("Ложимся спать")
//    if (sleep) println("Спим")
//    if (wrongTime) println("Неправильное время")

    when{
        day && cold -> println("Читаем книги, смотрим фильмы")
        day && niceWeather -> println("Идём гулять")
        day && hot -> println("Едем на море")
        night -> println("Ложимся спать")
        sleep -> println("Спим")
        wrongTime -> println("Неправильное время")
        wrongTemp -> println("Неправильная температура")
    }
}