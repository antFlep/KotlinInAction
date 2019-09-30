package chapter05

// Listing 5.12 Generating and using a sequence of natural numbers

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
    // All the delayed operations are performed when the result "sum" is obtained
}