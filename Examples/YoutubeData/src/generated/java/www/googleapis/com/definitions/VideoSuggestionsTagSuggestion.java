package www.googleapis.com.definitions;

public class VideoSuggestionsTagSuggestion {
    /**
     * A set of video categories for which the tag is relevant. You can use this information to display appropriate tag suggestions based on the video category that the video uploader associates with the video. By default, tag suggestions are relevant for all categories if there are no restricts defined for the keyword.
     */
    public String[] categoryRestricts;
    /**
     * The keyword tag suggested for the video.
     */
    public String tag;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoSuggestionsTagSuggestion othersame = ((VideoSuggestionsTagSuggestion) other);
        if ((categoryRestricts!= othersame.categoryRestricts)&&((categoryRestricts == null)||(!categoryRestricts.equals(othersame.categoryRestricts)))) {
            return false;
        }
        if ((tag!= othersame.tag)&&((tag == null)||(!tag.equals(othersame.tag)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((categoryRestricts == null)? 0 :categoryRestricts.hashCode())+((tag == null)? 0 :tag.hashCode()));
    }
}
