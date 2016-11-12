package def.screeps;
/**
 * An energy source object. Can be harvested by creeps with a WORK body part.
 */
public class Source extends RoomObject {
    /**
     * The prototype is stored in the Source.prototype global object. You can use it to extend game objects behaviour globally:
     */
    public Source prototype;
    /**
     * The remaining amount of energy.
     */
    public double energy;
    /**
     * The total amount of energy in the source. Equals to 3000 in most cases.
     */
    public double energyCapacity;
    /**
     * A unique object identificator. You can use Game.getObjectById method to retrieve an object instance by its id.
     */
    public String id;
    /**
     * The remaining time after which the source will be refilled.
     */
    public double ticksToRegeneration;
}

