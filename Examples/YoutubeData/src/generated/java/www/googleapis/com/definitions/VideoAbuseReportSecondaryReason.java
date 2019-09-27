package www.googleapis.com.definitions;

public class VideoAbuseReportSecondaryReason {
    /**
     * The ID of this abuse report secondary reason.
     */
    public String id;
    /**
     * The localized label for this abuse report secondary reason.
     */
    public String label;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoAbuseReportSecondaryReason othersame = ((VideoAbuseReportSecondaryReason) other);
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((label!= othersame.label)&&((label == null)||(!label.equals(othersame.label)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((id == null)? 0 :id.hashCode())+((label == null)? 0 :label.hashCode()));
    }
}
