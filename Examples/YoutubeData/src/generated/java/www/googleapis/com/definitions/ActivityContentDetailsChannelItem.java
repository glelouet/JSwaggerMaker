package www.googleapis.com.definitions;

public class ActivityContentDetailsChannelItem {
    /**
     * The resourceId object contains information that identifies the resource that was added to the channel.
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
        ActivityContentDetailsChannelItem othersame = ((ActivityContentDetailsChannelItem) other);
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((resourceId == null)? 0 :resourceId.hashCode());
    }
}
