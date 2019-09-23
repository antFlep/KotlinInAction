package chapter04

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent


// Listing 4.31 Accessing local variables from an anonymous object

fun countClicks(window: Window) {
    var clickCount = 0
    window.isVisible = true
    window.addMouseListener(
            object: MouseAdapter() {
                override fun mouseClicked(e: MouseEvent?) {
                    println("Clicked: ${++clickCount} times ")
                }
            }
    )
}

fun main() {
    val window = Window("Listing 4.31")
    countClicks(window)
}