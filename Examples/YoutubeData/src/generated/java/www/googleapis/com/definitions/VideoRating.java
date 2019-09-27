package www.googleapis.com.definitions;

import www.googleapis.com.structures.Rating;

public class VideoRating {
    public Rating rating;
    public String videoId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoRating othersame = ((VideoRating) other);
        if ((rating!= othersame.rating)&&((rating == null)||(!rating.equals(othersame.rating)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((rating == null)? 0 :rating.hashCode())+((videoId == null)? 0 :videoId.hashCode()));
    }
}
