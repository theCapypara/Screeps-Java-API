package def.screeps;
@jsweet.lang.Interface
public abstract class CPU extends jsweet.lang.Object {
    public double limit;
    public double tickLimit;
    public double bucket;
    /**
     * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
     */
    native public double getUsed();
}

