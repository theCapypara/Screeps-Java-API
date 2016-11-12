package def.screeps;
/**
 * Decreases movement cost to 1. Using roads allows creating creeps with less
 * `MOVE` body parts.
 */
public class StructureRoad extends Structure {
    /**
     * The amount of game ticks when this road will lose some hit points.
     */
    public double ticksToDecay;
}

