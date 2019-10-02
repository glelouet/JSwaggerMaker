package www.googleapis.com.definitions;

import www.googleapis.com.structures.VideoGameRating;

public class VideoAgeGating {
    /**
     * Indicates whether or not the video has alcoholic beverage content. Only users of legal purchasing age in a particular country, as identified by ICAP, can view the content.
     */
    public boolean alcoholContent;
    /**
     * Age-restricted trailers. For redband trailers and adult-rated video-games. Only users aged 18+ can view the content. The the field is true the content is restricted to viewers aged 18+. Otherwise The field won't be present.
     */
    public boolean restricted;
    /**
     * Video game rating, if any.
     */
    public VideoGameRating videoGameRating;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoAgeGating othersame = ((VideoAgeGating) other);
        if (alcoholContent!= othersame.alcoholContent) {
            return false;
        }
        if (restricted!= othersame.restricted) {
            return false;
        }
        if ((videoGameRating!= othersame.videoGameRating)&&((videoGameRating == null)||(!videoGameRating.equals(othersame.videoGameRating)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Boolean.hashCode(alcoholContent)+ Boolean.hashCode(restricted))+((videoGameRating == null)? 0 :videoGameRating.hashCode()));
    }
}
