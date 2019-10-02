package www.googleapis.com.definitions.channelcontentdetails;

public class RelatedPlaylists {
    /**
     * The ID of the playlist that contains the channel"s favorite videos. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from that list.
     */
    public String favorites;
    /**
     * The ID of the playlist that contains the channel"s liked videos. Use the   playlistItems.insert and  playlistItems.delete to add or remove items from that list.
     */
    public String likes;
    /**
     * The ID of the playlist that contains the channel"s uploaded videos. Use the  videos.insert method to upload new videos and the videos.delete method to delete previously uploaded videos.
     */
    public String uploads;
    /**
     * The ID of the playlist that contains the channel"s watch history. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from that list.
     */
    public String watchHistory;
    /**
     * The ID of the playlist that contains the channel"s watch later playlist. Use the playlistItems.insert and  playlistItems.delete to add or remove items from that list.
     */
    public String watchLater;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        RelatedPlaylists othersame = ((RelatedPlaylists) other);
        if ((favorites!= othersame.favorites)&&((favorites == null)||(!favorites.equals(othersame.favorites)))) {
            return false;
        }
        if ((likes!= othersame.likes)&&((likes == null)||(!likes.equals(othersame.likes)))) {
            return false;
        }
        if ((uploads!= othersame.uploads)&&((uploads == null)||(!uploads.equals(othersame.uploads)))) {
            return false;
        }
        if ((watchHistory!= othersame.watchHistory)&&((watchHistory == null)||(!watchHistory.equals(othersame.watchHistory)))) {
            return false;
        }
        if ((watchLater!= othersame.watchLater)&&((watchLater == null)||(!watchLater.equals(othersame.watchLater)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((favorites == null)? 0 :favorites.hashCode())+((likes == null)? 0 :likes.hashCode()))+((uploads == null)? 0 :uploads.hashCode()))+((watchHistory == null)? 0 :watchHistory.hashCode()))+((watchLater == null)? 0 :watchLater.hashCode()));
    }
}
