package chapter05.functional

class Book(val title: String, val authors: List<String>)

fun main() {
    val books = listOf(
            Book("leviathan wakes", listOf("James S.A. Corey")),
            Book("caliban's war", listOf("James S.A. Corey")),
            Book("caliban's war", listOf("James S.A. Corey")),
            Book("a clash of kings", listOf("George R.R. Martin")),
            Book("a storm of swords", listOf("George R.R. Martin")),
            Book("kotlin in action", listOf("Dmitry Jemerov", "Svetlana Isakova")))

    println(books.flatMap { it.authors })
    println(books.flatMap { it.authors }.toSet())
}