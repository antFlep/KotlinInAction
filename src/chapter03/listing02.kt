package chapter03

// Listing 3.2 Declaring joinToString() with default parameter values

fun <T> joinToString2(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf(1, 2, 3)
    println(joinToString2(list))
    println(joinToString2(list, postfix = "]", prefix = "# ["))
}