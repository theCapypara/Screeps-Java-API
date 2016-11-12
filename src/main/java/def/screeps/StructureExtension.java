package def.screeps;
/**
 * Contains energy which can be spent on spawning bigger creeps. Extensions can
 * be placed anywhere in the room, any spawns will be able to use them regardless
 * of distance.
 */
public class StructureExtension extends OwnedStructure {
    /**
     * The amount of energy containing in the extension.
     */
    public double energy;
    /**
     * The total amount of energy the extension can contain.
     */
    public double energyCapacity;
    /**
     * Transfer the energy from the extension to a creep.
     * @param target The creep object which energy should be transferred to.
     * @param amount The amount of energy to be transferred. If omitted, all the remaining amount of energy will be used.
     */
    native public double transferEnergy(Creep target, double amount);
    /**
     * Transfer the energy from the extension to a creep.
     * @param target The creep object which energy should be transferred to.
     * @param amount The amount of energy to be transferred. If omitted, all the remaining amount of energy will be used.
     */
    native public double transferEnergy(Creep target);
}

