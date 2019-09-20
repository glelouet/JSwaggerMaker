package www.googleapis.com.definitions;

public class ChannelSettings {
    /**
     * The country of the channel.
     */
    public String country;
    public String defaultLanguage;
    /**
     * Which content tab users should see when viewing the channel.
     */
    public String defaultTab;
    /**
     * Specifies the channel description.
     */
    public String description;
    /**
     * Title for the featured channels tab.
     */
    public String featuredChannelsTitle;
    /**
     * The list of featured channels.
     */
    public String[] featuredChannelsUrls;
    /**
     * Lists keywords associated with the channel, comma-separated.
     */
    public String keywords;
    /**
     * Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible.
     */
    public boolean moderateComments;
    /**
     * A prominent color that can be rendered on this channel page.
     */
    public String profileColor;
    /**
     * Whether the tab to browse the videos should be displayed.
     */
    public boolean showBrowseView;
    /**
     * Whether related channels should be proposed.
     */
    public boolean showRelatedChannels;
    /**
     * Specifies the channel title.
     */
    public String title;
    /**
     * The ID for a Google Analytics account to track and measure traffic to the channels.
     */
    public String trackingAnalyticsAccountId;
    /**
     * The trailer of the channel, for users that are not subscribers.
     */
    public String unsubscribedTrailer;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelSettings othersame = ((ChannelSettings) other);
        if ((country!= othersame.country)&&((country == null)||(!country.equals(othersame.country)))) {
            return false;
        }
        if ((defaultLanguage!= othersame.defaultLanguage)&&((defaultLanguage == null)||(!defaultLanguage.equals(othersame.defaultLanguage)))) {
            return false;
        }
        if ((defaultTab!= othersame.defaultTab)&&((defaultTab == null)||(!defaultTab.equals(othersame.defaultTab)))) {
            return false;
        }
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((featuredChannelsTitle!= othersame.featuredChannelsTitle)&&((featuredChannelsTitle == null)||(!featuredChannelsTitle.equals(othersame.featuredChannelsTitle)))) {
            return false;
        }
        if ((featuredChannelsUrls!= othersame.featuredChannelsUrls)&&((featuredChannelsUrls == null)||(!featuredChannelsUrls.equals(othersame.featuredChannelsUrls)))) {
            return false;
        }
        if ((keywords!= othersame.keywords)&&((keywords == null)||(!keywords.equals(othersame.keywords)))) {
            return false;
        }
        if (moderateComments!= othersame.moderateComments) {
            return false;
        }
        if ((profileColor!= othersame.profileColor)&&((profileColor == null)||(!profileColor.equals(othersame.profileColor)))) {
            return false;
        }
        if (showBrowseView!= othersame.showBrowseView) {
            return false;
        }
        if (showRelatedChannels!= othersame.showRelatedChannels) {
            return false;
        }
        if ((title!= othersame.title)&&((title == null)||(!title.equals(othersame.title)))) {
            return false;
        }
        if ((trackingAnalyticsAccountId!= othersame.trackingAnalyticsAccountId)&&((trackingAnalyticsAccountId == null)||(!trackingAnalyticsAccountId.equals(othersame.trackingAnalyticsAccountId)))) {
            return false;
        }
        if ((unsubscribedTrailer!= othersame.unsubscribedTrailer)&&((unsubscribedTrailer == null)||(!unsubscribedTrailer.equals(othersame.unsubscribedTrailer)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((country == null)? 0 :country.hashCode())+((defaultLanguage == null)? 0 :defaultLanguage.hashCode()))+((defaultTab == null)? 0 :defaultTab.hashCode()))+((description == null)? 0 :description.hashCode()))+((featuredChannelsTitle == null)? 0 :featuredChannelsTitle.hashCode()))+((featuredChannelsUrls == null)? 0 :featuredChannelsUrls.hashCode()))+((keywords == null)? 0 :keywords.hashCode()))+ Boolean.hashCode(moderateComments))+((profileColor == null)? 0 :profileColor.hashCode()))+ Boolean.hashCode(showBrowseView))+ Boolean.hashCode(showRelatedChannels))+((title == null)? 0 :title.hashCode()))+((trackingAnalyticsAccountId == null)? 0 :trackingAnalyticsAccountId.hashCode()))+((unsubscribedTrailer == null)? 0 :unsubscribedTrailer.hashCode()));
    }
}
