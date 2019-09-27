package www.googleapis.com.definitions;

import www.googleapis.com.structures.Livebroadcastcontent;

public class VideoSnippet {
    /**
     * The YouTube video category associated with the video.
     */
    public String categoryId;
    /**
     * The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.
     */
    public String channelId;
    /**
     * Channel title for the channel that the video belongs to.
     */
    public String channelTitle;
    /**
     * The default_audio_language property specifies the language spoken in the video's default audio track.
     */
    public String defaultAudioLanguage;
    /**
     * The language of the videos's default snippet.
     */
    public String defaultLanguage;
    /**
     * The video's description.
     */
    public String description;
    /**
     * Indicates if the video is an upcoming/active live broadcast. Or it's "none" if the video is not an upcoming/active live broadcast.
     */
    public Livebroadcastcontent liveBroadcastContent;
    /**
     * Localized snippet selected with the hl parameter. If no such localization exists, this field is populated with the default snippet. (Read-only)
     */
    public VideoLocalization localized;
    /**
     * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * A list of keyword tags associated with the video. Tags may contain spaces.
     */
    public String[] tags;
    /**
     * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The video's title.
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
        VideoSnippet othersame = ((VideoSnippet) other);
        if ((categoryId!= othersame.categoryId)&&((categoryId == null)||(!categoryId.equals(othersame.categoryId)))) {
            return false;
        }
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelTitle!= othersame.channelTitle)&&((channelTitle == null)||(!channelTitle.equals(othersame.channelTitle)))) {
            return false;
        }
        if ((defaultAudioLanguage!= othersame.defaultAudioLanguage)&&((defaultAudioLanguage == null)||(!defaultAudioLanguage.equals(othersame.defaultAudioLanguage)))) {
            return false;
        }
        if ((defaultLanguage!= othersame.defaultLanguage)&&((defaultLanguage == null)||(!defaultLanguage.equals(othersame.defaultLanguage)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((liveBroadcastContent!= othersame.liveBroadcastContent)&&((liveBroadcastContent == null)||(!liveBroadcastContent.equals(othersame.liveBroadcastContent)))) {
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
        return (((((((((((((categoryId == null)? 0 :categoryId.hashCode())+((channelId == null)? 0 :channelId.hashCode()))+((channelTitle == null)? 0 :channelTitle.hashCode()))+((defaultAudioLanguage == null)? 0 :defaultAudioLanguage.hashCode()))+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((description == null)? 0 :description.hashCode()))+((liveBroadcastContent == null)? 0 :liveBroadcastContent.hashCode()))+((localized == null)? 0 :localized.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((tags == null)? 0 :tags.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
