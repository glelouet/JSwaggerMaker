package www.googleapis.com.definitions;

public class Thumbnail {
    /**
     * (Optional) Height of the thumbnail image.
     */
    public long height;
    /**
     * The thumbnail image's URL.
     */
    public String url;
    /**
     * (Optional) Width of the thumbnail image.
     */
    public long width;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Thumbnail othersame = ((Thumbnail) other);
        if (height!= othersame.height) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        if (width!= othersame.width) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(height)+((url == null)? 0 :url.hashCode()))+ Long.hashCode(width));
    }
}
