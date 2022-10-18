package com.fox.kotlinexample

fun main() {
myWith("hello") {
    plus(2)
    toUpperCase()
}
    println(myWith(
        4
    ) {
        plus(24)
    })

    customFun(4) {
        it.plus(2)
    }
}

private inline fun sumOfListElement(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}

private inline fun customFun(number: Int, operator:(Int) ->Int): Int {
    return operator(number)
}


inline fun <T,R> myWith(obj: T, operator: T.() -> R): R {
    return obj.operator()

}