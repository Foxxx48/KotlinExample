package com.fox.kotlinexample

class CustomList<T> : MyList<T> {
    var array = arrayOfNulls<Any>(10)
    var size = 0

    override fun get(index: Int): T {
        if (index in 0..array.size) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(element: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = element
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAt(index)
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0..size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }

    companion object {
        fun <T> customListOf(vararg elements: T): CustomList<T> {
            val list = CustomList<T>()
            for (element in elements) {
                list.add(element)
            }
            return list
        }
    }


}