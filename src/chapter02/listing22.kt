package chapter02

// Listing 22 Using when to implement the Fizz-Buzz game

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i %  5 == 0 -> "Buzz "
    i %  3 == 0 -> "Fizz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 1..100) print(fizzBuzz(i))

    // Listing 23 Iterating over a range with a step
    println("")
    for (i in 100 downTo 1 step 2) print(fizzBuzz(i))

    // Test if it does ignore condition if second range value is smaller than the first one
    for (i in 1..0) println("should not go inside")
}
