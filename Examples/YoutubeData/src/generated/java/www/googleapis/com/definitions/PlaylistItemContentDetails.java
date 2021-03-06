package www.googleapis.com.definitions;

public class PlaylistItemContentDetails {
    /**
     * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
     */
    public String endAt;
    /**
     * A user-generated note for this item.
     */
    public String note;
    /**
     * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop playing when the video is played in the context of the playlist.) The default value is 0.
     */
    public String startAt;
    /**
     * The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request.
     */
    public String videoId;
    /**
     * The date and time that the video was published to YouTube. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String videoPublishedAt;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PlaylistItemContentDetails othersame = ((PlaylistItemContentDetails) other);
        if ((endAt!= othersame.endAt)&&((endAt == null)||(!endAt.equals(othersame.endAt)))) {
            return false;
        }
        if ((note!= othersame.note)&&((note == null)||(!note.equals(othersame.note)))) {
            return false;
        }
        if ((startAt!= othersame.startAt)&&((startAt == null)||(!startAt.equals(othersame.startAt)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        if ((videoPublishedAt!= othersame.videoPublishedAt)&&((videoPublishedAt == null)||(!videoPublishedAt.equals(othersame.videoPublishedAt)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((endAt == null)? 0 :endAt.hashCode())+((note == null)? 0 :note.hashCode()))+((startAt == null)? 0 :startAt.hashCode()))+((videoId == null)? 0 :videoId.hashCode()))+((videoPublishedAt == null)? 0 :videoPublishedAt.hashCode()));
    }
}
