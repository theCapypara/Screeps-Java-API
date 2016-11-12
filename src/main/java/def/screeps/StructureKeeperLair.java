package def.screeps;
/**
 * Non-player structure. Spawns NPC Source Keepers that guards energy sources
 * and minerals in some rooms. This structure cannot be destroyed.
 */
public class StructureKeeperLair extends OwnedStructure {
    /**
     * Time to spawning of the next Source Keeper.
     */
    public double ticksToSpawn;
}

