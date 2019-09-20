package www.googleapis.com.definitions;

public class PlaylistContentDetails {
    /**
     * The number of videos in the playlist.
     */
    public long itemCount;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PlaylistContentDetails othersame = ((PlaylistContentDetails) other);
        if (itemCount!= othersame.itemCount) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.hashCode(itemCount);
    }
}
