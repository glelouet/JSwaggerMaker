package www.googleapis.com.definitions;

public class VideoLocalization {
    /**
     * Localized version of the video's description.
     */
    public String description;
    /**
     * Localized version of the video's title.
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
        VideoLocalization othersame = ((VideoLocalization) other);
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
