package def.screeps;
@jsweet.lang.Interface
public abstract class Memory extends jsweet.lang.Object {
    native public static java.lang.Object $getStatic(String name);
    public static Creeps creeps;
    public static Flags flags;
    public static Rooms rooms;
    public static Spawns spawns;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Creeps extends jsweet.lang.Object {
        native public java.lang.Object $get(String name);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Flags extends jsweet.lang.Object {
        native public java.lang.Object $get(String name);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Rooms extends jsweet.lang.Object {
        native public java.lang.Object $get(String name);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Spawns extends jsweet.lang.Object {
        native public java.lang.Object $get(String name);
    }
}

