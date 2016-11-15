package def.screeps;
import jsweet.lang.Object;

/**
 * RawMemory object allows to implement your own memory stringifier instead of built-in serializer based on JSON.stringify.
 */
@jsweet.lang.Interface
public abstract class RawMemory extends jsweet.lang.Object {
    /**
     * Get a raw string representation of the Memory object.
     */
    native public String get();
    /**
     * Set new memory value.
     * @param value New memory value as a string.
     */
    native public Object set(String value);
}

