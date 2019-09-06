package chapter02

import java.io.BufferedReader
import java.io.StringReader

// Listing 29 Return a value in catch

fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine()) // This value is used when no exception happens
    } catch (e: NumberFormatException) {
        null // This value is used in case of an exception, (nothing will be printed, same as if we had nothing at all in the block)
    }
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber3(reader)
}