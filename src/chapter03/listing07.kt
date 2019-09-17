package chapter03

// Listing 3.7 Declaring an extension property

val String.lastChar: Char
    get() = get(length -1)

// Listing 3.8 Declaring a mutable extension property

var StringBuilder.lastChar: Char
    get () = get(length - 1)
    set (value: Char) {
        setCharAt(length - 1, value)
    }

fun main() {
    val sString ="hello"
    println(sString.lastChar)
    val mString = StringBuilder("worlö")
    mString.lastChar = 'd'
    println(mString.lastChar)
}
