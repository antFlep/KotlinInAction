package chapter05

// Listing 5.9 Using the default parameter name

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
}