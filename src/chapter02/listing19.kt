package chapter02

// Listing 19 Using if-expressions that return values

fun eval2(e: Expr): Int =
        if (e is Num)
            e.value
        else if (e is Sum)
            eval2(e.left) + eval2(e.right)
        else
            throw IllegalArgumentException("Unkown expression")

fun main(args: Array<String>) = println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))