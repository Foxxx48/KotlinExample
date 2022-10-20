package com.fox.kotlinexample

fun main() {
    val address1 = Address("Moscow", "Triumfalnaya" , 39)
    val address2 = Address("Moscow", "Triumfalnaya" , 39)

    val (city, street, homeNumber) = address1

    val address3 = address1.copy( "Voronezh", homeNumber=34)
    val address4 = address1

    println(city)
    println(street)
    println(homeNumber)

    println(address1)
    println(address2)
    println(address3)

    println(address1 == address2)
    println(address1 === address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address3.hashCode())
    println(address4.hashCode())

    println(address1 == address3)
    println(address1 === address3)

    println(address1 == address4)
    println(address1 === address4)


    val student1 = Student("Jhon", "Malkovich", 1234)
    val student2 = Student("Jhon", "Malkovich", 1234)
//    println(student1)
//    println(student2)
//    println(student1 === student2)
//    println(student1.hashCode())
//    println(student2.hashCode())
//    println(student1 == student2)

    val employee = Employee("Jhon", "programmer", 2017)
//    employee.work()
//    employee.printEmployeeInfo()

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

fun Employee.printEmployeeInfo() {
    println("Name $name Post: $post Year: $startYear Stage: $stage")
}