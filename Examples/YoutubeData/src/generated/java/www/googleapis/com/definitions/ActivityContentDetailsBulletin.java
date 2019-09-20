package www.googleapis.com.definitions;

public class ActivityContentDetailsBulletin {
    /**
     * The resourceId object contains information that identifies the resource associated with a bulletin post.
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
        ActivityContentDetailsBulletin othersame = ((ActivityContentDetailsBulletin) other);
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((resourceId == null)? 0 :resourceId.hashCode());
    }
}
