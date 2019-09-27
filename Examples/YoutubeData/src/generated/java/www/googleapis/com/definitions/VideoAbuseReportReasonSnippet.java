package www.googleapis.com.definitions;

public class VideoAbuseReportReasonSnippet {
    /**
     * The localized label belonging to this abuse report reason.
     */
    public String label;
    /**
     * The secondary reasons associated with this reason, if any are available. (There might be 0 or more.)
     */
    public VideoAbuseReportSecondaryReason[] secondaryReasons;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoAbuseReportReasonSnippet othersame = ((VideoAbuseReportReasonSnippet) other);
        if ((label!= othersame.label)&&((label == null)||(!label.equals(othersame.label)))) {
            return false;
        }
        if ((secondaryReasons!= othersame.secondaryReasons)&&((secondaryReasons == null)||(!secondaryReasons.equals(othersame.secondaryReasons)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((label == null)? 0 :label.hashCode())+((secondaryReasons == null)? 0 :secondaryReasons.hashCode()));
    }
}
