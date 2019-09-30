package chapter05.sequences

fun main() {
    // this will not be printed:
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter{ print("filter($it) "); it % 2 == 0}

    // this will be printed:
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter{ print("filter($it) "); it % 2 == 0}
            .toList()
}