package www.googleapis.com.definitions;

public class WatchSettings {
    /**
     * The text color for the video watch page's branded area.
     */
    public String backgroundColor;
    /**
     * An ID that uniquely identifies a playlist that displays next to the video player.
     */
    public String featuredPlaylistId;
    /**
     * The background color for the video watch page's branded area.
     */
    public String textColor;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        WatchSettings othersame = ((WatchSettings) other);
        if ((backgroundColor!= othersame.backgroundColor)&&((backgroundColor == null)||(!backgroundColor.equals(othersame.backgroundColor)))) {
            return false;
        }
        if ((featuredPlaylistId!= othersame.featuredPlaylistId)&&((featuredPlaylistId == null)||(!featuredPlaylistId.equals(othersame.featuredPlaylistId)))) {
            return false;
        }
        if ((textColor!= othersame.textColor)&&((textColor == null)||(!textColor.equals(othersame.textColor)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((backgroundColor == null)? 0 :backgroundColor.hashCode())+((featuredPlaylistId == null)? 0 :featuredPlaylistId.hashCode()))+((textColor == null)? 0 :textColor.hashCode()));
    }
}
