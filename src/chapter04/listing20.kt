package chapter04

// Listing 4.20 Implementing hashCode for client

class Client20(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client20)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }
}

fun main() {
    val alice1 = Client20("Alice", 143)
    val alice2 = Client20("Alice", 143)

    println(alice1 == alice2)

    val processed = hashSetOf(alice1)
    println(processed.contains(alice2))
}