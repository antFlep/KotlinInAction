package chapter02

// Listing 2.9 Importing the function from another package

// imports a function by name
import chapter02.geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}