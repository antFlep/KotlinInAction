package chapter04

// Listing 4.21 Client as a data class

data class Client21(val name: String, val postalCode: Int)

fun main() {
    val alice = Client21("alice", 321)
    val boris = Client21("alice", 321)
    println("Are Alice and Boris are the same person? Answer: ${alice == boris}")
    val people = listOf(alice)
    println("Is Boris in our people register? Answer: ${people.contains(boris)}")
    println("Information about Boris: $boris")
}