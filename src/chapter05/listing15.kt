package chapter05

import java.awt.Button

// Listing 5.15 Using a SAM constructor to reuse a listener instance

fun main() {
    val button1 = Button()
    val button2 = Button()

    val listener = onClickListener { view ->
        val text = when (view.id) {
            R.id.button1 -> "Frist button"
            R.id.button2 -> "Second button"
            else -> "Unkown button"
        }
        toast(text)
    }

    button1.setOnClickListener(listener)
    button2.setOnClickListener(listener)
}