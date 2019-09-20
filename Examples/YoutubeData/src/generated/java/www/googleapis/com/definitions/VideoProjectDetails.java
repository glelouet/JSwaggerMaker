package www.googleapis.com.definitions;

public class VideoProjectDetails {
    /**
     * A list of project tags associated with the video during the upload.
     */
    public String[] tags;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoProjectDetails othersame = ((VideoProjectDetails) other);
        if ((tags!= othersame.tags)&&((tags == null)||(!tags.equals(othersame.tags)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((tags == null)? 0 :tags.hashCode());
    }
}
