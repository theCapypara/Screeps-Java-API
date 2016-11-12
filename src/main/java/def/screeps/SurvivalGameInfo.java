package def.screeps;
/**
 * An object with survival game info
 */
@jsweet.lang.Interface
public abstract class SurvivalGameInfo extends jsweet.lang.Object {
    /**
     * Current score.
     */
    public double score;
    /**
     * Time to the next wave of invaders.
     */
    public double timeToWave;
    /**
     * The number of the next wave.
     */
    public double wave;
}

