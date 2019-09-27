package www.googleapis.com.definitions;

public class ActivityContentDetailsSubscription {
    /**
     * The resourceId object contains information that identifies the resource that the user subscribed to.
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
        ActivityContentDetailsSubscription othersame = ((ActivityContentDetailsSubscription) other);
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((resourceId == null)? 0 :resourceId.hashCode());
    }
}
