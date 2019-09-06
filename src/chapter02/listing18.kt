package chapter02

import java.lang.IllegalArgumentException

// Listing 18  Evaluating expressions with an if-cascade

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // this explicit cast to Num is redundant
        return n.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main (args: Array<String>) = println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))