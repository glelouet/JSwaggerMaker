package www.googleapis.com.definitions;

public class VideoAbuseReportReason {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID of this abuse report reason.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#videoAbuseReportReason".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the abuse report reason.
     */
    public VideoAbuseReportReasonSnippet snippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoAbuseReportReason othersame = ((VideoAbuseReportReason) other);
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
        return true;
    }

    public int hashCode() {
        return (((((etag == null)? 0 :etag.hashCode())+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()));
    }
}
