package www.googleapis.com.definitions;

import www.googleapis.com.structures.TYPE;

public class ActivitySnippet {
    /**
     * The ID that YouTube uses to uniquely identify the channel associated with the activity.
     */
    public String channelId;
    /**
     * Channel title for the channel responsible for this activity
     */
    public String channelTitle;
    /**
     * The description of the resource primarily associated with the activity.
     */
    public String description;
    /**
     * The group ID associated with the activity. A group ID identifies user events that are associated with the same user and resource. For example, if a user rates a video and marks the same video as a favorite, the entries for those events would have the same group ID in the user's activity feed. In your user interface, you can avoid repetition by grouping events with the same groupId value.
     */
    public String groupId;
    /**
     * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * A map of thumbnail images associated with the resource that is primarily associated with the activity. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The title of the resource primarily associated with the activity.
     */
    public String title;
    /**
     * The type of activity that the resource describes.
     */
    public TYPE type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ActivitySnippet othersame = ((ActivitySnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelTitle!= othersame.channelTitle)&&((channelTitle == null)||(!channelTitle.equals(othersame.channelTitle)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((groupId!= othersame.groupId)&&((groupId == null)||(!groupId.equals(othersame.groupId)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((thumbnails!= othersame.thumbnails)&&((thumbnails == null)||(!thumbnails.equals(othersame.thumbnails)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((channelId == null)? 0 :channelId.hashCode())+((channelTitle == null)? 0 :channelTitle.hashCode()))+((description == null)? 0 :description.hashCode()))+((groupId == null)? 0 :groupId.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
