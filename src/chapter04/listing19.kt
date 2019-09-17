package chapter04

// Listing 4.19 Implementing equals() for client

class Client19(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client19)
            return false
        return name == other.name && postalCode == other.postalCode
    }
}

fun main() {
    val alice1 = Client19("Alice", 143)
    val alice2 = Client19("Alice", 143)

    println(alice1 == alice2)

    val processed = hashSetOf(alice1)
    println(processed.contains(alice2))
}