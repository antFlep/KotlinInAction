package chapter05

// Listing 5.8 Omitting lambda parameter type

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy{p: Person -> p.age})
    println(people.maxBy{p -> p.age})
}