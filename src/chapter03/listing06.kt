package chapter03

// Listing 3.6 No overriding extension functions

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!") // This line will not be called because no overriding

fun main(){
    val view: View = Button()
    view.showOff()
}