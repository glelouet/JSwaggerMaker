package www.googleapis.com.definitions;

public class VideoAbuseReportReasonListResponse {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * Serialized EventId of the request which produced this response.
     */
    public String eventId;
    /**
     * A list of valid abuse reasons that are used with video.ReportAbuse.
     */
    public VideoAbuseReportReason[] items;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#videoAbuseReportReasonListResponse".
     */
    public String kind;
    /**
     * The visitorId identifies the visitor.
     */
    public String visitorId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoAbuseReportReasonListResponse othersame = ((VideoAbuseReportReasonListResponse) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((eventId!= othersame.eventId)&&((eventId == null)||(!eventId.equals(othersame.eventId)))) {
            return false;
        }
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((visitorId!= othersame.visitorId)&&((visitorId == null)||(!visitorId.equals(othersame.visitorId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((etag == null)? 0 :etag.hashCode())+((eventId == null)? 0 :eventId.hashCode()))+((items == null)? 0 :items.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((visitorId == null)? 0 :visitorId.hashCode()));
    }
}
