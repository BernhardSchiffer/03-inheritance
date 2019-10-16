package ohm.softa.a03.state;

import ohm.softa.a03.Cat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    static final Logger logger = LogManager.getLogger();
    int t;
    private final int duration;

    State(int duration) {
        this.duration = duration;
    }

    public final State tick(Cat cat) {
        t++;
        logger.info(t + "/" + cat.getCurrentState().getDuration() + " of " + cat.getCurrentState().getClass().getSimpleName());
        if(t == cat.getCurrentState().getDuration()) {
            return cat.getCurrentState().successor(cat);
        }
        else {
            return cat.getCurrentState();
        }
    }

    abstract State successor(Cat cat);

    private int getDuration() {
        return duration;
    }
}
