package chapter02

// Listing 20 Using when instead of if-cascade

fun eval3(e: Expr): Int =
        when(e) {
            is Num -> e.value
            is Sum -> eval3(e.left) + eval3(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) = println(eval3(Sum(Sum(Num(1), Num(2)), Num(4))))