package www.googleapis.com.definitions;

import www.googleapis.com.structures.CTATYPE;

public class ActivityContentDetailsPromotedItem {
    /**
     * The URL the client should fetch to request a promoted item.
     */
    public String adTag;
    /**
     * The URL the client should ping to indicate that the user clicked through on this promoted item.
     */
    public String clickTrackingUrl;
    /**
     * The URL the client should ping to indicate that the user was shown this promoted item.
     */
    public String creativeViewUrl;
    /**
     * The type of call-to-action, a message to the user indicating action that can be taken.
     */
    public CTATYPE ctaType;
    /**
     * The custom call-to-action button text. If specified, it will override the default button text for the cta_type.
     */
    public String customCtaButtonText;
    /**
     * The text description to accompany the promoted item.
     */
    public String descriptionText;
    /**
     * The URL the client should direct the user to, if the user chooses to visit the advertiser's website.
     */
    public String destinationUrl;
    /**
     * The list of forecasting URLs. The client should ping all of these URLs when a promoted item is not available, to indicate that a promoted item could have been shown.
     */
    public String[] forecastingUrl;
    /**
     * The list of impression URLs. The client should ping all of these URLs to indicate that the user was shown this promoted item.
     */
    public String[] impressionUrl;
    /**
     * The ID that YouTube uses to uniquely identify the promoted video.
     */
    public String videoId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ActivityContentDetailsPromotedItem othersame = ((ActivityContentDetailsPromotedItem) other);
        if ((adTag!= othersame.adTag)&&((adTag == null)||(!adTag.equals(othersame.adTag)))) {
            return false;
        }
        if ((clickTrackingUrl!= othersame.clickTrackingUrl)&&((clickTrackingUrl == null)||(!clickTrackingUrl.equals(othersame.clickTrackingUrl)))) {
            return false;
        }
        if ((creativeViewUrl!= othersame.creativeViewUrl)&&((creativeViewUrl == null)||(!creativeViewUrl.equals(othersame.creativeViewUrl)))) {
            return false;
        }
        if ((ctaType!= othersame.ctaType)&&((ctaType == null)||(!ctaType.equals(othersame.ctaType)))) {
            return false;
        }
        if ((customCtaButtonText!= othersame.customCtaButtonText)&&((customCtaButtonText == null)||(!customCtaButtonText.equals(othersame.customCtaButtonText)))) {
            return false;
        }
        if ((descriptionText!= othersame.descriptionText)&&((descriptionText == null)||(!descriptionText.equals(othersame.descriptionText)))) {
            return false;
        }
        if ((destinationUrl!= othersame.destinationUrl)&&((destinationUrl == null)||(!destinationUrl.equals(othersame.destinationUrl)))) {
            return false;
        }
        if ((forecastingUrl!= othersame.forecastingUrl)&&((forecastingUrl == null)||(!forecastingUrl.equals(othersame.forecastingUrl)))) {
            return false;
        }
        if ((impressionUrl!= othersame.impressionUrl)&&((impressionUrl == null)||(!impressionUrl.equals(othersame.impressionUrl)))) {
            return false;
        }
        if ((videoId!= othersame.videoId)&&((videoId == null)||(!videoId.equals(othersame.videoId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((adTag == null)? 0 :adTag.hashCode())+((clickTrackingUrl == null)? 0 :clickTrackingUrl.hashCode()))+((creativeViewUrl == null)? 0 :creativeViewUrl.hashCode()))+((ctaType == null)? 0 :ctaType.hashCode()))+((customCtaButtonText == null)? 0 :customCtaButtonText.hashCode()))+((descriptionText == null)? 0 :descriptionText.hashCode()))+((destinationUrl == null)? 0 :destinationUrl.hashCode()))+((forecastingUrl == null)? 0 :forecastingUrl.hashCode()))+((impressionUrl == null)? 0 :impressionUrl.hashCode()))+((videoId == null)? 0 :videoId.hashCode()));
    }
}
