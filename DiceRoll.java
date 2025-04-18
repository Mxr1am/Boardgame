import java.util.Random;


public class DiceRoll {

    private Random random;

    public DiceRoll() {
        random = new Random();
    }

    /**
     * Rolls a dice and returns a value between 1 and 6.
     */
    public int roll() {
        return random.nextInt(6) + 1;
    }
}

