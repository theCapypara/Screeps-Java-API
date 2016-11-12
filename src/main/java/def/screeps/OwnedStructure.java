package def.screeps;
/**
 * The base prototype for a structure that has an owner. Such structures can be
 * found using `FIND_MY_STRUCTURES` and `FIND_HOSTILE_STRUCTURES` constants.
 */
public class OwnedStructure extends Structure {
    /**
     * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
     */
    public Boolean my;
    /**
     * An object with the structure???s owner info (if present) containing the following properties: username
     */
    public Owner owner;
}

