package def.screeps;
/**
 * Parent object for structure classes
 */
public class Structure extends RoomObject {
    /**
     * The current amount of hit points of the structure.
     */
    public double hits;
    /**
     * The total amount of hit points of the structure.
     */
    public double hitsMax;
    /**
     * A unique object identificator. You can use Game.getObjectById method to retrieve an object instance by its id.
     */
    public String id;
    /**
     * One of the STRUCTURE_* constants.
     */
    public String structureType;
    /**
     * Destroy this structure immediately.
     */
    native public double destroy();
    /**
     * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
     */
    native public Boolean isActive();
    /**
     * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
     * @param enabled Whether to enable notification or disable.
     */
    native public double notifyWhenAttacked(Boolean enabled);
}

