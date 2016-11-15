package def.screeps;
import jsweet.lang.Object;

@jsweet.lang.Interface
public abstract class LookAtResultWithPos extends jsweet.lang.Object {
    public double x;
    public double y;
    public String type;
    @jsweet.lang.Optional
    public Creep creep;
    @jsweet.lang.Optional
    public String terrain;
    @jsweet.lang.Optional
    public Structure structure;
    @jsweet.lang.Optional
    public Flag flag;
    @jsweet.lang.Optional
    public Resource energy;
    @jsweet.lang.Optional
    public Object exit;
    @jsweet.lang.Optional
    public Source source;
}

