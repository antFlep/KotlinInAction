package chapter04

// Listing 4.13 Expression as sealed classes

// Mark a base class as sealed
sealed class Expr13{
    // List of all possible subclasses:
    class Num(val value: Int) : Expr13()
    class Sum(val left: Expr13, val right: Expr13): Expr13()
}

fun eval(e: Expr13): Int =
        // "when" covers all possible cases, so no "else" branch is required
        when(e) {
            is Expr13.Num -> e.value
            is Expr13.Sum -> eval(e.left) + eval(e.right)
        }