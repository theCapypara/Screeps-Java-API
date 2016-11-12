package def.screeps;
/**
 * A non-player structure.
 * Instantly teleports your creeps to a distant room acting as a room exit tile.
 * Portals appear randomly in the central room of each sector.
 */
public class StructurePortal extends Structure {
    /**
     * The position object in the destination room.
     */
    public RoomPosition destination;
    /**
     * The amount of game ticks when the portal disappears, or undefined when the portal is stable.
     */
    public double ticksToDecay;
}

