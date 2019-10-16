package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class DeathState extends State {

    DeathState() {
        super(0);
        t = 0;
        logger.info("I've starved for a too long time...good bye...");
    }

    @Override
    State successor(Cat cat) {
        return this;
    }
}
