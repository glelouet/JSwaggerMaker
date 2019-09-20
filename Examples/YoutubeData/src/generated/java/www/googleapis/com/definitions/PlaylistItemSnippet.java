package www.googleapis.com.definitions;

public class PlaylistItemSnippet {
    /**
     * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
     */
    public String channelId;
    /**
     * Channel title for the channel that the playlist item belongs to.
     */
    public String channelTitle;
    /**
     * The item's description.
     */
    public String description;
    /**
     * The ID that YouTube uses to uniquely identify the playlist that the playlist item is in.
     */
    public String playlistId;
    /**
     * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.
     */
    public long position;
    /**
     * The date and time that the item was added to the playlist. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item.
     */
    public ResourceId resourceId;
    /**
     * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The item's title.
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
        PlaylistItemSnippet othersame = ((PlaylistItemSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelTitle!= othersame.channelTitle)&&((channelTitle == null)||(!channelTitle.equals(othersame.channelTitle)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((playlistId!= othersame.playlistId)&&((playlistId == null)||(!playlistId.equals(othersame.playlistId)))) {
            return false;
        }
        if (position!= othersame.position) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
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
        return ((((((((((channelId == null)? 0 :channelId.hashCode())+((channelTitle == null)? 0 :channelTitle.hashCode()))+((description == null)? 0 :description.hashCode()))+((playlistId == null)? 0 :playlistId.hashCode()))+ Long.hashCode(position))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((resourceId == null)? 0 :resourceId.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
