package def.screeps;
/**
 * The main global game object containing all the gameplay information.
 */
@jsweet.lang.Interface
public abstract class Game extends jsweet.lang.Object {
    /**
     * An object containing information about your CPU usage with the following properties:
     */
    public static CPU cpu;
    /**
     * A hash containing all your creeps with creep names as hash keys.
     */
    public static Creeps creeps;
    /**
     * A hash containing all your flags with flag names as hash keys.
     */
    public static Flags flags;
    /**
     * Your Global Control Level, an object with the following properties :
     */
    public static GlobalControlLevel gcl;
    /**
     * A global object representing world GameMap.
     */
    public static GameMap map;
    /**
     * A global object representing the in-game market.
     */
    public static Market market;
    /**
     * A hash containing all the rooms available to you with room names as hash keys.
     */
    public static Rooms rooms;
    /**
     * A hash containing all your spawns with spawn names as hash keys.
     */
    public static Spawns spawns;
    /**
     * A hash containing all your structures with structure id as hash keys.
     */
    public static Structures structures;
    /**
     * A hash containing all your construction sites with their id as hash keys.
     */
    public static ConstructionSites constructionSites;
    /**
     * System game tick counter. It is automatically incremented on every tick.
     */
    public static double time;
    /**
     * Get an object with the specified unique ID. It may be a game object of any type. Only objects from the rooms which are visible to you can be accessed.
     * @param id The unique identificator.
     * @returns an object instance or null if it cannot be found.
     */
    native public static <T> T getObjectById(String id);
    /**
     * Send a custom message at your profile email. This way, you can set up notifications to yourself on any occasion within the game. You can schedule up to 20 notifications during one game tick. Not available in the Simulation Room.
     * @param message Custom text which will be sent in the message. Maximum length is 1000 characters.
     * @param groupInterval If set to 0 (default), the notification will be scheduled immediately. Otherwise, it will be grouped with other notifications and mailed out later using the specified time in minutes.
     */
    native public static void notify(String message, double groupInterval);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Creeps extends jsweet.lang.Object {
        native public Creep $get(String creepName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Flags extends jsweet.lang.Object {
        native public Flag $get(String flagName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Rooms extends jsweet.lang.Object {
        native public Room $get(String roomName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Spawns extends jsweet.lang.Object {
        native public Spawn $get(String spawnName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Structures extends jsweet.lang.Object {
        native public Structure $get(String structureId);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ConstructionSites extends jsweet.lang.Object {
        native public ConstructionSite $get(String constructionSiteId);
    }
    /**
     * Send a custom message at your profile email. This way, you can set up notifications to yourself on any occasion within the game. You can schedule up to 20 notifications during one game tick. Not available in the Simulation Room.
     * @param message Custom text which will be sent in the message. Maximum length is 1000 characters.
     * @param groupInterval If set to 0 (default), the notification will be scheduled immediately. Otherwise, it will be grouped with other notifications and mailed out later using the specified time in minutes.
     */
    native public static void notify(String message);
}

