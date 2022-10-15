package com.fox.kotlinexample

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfNumbers2 = (0 .. 100).toList()

    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }

    val names = mutableListOf("James", "Kirk", "Lars", "Jason", "Arnold")
    val namesStartFromA = names.filter { name -> name.startsWith("A") }
//    val namesStartFromA = names.filter {it.startsWith("A")}
    for (i in namesStartFromA) {
        println(i)
    }
//    val listOfNumbers2 = arrayOf(100,55,2,45,34,78,85,33,45,99,87,98)
    val sortIntWithBubblesDownTo: (Array<Int>) -> Array<Int> = {
            for (i in it.size - 2 downTo 0) {
                for (j in 0 .. i) {
                    if (it[j] < it[j+1]){
                        val temp = it[j]
                        it[j] = it[j+1]
                        it[j+1] = temp
                    }
                }
            }
        it
    }

    val sortedWithBubble: (Array<Int>) -> Array<Int> = {
        for( i in 1 until  it.size) {
            for (j in it.size -1 downTo  i) {
                if (it[j] < it[j-1]) {
                    val temp = it[j]
                    it[j] = it[j - 1]
                    it[j - 1] = temp
                }
            }
        }
        it
    }


    println(sortIntWithBubblesDownTo(arrayOf(100,55,2,45,34,78,85,33,45,99,87,98)).toList())
    println(sortedWithBubble(arrayOf(100,55,2,45,34,78,85,33,45,99,87,98)).toList())
}