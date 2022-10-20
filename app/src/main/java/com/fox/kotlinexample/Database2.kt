package com.fox.kotlinexample

object Database2 {
    val name = "db.2"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData2(str: String) {
        data.add(str)
    }

    fun printInfoData2(){
        data.forEach {
            println(it)
        }
    }
}