package chapter04

// Listing 4.11 Implementing View in Kotlin with a nested class

class Button11: View{
    override fun getCurrentState(): State {
        return ButtonState()
    }

    override fun restoreState(state: State) {
        /*  placeholder */
    }

    class ButtonState: State {
        /*  placeholder */
    }
}