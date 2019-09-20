package www.googleapis.com.definitions;

public class SubscriptionSubscriberSnippet {
    /**
     * The channel ID of the subscriber.
     */
    public String channelId;
    /**
     * The description of the subscriber.
     */
    public String description;
    /**
     * Thumbnails for this subscriber.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The title of the subscriber.
     */
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SubscriptionSubscriberSnippet othersame = ((SubscriptionSubscriberSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((thumbnails!= othersame.thumbnails)&&((thumbnails == null)||(!thumbnails.equals(othersame.thumbnails)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((channelId == null)? 0 :channelId.hashCode())+((description == null)? 0 :description.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
