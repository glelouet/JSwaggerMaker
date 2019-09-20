package www.googleapis.com.definitions;

public class ActivityContentDetailsPlaylistItem {
    /**
     * The value that YouTube uses to uniquely identify the playlist.
     */
    public String playlistId;
    /**
     * ID of the item within the playlist.
     */
    public String playlistItemId;
    /**
     * The resourceId object contains information about the resource that was added to the playlist.
     */
    public ResourceId resourceId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ActivityContentDetailsPlaylistItem othersame = ((ActivityContentDetailsPlaylistItem) other);
        if ((playlistId!= othersame.playlistId)&&((playlistId == null)||(!playlistId.equals(othersame.playlistId)))) {
            return false;
        }
        if ((playlistItemId!= othersame.playlistItemId)&&((playlistItemId == null)||(!playlistItemId.equals(othersame.playlistItemId)))) {
            return false;
        }
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((playlistId == null)? 0 :playlistId.hashCode())+((playlistItemId == null)? 0 :playlistItemId.hashCode()))+((resourceId == null)? 0 :resourceId.hashCode()));
    }
}
