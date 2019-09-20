package www.googleapis.com.definitions;

public class PlaylistSnippet {
    /**
     * The ID that YouTube uses to uniquely identify the channel that published the playlist.
     */
    public String channelId;
    /**
     * The channel title of the channel that the video belongs to.
     */
    public String channelTitle;
    /**
     * The language of the playlist's default title and description.
     */
    public String defaultLanguage;
    /**
     * The playlist's description.
     */
    public String description;
    /**
     * Localized title and description, read-only.
     */
    public ChannelLocalization localized;
    /**
     * The date and time that the playlist was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * Keyword tags associated with the playlist.
     */
    public String[] tags;
    /**
     * A map of thumbnail images associated with the playlist. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The playlist's title.
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
        PlaylistSnippet othersame = ((PlaylistSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelTitle!= othersame.channelTitle)&&((channelTitle == null)||(!channelTitle.equals(othersame.channelTitle)))) {
            return false;
        }
        if ((defaultLanguage!= othersame.defaultLanguage)&&((defaultLanguage == null)||(!defaultLanguage.equals(othersame.defaultLanguage)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((localized!= othersame.localized)&&((localized == null)||(!localized.equals(othersame.localized)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((tags!= othersame.tags)&&((tags == null)||(!tags.equals(othersame.tags)))) {
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
        return ((((((((((channelId == null)? 0 :channelId.hashCode())+((channelTitle == null)? 0 :channelTitle.hashCode()))+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((description == null)? 0 :description.hashCode()))+((localized == null)? 0 :localized.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((tags == null)? 0 :tags.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
