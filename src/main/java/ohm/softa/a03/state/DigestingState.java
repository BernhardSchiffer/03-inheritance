package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class DigestingState extends State {

    DigestingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        return new PlayfulState(cat.getAwake() - t);
    }
}
