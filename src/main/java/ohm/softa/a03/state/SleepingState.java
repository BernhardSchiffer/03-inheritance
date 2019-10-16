package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class SleepingState extends State {

    public SleepingState(int duration) {
        super(duration);
        t = 0;
        logger.info("Yoan... getting tired!");
    }

    @Override
    State successor(Cat cat) {
        return new HungryState(cat.getAwake());
    }
}
