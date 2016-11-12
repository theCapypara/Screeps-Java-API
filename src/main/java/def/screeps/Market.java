package def.screeps;
/**
 * A global object representing the in-game market. You can use this object to track resource transactions to/from your
 * terminals, and your buy/sell orders (in development). The object is accessible via the singleton Game.market property.
 */
public class Market extends jsweet.lang.Object {
    /**
     * An array of the last 100 incoming transactions to your terminals
     */
    public Transaction[] incomingTransactions;
    /**
     * An array of the last 100 outgoing transactions from your terminals
     */
    public Transaction[] outgoingTransactions;
}

