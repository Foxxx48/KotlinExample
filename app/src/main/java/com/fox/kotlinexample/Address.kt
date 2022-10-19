package com.fox.kotlinexample

class Address(
    val city: String, val street: String, val homeNumber: Int
) {
    fun copy(city: String = this.city, street: String = this.street, homeNumber: Int = this.homeNumber ) : Address {
        return Address(city, street, homeNumber)
    }
    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = homeNumber

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
//        if (this === other) return true
        if (other !is Address) return false
        other as Address
        if (city != other.city || street != other.street || homeNumber != other.homeNumber) return false
        return true
    }

    override fun hashCode(): Int {
        return city.hashCode() + street.hashCode() + homeNumber.hashCode()
    }

    override fun toString(): String {
        return "City: $city Street: $street Home: $homeNumber"
    }
}