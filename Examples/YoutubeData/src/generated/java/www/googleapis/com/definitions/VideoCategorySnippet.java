package www.googleapis.com.definitions;

public class VideoCategorySnippet {
    public boolean assignable;
    /**
     * The YouTube channel that created the video category.
     */
    public String channelId;
    /**
     * The video category's title.
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
        VideoCategorySnippet othersame = ((VideoCategorySnippet) other);
        if (assignable!= othersame.assignable) {
            return false;
        }
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Boolean.hashCode(assignable)+((channelId == null)? 0 :channelId.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
