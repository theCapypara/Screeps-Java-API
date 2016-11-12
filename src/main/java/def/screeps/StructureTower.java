package def.screeps;
/**
 * Remotely attacks or heals creeps, or repairs structures. Can be targeted to
 * any object in the room. However, its effectiveness highly depends on the
 * distance. Each action consumes energy.
 */
public class StructureTower extends OwnedStructure {
    /**
     * The amount of energy containing in this structure.
     */
    public double energy;
    /**
     * The total amount of energy this structure can contain.
     */
    public double energyCapacity;
    /**
     * Remotely attack any creep in the room. Consumes 10 energy units per tick. Attack power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
     * @param target The target creep.
     */
    native public double attack(Creep target);
    /**
     * Remotely heal any creep in the room. Consumes 10 energy units per tick. Heal power depends on the distance to the target: from 400 hits at range 10 to 200 hits at range 40.
     * @param target The target creep.
     */
    native public double heal(Creep target);
    /**
     * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
     * @param target The target structure.
     */
    native public double repair(Spawn target);
    /**
     *
     * @param target The creep object which energy should be transferred to.
     * @param amount The amount of energy to be transferred. If omitted, all the remaining amount of energy will be used.
     */
    native public double transferEnergy(Creep target, double amount);
    /**
     *
     * @param target The creep object which energy should be transferred to.
     * @param amount The amount of energy to be transferred. If omitted, all the remaining amount of energy will be used.
     */
    native public double transferEnergy(Creep target);
    /**
     * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
     * @param target The target structure.
     */
    native public double repair(Structure target);
}

