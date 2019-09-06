package chapter02

import chapter02.Color.*
// Listing 15 Using different objects in when branches

fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty Color")
}

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
    println(mix(BLUE, VIOLET))
    println(mix(YELLOW, RED))
}