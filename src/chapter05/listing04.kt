package chapter05

// Listing 5.4 Searching through a collection using a lambda

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
}