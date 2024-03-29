package chapter02

// Listing 12 Using when for choosing the right enum value

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED    -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN  -> "Gave"
            Color.BLUE   -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}