package www.googleapis.com.definitions;

public class MonitorStreamInfo {
    /**
     * If you have set the enableMonitorStream property to true, then this property determines the length of the live broadcast delay.
     */
    public long broadcastStreamDelayMs;
    /**
     * HTML code that embeds a player that plays the monitor stream.
     */
    public String embedHtml;
    /**
     * This value determines whether the monitor stream is enabled for the broadcast. If the monitor stream is enabled, then YouTube will broadcast the event content on a special stream intended only for the broadcaster's consumption. The broadcaster can use the stream to review the event content and also to identify the optimal times to insert cuepoints.
     * 
     * You need to set this value to true if you intend to have a broadcast delay for your event.
     * 
     * Note: This property cannot be updated once the broadcast is in the testing or live state.
     */
    public boolean enableMonitorStream;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MonitorStreamInfo othersame = ((MonitorStreamInfo) other);
        if (broadcastStreamDelayMs!= othersame.broadcastStreamDelayMs) {
            return false;
        }
        if ((embedHtml!= othersame.embedHtml)&&((embedHtml == null)||(!embedHtml.equals(othersame.embedHtml)))) {
            return false;
        }
        if (enableMonitorStream!= othersame.enableMonitorStream) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(broadcastStreamDelayMs)+((embedHtml == null)? 0 :embedHtml.hashCode()))+ Boolean.hashCode(enableMonitorStream));
    }
}
