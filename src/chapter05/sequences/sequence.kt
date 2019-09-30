package chapter05.sequences

class Person(val name: String)

fun main() {
    val people = listOf(
            Person("Alice"),
            Person("Boris"),
            Person("Henry"),
            Person("Maria"),
            Person("Theresa"))

    // This creates a list at each step:
    val peopleWithA = people.map(Person::name).filter {it.startsWith("A")}
    println(peopleWithA)

    // With sequences that is not the case:
    val peopleWithB = people.asSequence() // converts collection to sequence
            .map(Person::name)  // sequences support the same API as collections
            .filter { it.startsWith("B") }
            .toList() // convert the las resulting sequence back into a list collection
    println(peopleWithB)
}