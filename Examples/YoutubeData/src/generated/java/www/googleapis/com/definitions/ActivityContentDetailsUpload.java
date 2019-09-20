package www.googleapis.com.definitions;

public class ActivityContentDetailsUpload {
    /**
     * The ID that YouTube uses to uniquely identify the uploaded video.
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
        ActivityContentDetailsUpload othersame = ((ActivityContentDetailsUpload) other);
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((videoId == null)? 0 :videoId.hashCode());
    }
}
