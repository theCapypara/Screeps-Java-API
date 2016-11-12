package def.screeps;
@jsweet.lang.Interface
public abstract class Transaction extends jsweet.lang.Object {
    public String transactionId;
    public double time;
    public Sender sender;
    public Recipient recipient;
    public String resourceType;
    public double amount;
    public String from;
    public String to;
    public String description;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Sender extends jsweet.lang.Object {
        public String username;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Recipient extends jsweet.lang.Object {
        public String username;
    }
}

