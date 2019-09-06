package chapter02

// Listing 11 Declaring an enum class with properties

enum class ColorP(val r: Int, val g: Int, val b: Int) { // declares properties of enum constants
    RED   (255,   0,   0), // specifies property values when each constant is created
    ORANGE(255, 165,   0),
    YELLOW(255, 255,   0),
    GREEN (  0, 255,   0),
    BLUE  (  0,   0, 255),
    INDIGO( 75,   0, 130),
    VIOLET(238, 130, 238); // the semicolon here is required

    fun rgb() = (r * 256 + g) * 256 + b // defines a method on the enum class
}

fun main(args: Array<String>){
    println(ColorP.BLUE.rgb())
}