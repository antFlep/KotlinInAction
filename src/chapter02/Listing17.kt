package chapter02

// Listing 17 Expression class hierarchy

interface Expr

class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr