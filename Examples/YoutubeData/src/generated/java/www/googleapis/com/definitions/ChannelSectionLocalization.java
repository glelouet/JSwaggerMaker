package www.googleapis.com.definitions;

public class ChannelSectionLocalization {
    /**
     * The localized strings for channel section's title.
     */
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSectionLocalization othersame = ((ChannelSectionLocalization) other);
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((title == null)? 0 :title.hashCode());
    }
}
