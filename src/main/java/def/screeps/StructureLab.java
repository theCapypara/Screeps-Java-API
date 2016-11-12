package def.screeps;
/**
 * Produces mineral compounds from base minerals and boosts creeps.
 */
public class StructureLab extends OwnedStructure {
    /**
     * The amount of game ticks the lab has to wait until the next reaction is possible.
     */
    public double cooldown;
    /**
     * The amount of energy containing in the lab. Energy is used for boosting creeps.
     */
    public double energy;
    /**
     * The total amount of energy the lab can contain.
     */
    public double energyCapacity;
    /**
     * The amount of mineral resources containing in the lab.
     */
    public double mineralAmount;
    /**
     * The type of minerals containing in the lab. Labs can contain only one mineral type at the same time.
     */
    public String mineralType;
    /**
     * The total amount of minerals the lab can contain.
     */
    public double mineralCapacity;
    /**
     * Boosts creep body part using the containing mineral compound. The creep has to be at adjacent square to the lab. Boosting one body part consumes 30 mineral units and 20 energy units.
     * @param creep The target creep.
     * @param bodyPartsCount The number of body parts of the corresponding type to be boosted. Body parts are always counted left-to-right for TOUGH, and right-to-left for other types. If undefined, all the eligible body parts are boosted.
     */
    native public double boostCreep(Creep creep, double bodyPartsCount);
    /**
     * Produce mineral compounds using reagents from two another labs. Each lab has to be within 2 squares range. The same input labs can be used by many output labs
     * @param lab1 The first source lab.
     * @param lab2 The second source lab.
     */
    native public double runReaction(StructureLab lab1, StructureLab lab2);
    /**
     * Transfer resource from this structure to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType, double amount);
    /**
     * Boosts creep body part using the containing mineral compound. The creep has to be at adjacent square to the lab. Boosting one body part consumes 30 mineral units and 20 energy units.
     * @param creep The target creep.
     * @param bodyPartsCount The number of body parts of the corresponding type to be boosted. Body parts are always counted left-to-right for TOUGH, and right-to-left for other types. If undefined, all the eligible body parts are boosted.
     */
    native public double boostCreep(Creep creep);
    /**
     * Transfer resource from this structure to a creep. The target has to be at adjacent square.
     * @param target The target object.
     * @param resourceType One of the RESOURCE_* constants.
     * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
     */
    native public double transfer(Creep target, String resourceType);
}

