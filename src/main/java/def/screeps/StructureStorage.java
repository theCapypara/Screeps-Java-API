package def.screeps;
/**
 * A structure that can store huge amount of resource units. Only one structure
 * per room is allowed that can be addressed by `Room.storage` property.
 */
public class StructureStorage extends OwnedStructure {
    /**
     * An object with the storage contents.
     */
    public StoreDefinition store;
    /**
     * The total amount of resources the storage can contain.
     */
    public double storeCapacity;
    /**
     * Transfer resource from this storage to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType, double amount);
    /**
     * An alias for storage.transfer(target, RESOURCE_ENERGY, amount). This method is deprecated.
     * @param target The target object.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     * @deprecated
     */
    native public double transferEnergy(Creep target, double amount);
    /**
     * Transfer resource from this storage to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType);
    /**
     * An alias for storage.transfer(target, RESOURCE_ENERGY, amount). This method is deprecated.
     * @param target The target object.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     * @deprecated
     */
    native public double transferEnergy(Creep target);
}

