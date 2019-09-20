package www.googleapis.com.definitions;

public class VideoContentDetailsRegionRestriction {
    /**
     * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
     */
    public String[] allowed;
    /**
     * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
     */
    public String[] blocked;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoContentDetailsRegionRestriction othersame = ((VideoContentDetailsRegionRestriction) other);
        if ((allowed!= othersame.allowed)&&((allowed == null)||(!allowed.equals(othersame.allowed)))) {
            return false;
        }
        if ((blocked!= othersame.blocked)&&((blocked == null)||(!blocked.equals(othersame.blocked)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((allowed == null)? 0 :allowed.hashCode())+((blocked == null)? 0 :blocked.hashCode()));
    }
}
