package def.screeps;
import java.util.function.Function;

/**
 * Options for *.find* methods.
 * Replaces Room.Opts and RoomPosition.Opts
 */
@jsweet.lang.ObjectType
public class Opts extends jsweet.lang.Object {
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function<?,Boolean>> filter;
    @jsweet.lang.Optional
    public String algorithm;
}
