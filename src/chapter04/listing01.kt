package chapter04

// Listing 4.1 Declaring a simple interface
interface Clickable {
    fun click()
}

// Listing 4.2 Implementing a simple interface
class Button: Clickable {
    override fun click() {
        println("I was clicked")
    }
}

fun main() = Button().click()