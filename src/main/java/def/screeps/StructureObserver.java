package def.screeps;
/**
 * Provides visibility into a distant room from your script.
 */
public class StructureObserver extends OwnedStructure {
    /**
     * Provide visibility into a distant room from your script. The target room object will be available on the next tick. The maximum range is 5 rooms.
     * @param roomName
     */
    native public double observeRoom(String roomName);
}

