package www.googleapis.com.definitions;

public class LiveBroadcastStatistics {
    /**
     * The number of viewers currently watching the broadcast. The property and its value will be present if the broadcast has current viewers and the broadcast owner has not hidden the viewcount for the video. Note that YouTube stops tracking the number of concurrent viewers for a broadcast when the broadcast ends. So, this property would not identify the number of viewers watching an archived video of a live broadcast that already ended.
     */
    public String concurrentViewers;
    /**
     * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live chat feature enabled, and has at least one message. Note that this field will not be filled after the broadcast ends. So this property would not identify the number of chat messages for an archived video of a completed live broadcast.
     */
    public String totalChatCount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveBroadcastStatistics othersame = ((LiveBroadcastStatistics) other);
        if ((concurrentViewers!= othersame.concurrentViewers)&&((concurrentViewers == null)||(!concurrentViewers.equals(othersame.concurrentViewers)))) {
            return false;
        }
        if ((totalChatCount!= othersame.totalChatCount)&&((totalChatCount == null)||(!totalChatCount.equals(othersame.totalChatCount)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((concurrentViewers == null)? 0 :concurrentViewers.hashCode())+((totalChatCount == null)? 0 :totalChatCount.hashCode()));
    }
}
