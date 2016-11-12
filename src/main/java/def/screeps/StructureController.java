package def.screeps;
/**
 * Claim this structure to take control over the room. The controller structure
 * cannot be damaged or destroyed. It can be addressed by `Room.controller`
 * property.
 */
public class StructureController extends OwnedStructure {
    /**
     * Current controller level, from 0 to 8.
     */
    public double level;
    /**
     * The current progress of upgrading the controller to the next level.
     */
    public double progress;
    /**
     * The progress needed to reach the next level.
     */
    public double progressTotal;
    /**
     * An object with the controller reservation info if present: username, ticksToEnd
     */
    public ReservationDefinition reservation;
    /**
     * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
     */
    public double ticksToDowngrade;
    /**
     * The amount of game ticks while this controller cannot be upgraded due to attack.
     */
    public double upgradeBlocked;
    /**
     * Make your claimed controller neutral again.
     */
    native public double unclaim();
}

