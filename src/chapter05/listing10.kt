package chapter05

// Listing 5.10 Using function parameters in a lambda

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach{
        println("$prefix $it")
    }
}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error:")
}