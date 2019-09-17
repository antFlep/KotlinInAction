package chapter04

// Listing 4.6 Declaring an open class with an open method

open class RichButton: Clickable2 {
    fun disable() {}         // this function is final, it can't be overridden in a subclass
    open fun animate() {}    // this function is open, it can be overridden in a subclass
    override fun click() {}  // this function overrides an open function and is open as well
}

// Listing 4.7 Forbidding an override
open class RichButton2: Clickable2 {
    final override fun click() {}  // override without final == open -> explicit "final" is needed
}