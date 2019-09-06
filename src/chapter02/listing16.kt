package chapter02

import chapter02.Color.*

// Listing 16 when without an argument

fun mixOptimized(c1: Color, c2: Color) = when {
    (c1 == RED    && c2 == YELLOW || c1 == YELLOW && c2 == RED   ) -> ORANGE
    (c1 == YELLOW && c2 == BLUE   || c1 == BLUE   && c2 == YELLOW) -> GREEN
    (c1 == BLUE   && c2 == VIOLET || c1 == VIOLET && c2 == BLUE  ) -> ORANGE
    else -> throw Exception("Dirty Color")
}

fun main(args: Array<String>) = println(mixOptimized(BLUE, YELLOW))