package chapter04

// Listing 4.16 Declaring a property with a private setter

class  LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word:String) {
        counter += word.length
    }
}

fun main() {
    val lc = LengthCounter()
    val word = "Hello"
    println("counter: ${lc.counter}")
    println("""adding Word "$word" """)
    lc.addWord(word)
    println("counter: ${lc.counter}")

}