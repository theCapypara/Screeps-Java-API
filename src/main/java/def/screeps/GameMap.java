package def.screeps;
import jsweet.lang.Object;

/**
 * A global object representing world map. Use it to navigate between rooms. The object is accessible via Game.map property.
 */
public class GameMap extends jsweet.lang.Object {
    /**
     * List all exits available from the room with the given name.
     * @param roomName The room name.
     * @returns The exits information or null if the room not found.
     */
    native public DescribeExits describeExits(String roomName);
    /**
     * Find the exit direction from the given room en route to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @return The room direction constant, one of the following:
     * FIND_EXIT_TOP, FIND_EXIT_RIGHT, FIND_EXIT_BOTTOM, FIND_EXIT_LEFT
     * Or one of the following Result codes:
     * ERR_NO_PATH, ERR_INVALID_ARGS
     */
    native public jsweet.util.union.Union<String,Double> findExit(String fromRoom, String toRoom);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(String fromRoom, String toRoom, Opts opts);
    /**
     * Get the linear distance (in rooms) between two rooms. You can use this function to estimate the energy cost of
     * sending resources through terminals, or using observers and nukes.
     * @param roomName1 The name of the first room.
     * @param roomName2 The name of the second room.
     */
    native public double getRoomLinearDistance(String roomName1, String roomName2);
    /**
     * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
     * @param x X position in the room.
     * @param y Y position in the room.
     * @param roomName The room name.
     */
    native public String getTerrainAt(double x, double y, String roomName);
    /**
     * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
     * @param pos The position object.
     */
    native public String getTerrainAt(RoomPosition pos);
    /**
     * Check if the room with the given name is protected by temporary "newbie" walls.
     * @param roomName The room name.
     * @returns A boolean value.
     */
    native public Boolean isRoomProtected(String roomName);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DescribeExits extends jsweet.lang.Object {
        @jsweet.lang.Name("1")
        public String _1;
        @jsweet.lang.Name("3")
        public String _3;
        @jsweet.lang.Name("5")
        public String _5;
        @jsweet.lang.Name("7")
        public String _7;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class FindRoute extends jsweet.lang.Object {
        public String exit;
        public String room;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Opts extends jsweet.lang.Object {
        public RouteCallback routeCallback;
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class RouteCallback extends jsweet.lang.Object {
            native public Object apply(String roomName, String fromRoomName);
        }
        native public Object routeCallback(java.lang.String roomName, java.lang.String fromRoomName);
    }
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(String fromRoom, String toRoom);
    /**
     * Find the exit direction from the given room en route to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @return The room direction constant, one of the following:
     * FIND_EXIT_TOP, FIND_EXIT_RIGHT, FIND_EXIT_BOTTOM, FIND_EXIT_LEFT
     * Or one of the following Result codes:
     * ERR_NO_PATH, ERR_INVALID_ARGS
     */
    native public jsweet.util.union.Union<String,Double> findExit(Room fromRoom, Room toRoom);
    /**
     * Find the exit direction from the given room en route to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @return The room direction constant, one of the following:
     * FIND_EXIT_TOP, FIND_EXIT_RIGHT, FIND_EXIT_BOTTOM, FIND_EXIT_LEFT
     * Or one of the following Result codes:
     * ERR_NO_PATH, ERR_INVALID_ARGS
     */
    native public jsweet.util.union.Union<String,Double> findExit(String fromRoom, Room toRoom);
    /**
     * Find the exit direction from the given room en route to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @return The room direction constant, one of the following:
     * FIND_EXIT_TOP, FIND_EXIT_RIGHT, FIND_EXIT_BOTTOM, FIND_EXIT_LEFT
     * Or one of the following Result codes:
     * ERR_NO_PATH, ERR_INVALID_ARGS
     */
    native public jsweet.util.union.Union<String,Double> findExit(Room fromRoom, String toRoom);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(Room fromRoom, String toRoom, Opts opts);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(Room fromRoom, Room toRoom, Opts opts);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(String fromRoom, Room toRoom, Opts opts);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(Room fromRoom, String toRoom);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(Room fromRoom, Room toRoom);
    /**
     * Find route from the given room to another room.
     * @param fromRoom Start room name or room object.
     * @param toRoom Finish room name or room object.
     * @returns the route array or ERR_NO_PATH code
     */
    native public jsweet.util.union.Union<FindRoute[],Double> findRoute(String fromRoom, Room toRoom);
}

