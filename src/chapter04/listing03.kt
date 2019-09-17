package chapter04

// Listing 4.3

interface Clickable2 {
    fun click()
    fun showOff() = println("I'm clickable")  // Method with default implementation
}

class Button2: Clickable2 {
    override fun click() {
        println("I was clicked")
    }
}

fun main() {
    val btn = Button2()
    btn.click()
    btn.showOff()
}