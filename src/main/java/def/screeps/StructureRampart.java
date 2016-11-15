package def.screeps;
import jsweet.lang.Object;

/**
 * Blocks movement of hostile creeps, and defends your creeps and structures on
 * the same tile. Can be used as a controllable gate.
 */
public class StructureRampart extends OwnedStructure {
    /**
     * The amount of game ticks when this rampart will lose some hit points.
     */
    public double ticksToDecay;
    /**
     * If false (default), only your creeps can step on the same square. If true, any hostile creeps can pass through.
     */
    public Boolean isPublic;
    /**
     * Make this rampart public to allow other players' creeps to pass through.
     * @param isPublic Whether this rampart should be public or non-public
     */
    native public Object setPublic(Boolean isPublic);
}

