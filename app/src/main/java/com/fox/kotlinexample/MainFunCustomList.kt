package com.fox.kotlinexample

fun main() {
    val list = CustomList<String>()
    list.add("1")
    list.add("2")
    list.add("3")
    list.add("4")
    list.add("5")

    for (i in 0 until list.size()) {
        println(list.get(i))
    }

    val list2 = CustomList<Int>()
    for (i in 0 .. 100) {
        list2.add(i)
    }

    for (i in 0 until list2.size()) {
        println(list2.get(i))
    }

    val list3 = CustomList.customListOf(1,2,2,3,4)
    for (i in 0 until list3.size()) {
        println(list3.get(i))
    }



}