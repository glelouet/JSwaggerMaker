package www.googleapis.com.definitions;

public class ChannelStatistics {
    /**
     * The number of comments for the channel.
     */
    public String commentCount;
    /**
     * Whether or not the number of subscribers is shown for this user.
     */
    public boolean hiddenSubscriberCount;
    /**
     * The number of subscribers that the channel has.
     */
    public String subscriberCount;
    /**
     * The number of videos uploaded to the channel.
     */
    public String videoCount;
    /**
     * The number of times the channel has been viewed.
     */
    public String viewCount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelStatistics othersame = ((ChannelStatistics) other);
        if ((commentCount!= othersame.commentCount)&&((commentCount == null)||(!commentCount.equals(othersame.commentCount)))) {
            return false;
        }
        if (hiddenSubscriberCount!= othersame.hiddenSubscriberCount) {
            return false;
        }
        if ((subscriberCount!= othersame.subscriberCount)&&((subscriberCount == null)||(!subscriberCount.equals(othersame.subscriberCount)))) {
            return false;
        }
        if ((videoCount!= othersame.videoCount)&&((videoCount == null)||(!videoCount.equals(othersame.videoCount)))) {
            return false;
        }
        if ((viewCount!= othersame.viewCount)&&((viewCount == null)||(!viewCount.equals(othersame.viewCount)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((commentCount == null)? 0 :commentCount.hashCode())+ Boolean.hashCode(hiddenSubscriberCount))+((subscriberCount == null)? 0 :subscriberCount.hashCode()))+((videoCount == null)? 0 :videoCount.hashCode()))+((viewCount == null)? 0 :viewCount.hashCode()));
    }
}
