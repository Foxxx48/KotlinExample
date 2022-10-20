package com.fox.kotlinexample

fun main() {
    val database1 = Database.getInstance()
    database1.insertData("1")
    database1.insertData("2")
    TestDatabase.insertData1("3")
    TestDatabase.insertData1("4")

    val database2 = Database2
    database2.insertData2("1")
    database2.insertData2("2")
    TestDatabase.insertData2("3")
    TestDatabase.insertData2("4")


    val test = TestDatabase(database1)
    println()

    test.test()
    println()

    test.test2()
    println()

    database2.printInfoData2()




//    database.showDatabaseInfo()

}