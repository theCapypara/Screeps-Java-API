package def.screeps;
/**
 * A site of a structure which is currently under construction.
 */
public class ConstructionSite extends RoomObject {
    /**
     * A unique object identificator. You can use Game.getObjectById method to retrieve an object instance by its id.
     */
    public String id;
    /**
     * Whether this is your own construction site.
     */
    public Boolean my;
    /**
     * An object with the structure???s owner info
     */
    public Owner owner;
    /**
     * The current construction progress.
     */
    public double progress;
    /**
     * The total construction progress needed for the structure to be built.
     */
    public double progressTotal;
    /**
     * One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
     */
    public String structureType;
    /**
     * Remove the construction site.
     * @returns Result Code: OK, ERR_NOT_OWNER
     */
    native public double remove();
}

