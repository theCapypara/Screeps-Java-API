package def.screeps;
import jsweet.lang.Number;
@jsweet.lang.Interface
public abstract class StoreDefinition extends jsweet.lang.Object {
    native public Number $get(String resource);
    @jsweet.lang.Optional
    public double energy;
    @jsweet.lang.Optional
    public double power;
}

