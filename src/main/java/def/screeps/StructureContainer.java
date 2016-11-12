package def.screeps;
/**
 * Contains up to 2,000 resource units. Can be constructed in neutral rooms. Decays for 5,000 hits per 100 ticks.
 */
public class StructureContainer extends Structure {
    /**
     * An object with the structure contents. Each object key is one of the RESOURCE_* constants, values are resources
     * amounts. Use _.sum(structure.store) to get the total amount of contents
     */
    public Object store;
    /**
     * The total amount of resources the structure can contain.
     */
    public double storeCapacity;
    /**
     * Transfer resource from this structure to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType, double amount);
    /**
     * Transfer resource from this structure to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType);
}

