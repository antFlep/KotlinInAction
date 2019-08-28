package chapter02

fun main(args: Array<String>) {
    println("Hello World!")
    println(max(1,3))
    println(simpleMax(13, 7))
    println(infereMax(8, 5))

    val a = 15
    val b = 23

    val d: Double = 56.0
    assert(23 == max(a, b))
    println(d)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun simpleMax(a: Int, b: Int): Int = if (a > b) a else b
fun infereMax(a: Int, b: Int) = if (a > b) a else b
