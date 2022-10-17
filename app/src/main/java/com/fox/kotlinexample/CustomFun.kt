package com.fox.kotlinexample

fun main() {

val result = modifyString("Hello world!") {  it.toUpperCase() }
    println(result)

    val array  = (0..100).toMutableList()
 for (i in 0 until 100) {
     array[i]
 }
    val result2 = sumOfElements(array) {it.sum()}
    println(result2)

    val list = (0..100).toList()

    sumOfListElement(list) {
        println(it.sum())
    }
}

inline fun  modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

private inline fun sumOfElements(array: MutableList<Int>, modify: (MutableList<Int>) -> Int): Int {
    return modify(array)
}

private inline fun sumOfListElement(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}