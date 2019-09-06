package chapter02.geometry.shapes

import java.util.Random

// Listing 8 Putting a class and function declaration in a package

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}