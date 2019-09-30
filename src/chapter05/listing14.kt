package chapter05

// Listing 5.14 Using SAM constructor to return a value

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All Done!") }
}

fun main() {
    createAllDoneRunnable().run()
}