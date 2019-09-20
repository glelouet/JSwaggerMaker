package www.googleapis.com.definitions;

public class PlaylistPlayer {
    /**
     * An <iframe> tag that embeds a player that will play the playlist.
     */
    public String embedHtml;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PlaylistPlayer othersame = ((PlaylistPlayer) other);
        if ((embedHtml!= othersame.embedHtml)&&((embedHtml == null)||(!embedHtml.equals(othersame.embedHtml)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((embedHtml == null)? 0 :embedHtml.hashCode());
    }
}
