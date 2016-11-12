package def.screeps;
/**
 * An object containing additional pathfinding flags.
 */
@jsweet.lang.Interface
public abstract class PathFinderOpts extends jsweet.lang.Object {
    /**
     * Cost for walking on plain positions. The default is 1.
     */
    @jsweet.lang.Optional
    public double plainCost;
    /**
     * Cost for walking on swamp positions. The default is 5.
     */
    @jsweet.lang.Optional
    public double swampCost;
    /**
     * Instead of searching for a path to the goals this will search for a path away from the goals.
     * The cheapest path that is out of range of every goal will be returned. The default is false.
     */
    @jsweet.lang.Optional
    public Boolean flee;
    /**
     * The maximum allowed pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU. The default value is 2000.
     */
    @jsweet.lang.Optional
    public double maxOps;
    /**
     * The maximum allowed rooms to search. The default (and maximum) is 16.
     */
    @jsweet.lang.Optional
    public double maxRooms;
    /**
     * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand
     * the underlying A* algorithm mechanics! The default value is 1.
     */
    @jsweet.lang.Optional
    public double heuristicWeight;
    /**
     * Request from the pathfinder to generate a CostMatrix for a certain room. The callback accepts one argument, roomName.
     * This callback will only be called once per room per search. If you are running multiple pathfinding operations in a
     * single room and in a single tick you may consider caching your CostMatrix to speed up your code. Please read the
     * CostMatrix documentation below for more information on CostMatrix.
     *
     * @param roomName
     */
    native public jsweet.util.union.Union<Boolean,CostMatrix> roomCallback(String roomName);
}

