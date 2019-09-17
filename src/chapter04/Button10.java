package chapter04;

// Listing 10 Implementing View in Java with an inner class

public class Button10 implements View {

    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {
        /*  placeholder */
    }

    public class ButtonState implements State{
        /*  Placeholder */
    }
}
