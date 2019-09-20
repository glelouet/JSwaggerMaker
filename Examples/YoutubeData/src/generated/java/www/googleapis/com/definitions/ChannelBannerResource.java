package www.googleapis.com.definitions;

public class ChannelBannerResource {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#channelBannerResource".
     */
    public String kind;
    /**
     * The URL of this banner image.
     */
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelBannerResource othersame = ((ChannelBannerResource) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((etag == null)? 0 :etag.hashCode())+((kind == null)? 0 :kind.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
