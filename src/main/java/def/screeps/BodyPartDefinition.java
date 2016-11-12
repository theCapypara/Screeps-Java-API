package def.screeps;
/**
 * An array describing the creep???s body. Each element contains the following properties:
 */
@jsweet.lang.Interface
public abstract class BodyPartDefinition extends jsweet.lang.Object {
    /**
     * If the body part is boosted, this property specifies the mineral type which is used for boosting. One of the RESOURCE_* constants.
     */
    public String boost;
    /**
     * One of the body part types constants.
     */
    public String type;
    /**
     * The remaining amount of hit points of this body part.
     */
    public double hits;
}

