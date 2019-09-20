package www.googleapis.com.definitions;

public class VideoLiveStreamingDetails {
    /**
     * The ID of the currently active live chat attached to this video. This field is filled only if the video is a currently live broadcast that has live chat. Once the broadcast transitions to complete this field will be removed and the live chat closed down. For persistent broadcasts that live chat id will no longer be tied to this video but rather to the new video being displayed at the persistent page.
     */
    public String activeLiveChatId;
    /**
     * The time that the broadcast actually ended. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be available until the broadcast is over.
     */
    public String actualEndTime;
    /**
     * The time that the broadcast actually started. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. This value will not be available until the broadcast begins.
     */
    public String actualStartTime;
    /**
     * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
     */
    public String concurrentViewers;
    /**
     * The time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. If the value is empty or the property is not present, then the broadcast is scheduled to continue indefinitely.
     */
    public String scheduledEndTime;
    /**
     * The time that the broadcast is scheduled to begin. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String scheduledStartTime;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoLiveStreamingDetails othersame = ((VideoLiveStreamingDetails) other);
        if ((activeLiveChatId!= othersame.activeLiveChatId)&&((activeLiveChatId == null)||(!activeLiveChatId.equals(othersame.activeLiveChatId)))) {
            return false;
        }
        if ((actualEndTime!= othersame.actualEndTime)&&((actualEndTime == null)||(!actualEndTime.equals(othersame.actualEndTime)))) {
            return false;
        }
        if ((actualStartTime!= othersame.actualStartTime)&&((actualStartTime == null)||(!actualStartTime.equals(othersame.actualStartTime)))) {
            return false;
        }
        if ((concurrentViewers!= othersame.concurrentViewers)&&((concurrentViewers == null)||(!concurrentViewers.equals(othersame.concurrentViewers)))) {
            return false;
        }
        if ((scheduledEndTime!= othersame.scheduledEndTime)&&((scheduledEndTime == null)||(!scheduledEndTime.equals(othersame.scheduledEndTime)))) {
            return false;
        }
        if ((scheduledStartTime!= othersame.scheduledStartTime)&&((scheduledStartTime == null)||(!scheduledStartTime.equals(othersame.scheduledStartTime)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((activeLiveChatId == null)? 0 :activeLiveChatId.hashCode())+((actualEndTime == null)? 0 :actualEndTime.hashCode()))+((actualStartTime == null)? 0 :actualStartTime.hashCode()))+((concurrentViewers == null)? 0 :concurrentViewers.hashCode()))+((scheduledEndTime == null)? 0 :scheduledEndTime.hashCode()))+((scheduledStartTime == null)? 0 :scheduledStartTime.hashCode()));
    }
}
