package www.googleapis.com.definitions;

public class GuideCategorySnippet {
    public String channelId;
    /**
     * Description of the guide category.
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
        GuideCategorySnippet othersame = ((GuideCategorySnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((channelId == null)? 0 :channelId.hashCode())+((title == null)? 0 :title.hashCode()));
    }
}
