package chapter02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

// Listing 27 Using try as in Java

fun readNumber(reader: BufferedReader): Int? {
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch(e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun main() {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}