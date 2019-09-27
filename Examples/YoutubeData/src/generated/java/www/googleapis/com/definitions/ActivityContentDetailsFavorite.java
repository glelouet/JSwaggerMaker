package www.googleapis.com.definitions;

public class ActivityContentDetailsFavorite {
    /**
     * The resourceId object contains information that identifies the resource that was marked as a favorite.
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
        ActivityContentDetailsFavorite othersame = ((ActivityContentDetailsFavorite) other);
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((resourceId == null)? 0 :resourceId.hashCode());
    }
}
