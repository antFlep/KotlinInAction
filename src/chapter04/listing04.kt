package chapter04

// Listing 4.4 Defining another interface implementing the same method

interface Focusable {
    fun setFocus(b:Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

// Listing 4.5 Invoking an inherited interface method implementation
class Button3: Clickable2, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val btn = Button3()
    btn.showOff()
    btn.click()
    btn.setFocus(true)
}