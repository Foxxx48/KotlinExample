package com.fox.kotlinexample

fun main() {
    val list = listOf(1, 6, 2, 4, 5, 6, 8, 3)
    val intArray1 = intArrayOf(1, 6, 2, 4, 5, 6, 8, 3)
    val intArray2 = intArrayOf(1, 6, 2, 4, 5, 6, 8, 3)
    val array = arrayOf(1, 6, 2, 4, 5, 6, 8, 3)
    val mutableList = mutableListOf(1, 6, 2, 4, 5, 6, 8, 3)


    println(sort(6,7,1,5,2,3))
    println(sort(array))
    println(sort(list))

    intArray1.bubbleSort()
    println(intArray1.toList())

    println(onBubbleSort(intArray2).toList())

    println(sortBubble(mutableList))

}

fun sort(array: Array<Int>): List<Int> {
    return array.sorted()
}

fun sort(list: List<Int>): List<Int> {
    return list.sorted()
}

fun sort(vararg args: Int): List<Int> {
    args.sort()
    return args.toList()
}

fun sortBubble(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size -1 downTo i) {
            if (numbers[j] < numbers[j-1]){
                val temp = numbers[j]
                numbers[j] = numbers[j-1]
                numbers[j-1] = temp
            }
        }
    }
    return numbers
}

//fun sortBubble(numbers: MutableList<Int>): List<Int> {
//    for (i in 1 until numbers.size) {
//        for (j in i until numbers.size -1  ) {
//            if (numbers[j] > numbers[j+1]){
//                val temp = numbers[j]
//                numbers[j] = numbers[j+1]
//                numbers[j+1] = temp
//            }
//        }
//    }
//    return numbers
//}

fun IntArray.bubbleSort() {
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 1 until this.size) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sorted = false
            }
        }
    }
}

fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}

fun onBubbleSort(arr:IntArray):IntArray{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until arr.size-1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp

                swap = true
            }
        }
    }
    return arr
}