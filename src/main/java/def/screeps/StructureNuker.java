package def.screeps;
/**
 * Launches a nuke to another room dealing huge damage to the landing area.
 * Each launch has a cooldown and requires energy and ghodium resources. Launching
 * creates a Nuke object at the target room position which is visible to any player
 * until it is landed. Incoming nuke cannot be moved or cancelled. Nukes cannot
 * be launched from or to novice rooms.
 */
public class StructureNuker extends OwnedStructure {
    /**
     * The amount of energy contained in this structure.
     */
    public double energy;
    /**
     * The total amount of energy this structure can contain.
     */
    public double energyCapacity;
    /**
     * The amount of energy contained in this structure.
     */
    public double ghodium;
    /**
     * The total amount of energy this structure can contain.
     */
    public double ghodiumCapacity;
    /**
     * The amount of game ticks the link has to wait until the next transfer is possible.
     */
    public double cooldown;
    /**
     * Launch a nuke to the specified position.
     * @param pos The target room position.
     */
    native public double launchNuke(RoomPosition pos);
}

