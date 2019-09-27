package www.googleapis.com.definitions;

import java.util.HashMap;

public class Channel {
    /**
     * The auditionDetails object encapsulates channel data that is relevant for YouTube Partners during the audition process.
     */
    public ChannelAuditDetails auditDetails;
    /**
     * The brandingSettings object encapsulates information about the branding of the channel.
     */
    public ChannelBrandingSettings brandingSettings;
    /**
     * The contentDetails object encapsulates information about the channel's content.
     */
    public ChannelContentDetails contentDetails;
    /**
     * The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners linked with the channel.
     */
    public ChannelContentOwnerDetails contentOwnerDetails;
    /**
     * The conversionPings object encapsulates information about conversion pings that need to be respected by the channel.
     */
    public ChannelConversionPings conversionPings;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the channel.
     */
    public String id;
    /**
     * The invideoPromotion object encapsulates information about promotion campaign associated with the channel.
     */
    public InvideoPromotion invideoPromotion;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#channel".
     */
    public String kind;
    /**
     * Localizations for different languages
     */
    public HashMap<String, Object> localizations;
    /**
     * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
     */
    public ChannelSnippet snippet;
    /**
     * The statistics object encapsulates statistics for the channel.
     */
    public ChannelStatistics statistics;
    /**
     * The status object encapsulates information about the privacy status of the channel.
     */
    public ChannelStatus status;
    /**
     * The topicDetails object encapsulates information about Freebase topics associated with the channel.
     */
    public ChannelTopicDetails topicDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Channel othersame = ((Channel) other);
        if ((auditDetails!= othersame.auditDetails)&&((auditDetails == null)||(!auditDetails.equals(othersame.auditDetails)))) {
            return false;
        }
        if ((brandingSettings!= othersame.brandingSettings)&&((brandingSettings == null)||(!brandingSettings.equals(othersame.brandingSettings)))) {
            return false;
        }
        if ((contentDetails!= othersame.contentDetails)&&((contentDetails == null)||(!contentDetails.equals(othersame.contentDetails)))) {
            return false;
        }
        if ((contentOwnerDetails!= othersame.contentOwnerDetails)&&((contentOwnerDetails == null)||(!contentOwnerDetails.equals(othersame.contentOwnerDetails)))) {
            return false;
        }
        if ((conversionPings!= othersame.conversionPings)&&((conversionPings == null)||(!conversionPings.equals(othersame.conversionPings)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((invideoPromotion!= othersame.invideoPromotion)&&((invideoPromotion == null)||(!invideoPromotion.equals(othersame.invideoPromotion)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((localizations!= othersame.localizations)&&((localizations == null)||(!localizations.equals(othersame.localizations)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        if ((statistics!= othersame.statistics)&&((statistics == null)||(!statistics.equals(othersame.statistics)))) {
            return false;
        }
        if ((status!= othersame.status)&&((status == null)||(!status.equals(othersame.status)))) {
            return false;
        }
        if ((topicDetails!= othersame.topicDetails)&&((topicDetails == null)||(!topicDetails.equals(othersame.topicDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((auditDetails == null)? 0 :auditDetails.hashCode())+((brandingSettings == null)? 0 :brandingSettings.hashCode()))+((contentDetails == null)? 0 :contentDetails.hashCode()))+((contentOwnerDetails == null)? 0 :contentOwnerDetails.hashCode()))+((conversionPings == null)? 0 :conversionPings.hashCode()))+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((invideoPromotion == null)? 0 :invideoPromotion.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((localizations == null)? 0 :localizations.hashCode()))+((snippet == null)? 0 :snippet.hashCode()))+((statistics == null)? 0 :statistics.hashCode()))+((status == null)? 0 :status.hashCode()))+((topicDetails == null)? 0 :topicDetails.hashCode()));
    }
}
