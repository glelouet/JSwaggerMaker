package www.googleapis.com.definitions;

public class ResourceId {
    /**
     * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a channel. This property is only present if the resourceId.kind value is youtube#channel.
     */
    public String channelId;
    /**
     * The type of the API resource.
     */
    public String kind;
    /**
     * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a playlist. This property is only present if the resourceId.kind value is youtube#playlist.
     */
    public String playlistId;
    /**
     * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a video. This property is only present if the resourceId.kind value is youtube#video.
     */
    public String videoId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ResourceId othersame = ((ResourceId) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((playlistId!= othersame.playlistId)&&((playlistId == null)||(!playlistId.equals(othersame.playlistId)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((channelId == null)? 0 :channelId.hashCode())+((kind == null)? 0 :kind.hashCode()))+((playlistId == null)? 0 :playlistId.hashCode()))+((videoId == null)? 0 :videoId.hashCode()));
    }
}
