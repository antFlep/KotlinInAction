package chapter05

import java.io.File

// Listing 5.13 Generating and using a sequence of parent directories

fun File.isInsideHiddenDirectory() =
        generateSequence (this) { it.parentFile }.any{ it.isHidden }

fun main() {
    val file = File("C:\\Users\\fa529\\AppData\\Roaming\\.gitkraken\\config")
    println(file.isInsideHiddenDirectory())
}