package com.fox.kotlinexample

class Database {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }

    fun showDatabaseInfo() {
        data.forEach {
            println(it)
        }
    }

    companion object {
       private var db: Database? = null

        fun getInstance(): Database {
            db?.let {
                return it
            }
            val instance = Database()
            db = instance
            return instance
        }
    }
}