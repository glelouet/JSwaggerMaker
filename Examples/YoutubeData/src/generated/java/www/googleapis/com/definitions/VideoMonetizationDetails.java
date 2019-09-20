package www.googleapis.com.definitions;

public class VideoMonetizationDetails {
    /**
     * The value of access indicates whether the video can be monetized or not.
     */
    public AccessPolicy access;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoMonetizationDetails othersame = ((VideoMonetizationDetails) other);
        if ((access!= othersame.access)&&((access == null)||(!access.equals(othersame.access)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((access == null)? 0 :access.hashCode());
    }
}
