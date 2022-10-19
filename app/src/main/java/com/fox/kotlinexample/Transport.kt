package com.fox.kotlinexample

abstract class Transport(val name: String) {
   abstract fun drive()

   fun isStop() = false

   abstract fun stop()
}