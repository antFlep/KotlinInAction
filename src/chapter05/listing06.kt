package chapter05

// Listing 5.6 Passing a lambda as a named argument

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ", transform = {p: Person -> p.name})
    println(names)
}
