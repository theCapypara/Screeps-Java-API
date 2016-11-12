package def.screeps;
/**
 * Non-player structure. Contains power resource which can be obtained by
 * destroying the structure. Hits the attacker creep back on each attack.
 */
public class StructurePowerSpawn extends OwnedStructure {
    /**
     * The amount of energy containing in this structure.
     */
    public double energy;
    /**
     * The total amount of energy this structure can contain.
     */
    public double energyCapacity;
    /**
     * The amount of power containing in this structure.
     */
    public double power;
    /**
     * The total amount of power this structure can contain.
     */
    public double powerCapacity;
    /**
     * Create a power creep. Currently in development
     * @param name The name of the power creep.
     */
    native public double createPowerCreep(String name);
    /**
     * Register power resource units into your account. Registered power allows to develop power creeps skills. Consumes 1 power resource unit and 50 energy resource units.
     */
    native public double processPower();
    /**
     * Transfer the energy from this structure to a creep.
     * @param target The creep object which energy should be transferred to.
     * @param amount The amount of energy to be transferred. If omitted, all the remaining amount of energy will be used.
     */
    native public double transferEnergy(Creep target, double amount);
    /**
     * Transfer the energy from this structure to a creep.
     * @param target The creep object which energy should be transferred to.
     * @param amount The amount of energy to be transferred. If omitted, all the remaining amount of energy will be used.
     */
    native public double transferEnergy(Creep target);
}

