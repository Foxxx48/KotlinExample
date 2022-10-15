package com.fox.kotlinexample

fun main() {
    val square = { a: Int -> a * a }

    val sq: (Int) -> Int = { it * it }

    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }

    val name: (String) -> Unit = {println("Hi $it!")}

    val arraySort: (Array<Int>) -> Array<Int> = {array -> array.sortedArrayDescending() }



    println(square(10))
    println(sq(10))

    println(perimeter(10,10))
    name("James")
    val array = arrayOf(15,1,2,7,5,8,9,)
    println(arraySort(array).toList())

}