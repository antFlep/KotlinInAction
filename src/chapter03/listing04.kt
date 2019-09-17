package chapter03

// Listing 3.4 Declaring joinToString() as an extension

fun <T> Collection<T>.joinToString4(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString4(separator, prefix, postfix)

fun main() {
    val list = listOf(1, 2, 4)
    println(list.joinToString4(prefix = "[", postfix = "]"))
    val sList = listOf("one", "two", "three")
    println(sList.join(" ", "(", ")"))
}