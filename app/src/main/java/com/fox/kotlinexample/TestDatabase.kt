package com.fox.kotlinexample




class TestDatabase (val data: Database) {
    val s = "S"

    val d = Database()

    fun test() {
       println(data.data.size)
        println(data.name)
        println(data.version)
        data.showDatabaseInfo()
    }

    fun test2() {
        println(d.data.size)
        println(d.name)
        println(d.version)
        d.showDatabaseInfo()
    }

//  val df = Database()
//    fun inData(str: String){
//        df.insertData(str)
//    }

    companion object {
        fun insertData1(str: String) {
         Database.getInstance().insertData(str)
        }
        fun insertData2(str:String) {
            Database2.insertData2(str)
        }

    }
}