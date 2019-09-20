package www.googleapis.com.definitions;

public class VideoAbuseReport {
    /**
     * Additional comments regarding the abuse report.
     */
    public String comments;
    /**
     * The language that the content was viewed in.
     */
    public String language;
    /**
     * The high-level, or primary, reason that the content is abusive. The value is an abuse report reason ID.
     */
    public String reasonId;
    /**
     * The specific, or secondary, reason that this content is abusive (if available). The value is an abuse report reason ID that is a valid secondary reason for the primary reason.
     */
    public String secondaryReasonId;
    /**
     * The ID that YouTube uses to uniquely identify the video.
     */
    public String videoId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoAbuseReport othersame = ((VideoAbuseReport) other);
        if ((comments!= othersame.comments)&&((comments == null)||(!comments.equals(othersame.comments)))) {
            return false;
        }
        if ((language!= othersame.language)&&((language == null)||(!language.equals(othersame.language)))) {
            return false;
        }
        if ((reasonId!= othersame.reasonId)&&((reasonId == null)||(!reasonId.equals(othersame.reasonId)))) {
            return false;
        }
        if ((secondaryReasonId!= othersame.secondaryReasonId)&&((secondaryReasonId == null)||(!secondaryReasonId.equals(othersame.secondaryReasonId)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((comments == null)? 0 :comments.hashCode())+((language == null)? 0 :language.hashCode()))+((reasonId == null)? 0 :reasonId.hashCode()))+((secondaryReasonId == null)? 0 :secondaryReasonId.hashCode()))+((videoId == null)? 0 :videoId.hashCode()));
    }
}
