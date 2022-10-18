package com.fox.kotlinexample

class Dog {
    var name: String? = null
        get() {
            return if (field.isNullOrBlank()) {
                "DOG"
            } else {
                field?.replaceFirstChar { it.uppercase() }
            }
        }
    set(value) {
        val s = value?.length?: throw RuntimeException("Dog name = null")
        if (s > 5) {
            field = "Wrong name!"
        } else {
            field = value
        }
    }

    var age = 0
        set(value) {
            if (value <= 0) {
                field = age
            } else {
                field = value
            }
        }
    var weight = 0
        set(value) {
            field = if (value <= 0) {
                weight
            } else {
                value
            }
        }
}