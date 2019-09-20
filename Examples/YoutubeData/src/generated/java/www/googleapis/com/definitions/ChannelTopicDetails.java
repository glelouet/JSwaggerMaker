package www.googleapis.com.definitions;

public class ChannelTopicDetails {
    /**
     * A list of Wikipedia URLs that describe the channel's content.
     */
    public String[] topicCategories;
    /**
     * A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API.
     */
    public String[] topicIds;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelTopicDetails othersame = ((ChannelTopicDetails) other);
        if ((topicCategories!= othersame.topicCategories)&&((topicCategories == null)||(!topicCategories.equals(othersame.topicCategories)))) {
            return false;
        }
        if ((topicIds!= othersame.topicIds)&&((topicIds == null)||(!topicIds.equals(othersame.topicIds)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((topicCategories == null)? 0 :topicCategories.hashCode())+((topicIds == null)? 0 :topicIds.hashCode()));
    }
}
