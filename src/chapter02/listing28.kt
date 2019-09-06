package chapter02

import java.io.BufferedReader
import java.io.StringReader

// Listing 28 Using try as an expression

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}