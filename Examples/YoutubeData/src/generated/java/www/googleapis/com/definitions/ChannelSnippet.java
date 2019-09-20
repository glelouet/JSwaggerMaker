package www.googleapis.com.definitions;

public class ChannelSnippet {
    /**
     * The country of the channel.
     */
    public String country;
    /**
     * The custom url of the channel.
     */
    public String customUrl;
    /**
     * The language of the channel's default title and description.
     */
    public String defaultLanguage;
    /**
     * The description of the channel.
     */
    public String description;
    /**
     * Localized title and description, read-only.
     */
    public ChannelLocalization localized;
    /**
     * The date and time that the channel was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String publishedAt;
    /**
     * A map of thumbnail images associated with the channel. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
     * 
     * When displaying thumbnails in your application, make sure that your code uses the image URLs exactly as they are returned in API responses. For example, your application should not use the http domain instead of the https domain in a URL returned in an API response.
     * 
     * Beginning in July 2018, channel thumbnail URLs will only be available in the https domain, which is how the URLs appear in API responses. After that time, you might see broken images in your application if it tries to load YouTube images from the http domain.
     */
    public ThumbnailDetails thumbnails;
    /**
     * The channel's title.
     */
    public String title;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSnippet othersame = ((ChannelSnippet) other);
        if ((country!= othersame.country)&&((country == null)||(!country.equals(othersame.country)))) {
            return false;
        }
        if ((customUrl!= othersame.customUrl)&&((customUrl == null)||(!customUrl.equals(othersame.customUrl)))) {
            return false;
        }
        if ((defaultLanguage!= othersame.defaultLanguage)&&((defaultLanguage == null)||(!defaultLanguage.equals(othersame.defaultLanguage)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((localized!= othersame.localized)&&((localized == null)||(!localized.equals(othersame.localized)))) {
            return false;
        }
        if ((publishedAt!= othersame.publishedAt)&&((publishedAt == null)||(!publishedAt.equals(othersame.publishedAt)))) {
            return false;
        }
        if ((thumbnails!= othersame.thumbnails)&&((thumbnails == null)||(!thumbnails.equals(othersame.thumbnails)))) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((country == null)? 0 :country.hashCode())+((customUrl == null)? 0 :customUrl.hashCode()))+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((description == null)? 0 :description.hashCode()))+((localized == null)? 0 :localized.hashCode()))+((publishedAt == null)? 0 :publishedAt.hashCode()))+((thumbnails == null)? 0 :thumbnails.hashCode()))+((title == null)? 0 :title.hashCode()));
    }
}
