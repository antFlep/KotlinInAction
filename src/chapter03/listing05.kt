package chapter03

// Listing 3.5 Overriding a member function

open class View{
    open fun click() = println("view clicked")
}

class Button: View() {
    override fun click() = println("button clicked")
}

fun main() {
    val view: View = Button()
    view.click()
}