package www.googleapis.com.definitions;

public class ActivityContentDetailsLike {
    /**
     * The resourceId object contains information that identifies the rated resource.
     */
    public ResourceId resourceId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ActivityContentDetailsLike othersame = ((ActivityContentDetailsLike) other);
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((resourceId == null)? 0 :resourceId.hashCode());
    }
}
