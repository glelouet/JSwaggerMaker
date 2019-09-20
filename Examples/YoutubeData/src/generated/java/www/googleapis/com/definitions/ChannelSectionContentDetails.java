package www.googleapis.com.definitions;

public class ChannelSectionContentDetails {
    /**
     * The channel ids for type multiple_channels.
     */
    public String[] channels;
    /**
     * The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one playlistId is allowed.
     */
    public String[] playlists;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSectionContentDetails othersame = ((ChannelSectionContentDetails) other);
        if ((channels!= othersame.channels)&&((channels == null)||(!channels.equals(othersame.channels)))) {
            return false;
        }
        if ((playlists!= othersame.playlists)&&((playlists == null)||(!playlists.equals(othersame.playlists)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((channels == null)? 0 :channels.hashCode())+((playlists == null)? 0 :playlists.hashCode()));
    }
}
