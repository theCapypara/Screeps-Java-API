package def.screeps;
import jsweet.lang.Object;

/**
 * Container for custom navigation cost data.
 */
@jsweet.lang.Interface
public abstract class CostMatrix extends jsweet.lang.Object {
    /**
     * Creates a new CostMatrix containing 0's for all positions.
     * @constructor
     */
    //public CostMatrix(){}
    /**
     * Set the cost of a position in this CostMatrix.
     * @param x X position in the room.
     * @param y Y position in the room.
     * @param cost Cost of this position. Must be a whole number. A cost of 0 will use the terrain cost for that tile. A cost greater than or equal to 255 will be treated as unwalkable.
     */
    native public Object set(double x, double y, double cost);
    /**
     * Get the cost of a position in this CostMatrix.
     * @param x X position in the room.
     * @param y Y position in the room.
     */
    native public Object get(double x, double y);
    /**
     * Copy this CostMatrix into a new CostMatrix with the same data.
     */
    @jsweet.lang.Name("clone")
    native public CostMatrix Clone();
    /**
     * Returns a compact representation of this CostMatrix which can be stored via JSON.stringify.
     */
    native public double[] serialize();
    /**
     * Static method which deserializes a new CostMatrix using the return value of serialize.
     * @param val Whatever serialize returned
     */
    native public CostMatrix deserialize(double[] val);
}

