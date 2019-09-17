package chapter04

import java.io.Serializable

// Listing 4.9 Declaring a view with serializable state

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

