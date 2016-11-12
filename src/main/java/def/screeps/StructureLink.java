package def.screeps;
/**
 * Remotely transfers energy to another Link in the same room.
 */
public class StructureLink extends OwnedStructure {
    /**
     * The amount of game ticks the link has to wait until the next transfer is possible.
     */
    public double cooldown;
    /**
     * The amount of energy containing in the link.
     */
    public double energy;
    /**
     * The total amount of energy the link can contain.
     */
    public double energyCapacity;
    /**
     * Transfer energy from the link to another link or a creep. If the target is a creep, it has to be at adjacent square to the link. If the target is a link, it can be at any location in the same room. Remote transfer process implies 3% energy loss and cooldown delay depending on the distance.
     * @param target The target object.
     * @param amount The amount of energy to be transferred. If omitted, all the available energy is used.
     */
    native public double transferEnergy(Creep target, double amount);
    /**
     * Transfer energy from the link to another link or a creep. If the target is a creep, it has to be at adjacent square to the link. If the target is a link, it can be at any location in the same room. Remote transfer process implies 3% energy loss and cooldown delay depending on the distance.
     * @param target The target object.
     * @param amount The amount of energy to be transferred. If omitted, all the available energy is used.
     */
    native public double transferEnergy(Creep target);
    /**
     * Transfer energy from the link to another link or a creep. If the target is a creep, it has to be at adjacent square to the link. If the target is a link, it can be at any location in the same room. Remote transfer process implies 3% energy loss and cooldown delay depending on the distance.
     * @param target The target object.
     * @param amount The amount of energy to be transferred. If omitted, all the available energy is used.
     */
    native public double transferEnergy(StructureLink target, double amount);
    /**
     * Transfer energy from the link to another link or a creep. If the target is a creep, it has to be at adjacent square to the link. If the target is a link, it can be at any location in the same room. Remote transfer process implies 3% energy loss and cooldown delay depending on the distance.
     * @param target The target object.
     * @param amount The amount of energy to be transferred. If omitted, all the available energy is used.
     */
    native public double transferEnergy(StructureLink target);
}

