package www.googleapis.com.definitions;

public class VideoPlayer {
    public String embedHeight;
    /**
     * An <iframe> tag that embeds a player that will play the video.
     */
    public String embedHtml;
    /**
     * The embed width
     */
    public String embedWidth;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        VideoPlayer othersame = ((VideoPlayer) other);
        if ((embedHeight!= othersame.embedHeight)&&((embedHeight == null)||(!embedHeight.equals(othersame.embedHeight)))) {
            return false;
        }
        if ((embedHtml!= othersame.embedHtml)&&((embedHtml == null)||(!embedHtml.equals(othersame.embedHtml)))) {
            return false;
        }
        if ((embedWidth!= othersame.embedWidth)&&((embedWidth == null)||(!embedWidth.equals(othersame.embedWidth)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((embedHeight == null)? 0 :embedHeight.hashCode())+((embedHtml == null)? 0 :embedHtml.hashCode()))+((embedWidth == null)? 0 :embedWidth.hashCode()));
    }
}
