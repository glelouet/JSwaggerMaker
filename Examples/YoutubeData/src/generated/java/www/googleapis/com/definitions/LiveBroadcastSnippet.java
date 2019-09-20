package www.googleapis.com.definitions;

import www.googleapis.com.structures.BROADCASTTYPE;

public class LiveBroadcastSnippet {
    /**
     * The date and time that the broadcast actually ended. This information is only available once the broadcast's state is complete. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String actualEndTime;
    /**
     * The date and time that the broadcast actually started. This information is only available once the broadcast's state is live. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String actualStartTime;
    public BROADCASTTYPE broadcastType;
    /**
     * The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast.
     */
    public String channelId;
    /**
     * The broadcast's description. As with the title, you can set this field by modifying the broadcast resource or by setting the description field of the corresponding video resource.
     */
    public String description;
    public boolean isDefaultBroadcast;
    /**
     * The id of the live chat for this broadcast.
     */
    public String liveChatId;
    /**
     * The date and time that the broadcast was added to YouTube's live broadcast schedule. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * The date and time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String scheduledEndTime;
    /**
     * The date and time that the broadcast is scheduled to start. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String scheduledStartTime;
    /**
     * A map of thumbnail images associated with the broadcast. For each nested object in this object, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can set this field by modifying the broadcast resource or by setting the title field of the corresponding video resource.
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
        LiveBroadcastSnippet othersame = ((LiveBroadcastSnippet) other);
        if ((actualEndTime!= othersame.actualEndTime)&&((actualEndTime == null)||(!actualEndTime.equals(othersame.actualEndTime)))) {
            return false;
        }
        if ((actualStartTime!= othersame.actualStartTime)&&((actualStartTime == null)||(!actualStartTime.equals(othersame.actualStartTime)))) {
            return false;
        }
        if ((broadcastType!= othersame.broadcastType)&&((broadcastType == null)||(!broadcastType.equals(othersame.broadcastType)))) {
            return false;
        }
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if (isDefaultBroadcast!= othersame.isDefaultBroadcast) {
            return false;
        }
        if ((liveChatId!= othersame.liveChatId)&&((liveChatId == null)||(!liveChatId.equals(othersame.liveChatId)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((scheduledEndTime!= othersame.scheduledEndTime)&&((scheduledEndTime == null)||(!scheduledEndTime.equals(othersame.scheduledEndTime)))) {
            return false;
        }
        if ((scheduledStartTime!= othersame.scheduledStartTime)&&((scheduledStartTime == null)||(!scheduledStartTime.equals(othersame.scheduledStartTime)))) {
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
        return (((((((((((((actualEndTime == null)? 0 :actualEndTime.hashCode())+((actualStartTime == null)? 0 :actualStartTime.hashCode()))+((broadcastType == null)? 0 :broadcastType.hashCode()))+((channelId == null)? 0 :channelId.hashCode()))+((description == null)? 0 :description.hashCode()))+ Boolean.hashCode(isDefaultBroadcast))+((liveChatId == null)? 0 :liveChatId.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((scheduledEndTime == null)? 0 :scheduledEndTime.hashCode()))+((scheduledStartTime == null)? 0 :scheduledStartTime.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
