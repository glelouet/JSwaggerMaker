package www.googleapis.com.definitions;

public class LiveStream {
    /**
     * The cdn object defines the live stream's content delivery network (CDN) settings. These settings provide details about the manner in which you stream your content to YouTube.
     */
    public CdnSettings cdn;
    /**
     * The content_details object contains information about the stream, including the closed captions ingestion URL.
     */
    public LiveStreamContentDetails contentDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube assigns to uniquely identify the stream.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#liveStream".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the stream, including its channel, title, and description.
     */
    public LiveStreamSnippet snippet;
    /**
     * The status object contains information about live stream's status.
     */
    public LiveStreamStatus status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveStream othersame = ((LiveStream) other);
        if ((cdn!= othersame.cdn)&&((cdn == null)||(!cdn.equals(othersame.cdn)))) {
            return false;
        }
        if ((contentDetails!= othersame.contentDetails)&&((contentDetails == null)||(!contentDetails.equals(othersame.contentDetails)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((cdn == null)? 0 :cdn.hashCode())+((contentDetails == null)? 0 :contentDetails.hashCode()))+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
