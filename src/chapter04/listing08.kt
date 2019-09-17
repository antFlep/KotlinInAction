package chapter04

// Listing 08 Declaring an abstract class

abstract class Animated {
    abstract fun animate()      // abstract functions are open by default and don't have an implementation

    open fun stopAnimating() {}
    fun animateTwice() {}       // non abstract functions aren't open by default
}