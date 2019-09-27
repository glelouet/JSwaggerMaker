package www.googleapis.com.definitions;

import www.googleapis.com.structures.Livebroadcastcontent;

public class SearchResultSnippet {
    /**
     * The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.
     */
    public String channelId;
    /**
     * The title of the channel that published the resource that the search result identifies.
     */
    public String channelTitle;
    /**
     * A description of the search result.
     */
    public String description;
    /**
     * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's "none" if there is not any upcoming/active live broadcasts.
     */
    public Livebroadcastcontent liveBroadcastContent;
    /**
     * The creation date and time of the resource that the search result identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The title of the search result.
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
        SearchResultSnippet othersame = ((SearchResultSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelTitle!= othersame.channelTitle)&&((channelTitle == null)||(!channelTitle.equals(othersame.channelTitle)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((liveBroadcastContent!= othersame.liveBroadcastContent)&&((liveBroadcastContent == null)||(!liveBroadcastContent.equals(othersame.liveBroadcastContent)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((thumbnails!= othersame.thumbnails)&&((thumbnails == null)||(!thumbnails.equals(othersame.thumbnails)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((channelId == null)? 0 :channelId.hashCode())+((channelTitle == null)? 0 :channelTitle.hashCode()))+((description == null)? 0 :description.hashCode()))+((liveBroadcastContent == null)? 0 :liveBroadcastContent.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
