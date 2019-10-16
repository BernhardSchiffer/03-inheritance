package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class HungryState extends State {

    HungryState(int duration) {
        super(duration);
        t = 0;
        logger.info("Yoan... getting hungry!");
    }

    public State feed(Cat cat) {
        return new DigestingState(cat.getDigest());
    }

    @Override
    State successor(Cat cat) {
        return new DeathState();
    }
}
