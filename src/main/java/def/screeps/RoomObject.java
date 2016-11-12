package def.screeps;
/**
 * Any object with a position in a room. Almost all game objects prototypes
 * are derived from RoomObject.
 */
public class RoomObject extends jsweet.lang.Object {
    public RoomObject prototype;
    /**
     * An object representing the position of this object in the room.
     */
    public RoomPosition pos;
    /**
     * The link to the Room object. May be undefined in case if an object is a
     * flag or a construction site and is placed in a room that is not visible
     * to you.
     */
    public Room room;
}

