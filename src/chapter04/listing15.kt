package chapter04

// Listing 5.15 Accessing the backing field in a setter

class User15(val name: String) {
    var address: String = "unspecified"
        set(value:String) {
            println( """
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent())
            field = value
        }
}

fun main() {
    val boris = User15("Boris Johnson")
    boris.address = "10 Downing Street, Westminster, London, UK"
    boris.address = "Hell"

}