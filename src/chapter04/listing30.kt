package chapter04

import java.awt.Dimension
import java.awt.Frame
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent

// Listing 4.30 Implementing an event listener with an anonymous object

class Window(name: String) : Frame(name) {
    init {
        super.setSize(Dimension(300, 100))
        this.addWindowListener(
                object: WindowAdapter() {
                    override fun windowClosing(e: WindowEvent) {
                        destroy()
                    }
                }
        )
    }

    fun destroy(){
        this.dispose()
    }
}

fun main() {
    val windows = Window("My Window")
    windows.addMouseListener(
            object: MouseAdapter(){
                override fun mouseClicked(e: MouseEvent) {
                    println("mouse clicked on window")
                }
                override fun mouseEntered(e: MouseEvent) = println("mouse entered window")
            })

    windows.isVisible = true
}