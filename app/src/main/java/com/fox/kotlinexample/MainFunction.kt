package com.fox.kotlinexample

fun main() {

    val employee = Employee("Jhon", "programmer", 2017)



    employee.work()
    employee.printInfo()


    val cat = Cat("Barsik", 1, 3.3f)
    val cat2 = Cat("Pushok", 2)


//    cat.printCatInfo()
//    println(cat.checkAge())
//    println(cat.isOld)

    val book = Book("Jingle Book", 1999, 25)
//    println("Book name: ${book.name} Year of publishing: ${book.publishing} Price:$${book.price}")

    val dog = Dog()
    dog.name = "hulky"
    dog.age = 3
    dog.weight = 40

//    println("Dog name is: ${dog.name} Dog age is: ${dog.age} Dog weight is: ${dog.weight}")

}

fun Employee.printInfo() {
    println("Name $name Post: $post Year: $startYear Stage: $stage")
}