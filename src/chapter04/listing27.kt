package chapter04

// Listing 4.27 Declaring a named companion object

class Person27(val name: String) {

    companion object Loader {
        fun fromJSON(jsonText: String): Person =
                Person(
                        jsonText.substringAfter(""""name":""")
                                .substringBefore(",")
                )
    }

}

fun main() {
    val jsonText = """{ "name":"John", "age":30, "car":null };"""
    val person = Person27.fromJSON(jsonText)
    println(person)
}