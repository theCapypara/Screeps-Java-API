package def.screeps;
import jsweet.lang.Object;

/**
 * Contains powerful methods for pathfinding in the game world. Support exists for custom navigation costs and paths which span multiple rooms.
 * Additionally PathFinder can search for paths through rooms you can't see, although you won't be able to detect any dynamic obstacles like creeps or buildings.
 */
@jsweet.lang.Interface
public abstract class PathFinder extends jsweet.lang.Object {
    /**
     * Container for custom navigation cost data.
     */
    public static CostMatrix CostMatrix;
    /**
     * Find an optimal path between origin and goal.
     *
     * @param origin The start position.
     * @param goal goal A RoomPosition or an object containing a RoomPosition and range
     * @param opts An object containing additional pathfinding flags.
     */
    native public static Search search(RoomPosition origin, RoomPosition goal, PathFinderOpts opts);
    /**
     * Find an optimal path between origin and goal.
     *
     * @param origin The start position.
     * @param goal an array of goals, the cheapest path found out of all the goals will be returned.
     * @param opts An object containing additional pathfinding flags.
     */
    native public static Search search(RoomPosition origin, RoomPosition[] goal, PathFinderOpts opts);
    /**
     * Specify whether to use this new experimental pathfinder in game objects methods.
     * This method should be invoked every tick. It affects the following methods behavior:
     * Room.findPath, RoomPosition.findPathTo, RoomPosition.findClosestByPath, Creep.moveTo....
     *
     * @param isEnabled Whether to activate the new pathfinder or deactivate.
     */
    native public static Object use(Boolean isEnabled);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Search extends jsweet.lang.Object {
        public RoomPosition[] path;
        public double ops;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Goal extends jsweet.lang.Object {
        public RoomPosition pos;
        public double range;
    }
    /**
     * Find an optimal path between origin and goal.
     *
     * @param origin The start position.
     * @param goal goal A RoomPosition or an object containing a RoomPosition and range
     * @param opts An object containing additional pathfinding flags.
     */
    native public static Search search(RoomPosition origin, RoomPosition goal);
    /**
     * Find an optimal path between origin and goal.
     *
     * @param origin The start position.
     * @param goal goal A RoomPosition or an object containing a RoomPosition and range
     * @param opts An object containing additional pathfinding flags.
     */
    native public static Search search(RoomPosition origin, Goal goal, PathFinderOpts opts);
    /**
     * Find an optimal path between origin and goal.
     *
     * @param origin The start position.
     * @param goal an array of goals, the cheapest path found out of all the goals will be returned.
     * @param opts An object containing additional pathfinding flags.
     */
    native public static Search search(RoomPosition origin, Goal[] goal, PathFinderOpts opts);
    /**
     * Find an optimal path between origin and goal.
     *
     * @param origin The start position.
     * @param goal goal A RoomPosition or an object containing a RoomPosition and range
     * @param opts An object containing additional pathfinding flags.
     */
    native public static Search search(RoomPosition origin, Goal goal);
}

