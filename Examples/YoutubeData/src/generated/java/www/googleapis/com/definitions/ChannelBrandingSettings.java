package www.googleapis.com.definitions;

public class ChannelBrandingSettings {
    /**
     * Branding properties for the channel view.
     */
    public ChannelSettings channel;
    /**
     * Additional experimental branding properties.
     */
    public PropertyValue[] hints;
    /**
     * Branding properties for branding images.
     */
    public ImageSettings image;
    /**
     * Branding properties for the watch page.
     */
    public WatchSettings watch;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelBrandingSettings othersame = ((ChannelBrandingSettings) other);
        if ((channel!= othersame.channel)&&((channel == null)||(!channel.equals(othersame.channel)))) {
            return false;
        }
        if ((hints!= othersame.hints)&&((hints == null)||(!hints.equals(othersame.hints)))) {
            return false;
        }
        if ((image!= othersame.image)&&((image == null)||(!image.equals(othersame.image)))) {
            return false;
        }
        if ((watch!= othersame.watch)&&((watch == null)||(!watch.equals(othersame.watch)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((channel == null)? 0 :channel.hashCode())+((hints == null)? 0 :hints.hashCode()))+((image == null)? 0 :image.hashCode()))+((watch == null)? 0 :watch.hashCode()));
    }
}
