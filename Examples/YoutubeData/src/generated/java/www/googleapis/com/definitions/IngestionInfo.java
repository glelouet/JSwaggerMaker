package www.googleapis.com.definitions;

public class IngestionInfo {
    /**
     * The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are sending to the ingestionAddress to this URL.
     */
    public String backupIngestionAddress;
    /**
     * The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL.
     * 
     * Depending on which application or tool you use to encode your video stream, you may need to enter the stream URL and stream name separately or you may need to concatenate them in the following format:
     * 
     * STREAM_URL/STREAM_NAME
     */
    public String ingestionAddress;
    /**
     * The HTTP or RTMP stream name that YouTube assigns to the video stream.
     */
    public String streamName;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        IngestionInfo othersame = ((IngestionInfo) other);
        if ((backupIngestionAddress!= othersame.backupIngestionAddress)&&((backupIngestionAddress == null)||(!backupIngestionAddress.equals(othersame.backupIngestionAddress)))) {
            return false;
        }
        if ((ingestionAddress!= othersame.ingestionAddress)&&((ingestionAddress == null)||(!ingestionAddress.equals(othersame.ingestionAddress)))) {
            return false;
        }
        if ((streamName!= othersame.streamName)&&((streamName == null)||(!streamName.equals(othersame.streamName)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((backupIngestionAddress == null)? 0 :backupIngestionAddress.hashCode())+((ingestionAddress == null)? 0 :ingestionAddress.hashCode()))+((streamName == null)? 0 :streamName.hashCode()));
    }
}
