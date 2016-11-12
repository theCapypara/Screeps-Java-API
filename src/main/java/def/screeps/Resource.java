package def.screeps;
/**
 * A dropped piece of resource. It will decay after a while if not picked up. Dropped resource pile decays for ceil(amount/1000) units per tick.
 */
public class Resource extends RoomObject {
    /**
     * The amount of resource units containing.
     */
    public double amount;
    /**
     * A unique object identificator. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
     */
    public String id;
    /**
     * One of the `RESOURCE_*` constants.
     */
    public String resourceType;
}

