package www.googleapis.com.definitions;

public class LiveStreamContentDetails {
    /**
     * The ingestion URL where the closed captions of this stream are sent.
     */
    public String closedCaptionsIngestionUrl;
    /**
     * Indicates whether the stream is reusable, which means that it can be bound to multiple broadcasts. It is common for broadcasters to reuse the same stream for many different broadcasts if those broadcasts occur at different times.
     * 
     * If you set this value to false, then the stream will not be reusable, which means that it can only be bound to one broadcast. Non-reusable streams differ from reusable streams in the following ways:  
     * - A non-reusable stream can only be bound to one broadcast. 
     * - A non-reusable stream might be deleted by an automated process after the broadcast ends. 
     * - The  liveStreams.list method does not list non-reusable streams if you call the method and set the mine parameter to true. The only way to use that method to retrieve the resource for a non-reusable stream is to use the id parameter to identify the stream.
     */
    public boolean isReusable;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveStreamContentDetails othersame = ((LiveStreamContentDetails) other);
        if ((closedCaptionsIngestionUrl!= othersame.closedCaptionsIngestionUrl)&&((closedCaptionsIngestionUrl == null)||(!closedCaptionsIngestionUrl.equals(othersame.closedCaptionsIngestionUrl)))) {
            return false;
        }
        if (isReusable!= othersame.isReusable) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((closedCaptionsIngestionUrl == null)? 0 :closedCaptionsIngestionUrl.hashCode())+ Boolean.hashCode(isReusable));
    }
}
