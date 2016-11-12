package def.screeps;
/**
 * Sends any resources to a Terminal in another room.
 */
public class StructureTerminal extends OwnedStructure {
    /**
     * An object with the storage contents. Each object key is one of the RESOURCE_* constants, values are resources amounts.
     */
    public Object store;
    /**
     * The total amount of resources the storage can contain.
     */
    public double storeCapacity;
    /**
     * Sends resource to a Terminal in another room with the specified name.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be sent. The minimum amount is 100.
     * @param destination The name of the target room. You don't have to gain visibility in this room.
     * @param description The description of the transaction. It is visible to the recipient. The maximum length is 100 characters.
     */
    native public double send(String resourceType, double amount, String destination, String description);
    /**
     * Transfer resource from this terminal to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType, double amount);
    /**
     * Sends resource to a Terminal in another room with the specified name.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be sent. The minimum amount is 100.
     * @param destination The name of the target room. You don't have to gain visibility in this room.
     * @param description The description of the transaction. It is visible to the recipient. The maximum length is 100 characters.
     */
    native public double send(String resourceType, double amount, String destination);
    /**
     * Transfer resource from this terminal to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType);
}

