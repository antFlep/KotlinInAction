package chapter04

// Listing 4.29 Defining an extension function for a companion object

// business logic module
class Person29(val firstName: String, val lastName: String) {
    companion object{

    }
}

// client/server communication module
fun Person29.Companion.fromJSON(json: String): Person29 =
        Person29(
                json.substringAfter(""""name":""")
                        .substringBefore(","),
                json.substringAfter(""""lastName":""")
                        .substringBefore(",")
        )

fun main() {
    val jsonText = """{ "name":"John", "lastName":"Deer", "car":null };"""
    val person = Person29.fromJSON(jsonText)
    println(person)
}