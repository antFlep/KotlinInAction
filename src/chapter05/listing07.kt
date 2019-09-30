package chapter05

// Listing 5.7 Passing a lambda outside of parentheses

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(" ") {p: Person -> p.name}
    println(names)
}