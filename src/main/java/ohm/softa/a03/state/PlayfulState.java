package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class PlayfulState extends State {

    PlayfulState(int duration) {
        super(duration);
        logger.info("Getting in a playful mood!");
    }

    @Override
    State successor(Cat cat) {
        return new SleepingState(cat.getSleep());
    }
}
