package www.googleapis.com.definitions;

public class VideoTopicDetails {
    /**
     * Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You can retrieve information about each topic using Freebase Topic API.
     */
    public String[] relevantTopicIds;
    /**
     * A list of Wikipedia URLs that provide a high-level description of the video's content.
     */
    public String[] topicCategories;
    /**
     * A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be said that the video is mainly about each of these. You can retrieve information about each topic using the Freebase Topic API.
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
        VideoTopicDetails othersame = ((VideoTopicDetails) other);
        if ((relevantTopicIds!= othersame.relevantTopicIds)&&((relevantTopicIds == null)||(!relevantTopicIds.equals(othersame.relevantTopicIds)))) {
            return false;
        }
        if ((topicCategories!= othersame.topicCategories)&&((topicCategories == null)||(!topicCategories.equals(othersame.topicCategories)))) {
            return false;
        }
        if ((topicIds!= othersame.topicIds)&&((topicIds == null)||(!topicIds.equals(othersame.topicIds)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((relevantTopicIds == null)? 0 :relevantTopicIds.hashCode())+((topicCategories == null)? 0 :topicCategories.hashCode()))+((topicIds == null)? 0 :topicIds.hashCode()));
    }
}
