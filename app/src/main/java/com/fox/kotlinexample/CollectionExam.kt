package com.fox.kotlinexample

fun main() {
    val data = mapOf(
        "January" to listOf(100, 100, 100, 100),
        "February" to listOf(200, 200, -190, 200),
        "March" to listOf(300, 180, 300, 100),
        "April" to listOf(250, -250, 100, 300),
        "May" to listOf(200, 100, 400, 300),
        "June" to listOf(200, 100, 300, 300),
        "July" to listOf(200, -100, 300, -300),
        "August" to listOf(200, 100, 800, 300)
    )

printInfo(data)

}

private fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filter { it.value.all { it > 0 }}

    println(validData.keys.joinToString())

    val wrongValue = data.filter { it -> it.value.any { it < 0 } }.keys.joinToString()
    val weekAverage = validData.flatMap { it.value}.average()
    val averageInMonth = validData.map { it.value.sum() }.average()
    val listOfSum =  validData.map { it.value.sum() }
    val maxAverage = listOfSum.max()
    val minAverage = listOfSum.min()
    val monthWithMaxAverage = validData.filter { it.value.sum() == maxAverage }.keys.joinToString()
    val monthWithMinAverage = validData.filter { it.value.sum() == minAverage }.keys.joinToString()


    println("Средняя выручка неделю: $weekAverage")
    println("Средняя выручка в месяц: $averageInMonth")
    println("Максимальная выручка в месяц: $maxAverage")
    println("Была в следующий месяц: $monthWithMaxAverage")
    println("Минимальная выручка в месяц: $minAverage")
    println("Была в следующий месяц: $monthWithMinAverage")
    println("Ошибки произошли в следующих меяцах: $wrongValue")









}


