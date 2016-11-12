package def.screeps;
/**
 * A mineral deposit object. Can be harvested by creeps with a WORK body part using the extractor structure.
 */
public class Mineral extends RoomObject {
    /**
     * The prototype is stored in the Mineral.prototype global object. You can use it to extend game objects behaviour globally.
     */
    public Mineral prototype;
    /**
     * The remaining amount of resources.
     */
    public double mineralAmount;
    /**
     * The resource type, one of the RESOURCE_* constants.
     */
    public String mineralType;
    /**
     * A unique object identificator. You can use Game.getObjectById method to retrieve an object instance by its id.
     */
    public String id;
    /**
     * The remaining time after which the deposit will be refilled.
     */
    public double ticksToRegeneration;
}

