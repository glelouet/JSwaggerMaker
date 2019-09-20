package www.googleapis.com.definitions;

public class ChannelContentOwnerDetails {
    /**
     * The ID of the content owner linked to the channel.
     */
    public String contentOwner;
    /**
     * The date and time of when the channel was linked to the content owner. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String timeLinked;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelContentOwnerDetails othersame = ((ChannelContentOwnerDetails) other);
        if ((contentOwner!= othersame.contentOwner)&&((contentOwner == null)||(!contentOwner.equals(othersame.contentOwner)))) {
            return false;
        }
        if ((timeLinked!= othersame.timeLinked)&&((timeLinked == null)||(!timeLinked.equals(othersame.timeLinked)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((contentOwner == null)? 0 :contentOwner.hashCode())+((timeLinked == null)? 0 :timeLinked.hashCode()));
    }
}
