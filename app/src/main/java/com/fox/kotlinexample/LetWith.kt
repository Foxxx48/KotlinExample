package com.fox.kotlinexample

import kotlin.random.Random

var name: String? = "ertuower"

var array: MutableList<Int>? = mutableListOf()

fun main() {


    name?.let {
        if (it.length > 5) {
            println("name length > 5")
        }
    }

    val list = (0..100).toMutableList()
    with(list) {
        for (i in 0..100) {
            add(Random.nextInt(0, 100))
        }

        println("Первый элемент списка ${first()}")
        println("Последний элемент списка ${last()}")
        println("Сумма всех элементов списка ${sum()}")
        println("Среднее значение всех элементов списка ${average()}")
        println("Максимальное значение всех элементов списка ${max()}")
        println("Минимальное значение всех элементов списка ${min()}")

    }

    println()


    array?.let { it ->
        with(it) {
            for (i in 0..100) {
                add(Random.nextInt(0, 100))
            }
            println("Первый элемент листа ${first()}")
            println("Последний элемент листа ${last()}")
            println("Сумма всех элементов листа ${sum()}")
            println("Среднее значение всех элементов листа ${average()}")
            println("Максимальное значение всех элементов листа ${max()}")
            println("Минимальное значение всех элементов листа ${min()}")

            val result = it.filter { it % 2 == 0 }. take(5)
            result.forEach {
                println(it)
            }
        }
    }
}