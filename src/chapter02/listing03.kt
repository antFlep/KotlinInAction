package chapter02

// Listing 3 Simple Java class Person

/*
public class Person{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
    return name;
    }
}
 */

// Listing 2.4 Person class converted to Kotlin
class Person(val name: String)

fun main(args: Array<String>) {
    val person: Person = Person("Sonia")
    println("We created: $person.name")
}