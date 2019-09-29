package www.googleapis.com.definitions;

import java.util.Map;

public class Playlist {
    /**
     * The contentDetails object contains information like video count.
     */
    public PlaylistContentDetails contentDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the playlist.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#playlist".
     */
    public String kind;
    /**
     * Localizations for different languages
     */
    public Map<String, PlaylistLocalization> localizations;
    /**
     * The player object contains information that you would use to play the playlist in an embedded player.
     */
    public PlaylistPlayer player;
    /**
     * The snippet object contains basic details about the playlist, such as its title and description.
     */
    public PlaylistSnippet snippet;
    /**
     * The status object contains status information for the playlist.
     */
    public PlaylistStatus status;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Playlist othersame = ((Playlist) other);
        if ((contentDetails!= othersame.contentDetails)&&((contentDetails == null)||(!contentDetails.equals(othersame.contentDetails)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((localizations!= othersame.localizations)&&((localizations == null)||(!localizations.equals(othersame.localizations)))) {
            return false;
        }
        if ((player!= othersame.player)&&((player == null)||(!player.equals(othersame.player)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((contentDetails == null)? 0 :contentDetails.hashCode())+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((localizations == null)? 0 :localizations.hashCode()))+((player == null)? 0 :player.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((status == null)? 0 :status.hashCode()));
    }
}
