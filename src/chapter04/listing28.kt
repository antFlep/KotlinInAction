package chapter04

// Listing 4.28 Implementing an interface in a companion object

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person28(val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person =
            Person(
                    jsonText.substringAfter(""""name":""")
                            .substringBefore(",")
            )
    }
}