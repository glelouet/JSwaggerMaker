package www.googleapis.com.definitions;

public class SubscriptionSnippet {
    /**
     * The ID that YouTube uses to uniquely identify the subscriber's channel.
     */
    public String channelId;
    /**
     * Channel title for the channel that the subscription belongs to.
     */
    public String channelTitle;
    /**
     * The subscription's details.
     */
    public String description;
    /**
     * The date and time that the subscription was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * The id object contains information about the channel that the user subscribed to.
     */
    public ResourceId resourceId;
    /**
     * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The subscription's title.
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
        SubscriptionSnippet othersame = ((SubscriptionSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelTitle!= othersame.channelTitle)&&((channelTitle == null)||(!channelTitle.equals(othersame.channelTitle)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
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
        return ((((((((channelId == null)? 0 :channelId.hashCode())+((channelTitle == null)? 0 :channelTitle.hashCode()))+((description == null)? 0 :description.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((resourceId == null)? 0 :resourceId.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
