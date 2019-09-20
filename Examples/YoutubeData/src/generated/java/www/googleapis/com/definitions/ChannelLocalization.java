package www.googleapis.com.definitions;

public class ChannelLocalization {
    /**
     * The localized strings for channel's description.
     */
    public String description;
    /**
     * The localized strings for channel's title.
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
        ChannelLocalization othersame = ((ChannelLocalization) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((description == null)? 0 :description.hashCode())+((title == null)? 0 :title.hashCode()));
    }
}
