package chapter05

// Listing 5.5 Searching using a member reference

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy(Person::age))
}